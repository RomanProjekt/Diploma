/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author patri
 */
public class Benutzer {

    private int user_id;
    private String username;
    private String firstname;
    private String lastname;
    private String passWd;
    private String salt;
    private String role;
    private String eMail;
    
    private boolean editable;
    private int sicherheitscode_id;

    
    
    
    public Benutzer(int user_id, String username, String firstname, String lastname, String passWd, String salt, String role, String eMail, int sicherheitscode_id) {
        this.user_id = user_id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.passWd = passWd;
        this.salt = salt;
        this.role = role;
        this.eMail = eMail;
        this.sicherheitscode_id = sicherheitscode_id;
    }

    public Benutzer(int user_id, String username, String firstname, String lastname, String passWd, String salt, String role, String eMail) {
        this.user_id = user_id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.passWd = passWd;
        this.salt = salt;
        this.role = role;
        this.eMail = eMail;
    }

    public Benutzer(int user_id, String username, String firstname, String lastname, String role) {
        this.user_id = user_id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }

    public Benutzer() {

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

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
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

    public String geteMail() {
        return eMail;
    }

    public boolean isEditable() {
        return editable;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public int getSicherheitscode_id() {
        return sicherheitscode_id;
    }

    public void setSicherheitscode_id(int sicherheitscode_id) {
        this.sicherheitscode_id = sicherheitscode_id;
    }
    
    

}
