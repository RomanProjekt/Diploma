/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import infrastructure.DiplomarbeitDAO;
import java.io.FileNotFoundException;
import java.sql.Blob;
import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.ActionEvent;
import pojo.Diplomarbeit;
import service.DatabaseManagerService;

//import service.DatabaseManagerService;
//testdatebank:
//import static testdatenbank.DatabaseManagerService.dplist;
public class bibliothekBean {

    //Variablen der weiteren Suche
    private String Titel;
    private String autor;
    private String date;
    private String speech;
    private String fachgebiet;
    private String schlagwort;
    
    //Variablen: Diplomarbeit
    private int da_id;
    private String title;
    private int autor_id;
    private int sw_id;
    private Blob pdf;
    private String user_id;
    private String datum;
    private String bild;
    private int download_count;
    private int click_count;
    private String pfad;
    DiplomarbeitDAO da;

    //DatabaseManagerService
    public DatabaseManagerService dbService;

    private int seitenanzahl = 0;
    private String message = "0";

    //DatabaseManagerService
    private DatabaseManagerService dms;
    private boolean renderer;

    private String aktuellerBenutzer;
    
    
    //Liste aller Diplomarbeiten
    private List<Diplomarbeit> alldiplomarbeiten;
    private List<Diplomarbeit> diplist;


    public bibliothekBean() throws SQLException, FileNotFoundException {
        dms = new DatabaseManagerService();
        diplist = new ArrayList<>();
        alldiplomarbeiten = new ArrayList<>();
        
        diplist = dms.varread(seitenanzahl, renderer);
        alldiplomarbeiten = dms.ListeAllDiplomarbeiten();
//      diplist.add(new Diplomarbeit(12, "Bild01", 12, 12, 12, null, 12, new Date(2020-12-01), null, 12, 12));

        


    }

    @PostConstruct
    void init() {

    }

    public List<Diplomarbeit> getDiplist() {
        return diplist;
    }

    public void setDiplist(List<Diplomarbeit> diplist) {
        this.diplist = diplist;
    }

    //Anfang Get- und Setmethoden, Weitere Suche
    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        this.Titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    public String getFachgebiet() {
        return fachgebiet;
    }

    public void setFachgebiet(String fachgebiet) {
        this.fachgebiet = fachgebiet;
    }

    public String getSchlagwort() {
        return schlagwort;
    }

    public void setSchlagwort(String schlagwort) {
        this.schlagwort = schlagwort;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    //Ende Get- und Set-Methoden, Weitere Suche
    
    
    
    //Anfang Get- und Setmethoden: Variablen Diplomarbeit
    public int getDa_id() {
        return da_id;
    }

    public void setDa_id(int da_id) {
        this.da_id = da_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public int getSw_id() {
        return sw_id;
    }

    public void setSw_id(int sw_id) {
        this.sw_id = sw_id;
    }

    public Blob getPdf() {
        return pdf;
    }

    public void setPdf(Blob pdf) {
        this.pdf = pdf;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

    public int getDownload_count() {
        return download_count;
    }

    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }

    public int getClick_count() {
        return click_count;
    }

    public void setClick_count(int click_count) {
        this.click_count = click_count;
    }

    public DiplomarbeitDAO getDa() {
        return da;
    }

    public void setDa(DiplomarbeitDAO da) {
        this.da = da;
    }

    public DatabaseManagerService getDms() {
        return dms;
    }

    public void setDms(DatabaseManagerService dms) {
        this.dms = dms;
    }

    public List<Diplomarbeit> getAlldiplomarbeiten() {
        return alldiplomarbeiten;
    }

    public void setAlldiplomarbeiten(List<Diplomarbeit> alldiplomarbeiten) {
        this.alldiplomarbeiten = alldiplomarbeiten;
    }
    
    //
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //Variable renderer ist für den aus- und einblenden von der Zählerleiste
    public boolean isRenderer() {
        return renderer;
    }

    public void setRenderer(boolean renderer) {
        this.renderer = renderer;
    }

    public String getPfad() {
        return pfad;
    }

    public void setPfad(String pfad) {
        this.pfad = pfad;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }

    public String getAktuellerBenutzer() {
        return aktuellerBenutzer;
    }

    public void setAktuellerBenutzer(String aktuellerBenutzer) {
        this.aktuellerBenutzer = aktuellerBenutzer;
    }
    
    
    public void aktullerBenutzer() {
        dms.getLoggedInBenutzer();
    }


 
//    //Hinzugefügt
//    Object listediplomarbeiten;
//
//    public Object getListediplomarbeiten() {
//
//        int index = 0;
//
//        listediplomarbeiten = diplist.get(index);
//        return listediplomarbeiten;
//    }
//
//    public void setListediplomarbeiten(Object Listediplomarbeiten) {
//        this.listediplomarbeiten = Listediplomarbeiten;
//    }
    
    
    public Object hochzählen(ActionEvent actionEvent) {

        int maxszahl = 0;
        

        if (alldiplomarbeiten.size() % 10 == 0) {
            maxszahl = (int) alldiplomarbeiten.size() / 10-1;
            System.out.println(maxszahl);
            
        } else {
            
            if(alldiplomarbeiten.size() % 10 <= 4) {
                maxszahl = (alldiplomarbeiten.size() / 10);
                System.out.println(maxszahl);
            } 
            else if(alldiplomarbeiten.size() % 10 >= 5) {
                 maxszahl = alldiplomarbeiten.size() / 10;
                 System.out.println(maxszahl);
            }

        }

        if (alldiplomarbeiten.size() > 0) {

            if (seitenanzahl < maxszahl) {
                this.seitenanzahl = this.seitenanzahl + 1;
                this.message = String.valueOf(seitenanzahl);
                this.diplist = dms.varread(seitenanzahl, renderer);
            }

        }
        
        return null;

    }

    public Object hinunterzählen(ActionEvent actionEvent) {

        if (seitenanzahl != 0) {
            seitenanzahl = seitenanzahl - 1;
            message = String.valueOf(seitenanzahl);
            diplist = dms.varread(seitenanzahl, renderer);
            
        } else {
            seitenanzahl = 0;
            message = String.valueOf(seitenanzahl);
            diplist = dms.varread(seitenanzahl, renderer);

        }
        
        return null;

    }
    
    
     //Ende Get- und Setmethoden, Diplomarbeit
    public Object suche(String titel, String autor, String date, String fachgebiet, String schlagwort) {
        System.out.println(titel + autor + date + fachgebiet + schlagwort);
        return null;
    }
    
    
    public void verlinken(ActionEvent event) {
        
       renderer = true;
        
//      if("hallo".equals(event.getActionCommand())) {
//          int aktuellesanzahl = event.getID();
//          this.diplist = dms.varread(aktuellesanzahl, renderer);
//          
//      }
       
    }   
        
    
    
    
    
  
    


}
