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
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import pojo.SicherheitsCode;
import static presentation.EmailProvider.mbenutzername;

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
    private String bestaetigtespw;
    private boolean passwortcorrekt;

    private SicherheitsCode c;
    private String message;

    private String securityanswer;
    private String compareCodeSalt;
    private String resetCodeSalt;
    private String additiveCodeSalt;
    private boolean isSicherheitsAntwortNull;

    private String DateBefore;
    private String TimeBefore;
    private String mainKey;
    private boolean isemail;
    private boolean emailfail;

    public registerBean() {
    }

    @PostConstruct
    void init() {

    }

    public Object register() {
        
        if (!(dbService.usernameExists(username))) {
            HashMap<Integer, String> mape;
            mape = new HashMap<>();
            Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
            String hash = argon2.hash(4, 1024 * 1024, 8, pw.toCharArray());

            if (this.comparePasswort()) {

                if (this.compareEmailAddress()) {
                    b = new Benutzer(0, username, firstName, lastName, hash, "salt", "User", email);
                    int result = dbService.insertBenutzer(b);

                    if (result == 1) {
                        b = dbService.load(username);

                        if (this.securityanswer != null) {

                            c = new SicherheitsCode(0, b.getUser_id(),
                                    dbService.entcryptionSecurityAnswer(this.securityanswer, b.getUser_id()),
                                    dbService.entcyptioncompareCodeSalt(this.securityanswer, this.NowDayBefore(), this.NowTimeBefore()),
                                    dbService.entcyptioncompareResetCodeSalt(username, this.NowDayBefore(), this.NowTimeBefore()),
                                    dbService.additiveCodeSalt());

                        }

                        dbService.setLoggedInBenutzer(b);
                        dbService.insertSicherheitsCode(c, b);
                        clearLogin();
                        this.emailfail = false;
                        return "success";

                    }

                }
                this.emailfail = true;
                return "fail";

            }
            else {
                System.out.println("Passwort ist nicht correkt!!");
                return "fail";
            }

        }
        return "fail";
    }

    public void clearLogin() {
        username = "";
        firstName = "";
        lastName = "";
        email = "";
        pw = "";
        this.securityanswer = "";
        message = "";
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

    public boolean isIsemail() {
        return isemail;
    }

    public void setIsemail(boolean isemail) {
        this.isemail = isemail;
    }

    public boolean isEmailfail() {
        return emailfail;
    }

    public void setEmailfail(boolean emailfail) {
        this.emailfail = emailfail;
    }

    public String getBestaetigtespw() {
        return bestaetigtespw;
    }

    public void setBestaetigtespw(String bestaetigtespw) {
        this.bestaetigtespw = bestaetigtespw;
    }

    public boolean isPasswortcorrekt() {
        return passwortcorrekt;
    }

    public void setPasswortcorrekt(boolean passwortcorrekt) {
        this.passwortcorrekt = passwortcorrekt;
    }

    //Verschlüsselung:
    public SicherheitsCode getC() {
        return c;
    }

    public void setC(SicherheitsCode c) {
        this.c = c;
    }

    public String getSecurityanswer() {
        return securityanswer;
    }

    public void setSecurityanswer(String securityanswer) {
        this.securityanswer = securityanswer;
    }

    public String getCompareCodeSalt() {
        return compareCodeSalt;
    }

    public void setCompareCodeSalt(String compareCodeSalt) {
        this.compareCodeSalt = compareCodeSalt;
    }

    public String getResetCodeSalt() {
        return resetCodeSalt;
    }

    public void setResetCodeSalt(String resetCodeSalt) {
        this.resetCodeSalt = resetCodeSalt;
    }

    public String getAdditiveCodeSalt() {
        return additiveCodeSalt;
    }

    public void setAdditiveCodeSalt(String additiveCodeSalt) {
        this.additiveCodeSalt = additiveCodeSalt;
    }

    public String getDateBefore() {
        return DateBefore;
    }

    public void setDateBefore(String DateBefore) {
        this.DateBefore = DateBefore;
    }

    public String getTimeBefore() {
        return TimeBefore;
    }

    public void setTimeBefore(String TimeBefore) {
        this.TimeBefore = TimeBefore;
    }

    public boolean isIsSicherheitsAntwortNull() {
        return isSicherheitsAntwortNull;
    }

    public void setIsSicherheitsAntwortNull(boolean isSicherheitsAntwortNull) {
        this.isSicherheitsAntwortNull = isSicherheitsAntwortNull;
    }

    public String getMainKey() {
        return mainKey;
    }

    public void setMainKey(String mainKey) {
        this.mainKey = mainKey;
    }

    public String MainKey() {
        return this.mainKey = dbService.encrypt(this.securityanswer, (this.securityanswer + this.NowTimeBefore()));
    }

    public String NowDayBefore() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.now();
        return this.DateBefore = date.format(formatter);
    }

    //2. Variable Date 
    public String NowTimeBefore() {
        LocalTime startTime = LocalTime.now();
        System.out.println(startTime);
        return this.TimeBefore = startTime.toString();
    }

    public boolean compareEmailAddress() {
        return this.isemail = dbService.compare(this.email);
    }

    public boolean comparePasswort() {

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        this.pw = argon2.hash(4, 1024 * 1024, 8, pw.toCharArray());
        Benutzer b = dbService.readBenutzer(username);

        //this.isAltesPasswortInputTextF = false;
        if (argon2.verify(this.pw, this.bestaetigtespw.toCharArray())) {
            System.out.println("Passwort ist correkt!");
            return this.passwortcorrekt = true;

        } else {
            System.out.println("Geben sie ein neues Passwort ein!");
            return this.passwortcorrekt = false;

        }

    }

}
