/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

/**
 *
 * @author hp
 */
public class Testklasse {
    
    public String mainEncryption(String securityanswer, int id) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        return argon2.hash(4, 1024 * 1024, 8, (String.valueOf(id) + securityanswer).toCharArray());
    }

//    public String entcryptionSecurityAnswer(String securityanswer, int id) {
//        String schlüssel = securityanswer + String.valueOf(id);
//        //String firstEnc =  this.manipulationCode(this.encrypt(this.composeSecurityAnswer(securityanswer, benutzername, date, time), this.mainEncryption()));
//        return  this.manipulationCode(this.encrypt( schlüssel , this.mainEncryption(securityanswer, id)));
//
//    }

    public String manipulationCode(String code) {
        return code.substring(0, 15);
    }

    public static void main(String[] args) {
        Testklasse db = new Testklasse();
        System.out.println(db.mainEncryption("patrick",12));
        System.out.println(db.mainEncryption("patrick",13));
    }
    
}
