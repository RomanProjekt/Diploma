/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import pojo.Benutzer;
import service.DatabaseManagerService;

/**
 *
 * @author dople
 */
public class benutzerverwaltungBean {

    private Benutzer benutzer;
    private ArrayList<Benutzer> benutzerList;
    private DatabaseManagerService dbService;
    private int result;

    /**
     * Creates a new instance of benutzerverwaltungBean
     */
    public benutzerverwaltungBean() {

    }

    @PostConstruct
    void init() {
        benutzerList = dbService.getAllBenutzer();
    }

    public ArrayList<Benutzer> getBenutzerList() {
        return benutzerList;
    }

    public void setBenutzerList(ArrayList<Benutzer> benutzerList) {
        this.benutzerList = benutzerList;
    }

    public Object add() {
        return null;
    }

    public Object delete(int id) {
        result = dbService.deleteBenutzer(id);
        benutzerList = dbService.getAllBenutzer();
        return null;
    }

    public Object modify(Benutzer b) {
        b.setEditable(true);
        return null;
    }

    public Object save(Benutzer b) {
        b.setEditable(false);
        result = dbService.updateBenutzer(b);
        benutzerList = dbService.getAllBenutzer();
        return null;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}
