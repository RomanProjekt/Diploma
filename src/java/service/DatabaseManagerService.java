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

    public void loggout() {
        loggedInBenutzer = new Benutzer();
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

    public List<Autor> getAllAutor() {
        return autorDAO.getAllAutor();
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

    public List<Diplomarbeit> varread(int seitenanzahl, boolean renderer) {

        List<Diplomarbeit> varlist = null;
        int maxszahl;

        if (ListeAllDiplomarbeiten() != null) {

            if (ListeAllDiplomarbeiten().size() % 10 == 0) {
                maxszahl = (int) ListeAllDiplomarbeiten().size() / 10;
            } else {
                maxszahl = ListeAllDiplomarbeiten().size() / 10;
            }

            if (ListeAllDiplomarbeiten().size() % 10 == 0) {

                int anfang = seitenanzahl * 10;
                int ende = ((seitenanzahl + 1) * 10);

                System.out.println(anfang);
                System.out.println(ende);

                varlist = ListeAllDiplomarbeiten().subList(anfang, ende);

            } else {

                if (seitenanzahl < maxszahl) {
                    int anfang = seitenanzahl * 10;
                    int ende = ((seitenanzahl + 1) * 10);

                    System.out.println(anfang);
                    System.out.println(ende);

                    varlist = ListeAllDiplomarbeiten().subList(anfang, ende);

                }
                if (seitenanzahl == maxszahl) {
                    int anfang = seitenanzahl * 10;
                    int ende = ListeAllDiplomarbeiten().size();

                    varlist = ListeAllDiplomarbeiten().subList(anfang, ende);

                }
            }
        }
        return varlist;
    }

    //Diplomarbeit hochladen:
    public void hochladen(String title, String autor_name, String schule, List<String> schlagwoerter, String pdfpath, String imagepath) throws FileNotFoundException {

        
        int var_user_id = this.getB().getUser_id();

        schuleDAO.insert(schule);

        int schule_id = this.getListevonSchulen().get(this.getListevonSchulen().size() - 1).getSchule_id();

        //1.Erstellen einer Diplomarbeit-Tabelle
        diplomarbeitDAO.insert(title, var_user_id, schule_id, pdfpath, imagepath);

        int var_da_id = this.ListeAllDiplomarbeiten().get(this.ListeAllDiplomarbeiten().size() - 1).getDa_id();
        

        //2. Erstellen eines Autor-Tabelle
        autorDAO.insert(autor_name, var_da_id);

        Autor autor = this.getAutor(var_da_id);
        System.out.println("Autor id adsfadsfasdfsf" + autor);

        schlagwDAO.insert(schlagwoerter);
        
        List<Schlagwort> schlagwortliste = this.getAllSchlagwörter().subList(this.getAllSchlagwörter().size()-2, this.getAllSchlagwörter().size());

        schlagwort_verknuepfungDAO.insert(schlagwortliste, var_da_id);

        //5.Update Diplomarbeit
        diplomarbeitDAO.update(var_da_id, autor.getAutor_id());

    }

    //Favouriten einfügen
    public void insertFavouriten() {
        favDAO.insert();
    }
    
    //Diplomarbeit löschen
    public void deleteDiplomarbeit(int id) {
        diplomarbeitDAO.delete(id);
    }
    
    public static void main(String[] args) {
        DatabaseManagerService dms = new DatabaseManagerService();
        dms.ListeAllDiplomarbeiten();
    }
  

}
