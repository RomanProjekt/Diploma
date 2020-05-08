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
import service.DatabaseManagerService;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.io.Serializable;



public class loginBean implements Serializable {

    private Benutzer b;
    private DatabaseManagerService dbService;
    private int benID;
    private String message;
    private String pw;
    private String username;
    private boolean alert;
    
    
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String deaktivierenLink() {
        return this.link = "index";
    }
    
    
    public loginBean() {}

    @PostConstruct
    void init() {}

    private String previousPage = null;

    public boolean isAlert() {
        return alert;
    }

    public void setAlert(boolean alert) {
        this.alert = alert;
    }
    
    
    

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
                return "index.xhtml";
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
        this.alert = true;
        
        return "index.xhtml?faces-redirect=true";
    }
    
    public Object loggin() {
        this.alert = false;
        return "login.xhtml";
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
  

}
