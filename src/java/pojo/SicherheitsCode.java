/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author hp
 */
public class SicherheitsCode {
    
    private int sicherheitscode_id;
    private int benutzer_id;
    private String sicherheitsantwort;
    private String sa_salt;
    private String compareCodeSalt;
    private String restCodeSalt;
    private String additiveCodeSalt;
    

    public SicherheitsCode(int sicherheitscode_id, int benutzer_id, String sicherheitsantwort, String compareCodeSalt, String restCodeSalt, String additiveCodeSalt) {
        this.sicherheitscode_id = sicherheitscode_id;
        this.benutzer_id = benutzer_id;
        this.sicherheitsantwort = sicherheitsantwort;
        this.compareCodeSalt = compareCodeSalt;
        this.restCodeSalt = restCodeSalt;
        this.additiveCodeSalt = additiveCodeSalt;
    }

//    public SicherheitsCode(int sicherheitscode_id, int benutzer_id, String sicherheitsantwort, String sa_salt, String compareCodeSalt, String restCodeSalt, String additiveCodeSalt) {
//        this.sicherheitscode_id = sicherheitscode_id;
//        this.benutzer_id = benutzer_id;
//        this.sicherheitsantwort = sicherheitsantwort;
//        this.sa_salt = sa_salt;
//        this.compareCodeSalt = compareCodeSalt;
//        this.restCodeSalt = restCodeSalt;
//        this.additiveCodeSalt = additiveCodeSalt;
//    }
    
    

    public int getSicherheitscode_id() {
        return sicherheitscode_id;
    }

    public void setSicherheitscode_id(int sicherheitscode_id) {
        this.sicherheitscode_id = sicherheitscode_id;
    }

    public int getBenutzer_id() {
        return benutzer_id;
    }

    public void setBenutzer_id(int benutzer_id) {
        this.benutzer_id = benutzer_id;
    }

    public String getSicherheitsantwort() {
        return sicherheitsantwort;
    }

    public void setSicherheitsantwort(String sicherheitsantwort) {
        this.sicherheitsantwort = sicherheitsantwort;
    }

    public String getCompareCodeSalt() {
        return compareCodeSalt;
    }

    public void setCompareCodeSalt(String compareCodeSalt) {
        this.compareCodeSalt = compareCodeSalt;
    }

    public String getRestCodeSalt() {
        return restCodeSalt;
    }

    public void setRestCodeSalt(String restCodeSalt) {
        this.restCodeSalt = restCodeSalt;
    }

    public String getAdditiveCodeSalt() {
        return additiveCodeSalt;
    }

    public void setAdditiveCodeSalt(String additiveCodeSalt) {
        this.additiveCodeSalt = additiveCodeSalt;
    }

    public String getSa_salt() {
        return sa_salt;
    }

    public void setSa_salt(String sa_salt) {
        this.sa_salt = sa_salt;
    }
    
    
    
    
}
