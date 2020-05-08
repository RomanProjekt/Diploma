/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;

/**
 *
 * @author patri
 */
public class Favoriten implements Serializable {
    
    private int user_id;
    private int da_id;

    public Favoriten(int user_id, int da_id) {
        this.user_id = user_id;
        this.da_id = da_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getDa_id() {
        return da_id;
    }

    public void setDa_id(int da_id) {
        this.da_id = da_id;
    }
    
}
