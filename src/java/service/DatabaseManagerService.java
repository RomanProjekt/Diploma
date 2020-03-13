/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;
import pojo.Benutzer;
import pojo.Diplomarbeit;
import infrastructure.AutorDAO;
import infrastructure.BenutzerDAO;
import infrastructure.DiplomarbeitDAO;
import infrastructure.FavoritenDAO;
import infrastructure.SW_DA_DAO;
import infrastructure.SchlagwortDAO;
import infrastructure.SchuleDAO;
import java.io.FileNotFoundException;
import java.util.HashMap;
import pojo.Autor;
import pojo.SW_DA;
import pojo.Schlagwort;
import pojo.Schule;

/**
 *
 * @author dople
 */
public class DatabaseManagerService {

    private Benutzer loggedInBenutzer;
    private Benutzer b;
    private Diplomarbeit dip;

    private BenutzerDAO benutzerDAO;
    private AutorDAO autorDAO;
    private FavoritenDAO favDAO;
    private SchlagwortDAO schlagwDAO;
    private SW_DA_DAO schlagwort_verknuepfungDAO;
    private SchuleDAO schuleDAO;

    private DiplomarbeitDAO diplomarbeitDAO;
    private List<Diplomarbeit> dplist;

    public DatabaseManagerService() {
        benutzerDAO = new BenutzerDAO();
        loggedInBenutzer = new Benutzer();
        dip = new Diplomarbeit();
        dplist = new ArrayList<>();
        b = new Benutzer();
        benutzerDAO = new BenutzerDAO();
        autorDAO = new AutorDAO();
        schlagwDAO = new SchlagwortDAO();
        schlagwort_verknuepfungDAO = new SW_DA_DAO();
        schuleDAO = new SchuleDAO();
        diplomarbeitDAO = new DiplomarbeitDAO();
        favDAO = new FavoritenDAO();

    }

    //Benutzer
    public Benutzer load(String username) {
        b = benutzerDAO.read(username);
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

    public boolean loggedIn() {
        return loggedInBenutzer.getUsername() != null;
    }

    public Object stillLoggedIn() {
        if (loggedInBenutzer.getUsername() == null) {
            return "index.xhtml";
        }
        return null;
    }

    public void loggout() {
        loggedInBenutzer = new Benutzer();
    }

    public boolean usernameExists(String username) {
        return benutzerDAO.usernameExists(username);
    }

    public boolean isUser() {
        return "User".equals(loggedInBenutzer.getRole()) || loggedInBenutzer.getRole() == null;
    }

    public boolean isAdmin() {
        return "Admin".equals(loggedInBenutzer.getRole()) && loggedInBenutzer.getRole() != null;
    }

    public boolean isRedakteurOrHigher() {
        return !("User".equals(loggedInBenutzer.getRole()) || loggedInBenutzer.getRole() == null);
    }

    public Object isAdminRedirect() {
        if (!"Admin".equals(loggedInBenutzer.getRole()) || loggedInBenutzer.getRole() == null) {
            return "unauthorized.xhtml";
        }
        return null;
    }

    public Object isUserRedirect() {
        if ("User".equals(loggedInBenutzer.getRole()) || loggedInBenutzer.getRole() == null) {
            return "unauthorized.xhtml";
        }
        return null;
    }

    ////Getter-Setter
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

    public int getNextUserId() {
        return benutzerDAO.getNextIdFromUser();
    }

    public Benutzer getLoggedInBenutzer() {
        return loggedInBenutzer;
    }

    public void setLoggedInBenutzer(Benutzer loggedInBenutzer) {
        this.loggedInBenutzer = loggedInBenutzer;
    }

    //Diplomarbeit
    public List<Diplomarbeit> getDplist() {
        return dplist;
    }

    public void setDplist(List<Diplomarbeit> dplist) {
        this.dplist = dplist;
    }

    public DiplomarbeitDAO getDiplomarbeitDAO() {
        return diplomarbeitDAO;
    }

    public void setDiplomarbeitDAO(DiplomarbeitDAO diplomarbeitDAO) {
        this.diplomarbeitDAO = diplomarbeitDAO;
    }

    public List<Diplomarbeit> ListeAllDiplomarbeiten() {
        //if wohers kommt? von dipSuchenBean die Liste?
        dplist = diplomarbeitDAO.read();
        return dplist;
    }

    public Diplomarbeit getDiplomarbeit(int id) {
        Diplomarbeit dip = diplomarbeitDAO.getDiplomarbeit(id);
        return dip;
    }

    //Autor
    public AutorDAO getAutorDAO() {
        return autorDAO;
    }

    public void setAutorDAO(AutorDAO autorDAO) {
        this.autorDAO = autorDAO;
    }

    public void updateAutors(HashMap<Integer, Autor> editMap) {
        this.autorDAO.updateAutors(editMap);
    }

    public void deleteAutor(int autId) {
        this.autorDAO.deleteAutor(autId);
    }

    public void deleteAutors(HashMap<Integer, Autor> delList) {
        this.autorDAO.deleteAutors(delList);
    }

    public void insertAutor(Autor autor) {
        this.autorDAO.insert(autor.getFullName(), autor.getDa_id());
    }

    public void insertAutors(HashMap<Integer, Autor> insList) {
        this.autorDAO.insertAutorMap(insList);
    }

    public List<Autor> getAllAutor() {
        return autorDAO.getAllAutor();
    }

    public List<Autor> getAllAutor(int id) {
        return autorDAO.getAllAutor(id);
    }

    public Autor getOneAutor(int id) {
        return autorDAO.read(id);
    }

    //Schlagwort
    public SchlagwortDAO getSchlagwDAO() {
        return schlagwDAO;
    }

    public void setSchlagwDAO(SchlagwortDAO schlagwDAO) {
        this.schlagwDAO = schlagwDAO;
    }

    public List<Schlagwort> getAllSchlagwörter() {
        return schlagwDAO.read();
    }

    public HashMap<String, Integer> getAllSchlagwoerterHashMap() {
        HashMap<String, Integer> allSchlagwoerterMap = new HashMap<>();
        List<Schlagwort> swList = getAllSchlagwörter();
        swList.forEach((schlagwort) -> {
            allSchlagwoerterMap.put(schlagwort.getWord(), schlagwort.getTag_id());
        });
        return allSchlagwoerterMap;
    }

    public List<Schlagwort> getAllSchlagwoerter(int id) {
        return schlagwort_verknuepfungDAO.getAllSchlagwoerter(id);
    }

    public void insertSchlagwortList(List<Schlagwort> swList) {
        schlagwDAO.insertSchlagwortList(swList);
    }

    //Schlagwort-Verknüpfungstabelle
    public Diplomarbeit getDip() {
        return dip;
    }

    public void setDip(Diplomarbeit dip) {
        this.dip = dip;
    }

    public Autor getAutor(int id) {
        return autorDAO.read(id);
    }

    //FavoritenDAO
    public FavoritenDAO getFavDAO() {
        return favDAO;
    }

    public void setFavDAO(FavoritenDAO favDAO) {
        this.favDAO = favDAO;
    }

    //SW_DA_DAO
    public SW_DA_DAO getSchlagwort_verknuepfungDAO() {
        return schlagwort_verknuepfungDAO;
    }

    public void setSchlagwort_verknuepfungDAO(SW_DA_DAO schlagwort_verknuepfungDAO) {
        this.schlagwort_verknuepfungDAO = schlagwort_verknuepfungDAO;
    }

    public List<SW_DA> getAllSW_DA_Verknuepfung() {
        return this.schlagwort_verknuepfungDAO.getAllSW_DA_Verknüpfungen();
    }

    public void deleteSW_DA(HashMap<Integer, Schlagwort> remMap, int daId) {
        this.schlagwort_verknuepfungDAO.deleteSW_DA(remMap, daId);
    }

    public void insertSW_DAMap(HashMap<Integer, Schlagwort> insMap, int daId) {
        this.schlagwort_verknuepfungDAO.insertHashMap(insMap, daId);
    }

    //Schule
    public SchuleDAO getSchuleDAO() {
        return schuleDAO;
    }

    public void setSchuleDAO(SchuleDAO schuleDAO) {
        this.schuleDAO = schuleDAO;
    }

    public List<Schule> getListevonSchulen() {
        return this.schuleDAO.read();
    }

    public Schule getOneSchule(int id) {
        return this.schuleDAO.readOne(id);
    }

//    public List<Diplomarbeit> varread(int seitenanzahl, boolean renderer) {
//
//        List<Diplomarbeit> varlist = null;
//        int maxszahl;
//
//        if (ListeAllDiplomarbeiten() != null) {
//
//            if (ListeAllDiplomarbeiten().size() % 10 == 0) {
//                maxszahl = (int) ListeAllDiplomarbeiten().size() / 10;
//            } else {
//                maxszahl = ListeAllDiplomarbeiten().size() / 10;
//            }
//
//            if (ListeAllDiplomarbeiten().size() % 10 == 0) {
//
//                int anfang = seitenanzahl * 10;
//                int ende = ((seitenanzahl + 1) * 10);
//
//                System.out.println(anfang);
//                System.out.println(ende);
//
//                varlist = ListeAllDiplomarbeiten().subList(anfang, ende);
//
//            } else {
//
//                if (seitenanzahl < maxszahl) {
//                    int anfang = seitenanzahl * 10;
//                    int ende = ((seitenanzahl + 1) * 10);
//
//                    System.out.println(anfang);
//                    System.out.println(ende);
//
//                    varlist = ListeAllDiplomarbeiten().subList(anfang, ende);
//
//                }
//                if (seitenanzahl == maxszahl) {
//                    int anfang = seitenanzahl * 10;
//                    int ende = ListeAllDiplomarbeiten().size();
//
//                    varlist = ListeAllDiplomarbeiten().subList(anfang, ende);
//
//                }
//            }
//        }
//        return varlist;
//    }
    //Diplomarbeit hochladen:
    public void hochladen(String title, String autor_name, String schule, List<String> schlagwoerter, String pdfpath, String imagepath) throws FileNotFoundException {

        int var_user_id = this.getLoggedInBenutzer().getUser_id();

        schuleDAO.insert(schule);

        int schule_id = this.getListevonSchulen().get(this.getListevonSchulen().size() - 1).getSchule_id();

        //1.Erstellen einer Diplomarbeit-Tabelle
        diplomarbeitDAO.insert(title, var_user_id, schule_id, pdfpath, imagepath);

        int var_da_id = this.ListeAllDiplomarbeiten().get(this.ListeAllDiplomarbeiten().size() - 1).getDa_id();

        //2. Erstellen eines Autor-Tabelle
        autorDAO.insert(autor_name, var_da_id);

        Autor autor = this.getAutor(var_da_id);
        System.out.println("Autor id adsfadsfasdfsf" + autor);

        //  schlagwDAO.insert(schlagwoerter);
        List<Schlagwort> schlagwortliste = this.getAllSchlagwörter().subList(this.getAllSchlagwörter().size() - 2, this.getAllSchlagwörter().size());

        schlagwort_verknuepfungDAO.insert(schlagwortliste, var_da_id);

        //5.Update Diplomarbeit
        diplomarbeitDAO.update(var_da_id, autor.getAutor_id());

    }

    //Diplomarbeit löschen
    public void deleteDiplomarbeit(Diplomarbeit dip) {
        //delete autor
        autorDAO.deleteAutorDip(dip.getDa_id());

        //delete fav
        favDAO.deleteDip(dip.getDa_id());
        //delete schlag
        schlagwort_verknuepfungDAO.deleteDA(dip.getDa_id());

        diplomarbeitDAO.delete(dip.getDa_id());
    }

    //DP Title update
    public void updateDPTitle(int id, String title) {
        diplomarbeitDAO.updateTitle(id, title);
    }

    //Redakteur Liste der DAs
    public List<Diplomarbeit> getRedList() {
        return diplomarbeitDAO.getRedList(loggedInBenutzer.getUser_id());
    }

    //Favouriten einfügen
    public int insertFavouriten(int dp_id, int b_id) {
        return this.favDAO.insert(dp_id, b_id);
    }

    public List<Diplomarbeit> getFavList() {
        return favDAO.getFavList(loggedInBenutzer.getUser_id());
    }

    public int deleteFav(Diplomarbeit dip) {
        return favDAO.deleteOne(dip, loggedInBenutzer.getUser_id());
    }
    
    
     //Passwort zurücksetzen im eigenen Programm:
    public void insertNewPasswort() {
        benutzerDAO.insertNewPassword(this.loggedInBenutzer);
    }

    public boolean diplomarbeit(String titel) {
        return diplomarbeitDAO.read(titel);
    }

}
