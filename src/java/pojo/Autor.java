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
public class Autor {
    private int autor_id;
    private String fullName;
    private String da_id;

    public Autor(int autor_id, String fullName, String da_id) {
        this.autor_id = autor_id;
        this.fullName = fullName;
        this.da_id = da_id;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDa_id() {
        return da_id;
    }

    public void setDa_id(String da_id) {
        this.da_id = da_id;
    }
    
}
