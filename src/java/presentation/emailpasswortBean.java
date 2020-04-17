/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import pojo.Benutzer;
import pojo.SicherheitsCode;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class emailpasswortBean {

    private Session mailSession;
    private String checked;
    private boolean noemailformat;
    private List<EmailProvider> emailList;
    
    private boolean nofoundemail;
    private boolean nofoundusername;
    private DatabaseManagerService dbService;
    private String reset;
    
    private boolean kontofindtf;
    private boolean pwresettf;
    private boolean pwresetbutton;
    
    private String var_username;
    private String var_email;
    
    private String email_format;
    private boolean right_email_format;
    
    private String resetCodeBefore;

    private String show_name;
    private String show_email;
    
    
    private String message;
    private String FullTimeBefore;
    private boolean sendemail;
    
    private String TimeBefore;
    private String DateBefore;
    
    private LocalDate datebefore;
    private String date;
    
    private String sicherheitsantwort;
    private String compareCode;
    private String FullAdditiveCodeSalt;
    private String sanswere;
    
    private int zaehler;
    private int max;
          
    //Benutzername und passwort Anbieter
    //Benutzername und passwort Anbieter
    static final String benutzername = "testdiplomarbeit@gmx.at";
    static final String passwort = "TiegerMade12Acht"; 
    static final String absender = "testdiplomarbeit@gmx.at";
    String smtpHost = "mail.gmx.net";        
    String smtPort = "587";  
    
    //Kunde
    static final String empfanger = "roman.grof@gmx.at";
    private String emailUser;
    
    
    //Email Provider
    EmailProvider gmx = new EmailProvider(0,"gmx", "mail.gmx.net", "587");
    EmailProvider gmail = new EmailProvider(1,"gmail", "smtp.gmail.com", "587");
    EmailProvider outlook = new EmailProvider(2,"outlook", "smtp.office365.com", "993");
    EmailProvider yahoo = new EmailProvider(3,"yahoo", "smtp.mail.yahoo.com" ,"587");
    EmailProvider einsueins = new EmailProvider(4,"einsueins", "mail.gmx.net", "587");
    
    

    public emailpasswortBean() {}
    
    
    @PostConstruct
    public void init() {
        this.emailList = new ArrayList<>();
        this.emailList.add(gmx);    
        this.pwresetbutton = true;
        this.right_email_format = false;
        this.zaehler = 0;      
    }
    
     
    public Session getMailSession() {
        return mailSession;
    }

    public void setMailSession(Session mailSession) {
        this.mailSession = mailSession;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public String getReset() {
        return reset;
    }

    public void setReset(String reset) {
        this.reset = reset;
    }

    public boolean isNoemailformat() {
        return noemailformat;
    }

    public void setNoemailformat(boolean noemailformat) {
        this.noemailformat = noemailformat;
    }

    public List<EmailProvider> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<EmailProvider> emailList) {
        this.emailList = emailList;
    }

    public boolean isNofoundemail() {
        return nofoundemail;
    }

    public void setNofoundemail(boolean nofoundemail) {
        this.nofoundemail = nofoundemail;
    }

    public boolean isNofoundusername() {
        return nofoundusername;
    }

    public void setNofoundusername(boolean nofoundusername) {
        this.nofoundusername = nofoundusername;
    }

    public boolean isKontofindtf() {
        return kontofindtf;
    }

    public void setKontofindtf(boolean kontofindtf) {
        this.kontofindtf = kontofindtf;
    }

    public boolean isPwresettf() {
        return pwresettf;
    }

    public void setPwresettf(boolean pwresettf) {
        this.pwresettf = pwresettf;
    }

    public boolean isPwresetbutton() {
        return pwresetbutton;
    }

    public void setPwresetbutton(boolean pwresetbutton) {
        this.pwresetbutton = pwresetbutton;
    }


    public String getVar_username() {
        return var_username;
    }

    public void setVar_username(String var_username) {
        this.var_username = var_username;
    }

    public String getVar_email() {
        return var_email;
    }

    public void setVar_email(String var_email) {
        this.var_email = var_email;
    }

    public String getEmail_format() {
        return email_format;
    }

    public void setEmail_format(String email_format) {
        this.email_format = email_format;
    }

   
    public String getShow_name() {
        return show_name;
    }

    public void setShow_name(String show_name) {
        this.show_name = show_name;
    }

    public String getShow_email() {
        return show_email;
    }

    public void setShow_email(String show_email) {
        this.show_email = show_email;
    }

    public boolean isRight_email_format() {
        return right_email_format;
    }

    public void setRight_email_format(boolean right_email_format) {
        this.right_email_format = right_email_format;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    
  

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String displaySelectedDa() { 
        return "email_securitycode?faces-redirect=true&amp;includeViewParams=true";                 
    }

    public String getFullTimeBefore() {
        return FullTimeBefore;
    }

    public void setFullTimeBefore(String FullTimeBefore) {
        this.FullTimeBefore = FullTimeBefore;
    }
   
    public boolean isSendemail() {
        return sendemail;
    }

    public void setSendemail(boolean sendemail) {
        this.sendemail = sendemail;
    }

    public String getTimeBefore() {
        return TimeBefore;
    }

    public void setTimeBefore(String TimeBefore) {
        this.TimeBefore = TimeBefore;
    }

    public String getDateBefore() {
        return DateBefore;
    }

    public void setDateBefore(String DateBefore) {
        this.DateBefore = DateBefore;
    }

    public LocalDate getDatebefore() {
        return datebefore;
    }

    public void setDatebefore(LocalDate datebefore) {
        this.datebefore = datebefore;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getResetCodeBefore() {
        return resetCodeBefore;
    }

    public void setResetCodeBefore(String resetCodeBefore) {
        this.resetCodeBefore = resetCodeBefore;
    }

    public String getSicherheitsantwort() {
        return sicherheitsantwort;
    }

    public void setSicherheitsantwort(String sicherheitsantwort) {
        this.sicherheitsantwort = sicherheitsantwort;
    }

    public String getCompareCode() {
        return compareCode;
    }

    public void setCompareCode(String compareCode) {
        this.compareCode = compareCode;
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public String getSanswere() {
        return sanswere;
    }

    public void setSanswere(String sanswere) {
        this.sanswere = sanswere;
    }

    public String getFullAdditiveCodeSalt() {
        return FullAdditiveCodeSalt;
    }

    public void setFullAdditiveCodeSalt(String FullAdditiveCodeSalt) {
        this.FullAdditiveCodeSalt = FullAdditiveCodeSalt;
    }

  
    
    
    
    
    
    
    
    
   
    
//----------------------Email oder Benuztername suchen -------------------------   
    
    
    public Object search() {
        
        
        if (this.zaehler < 5) {

            if (this.reset != null && !("".equals(this.reset))) {

                System.out.println(this.reset);

                if (this.isValid(this.reset)) {
                    this.zaehler +=1;

                    this.var_email = dbService.reademailfound(this.reset, this.nofoundemail);

                    if (this.var_email != null) {
                        this.pwresettf = true;
                        this.pwresetbutton = false;
                        this.right_email_format = true;

                        this.var_email = this.reset;
                        System.out.println(this.var_email);
                        this.show_email = this.entcryptionEmail(this.reset);
                        this.var_username = this.readusername(this.reset);
                        System.out.println(this.var_username);

                        System.out.println("Email in der Datenbank gefunden!");

                    } else {
                        this.nofoundusername = true;
                        System.out.println("Keine richtige Email-Adresse gefunden!!");
                    }

                } else {
                    this.nofoundusername = true;
                    System.out.println("Kein richtiges Email-Format gefunden!!");
                }

                if (this.nofoundusername) {
                    this.zaehler +=1;
                    this.var_username = dbService.readusernamefound(this.reset, this.nofoundusername);

                    if (this.var_username != null) {
                        this.pwresettf = true;
                        this.pwresetbutton = false;
                        this.var_username = this.reset;

                        this.var_email = this.reademail(this.reset);
                        this.show_email = this.entcryptionEmail(this.reademail(this.reset));
                        this.right_email_format = true;
                        System.out.println("Username in der Datenbank gefunden!");
                    } else {
                        this.nofoundusername = false;
                        this.nofoundemail = false;
                        System.out.println("Keinen richtigen Usernamen gefunden!!");
                    }

                } else {
                    System.out.println("Kein richtigen Username gefunden!!");
                }
            } else {
                System.out.println("Kein gültiges Passwort und Username");

            }

            return null;

        } else {
            System.out.println("Sie haben zu oft nach dem selben Begriff gesucht!");
            return "index.xhtml";
        }

        

    }

    public boolean isValid(String email) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        this.noemailformat = pat.matcher(email).matches();
        return this.noemailformat;
    }


    public String reademail(String username) {
        return dbService.reademail(username);
    }
    
    public String readusername(String email) {
        return dbService.readusername(email);
    }
       
    public String entcryptionEmail(String email) {
        
        String[] email_first_array = email.split(Pattern.quote("@"));
        email_format = email_first_array[0];
        String showemail = email_format.substring(0, 5);
        String encryptionemail = showemail + "xxxxxx@xxxx.xxx";
        return encryptionemail;
        
    }
   
    
//-------------------Email zuruecksetzen------------------------------------
    
//    public String NowDateBefore() {       
//        SimpleDateFormat formatter = new SimpleDateFormat("dd:MM:yyyy");
//        Date currentTime = new Date();
//        //System.out.println(formatter.format(currentTime));
//        return this.DateBefore = formatter.format(currentTime); 
//    }
//    
//    
//    public String NowTimeBefore() {
//        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
//        Date currentTime = new Date();
//        //System.out.println(formatter.format(currentTime));
//        return this.TimeBefore = formatter.format(currentTime);
//    }
    
    
//    public String FullTimeFormat() {
//        this.FullTimeBefore = this.NowDateBefore() + "-" + this.NowTimeBefore();
//        System.out.println(this.FullTimeBefore);
//        return this.FullTimeBefore;
//    }
    
    
    
    
//    //Aktuell mit geschickt!!
//    public String FullTimeBeforeFormat() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime currentTime = LocalDateTime.now();
//        System.out.println(currentTime.format(formatter));
//        return this.FullTimeBefore = currentTime.format(formatter);
//    }
    
    
    
   //1. Variable BeforeDate LocalDate Format: (yyyy-MM-dd))
    
    public String NowDayBefore() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();
        return this.DateBefore = date.format(formatter); 
    }
    
    
    //2. Variable Date 
    
    public String NowTimeBefore() {
        LocalTime startTime = LocalTime.now();
        System.out.println(startTime);
        return this.TimeBefore = startTime.toString();
    }


    public static void main(String[] args) {
         LocalTime startTime =  LocalTime.now();
         System.out.println(startTime);
         System.out.println(startTime.getSecond());
         System.out.println(startTime.getNano());  
         startTime.getNano();
    }
     
     

    
    
    public String emailFormat() {
        String[] email_first_array = this.var_email.split(Pattern.quote("@"));
        email_format = email_first_array[email_first_array.length - 1];
        System.out.println(email_format);
        String[] email_sec_array = email_format.split(Pattern.quote("."));
        email_format = email_sec_array[0];
        System.out.println(email_format);
        return email_format;
    }
    
    
    
    public EmailProvider compare_port_address(String email_format) {
        if (email_format.equals(gmx.getAnbieter())) {
            return gmx;
        } else if (email_format.equals(gmail.getAnbieter())) {
            return gmail;
        } else if (email_format.equals(einsueins.getAnbieter())) {
            return einsueins;
        } else if (email_format.toLowerCase().equals(outlook.getAnbieter())) {
            return outlook;
        } else if (email_format.equals(yahoo.getAnbieter())) {
            return yahoo;
        } else {
            return null;
        }


    }

   

 
    public String passwort_vergessen() {

        if (this.right_email_format) {

            EmailProvider provider = this.compare_port_address(this.emailFormat());
            System.out.println(provider);

            if (provider != null) {

                if (!this.sendemail) {
                    this.sendemail = true;
                    
                    //Benutzername ist vom AK
                    //Passwort AK
                    
                    this.login(smtpHost, smtPort, benutzername, passwort);
                    
                    if (this.sendemail) {
                        this.reset = "";
                        return this.displaySelectedDa();
                    }

                } else {
                    System.out.println("Sendemail ist false");
                }

            } else {
                System.out.println("Kein unterstützenden Provider gefunden!!");
            }
        } else {
            System.out.println("Email Format ungültig!");
        }

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
        //Kunde:
        this.emailUser = this.dbService.readBenutzer(var_username).geteMail();
        
        if (this.emailUser != null) {
            System.out.println("Email konnte versendet werden!!!");
             //this.RightUserEmailFormat();
            this.mailSession = Session.getDefaultInstance(properties, auth);
            this.mailSession.setDebug(true);
            System.out.println("Eingeloggt.");
            this.sendMail(this.emailUser, "Lieber " + this.var_username + " - Passwort zurücksetzen");
        }
        else {
            System.out.println("Email ist nicht vorhanden!!!");
        }
       
        
        

    }

    public void sendMail(String empfaenger, String betreff) {

        try {
            // Erstellt ein MimeMessage Objekt.
            MimeMessage message = new MimeMessage(this.mailSession);

            // Setzt die E-Mail Adresse des Versenders in den E-Mail Header
            message.setFrom(new InternetAddress(absender));

            // Setzt die E-Mail Adresse des Empfängers in den E-Mail Header
            // hier können beliegig viele E-Mail Adressen hinzugefügt werden
            
            //Empfänger:
            
            
            
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
            //BodyPart messageBodyPart = new MimeBodyPart();
            //messageBodyPart.setText("This is message body");
            
            //String anhang = "http://localhost:8086/DA_AK/email_securitycode.xhtml?date="; 
            
            
            //ResetCode speichern und lesen 
            
           
            //Variablen
            this.FullTimeBefore = this.NowTimeBefore();
            this.DateBefore = this.NowDayBefore();
            System.out.println(this.FullTimeBefore);
           
            
            
            
            //Verschlüsselung CompareCode:
            //dbService.composeCompareCode(this.FullTimeBefore, this.var_username);
            //this.compareCode = dbService.encrypt(dbService.composeCompareCode(this.FullTimeBefore, this.var_username) , dbCompareCodeSalt );
            //System.out.println("------CompareCode: " + this.compareCode);
            
            //Verschlüsselung ResetCode
            //dbService.composeresetCode(this.FullTimeBefore, this.sicherheitsantwort);
            //this.resetCodeBefore = dbService.encrypt(dbService.composeresetCode(this.FullTimeBefore, this.sicherheitsantwort), dbResetCodeSalt );
            //System.out.println("------ResetCodeBefore: " + this.resetCodeBefore);
            
            
            //Benuzter_id
            Benutzer b = dbService.readBnId(var_username);
            SicherheitsCode sc = dbService.ReadAdditiveCodeSalt(b.getUser_id());
            System.out.println(sc.getAdditiveCodeSalt());
            this.sanswere = sc.getSicherheitsantwort();
            
            this.compareCode = dbService.entcryptionCompareCode(sc.getSicherheitsantwort(), this.DateBefore, this.FullTimeBefore, dbService.ReadResetCodeSalt(b.getUser_id()).getCompareCodeSalt());
            System.out.println(this.compareCode);

            this.resetCodeBefore = dbService.entcryptionResetCode(sc.getSicherheitsantwort(), this.DateBefore , this.FullTimeBefore, (dbService.ReadResetCodeSalt(b.getUser_id()).getRestCodeSalt()));
            System.out.println(resetCodeBefore);
            
            
            //Mitgeschückte Schlüssel für das Zuruckseten von dem Passwort
            //Verschlüsselung des V2
            this.FullAdditiveCodeSalt = dbService.manipulationCode(dbService.encrypt(this.resetCodeBefore, sc.getAdditiveCodeSalt()));
            System.out.println(this.FullAdditiveCodeSalt);
            
            this.sicherheitsantwort = sc.getSicherheitsantwort();


            if (this.FullAdditiveCodeSalt != null) {
                

                //Versenden der Email:
                message.setContent(
                        "<html>\n"
                        + "\n"
                        + "<head>\n"
                        + "\n"
                        + "\n"
                        + "</head>\n"
                        + "\n"
                        + "<style>\n"
                        + "    h1 {margin-left: 40px;}\n"
                        + "    #wrapper {margin: 0 0 0 0; width: 500px }\n"
                        + "\n"
                        + "    footer { width: 500px; background-color: red; }\n"
                        + "    header { background-color: red; }\n"
                        + "</style>\n"
                        + "\n"
                        + "<body>\n"
                        + "\n"
                        + "\n"
                        + "    <div id=wrapper>\n"
                        + "        <header>\n"
                        + "            <h2><img src=\"selfhtml.png\" alt=\"Selfhtml\"> Diplomarbeiten-Bibliothek </h2>\n"
                        + "        </header>\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "        <h4>Lieber \"Name des Users\"!</h42>\n"
                        + "\n"
                        + "        <h4>Hiermit senden wir Ihnen den Sicherheitscode zum Zurücksetzen ihres Passwortes zu. <br>\n"
                        + "            Hinweis: Die Passwort-Rücksetzung ist zeitlich befristen.</h4>\n"
                        + "\n"
                        + "        <h4>Sicherheitscode:"+  this.FullAdditiveCodeSalt  + "</h4>\n"
                        + "        <h4>Sicherheiantwort:" + this.sicherheitsantwort + "</h4>\n"       
                        + "\n"
                        + "\n"
                        + "\n"
                        + "        <footer>\n"
                        + "\n"
                        + "            <a href=\"url\"><img src=\"test.png\" alt=\"Selfhtml\"></a>\n"
                        + "            <a href=\"url\"><img src=\"test.png\" alt=\"Selfhtml\"></a>\n"
                        + "            <a href=\"url\"><img src=\"test.png\" alt=\"Selfhtml\"></a>\n"
                        + "            <a href=\"url\"><img src=\"test.png\" alt=\"Selfhtml\"></a>\n"
                        + "            <a href=\"url\"><img src=\"test.png\" alt=\"Selfhtml\"></a>\n"
                        + "            <a href=\"url\"><img src=\"test.png\" alt=\"Selfhtml\"></a>\n"
                        + "            \n"
                        + "            <h5>Test Beispiel für einen Footer: Hier könnte dein Name stehen!!!!</h5>\n"
                        + "\n"
                        + "        </footer>\n"
                        + "    </div>\n"
                        + "\n"
                        + "</body>\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "\n"
                        + "</html>", "text/html"
                );
                
                
                // Setzen des Textes
                //messageBodyPart.setText(text);
                // Erstellen eines Multipart Objektes für das ablegen des Textes
                //Multipart multipart = new MimeMultipart();
                // Setzen des Textes
                //multipart.addBodyPart(messageBodyPart);
                // Setzt den Inhalt der E-Mail, Text + Dateianhänge
                //message.setContent(multipart);
                // E-Mail versenden
                
                
                Transport.send(message);

                System.out.println("Sent message successfully....");

            }
            else {
                System.out.println("Code konnte nicht gefunden werden!!");
            }
    
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
    
    
    
    
    
  

    
    
    
//     public static void main(String args[]) {
//    
////        
//////        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
//////        Date currentTime = new Date();
//////        System.out.println(formatter.format(currentTime));
////        
//////        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
//////        Date currentTime = new Date();
//////        System.out.println(formatter.format(currentTime));
////          //zufallsCode.toCharArray()
////
//////        Random rcode = new Random();
//////        int zufallscode = rcode.nextInt(6);
//////        String zufallsCode = String.valueOf(zufallscode);
//////        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
//////        String hash = argon2.hash(4, 1024 * 1024, 8, zufallsCode.toCharArray());
//////        String hash2 = argon2.hash(4, 1024 * 1024, 8, zufallsCode);
//////        System.out.println(hash + "\n" + hash2);
//////
//////        int zufallscode = (int) (Math.random()) + 1;
//////        String zufallsCode = String.valueOf(zufallscode);  
//////        System.out.println(zufallscode);
//
////            String dateTime = "2018-09-25T10:13:14.74";
////            LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_DATE_TIME);
////            System.out.println("ISO Date Time is " + localDateTime);
//            
////            Date currentTime = new Date();
////            System.out.println(currentTime.toString());
//            
//           String t1 =  "2020-04-05 11:32:38.377";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDate data2 = LocalDate.parse(t1, formatter);
//        System.out.println(data2);
//            
//
// }
//     
     


    
}
