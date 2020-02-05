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
 * @author patri
 */
public class registerBean {

    private Benutzer b;
    private DatabaseManagerService dbService;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String pw;

    public registerBean() {
    }

    @PostConstruct
    void init() {

    }

    public Object register() {

        b = new Benutzer(0, username, firstName, lastName, pw, "salt", "User", email);
        int result = dbService.insertBenutzer(b);
        if (result == 1) {
            b = dbService.load(username);
            dbService.setLoggedInBenutzer(b);
            return "success";
        }
        return "fail";
    }

    public Benutzer getB() {
        return b;
    }

    public void setB(Benutzer b) {
        this.b = b;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

}
