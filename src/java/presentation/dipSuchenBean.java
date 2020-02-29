/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import infrastructure.DiplomarbeitDAO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import pojo.Diplomarbeit;

/**
 *
 * @author patri
 */
public class dipSuchenBean {

    String key="";
    DiplomarbeitDAO obj;
    List<Diplomarbeit> daList;
    Diplomarbeit selectedDa;
    List<Diplomarbeit> recentDaList;
    Boolean sBool=false;
    //favoriten auch so?
    public dipSuchenBean() {
        
    }
    @PostConstruct
    void init() {
        obj = new DiplomarbeitDAO();
        daList = new ArrayList<>();
        recentDaList = new ArrayList<>(); //favoriten aus der db laden?
    }
    
    public Object selectDA() {
        daList=obj.Suchleiste(key);
        sBool=true;
        selectedDa = daList.get(0); //null check?, andere select bar machen
        return null;
    }
    
    public Object recentDa() {
        for(Diplomarbeit ar : daList) {
            recentDaList.add(ar);
        }
        return null;
    }
    
    
    public String displaySelectedDa() { //String navigation, or display with button? auf out of bound prüfen und basisliste bei leer?
        return "switchda";              //listener für click action
    }
    
    
    //public void displaySelectedDa(ActionEvent e) {
    //    
    //}
    
    /*public void resetKey() {
        if(sBool == true) {
            key="";
        }
        sBool=false;
    }*/

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Diplomarbeit> getDaList() {
        return daList;
    }

    public void setDaList(List<Diplomarbeit> daList) {
        this.daList = daList;
    }

    public Diplomarbeit getSelectedDa() {
        return selectedDa;
    }

    public void setSelectedDa(Diplomarbeit selectedDa) {
        this.selectedDa = selectedDa;
    }

    public Boolean getsBool() {
        return sBool;
    }

    public void setsBool(Boolean sBool) {
        this.sBool = sBool;
    }

    public List<Diplomarbeit> getRecentDaList() {
        return recentDaList;
    }

    public void setRecentDaList(List<Diplomarbeit> recentDaList) {
        this.recentDaList = recentDaList;
    }
    
    
    
    
    
}
