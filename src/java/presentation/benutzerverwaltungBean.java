/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.util.ArrayList;
import pojo.Benutzer;

/**
 *
 * @author dople
 */
public class benutzerverwaltungBean {
    private ArrayList<Benutzer> benutzerList;
    
    
    
    /**
     * Creates a new instance of benutzerverwaltungBean
     */
    public benutzerverwaltungBean() {
        benutzerList = new ArrayList<>();
        benutzerList.add(new Benutzer(1, "maxEthen", "Patrick", "Dopler", null, null, "Admin", "doplerpatrick@gmail.com"));
    }

    public ArrayList<Benutzer> getBenutzerList() {
        return benutzerList;
    }

    public void setBenutzerList(ArrayList<Benutzer> benutzerList) {
        this.benutzerList = benutzerList;
    }
    
   
    
}
