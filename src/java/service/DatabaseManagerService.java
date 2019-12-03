/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import infrastructure.BenutzerDAO;
import java.util.ArrayList;
import pojo.Benutzer;

/**
 *
 * @author dople
 */
public class DatabaseManagerService {

    /**
     * Creates a new instance of DatabaseManagerService
     */
    private Benutzer b;
    private BenutzerDAO benutzerDAO;

    /**
     * Creates a new instance of databaseManagerService
     */
    public DatabaseManagerService() {
        b = new Benutzer();
        benutzerDAO = new BenutzerDAO();
    }

    public Benutzer load(String id) {
        b = benutzerDAO.read(id);
        return b;
    }

    public ArrayList<Benutzer> getAllBenutzer() {
        return benutzerDAO.getAllBenutzer();
    }

    public int updateBenutzer(Benutzer b) {
        return benutzerDAO.updateBenutzer(b);
    }

    public int deleteBenutzer(int id) {
        return benutzerDAO.deleteBenutzer(id);
    }

    public int insertBenutzer(Benutzer b) {
        return benutzerDAO.insert(b);
    }

    public Benutzer getB() {
        return b;
    }

    public BenutzerDAO getBenutzerDAO() {
        return benutzerDAO;
    }

    public void setB(Benutzer b) {
        this.b = b;
    }

    public void setBenutzerDAO(BenutzerDAO benutzerDAO) {
        this.benutzerDAO = benutzerDAO;
    }
}
