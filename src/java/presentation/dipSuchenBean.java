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
    Boolean sBool=false;
    
    public dipSuchenBean() {
        
    }
    @PostConstruct
    void init() {
        obj = new DiplomarbeitDAO();
        daList = new ArrayList<>();
    }
    
    public Object selectDA() {
        daList=obj.Suchleiste(key);
        sBool=true;
        selectedDa = daList.get(0); //null check?
        return null;
    }
    
    public String displaySelectedDa() { //String navigation, or display with button? auf out of bound prüfen und basisliste bei leer?
        return "switchda";
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
    
    
    
    
    
}
