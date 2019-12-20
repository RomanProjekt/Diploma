/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import infrastructure.DiplomarbeitDAO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.util.List;
import javax.annotation.PostConstruct;
import pojo.Diplomarbeit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionListener;
import javax.faces.event.PhaseId;

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
     private List<Diplomarbeit> diplist;
     private List<Diplomarbeit> testdiplist;
   
     
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

     
     
     public bibliothekBean() throws SQLException, FileNotFoundException {
               dbService = new DatabaseManagerService();
             
               diplist = new ArrayList<>();  
             
               diplist =  dbService.show();
                  
             
               
               
               
        
                diplist.add(new Diplomarbeit(12, "Bild01", 12, 12, null, "Test", "Test" , null , 12, 12));
                diplist.add(new Diplomarbeit(12, "Bild02", 12, 12, null, "Test", "Test" , null , 12, 12));
                diplist.add(new Diplomarbeit(12, "Bild03", 12, 12, null, "Test", "Test" , null , 12, 12));
                diplist.add(new Diplomarbeit(12, "Bild04", 12, 12, null, "Test", "Test" , null , 12, 12));    
                diplist.add(new Diplomarbeit(12, "Bild05", 12, 12, null, "Test", "Test" , null , 12, 12));
                diplist.add(new Diplomarbeit(12, "Bild06", 12, 12, null, "Test", "Test" , null , 12, 12));    
                diplist.add(new Diplomarbeit(12, "Bild07", 12, 12, null, "Test", "Test" , null , 12, 12));
                diplist.add(new Diplomarbeit(12, "Bild08", 12, 12, null, "Test", "Test" , null , 12, 12));
                diplist.add(new Diplomarbeit(12, "Bild09", 12, 12, null, "Test", "Test" , null , 12, 12));
                diplist.add(new Diplomarbeit(12, "Bild010", 12, 12, null, "Test", "Test" , null , 12, 12));
                diplist.add(new Diplomarbeit(12, "Bild11", 12, 12, null, "Test", "Test" , null , 12, 12));
                diplist.add(new Diplomarbeit(12, "Bild12", 12, 12, null, "Test", "Test" , null , 12, 12));
    }

     @PostConstruct
     void init()  {


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
        title ="titel01";
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
    
    //Ende Get- und Setmethoden, Diplomarbeit
    
    
   
    public Object suche(String titel, String autor, String date, String fachgebiet, String schlagwort) {
          System.out.println(titel + autor + date + fachgebiet + schlagwort);

          
          return null;
     }
    
    Object listediplomarbeiten;

    public Object getListediplomarbeiten() {
        
        
        
        int index = 0;
        
        listediplomarbeiten = diplist.get(index);
        return listediplomarbeiten;
    }

    public void setListediplomarbeiten(Object Listediplomarbeiten) {
        this.listediplomarbeiten = Listediplomarbeiten;
    }

    

    
    
    
   
     
    
     
   public static void main(String[] args) throws SQLException, IOException {
        
         bibliothekBean bb = new bibliothekBean();
         


//        System.out.println(bb.getDiplist().get(1).getBild());
      
////         System.out.println(bb.getAutor());
////         System.out.println(bb.autor_id);
////         System.out.println(bb.getBild(0));
////         System.out.println(bb.getBild(0));
////         System.out.println(bb.getBild(0));
//         
////         System.out.println(bb.getDiplist());
//         
////         System.out.println("Bufferimage " + bb.bildladen());
////         System.out.println("Bufferimage " + bb.getBi());
   }
   
   
   
   

   
}
