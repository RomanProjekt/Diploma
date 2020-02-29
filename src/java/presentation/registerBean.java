/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.nio.charset.Charset;
import java.util.Random;
import pojo.Benutzer;
import javax.annotation.PostConstruct;
import service.DatabaseManagerService;
import java.nio.charset.StandardCharsets.*;
import static java.nio.charset.StandardCharsets.UTF_16;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.time.Duration;
import java.time.Instant;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.HashMap;

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
    private String message;

    public registerBean() {
    }

    @PostConstruct
    void init() {

    }

    public Object register() {
        HashMap<Integer, String> mape;
        mape = new HashMap<>();
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(4, 1024 * 1024, 8, pw.toCharArray());

        b = new Benutzer(0, username, firstName, lastName, hash, "salt", "User", email);
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
