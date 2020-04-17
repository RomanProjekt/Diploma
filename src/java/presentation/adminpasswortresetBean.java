/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import pojo.Benutzer;
import static presentation.EmailProvider.mbenutzername;
import static presentation.EmailProvider.passwort;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class adminpasswortresetBean {
    
    
    
    private String pw;
    private String bestaetigtespw;
    private DatabaseManagerService dbService;
    private String benutzerid;
    private String isUserfound;
    private String messagePasswort;


    public adminpasswortresetBean() {
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

    public String getBenutzerid() {
        return benutzerid;
    }

    public void setBenutzerid(String benutzerid) {
        this.benutzerid = benutzerid;
    }
    
    public String loggout() {
        dbService.loggout();
        this.pw = "";
        this.bestaetigtespw = "";
        return "login.xhtml?faces-redirect=true";
    }

    public String getIsUserfound() {
        return isUserfound;
    }

    public void setIsUserfound(String isUserfound) {
        this.isUserfound = isUserfound;
    }

    public String getMessagePasswort() {
        return messagePasswort;
    }

    public void setMessagePasswort(String messagePasswort) {
        this.messagePasswort = messagePasswort;
    }
    
    
    
    
    
      public String speichernPasswortAdmin(Benutzer b) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        this.pw = argon2.hash(4, 1024 * 1024, 8, pw.toCharArray());
        
        System.out.println("Du wurdest als Admin angemeldet!");

             if(b != null) {
                      
                if (argon2.verify(this.pw, this.bestaetigtespw.toCharArray())) {
                    //System.out.println("Du bist als Benutzer angemeldet!!");
                    //System.out.println("Passwort eingabe richtig!!!");
                    //System.out.println(this.pw);
                    int reset = dbService.updateAdminNewPasswort(this.pw, b.getUser_id());
                    if (reset > 0) {
                        System.out.println("Passwort wurde erfolgreich zurückgesetzt!" + dbService.getLoggedInBenutzer().getUsername());
                        return this.loggout();
                    } else {
                        System.out.println("Passwort konnte nicht gespeichert werden!!!!");

                    }

                } else {
                    this.messagePasswort = "Geben sie ein neues Passwort ein!";
                    System.out.println("Geben sie ein neues Passwort ein!");
                }
             }else {
                 System.out.println("Benutzer ist nicht vorhanden");
             }
           
          
        
        return "passwort_reset.xhtml?includeViewParams=true";

    }

    
}
