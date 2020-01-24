/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pojo.Benutzer;

/**
 *
 * @author patri
 */
public class benutzerBean {

    private int user_id;
    private String userName;
    private String firstName;
    private String lastName;
    private String passWd;
    private String salt;
    private String role;
    private String eMail;

    List<Benutzer> bList; //künstliche Datenbank, the following code is merely for testing

    /**
     * Creates a new instance of benutzerBean
     */
    public benutzerBean() {
        user_id = 0;
        bList = new ArrayList<>();
    }

    public Object register() { //registerbean
        int listsize = bList.size();
        bList.add(new Benutzer(++user_id, userName, firstName, lastName, passWd, salt, role, eMail));
        if (listsize != bList.size()) {
            System.out.println("User added");
        }
        //in die datenbank schreiben
        //tryout, still testing
        return null;
    }
    
    

    public Object login() {
        /* int cnt=0;
        Iterator it = bList.iterator();
        for(Benutzer b : bList) {
            cnt++;
            while(it.hasNext()) {
                if(it.next().equals(bList.get(cnt))) {
                    
                }
                
            }
        }

         */ for (Benutzer b : bList) {
            if (b == new Benutzer(user_id, userName, firstName, lastName, passWd, salt, role, eMail)) {
                if( b.getPassWd() == passWd) {
                    System.out.println("User vorhanden");
                }
            }
        }
        //login
        return null;
    }
}
