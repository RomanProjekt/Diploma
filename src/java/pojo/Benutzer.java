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
    private String userName;
    private String firstName;
    private String lastName;
    private String passWd;
    private String salt;
    private String role;
    private String eMail;

    public Benutzer(int user_id, String userName, String firstName, String lastName, String passWd, String salt, String role, String eMail) {
        this.user_id = user_id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.passWd = passWd;
        this.salt = salt;
        this.role = role;
        this.eMail = eMail;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

}
