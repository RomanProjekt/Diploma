/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import pojo.Benutzer;
import javax.annotation.PostConstruct;
import service.DatabaseManagerService;

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

    public loginBean() {
    }

    @PostConstruct
    void init() {

    }

    public Object load() {
        b = dbService.load(username);

        if (b != null) {
            if (pw.equals(b.getPassWd())) {
                dbService.setLoggedInBenutzer(b);
                return "success";
            } else {
                message = "Username or Password are wrong!";
            }

        } else {
            message = "Username or Password are wrong!";
        }
        return "fail";
    }

    public Object loggout() {
        dbService.loggout();
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

}
