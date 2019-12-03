/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import pojo.Benutzer;
import service.DatabaseManagerService;

/**
 *
 * @author dople
 */
public class benutzerverwaltungBean {

    private int user_id;
    private Benutzer benutzer;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String rolle;
    private String password;
    private ArrayList<Benutzer> benutzerList;
    private DatabaseManagerService dbService;
    private int result;
    private boolean newUser;

    /**
     * Creates a new instance of benutzerverwaltungBean
     */
    public benutzerverwaltungBean() {
        benutzer = new Benutzer();
    }

    @PostConstruct
    void init() {
        benutzerList = dbService.getAllBenutzer();
    }

    public ArrayList<Benutzer> getBenutzerList() {
        return benutzerList;
    }

    public void setBenutzerList(ArrayList<Benutzer> benutzerList) {
        this.benutzerList = benutzerList;
    }

    public Object add() {
        return null;
    }

    public Object delete(int id) {
        result = dbService.deleteBenutzer(id);
        benutzerList = dbService.getAllBenutzer();
        return null;
    }

    public Object modify(Benutzer b) {
        b.setEditable(true);
        return null;
    }

    public Object save(Benutzer b) {
        b.setEditable(false);
        result = dbService.updateBenutzer(b);
        benutzerList = dbService.getAllBenutzer();
        return null;
    }

    public Object saveUser() {
        benutzer = new Benutzer(5, username, firstname, lastname, password, "Test", rolle, email);
        result = dbService.insertBenutzer(benutzer);
        if (result == 1) {
            benutzerList = dbService.getAllBenutzer();
        }
        newUser = false;
        return null;
    }

    public Object resetUser() {
        username = null;
        return null;
    }

    public Object showNewUser() {
        newUser = true;
        return null;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public int getResult() {
        return result;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getRolle() {
        return rolle;
    }

    public String getPassword() {
        return password;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public boolean isNewUser() {
        return newUser;
    }

    public void setNewUser(boolean newUser) {
        this.newUser = newUser;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

}
