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
public class SW_DA {
    private int sw_id;
    private int da_id;

    public SW_DA(int sw_id, int da_id) {
        this.sw_id = sw_id;
        this.da_id = da_id;
    }

    public int getSw_id() {
        return sw_id;
    }

    public void setSw_id(int sw_id) {
        this.sw_id = sw_id;
    }

    public int getDa_id() {
        return da_id;
    }

    public void setDa_id(int da_id) {
        this.da_id = da_id;
    }
    
    
}
