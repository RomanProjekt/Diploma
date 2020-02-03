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
public class Schule {
    
        private int schule_id;
    private String schule;

    public Schule(int schule_id, String schule) {
        this.schule_id = schule_id;
        this.schule = schule;
    }

    public int getSchule_id() {
        return schule_id;
    }

    public void setSchule_id(int schule_id) {
        this.schule_id = schule_id;
    }

    public String getSchule() {
        return schule;
    }

    public void setSchule(String schule) {
        this.schule = schule;
    }
}

    

