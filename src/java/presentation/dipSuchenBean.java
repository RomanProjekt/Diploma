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
import pojo.Diplomarbeit;

/**
 *
 * @author patri
 */
public class dipSuchenBean {

    String key = "";
    DiplomarbeitDAO obj;
    List<Diplomarbeit> daList;
    Diplomarbeit selectedDa;
    List<Diplomarbeit> recentDaList;
    boolean render;
    boolean render2;

    //favoriten auch so?
    public dipSuchenBean() {

    }

    @PostConstruct
    void init() {
        render = false;
        render2 = false;
        obj = new DiplomarbeitDAO();
        daList = new ArrayList<>();
        recentDaList = new ArrayList<>(); //favoriten aus der db laden?
    }

    public Object selectDA() {
        daList = obj.Suchleiste(key);
        if (!daList.isEmpty()) {
            render = true;
            selectedDa = daList.get(0); //null check?, andere select bar machen, bei select auf da seite weiterreferenzieren
            return null;
        }
        return null;
    }

    public Object recentDa() {
        //recentDaList.clear();
        int check = 0;
        if (!daList.isEmpty()) {
            render2 = true;
            check = 1;
            if (!recentDaList.isEmpty()) {
                for (Diplomarbeit ar : recentDaList) { //daList) {
                    //    recentDaList.add(ar);
                    if (ar.getDa_id() == selectedDa.getDa_id()) {
                        check = 0;
                    }
                }
            } else {
                //recentDaList.add(selectedDa);
            }
        }
        if (check == 1) {
            recentDaList.add(selectedDa);
        }
        return null;
    }

    public String displaySelectedDa() { //String navigation, or display with button? auf out of bound prüfen und basisliste bei leer?
        return "switchda";              //listener für click action
        //new, weiter an bibliothek
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

    public List<Diplomarbeit> getRecentDaList() {
        return recentDaList;
    }

    public void setRecentDaList(List<Diplomarbeit> recentDaList) {
        this.recentDaList = recentDaList;
    }

    public boolean getRender() {
        return render;
    }

    public void setRender(boolean render) {
        this.render = render;
    }

    public boolean getRender2() {
        return render2;
    }

    public void setRender2(boolean render2) {
        this.render2 = render2;
    }

}
