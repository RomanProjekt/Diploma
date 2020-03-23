/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import pojo.Benutzer;
import javax.annotation.PostConstruct;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import service.DatabaseManagerService;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

//import Email-zurücksetzen
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 *
 * @author dople
 */
public class loginBean {

    private Benutzer b;
    private DatabaseManagerService dbService;
    private int benID;
    private String message;
    private String pw;
    private String username;

    //Variable Passwort zurücksetzen mit Email
    private Session mailSession;
    private String bestätigtespw;
    
    
    
    
    
    
    
    public loginBean() {
    }

    @PostConstruct
    void init() {

    }

    private String previousPage = null;

    public void checkF5() {

        UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
        String id = viewRoot.getViewId();
        if (previousPage != null && (previousPage.equals(id))) {
            message = null;
            username = null;
            pw = null;
        }
        previousPage = id;
    }

    public Object load() {
        message = null;
        b = dbService.load(username);
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (b != null) {
            if (argon2.verify(b.getPassWd(), pw.toCharArray())) {
                dbService.setLoggedInBenutzer(b);
                username = null;
                pw = null;

                return "success";
            } else {
                message = "Benutzername oder Passwort sind falsch!";
            }

        } else {
            message = "Benutzername oder Passwort sind falsch";
        }
        return "fail";
    }

    public Object loggout() {
        dbService.loggout();
        return "index.xhtml?faces-redirect=true";
    }

    public String onLoad() {

        message = null;
        pw = null;
        username = null;

        return null;
    }

    public Benutzer getB() {
        return b;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public int getBenID() {
        return benID;
    }

    public String getMessage() {
        return message;
    }

    public String getPw() {
        return pw;
    }
    
    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUsername() {
        return username;
    }

    public void setB(Benutzer b) {
        this.b = b;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public void setBenID(int benID) {
        this.benID = benID;
    }

    public void setMessage(String message) {
        this.message = message;
    }

   
    public void setUsername(String username) {
        this.username = username;
    }

    
    
//--------------Passwort zurücksetzen im Programm selbst---------------

    public String getBestätigtespw() {
        return bestätigtespw;
    }

    public void setBestätigtespw(String bestätigtespw) {
        this.bestätigtespw = bestätigtespw;
    }
    
    public void speichernPasswort() {

        if(this.pw.equals(this.bestätigtespw)) {
            
            
            //Ohne Verschlüsselung
            dbService.insertNewPasswort(this.pw, dbService.getLoggedInBenutzer());
             
             this.pw = "";
             this.bestätigtespw="";
        }
        else {
            System.out.println("Geben sie ein neues Passwort ein!");
        }
        
        
        
       
    }
    
    
    
    
//Passwort zurücksetzen mit einer Email:
    
//Bekanntes Email-Dienste in Österreich
//    1&1
//    AOL Mail
//    Freenetmail Basic
//    GMX Freemail
//    GMX Topmail
//    Google Gmail
//    Mailbox.org Tarif Mail 
//    Mail.de Plusmail
//    Microsoft Outlook
//    Posteo
//    Web.de Freemail
//    Yahoo Mail
    
    
    
    
    
    
    
    public Session getMailSession() {
        return mailSession;
    }

    public void setMailSession(Session mailSession) {
        this.mailSession = mailSession;
    }
  
       
    String benutzername = "testdiplomarbeit@gmx.at";
    String passwort = "TiegerMade12Acht";

    String absender = "testdiplomarbeit@gmx.at";
    String empfanger = "roman.grof@gmx.at";
    String smtpHost = "mail.gmx.net";        
    String smtPort = "587";
    

 
    public String passwort_vergessen() {
        this.login(smtpHost, smtPort, benutzername, passwort);
        return "index.xhtml";
    }

    public void login(String smtpHost, String smtpPort, String benutzername, String passwort) {

        // Die Properties der JVM holen
        Properties properties = System.getProperties();

        // Postausgangsserver
        properties.put("mail.smtp.port", smtpPort);
        properties.put("mail.smtp.host", smtpHost);

        // Benutzername
        properties.put("mail.user", benutzername);

        // Passwort
        properties.put("mail.password", passwort);

        //Einstellungen für die STARTTLS Verschlüsselte Übermittlung von E-Mails
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Einstellungen für die SSL Verschlüsselte Übermittlung von E-Mails
        //properties.setProperty("mail.smtps.**ssl.enable", "true");
        //properties.setProperty("mail.smtps.**ssl.required", "true");
        //properties.setProperty("mail.smtps.auth", "true"); 
        //-----------------------------------------------------------
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(benutzername, passwort);
            }
        };

        //---------------------------------------------------------------
        
        String message = "<a href=\"mailto:abc@example.com?subject=Feedback&body=Message\">\n" + "Send Feedback\n" + "</a>";
        this.mailSession = Session.getDefaultInstance(properties, auth);
        this.mailSession.setDebug(true);
        System.out.println("Eingeloggt.");
        this.sendMail(empfanger, "Betreff", message);

    }

    public void sendMail(String empfaenger, String betreff, String text) {

        // Erstellt ein Session Objekt mit der E-Mail Konfiguration
        // Optional, schreibt auf die Konsole / in das Log, die Ausgabe des
        // E-Mail Servers, dieses kann bei einer Fehleranalyse sehr Hilfreich
        // sein.
        try {
            // Erstellt ein MimeMessage Objekt.
            MimeMessage message = new MimeMessage(this.mailSession);

            // Setzt die E-Mail Adresse des Versenders in den E-Mail Header
            message.setFrom(new InternetAddress(absender));

            // Setzt die E-Mail Adresse des Empfängers in den E-Mail Header
            // hier können beliegig viele E-Mail Adressen hinzugefügt werden
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(empfaenger));

            // Der Empfänger erhält eine Kopie dieser E-Mail
            // message.addRecipient(Message.RecipientType.CC, new
            // InternetAddress(empfaenger));
            // Der Empfänger erhält eine "Blindkopie" dieser E-Mail d.h. er
            // sieht nicht wer diese E-Mail noch erhalten hat.
            // message.addRecipient(Message.RecipientType.BCC, new
            // InternetAddress(empfaenger));
            // Setzt den Betreff der E-Mail
            message.setSubject(betreff);

            // Erstellen des "Containers" für die Nachricht
            BodyPart messageBodyPart = new MimeBodyPart();

            // Setzen des Textes
            messageBodyPart.setText(text);

            // Erstellen eines Multipart Objektes für das ablegen des Textes
            Multipart multipart = new MimeMultipart();
            // Setzen des Textes
            multipart.addBodyPart(messageBodyPart);

            // Setzt den Inhalt der E-Mail, Text + Dateianhänge
            message.setContent(multipart);

            // E-Mail versenden
            Transport.send(message);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

}
