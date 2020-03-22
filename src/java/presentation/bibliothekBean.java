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

    //Variablenb der Seitenleiste der Bibliothek
    private int seitenanzahl;
    private String aktuelleseitenanzahl;
    

    //DatabaseManagerService
    private DatabaseManagerService dms;
    private boolean renderer;

    //Aktueller Benutzer
    private String aktuellerBenutzer;
    
    
    //Liste aller Diplomarbeiten
    private List<Diplomarbeit> alldiplomarbeiten;
    private List<Diplomarbeit> diplist;


    //Seitenleiste
    private List<Seitenzahl> seitenleiste = new ArrayList<>();
    private String seitenzahl;
    
    
    
    public bibliothekBean() throws SQLException, FileNotFoundException {
        
        this.seitenanzahl = 1;
        this.aktuelleseitenanzahl = String.valueOf(this.seitenanzahl);
        dms = new DatabaseManagerService();
        diplist = new ArrayList<>();
        this.alldiplomarbeiten = new ArrayList<>();
        
        this.diplist = this.varread(0);
        alldiplomarbeiten = dms.ListeAllDiplomarbeiten();
//      diplist.add(new Diplomarbeit(12, "Bild01", 12, 12, 12, null, 12, new Date(2020-12-01), null, 12, 12));

        
        


    }

    @PostConstruct
    void init() {
        
        
        this.Seitenzahl_befüllen();
        

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
    
    
    
    //DiplomarbeitenDAO
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
    
    //RÃ¼ckgabe der Seitenanzahl

    public String getAktuelleseitenanzahl() {
        return aktuelleseitenanzahl;
    }

    public void setAktuelleseitenanzahl(String aktuelleseitenanzahl) {
        this.aktuelleseitenanzahl = aktuelleseitenanzahl;
    }
    

    //Variable renderer ist fÃ¼r den aus- und einblenden von der ZÃ¤hlerleiste
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
    
    
    //aktueller Benutzer
    public void aktullerBenutzer() {
        dms.getLoggedInBenutzer();
    }


 
//    //HinzugefÃ¼gt
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
    
    
    public Object hochzaehlen(ActionEvent actionEvent) {
        
        
        if (alldiplomarbeiten.size() > 0) {

            
            //maxszahl = 2
            if ((this.seitenanzahl < this.berechnenMaxSeitenanzahl()) & (this.seitenanzahl > 0)) {
                this.seitenanzahl = this.seitenanzahl + 1;
                this.aktuelleseitenanzahl = String.valueOf(seitenanzahl);
                
                //Anzeigen der Diplomarbeiten
                int anfangListeDip = this.seitenanzahl - 1;
                //anfangsListeDip = 0;
                this.diplist = this.varread(anfangListeDip);
            }
            else {
                //Anzeigen der Diplomarbeiten
                int anfangListeDip = this.seitenanzahl - 1;               
                this.diplist = this.varread(anfangListeDip);
                
            }

        }
        
        return null;

    }

    public Object hinunterzaehlen(ActionEvent actionEvent) {

        if (seitenanzahl != 1) {
            this.seitenanzahl = this.seitenanzahl - 1;
            this.aktuelleseitenanzahl = String.valueOf(this.seitenanzahl);
            
            //Anzeigen der Diplomarbeiten
            int anfangListeDip = this.seitenanzahl - 1;
            diplist = this.varread(anfangListeDip);
            
        } else {
            seitenanzahl = 1;
            aktuelleseitenanzahl = String.valueOf(seitenanzahl);
            
            //Anzeigen der Diplomarbeiten
            int anfangListeDip = this.seitenanzahl - 1;
            diplist = this.varread(anfangListeDip);

        }
        
        return null;

    }
    
   
    
    
          

        
       public final int berechnenMaxSeitenanzahl() {
        
        int groeße = this.alldiplomarbeiten.size();
        int maxszahl = 0;
        double size = groeße;
        
        

        if (((double) size) % 10 == 0) {
            System.out.println("Lasst sich Teilen!");
            maxszahl = (int) (size / 10);
            System.out.println(size + " mit " + maxszahl + " Seiten");
            
        } else {
            
            if(((double) size) % 10 > 0) {
                System.out.println("groeßer 0 Rest");
                maxszahl =  (int) ((size / 10) + 1);
                System.out.println(size + " mit " + maxszahl + " Seiten");
            } 
            

        }
        
        return maxszahl;
        
    } 
    
    
       
    


//Seitenleiste neu

    public String getSeitenzahl() {
        return seitenzahl;
    }

    public void setSeitenzahl(String seitenzahl) {
        this.seitenzahl = seitenzahl;
    }
       
       
    
    

    public List<Seitenzahl> getSeitenleiste() {
        return seitenleiste;
    }

    private void Seitenzahl_befüllen() {
          
        int i;
        for(i = 1; i < this.berechnenMaxSeitenanzahl()+1; i++) {
            
            Seitenzahl seitz = new Seitenzahl(i);
            
            seitenleiste.add(seitz);
        }
    }
    
    
    
    public class Seitenzahl {
        
        int seitenzahl;

        public Seitenzahl(int seitenzahl) {
            this.seitenzahl = seitenzahl;
        }
        
        public int getSeitenzahl() {
            return seitenzahl;
        }

        public void setSeitenzahl(int seitenzahl) {
            this.seitenzahl = seitenzahl;
        }
        
        
    }
    
  
    public void verlinken(ActionEvent ex) { 
        
//        int buttonId = Integer.valueOf(ex.getSource());
    
//        int aktuellesz = (int) ex.getSource();
//        System.out.println(buttonId);
//        this.varread(buttonId);
        
    }
    
    
    
  
    
    //Ende Get- und Setmethoden, Diplomarbeit
    public Object suche(String titel, String autor, String date, String fachgebiet, String schlagwort) {
        System.out.println(titel + autor + date + fachgebiet + schlagwort);
        return null;
    }
    
    
    public List<Diplomarbeit> varread(int seitenanzahl) {

        List<Diplomarbeit> varlist = null;
        int maxszahl;

        if (dms.ListeAllDiplomarbeiten() != null) {

            if (dms.ListeAllDiplomarbeiten().size() % 10 == 0) {
                maxszahl = (int) dms.ListeAllDiplomarbeiten().size() / 10;
            } else {
                maxszahl = dms.ListeAllDiplomarbeiten().size() / 10;
            }

            if (dms.ListeAllDiplomarbeiten().size() % 10 == 0) {

                int anfang = seitenanzahl * 10;
                int ende = ((seitenanzahl + 1) * 10);

                System.out.println(anfang);
                System.out.println(ende);

                varlist = dms.ListeAllDiplomarbeiten().subList(anfang, ende);

            } else {

                if (seitenanzahl < maxszahl) {
                    int anfang = seitenanzahl * 10;
                    int ende = ((seitenanzahl + 1) * 10);

                    System.out.println(anfang);
                    System.out.println(ende);

                    varlist = dms.ListeAllDiplomarbeiten().subList(anfang, ende);

                }
                if (seitenanzahl == maxszahl) {
                    int anfang = seitenanzahl * 10;
                    int ende = dms.ListeAllDiplomarbeiten().size();

                    varlist = dms.ListeAllDiplomarbeiten().subList(anfang, ende);

                }
            }
        }
        return varlist;
    }
    
    
    


}
