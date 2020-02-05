/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import javax.annotation.PostConstruct;
import pojo.Benutzer;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class meinKontoBean {

    private Benutzer loggedInUser;
    private int user_id;
    private String username;
    private String firstname;
    private String lastname;
    private String passWd;
    private String salt;
    private String role;
    private String email;

    private DatabaseManagerService dbService;

    public meinKontoBean() {
    }

    @PostConstruct
    public void init() {
        loggedInUser = dbService.getLoggedInBenutzer();
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object updateBenutzer() {
        return null;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public Benutzer getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(Benutzer loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

}
