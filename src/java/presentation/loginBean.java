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
//import java.io.UnsupportedEncodingException;
//import java.util.Date;
//import java.util.Properties;
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
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

    //Variable Passwort zurücksetzen
//    private Session mailSession;
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

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public Session getMailSession() {
//        return mailSession;
//    }
//
//    public void setMailSession(Session mailSession) {
//        this.mailSession = mailSession;
//    }
//    
    public void passwort_zuruecksetzen(ActionEvent event) {

        //Benutzername und Passwort
        //zum Tesst 
        String email_username = null;
        String email_passwort = null;
        String smtpHost = null;
        String smtPort = null;

        try {

            //1.Einloggen der AK in den email-server
            //Testen: sender.login("mail.gmx.net", "587", username, password);
//            this.login(smtpHost, smtPort, email_username, email_passwort);
            //2. Senden des Texten an den email-Server
            //String senderMail, String senderName, String receiverAddresses, String subject, String nachrichten)
            //sender.send("absender@provider.com", "Absender Name", "empfaenger@provider.com", "Test Test Test Betreff", "Ãœberall dieselbe alte Leier.\r\n\r\nDas Layout ist fertig, der Text lÃ¤sst auf sich warten. "+ "Damit das Layout nun nicht nackt im Raume steht und sich klein und leer vorkommt, "+ "springe ich ein: der Blindtext. Genau zu diesem Zwecke erschaffen, immer im Schatten "+ "meines groÃŸen Bruders Â»Lorem IpsumÂ«, freue ich mich jedes Mal, wenn Sie ein paar Zeilen "+ "lesen. Denn esse est percipi - Sein ist wahrgenommen werden.");
            //this.send(senderMail, senderName, receiverAdresses, subject, message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

//    public void login(String smtpHost, String smtpPort, String email_username, String email_passwort) {
//			Properties props = new Properties();
//			props.put("mail.smtp.host", smtpHost);
//			props.put("mail.smtp.socketFactory.port", smtpPort);
//			props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//			props.put("mail.smtp.auth", "true");
//			props.put("mail.smtp.port", smtpPort);
//
//			Authenticator auth = new Authenticator() {
//				@Override
//				protected PasswordAuthentication getPasswordAuthentication() {
//					return new PasswordAuthentication(email_username, email_passwort);
//				}
//			};
//
//			this.mailSession = Session.getDefaultInstance(props, auth);
//			System.out.println("Eingeloggt.");
//    }
//    public void send(String senderMail, String senderName, String receiverAddresses, String subject, String message)
//				throws MessagingException, IllegalStateException, UnsupportedEncodingException {
//			if (mailSession == null) {
//				throw new IllegalStateException("Du musst dich zuerst einloggen (login()-Methode)");
//			}
//
//			MimeMessage msg = new MimeMessage(mailSession);
//			msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
//			msg.addHeader("format", "flowed");
//			msg.addHeader("Content-Transfer-Encoding", "8bit");
//
//			msg.setFrom(new InternetAddress(senderMail, senderName));
//			msg.setReplyTo(InternetAddress.parse(senderMail, false));
//			msg.setSubject(subject, "UTF-8");
//			msg.setText(message, "UTF-8");
//			msg.setSentDate(new Date());
//
//			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiverAddresses, false));
//
//			System.out.println("Versende E-Mail...");
//			Transport.send(msg);
//			System.out.println("E-Mail versendet.");
//		}
}
