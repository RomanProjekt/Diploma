/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import pojo.Benutzer;
import static presentation.EmailProvider.mbenutzername;
import static presentation.EmailProvider.passwort;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class passwortresetBean {

    private String pw;
    private String bestaetigtespw;
    private DatabaseManagerService dbService;
    private String benutzername;
    String smtpHost = "mail.gmx.net";
    String smtPort = "587";
    
    private String altesPasswort;
    private String bestaetigtesAltesPasswort;
    private boolean altesPasswortNULL;
    private boolean compareOldPassword;
    
    private String eingabeSicherheitsantwort;
    private String dbSicherheitscode;
    private boolean comparedbSicherheitscode;
    private String addativeSecSalt;
    private String compareSecCode;
    
    private String message;
    private String messagePasswort;
    private boolean showmessage;
    private boolean showmessagePasswort;
    
    
    private boolean passwortalert;

    public passwortresetBean() {
    }

    @PostConstruct
    public void init() {

    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getBestaetigtespw() {
        return bestaetigtespw;
    }

    public void setBestaetigtespw(String bestaetigtespw) {
        this.bestaetigtespw = bestaetigtespw;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }


    public String getAltesPasswort() {
        return altesPasswort;
    }

    public void setAltesPasswort(String altesPasswort) {
        this.altesPasswort = altesPasswort;
    }

    public String getBestaetigtesAltesPasswort() {
        return bestaetigtesAltesPasswort;
    }

    public void setBestaetigtesAltesPasswort(String bestaetigtesAltesPasswort) {
        this.bestaetigtesAltesPasswort = bestaetigtesAltesPasswort;
    }

    public boolean isAltesPasswortNULL() {
        return altesPasswortNULL;
    }

    public void setAltesPasswortNULL(boolean altesPasswortNULL) {
        this.altesPasswortNULL = altesPasswortNULL;
    }

    public boolean isCompareOldPassword() {
        return compareOldPassword;
    }

    public void setCompareOldPassword(boolean compareOldPassword) {
        this.compareOldPassword = compareOldPassword;
    }

    public String getEingabeSicherheitsantwort() {
        return eingabeSicherheitsantwort;
    }

    public void setEingabeSicherheitsantwort(String eingabeSicherheitsantwort) {
        this.eingabeSicherheitsantwort = eingabeSicherheitsantwort;
    }

    public String getDbSicherheitscode() {
        return dbSicherheitscode;
    }

    public void setDbSicherheitscode(String dbSicherheitscode) {
        this.dbSicherheitscode = dbSicherheitscode;
    }

    public boolean isComparedbSicherheitscode() {
        return comparedbSicherheitscode;
    }

    public void setComparedbSicherheitscode(boolean comparedbSicherheitscode) {
        this.comparedbSicherheitscode = comparedbSicherheitscode;
    }

    public String getAddativeSecSalt() {
        return addativeSecSalt;
    }

    public void setAddativeSecSalt(String addativeSecSalt) {
        this.addativeSecSalt = addativeSecSalt;
    }

    public String getCompareSecCode() {
        return compareSecCode;
    }

    public void setCompareSecCode(String compareSecCode) {
        this.compareSecCode = compareSecCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessagePasswort() {
        return messagePasswort;
    }

    public void setMessagePasswort(String messagePasswort) {
        this.messagePasswort = messagePasswort;
    }

    public boolean isShowmessage() {
        return showmessage;
    }

    public void setShowmessage(boolean showmessage) {
        this.showmessage = showmessage;
    }

    public boolean isShowmessagePasswort() {
        return showmessagePasswort;
    }

    public void setShowmessagePasswort(boolean showmessagePasswort) {
        this.showmessagePasswort = showmessagePasswort;
    }

    public boolean isPasswortalert() {
        return passwortalert;
    }

    public void setPasswortalert(boolean passwortalert) {
        this.passwortalert = passwortalert;
    }
    
    
    
    
    

    public String loggout() {
        dbService.loggout();
        this.pw = "";
        this.bestaetigtespw = "";
        this.passwortalert = true;
        return "login.xhtml?faces-redirect=true;includeViewParams=true";
    }
    
   
    
    public String speichernPasswortUser(String username, String prdate) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        this.pw = argon2.hash(4, 1024 * 1024, 8, pw.toCharArray());
        Benutzer b = dbService.readBenutzer(username);

        if (this.CompareSicherheitsAntwort(b, prdate)) {

                //this.isAltesPasswortInputTextF = false;
                if (argon2.verify(this.pw, this.bestaetigtespw.toCharArray())) {
                    System.out.println("Du bist ein User!!");
                    System.out.println("Passwort eingabe richtig!!!");
                    System.out.println("----------------------" + username);

                    
                    System.out.println("Benutzer: " + b.getFirstname());
                    System.out.println("-------------------------------------");
                    int reset = dbService.updateNewPasswort(this.pw, b);
                    if (reset > 0) {
                        System.out.println("Passwort wurde erfolgreich zurückgesetzt!");
                        dbService.login(smtpHost, smtPort, mbenutzername, passwort, dbService.load(username));
                        return this.loggout();
                    } else {
                        System.out.println("Passwort konnte nicht gespeichert werden");
                    }

                } else {
                    this.messagePasswort = "Passwort ist nicht correct!";
                    System.out.println("Geben sie ein neues Passwort ein!");
                }

            } else {
                    this.message = "Sicherheitsantwort ist nicht correct!";
            }
        
            
        
        return "passwort_reset.xhtml?faces-redirect=true&amp;includeViewParams=true";
    }
    
    
    public String speichernPasswortBenutzer() {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        this.pw = argon2.hash(4, 1024 * 1024, 8, pw.toCharArray());
        
        System.out.println("Du wurdest als Benutzer angemeldet!");

            if (this.CompareOldPassword()) {
                
                if (argon2.verify(this.pw, this.bestaetigtespw.toCharArray())) {
                    //System.out.println("Du bist als Benutzer angemeldet!!");
                    //System.out.println("Passwort eingabe richtig!!!");
                    //System.out.println(this.pw);
                    int reset = dbService.updateNewPasswort(this.pw, dbService.getLoggedInBenutzer());
                    if (reset > 0) {
                        System.out.println("Passwort wurde erfolgreich zurückgesetzt!" + dbService.getLoggedInBenutzer().getUsername());
                        dbService.login(smtpHost, smtPort, mbenutzername, passwort, dbService.getLoggedInBenutzer());
                        this.bestaetigtesAltesPasswort = "";
                        return this.loggout();
                    } else {
                        System.out.println("Passwort konnte nicht gespeichert werden!!!!");

                    }

                } else {
                    this.messagePasswort = "Passwort sind nicht correct!";
                    System.out.println("Geben sie ein neues Passwort ein!");
                }
            }else {
                this.message = "Altes Passwort ist nicht richtig!!!";
                System.out.println("Altes Passwort ist nicht richtig!!!");
            }
        
        return "passwort_reset.xhtml?faces-redirect=true&amp;includeViewParams=true";

    }
    
    
   
    
    
    
    
//Alter Code
//    public String speichernPasswort(String username, String prdate) {
//
//        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
//        
//        System.out.println("verschlusselter Code" + this.pw + "-------------------------");
//        System.out.println("--------" + username);
//        Benutzer b = dbService.readBenutzer(username);
//
//        this.benutzername = username;
//        
//        System.out.println("-------------------------------" + this.benutzername);
//
//        if (!dbService.isUser()) {
//            System.out.println("Du wurdest als Benutzer angemeldet!");
//
//            if (this.CompareOldPassword()) {
//                
//                if (argon2.verify(this.pw, this.bestaetigtespw.toCharArray())) {
//                    //System.out.println("Du bist als Benutzer angemeldet!!");
//                    //System.out.println("Passwort eingabe richtig!!!");
//                    //System.out.println(this.pw);
//                    int reset = dbService.updateNewPasswort(this.pw, dbService.getLoggedInBenutzer());
//                    if (reset > 0) {
//                        System.out.println("Passwort wurde erfolgreich zurückgesetzt!" + dbService.getLoggedInBenutzer().getUsername());
//                        dbService.login(smtpHost, smtPort, mbenutzername, passwort, dbService.getLoggedInBenutzer());
//                        this.bestaetigtesAltesPasswort = "";
//                        return this.loggout();
//                    } else {
//                        System.out.println("Passwort konnte nicht gespeichert werden!!!!");
//
//                    }
//
//                } else {
//                    System.out.println("Geben sie ein neues Passwort ein!");
//                }
//            }else {
//                System.out.println("Altes Passwort ist nicht richtig!!!");
//            }
//
//        } else {
//            
//            
//            if (this.CompareSicherheitsAntwort(b, addativeSecSalt, prdate)) {
//
//                //this.isAltesPasswortInputTextF = false;
//                if (argon2.verify(this.pw, this.bestaetigtespw.toCharArray())) {
//                    System.out.println("Du bist ein User!!");
//                    System.out.println("Passwort eingabe richtig!!!");
//                    System.out.println("----------------------" + username);
//
//                    
//                    System.out.println("Benutzer: " + b.getFirstname());
//                    System.out.println("-------------------------------------");
//                    int reset = dbService.updateNewPasswort(this.pw, b);
//                    if (reset > 0) {
//                        System.out.println("Passwort wurde erfolgreich zurückgesetzt!");
//                        dbService.login(smtpHost, smtPort, mbenutzername, passwort, dbService.load(username));
//                        return this.loggout();
//                    } else {
//                        System.out.println("Passwort konnte nicht gespeichert werden");
//                    }
//
//                } else {
//                    System.out.println("Geben sie ein neues Passwort ein!");
//                }
//
//            }
//
//        }
//
//        return "passwort_reset.xhtml?faces-redirect=true&amp;includeViewParams=true";
//    }
    
    
    public boolean CompareOldPassword() {

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

        this.altesPasswort = this.dbService.getLoggedInBenutzer().getPassWd();
        
        System.out.println("Passwort: " + this.altesPasswort);

        if (this.altesPasswort != null) {

            this.altesPasswortNULL = true;

            if (argon2.verify(this.altesPasswort, this.bestaetigtesAltesPasswort.toCharArray())) {
                this.altesPasswortNULL = true;
                return this.compareOldPassword = true;

            } else {
                return this.compareOldPassword = false;
            }

        } else {
            return this.compareOldPassword = false;
        }

        
    }
    
    
    public boolean CompareSicherheitsAntwort(Benutzer b, String prdate ) {
          
        if(this.composeEmailCompareSecCode(b, prdate).equals(this.composePasswortResetBeanCompareSecCode(b, prdate))) {
            System.out.println("Sicherheitsantwort ist richtig!");
            return true;
        }
        else {
            System.out.println("Sicherheitsantwort ist falsch");
            return false;
        }

        
    }
    
    //this.dbSicherheitscode = dbService.ReadSicherheitsantwort(b.getUser_id()).getSicherheitsantwort();
    
    public String composeEmailCompareSecCode(Benutzer b, String prdate) {
        this.addativeSecSalt = dbService.ReadAddativeSecSalt(String.valueOf(b.getUser_id()), b.getUsername(), prdate);
        return dbService.manipulationCode(dbService.encrypt(this.eingabeSicherheitsantwort, this.addativeSecSalt));
    }
    
    public String composePasswortResetBeanCompareSecCode(Benutzer b, String prdate) {
        this.addativeSecSalt = dbService.ReadAddativeSecSalt(String.valueOf(b.getUser_id()), b.getUsername(), prdate);
        this.dbSicherheitscode = dbService.ReadSicherheitsantwort(b.getUser_id()).getSicherheitsantwort();
        return dbService.manipulationCode(dbService.encrypt(this.dbSicherheitscode, this.addativeSecSalt));
    }

}
