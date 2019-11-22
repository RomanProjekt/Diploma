/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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

    /**
     * Creates a new instance of benutzerBean
     */
    public benutzerBean() {
        
    }
    
    public Object register() {
        //in die datenbank schreiben
        return null;
    }
    
    

}
