/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import infrastructure.DiplomarbeitDAO;
import java.sql.Blob;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.ActionEvent;
import pojo.Autor;
import pojo.Diplomarbeit;
import pojo.Schlagwort;
import pojo.Schule;
import service.DatabaseManagerService;

public class bibliothekBean {

    //Variablen der weiteren Suche
    private String titel;
    private String autor;
    private String date;
    private String schlagwort;
    private String schule;

    private String speech;
    private String fachgebiet;

    private List<Diplomarbeit> indexSortList;

    //Variablen: Diplomarbeit
    private int da_id;
    private String title;
    private int autor_id;
    private int sw_id;
    private Blob pdf;
    private String user_id;
    private String datum;
    private String bild;
    private String pfad;
 
    //DatabaseManagerService
    private DatabaseManagerService dbService;

    //Variablenb der Seitenleiste der Bibliothek
    private int seitenanzahl;
    private String aktuelleseitenanzahl;

    //Aktueller Benutzer
    private String aktuellerBenutzer;

    //Liste aller Diplomarbeiten
    private List<Diplomarbeit> alldiplomarbeiten;
    private List<Diplomarbeit> diplist;
    private List<Diplomarbeit> allindexList;

    private DiplomarbeitDAO dipDAO;
    private boolean isFromIndex;
    private boolean isFromBibliothek;
    private String choice = "";
    private String alterantivKey;
    
    
    //Zweite Suchleiste in der Biblitohek---------------------------------------
    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
    
    public void setChoiceTitel() {
        this.choice = "Titel";
    }
    public void setChoiceAutor() {
        this.choice = "Autor";
    }
    public void setChoiceDatum() {
        this.choice = "Datum";
    }
    public void setChoiceSw() {
        this.choice = "Schlagwort";
    }
    public void setChoiceSchule() {
        this.choice = "Schule";
    }

    public String getAlterantivKey() {
        return alterantivKey;
    }

    public void setAlterantivKey(String alterantivKey) {
        this.alterantivKey = alterantivKey;
    }
    
    
    
    
    //--------------------------------------------------------------------------

    public bibliothekBean() {

    }

    @PostConstruct
    void init() {
        dbService = new DatabaseManagerService();
        diplist = new ArrayList<>();
        dipDAO = new DiplomarbeitDAO();
        this.alldiplomarbeiten = new ArrayList<>();
        allindexList = new ArrayList<>();
//        this.seitenList = new ArrayList<>();
        this.indexSortList = new ArrayList<>();
        
//        dsb = new dipSuchenBean();
    }

    public DiplomarbeitDAO getDipDAO() {
        return dipDAO;
    }

    public void setDipDAO(DiplomarbeitDAO dipDAO) {
        this.dipDAO = dipDAO;
    }

    public boolean isIsFromIndex() {
        return isFromIndex;
    }

    public void setIsFromIndex(boolean isFromIndex) {
        this.isFromIndex = isFromIndex;
    }

    public boolean isIsFromBibliothek() {
        return isFromBibliothek;
    }

    public void setIsFromBibliothek(boolean isFromBibliothek) {
        this.isFromBibliothek = isFromBibliothek;
    }

    public List<Diplomarbeit> getIndexSortList() {
        return indexSortList;
    }

    public void setIndexSortList(List<Diplomarbeit> indexSortList) {
        this.indexSortList = indexSortList;
    }

    public List<Diplomarbeit> getDiplist() {
        
        return diplist;
        
    }

    public void setDiplist(List<Diplomarbeit> diplist) {
       
        this.diplist = diplist;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    

    public String getDate() {
        //dsb.setChoiceDatum();
        return date;
    }

    public void setDate(String date) {
        //dsb.setChoiceDatum();
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
//        dsb.setChoiceSw();
        return schlagwort;
    }

    public void setSchlagwort(String schlagwort) {
//        dsb.setChoiceSw();
        this.schlagwort = schlagwort;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public String getSchule() {
        return schule;
    }

    public void setSchule(String schule) {
        this.schule = schule;
    }

   

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


    public List<Diplomarbeit> getAlldiplomarbeiten() {
        return alldiplomarbeiten;
    }

    public void setAlldiplomarbeiten(List<Diplomarbeit> alldiplomarbeiten) {
        this.alldiplomarbeiten = alldiplomarbeiten;
    }

    public String getAktuelleseitenanzahl() {
        return aktuelleseitenanzahl;
    }

    public void setAktuelleseitenanzahl(String aktuelleseitenanzahl) {
        this.aktuelleseitenanzahl = aktuelleseitenanzahl;
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

    public List<Diplomarbeit> getAllindexList() {
        return allindexList;
    }

    public void setAllindexList(List<Diplomarbeit> allindexList) {
        this.allindexList = allindexList;
    }

    //aktueller Benutzer
    public void aktullerBenutzer() {
        dbService.getLoggedInBenutzer();
    }


    private boolean keyreset;

    public boolean isKeyreset() {
        return keyreset;
    }

    public void setKeyreset(boolean keyreset) {
        this.keyreset = keyreset;
    }
    
    
    
    
    
    

    //Neu-----------------------------------------------------------------------
    public String isFromBiblothek() {
        return "dipbibliothek.xhtml";
    }

    public void FromBibliothek(ActionEvent event) {
        
        alldiplomarbeiten = dbService.ListeAllDiplomarbeiten();
        this.isFromBibliothek = true;
        this.isFromIndex = false;
        this.seitenanzahl = 0;
        System.out.println("------------------------" + this.alldiplomarbeiten.size());
        this.showBibDiplomarbeit(alldiplomarbeiten);
       
    }

    public void FromIndex(ActionEvent event) {
        
        this.keyreset = false;
        this.allindexList = dbService.getFoundDiplomarbeit(this.key);
        System.out.println("----------------------------" + this.allindexList.size());
        this.isFromIndex = true;
        this.isFromBibliothek = false;
        this.seitenanzahl = 0;
        this.showIndexDiplomarbeit(this.allindexList);
        
        if(this.keyreset) {
            this.key = "";
        }
        
        

    }
    
    
    
    public boolean showDiplomarbeit(ActionEvent ev) {
        
        
        if(this.isFromBibliothek) {
            this.showBibDiplomarbeit(this.alldiplomarbeiten);
            this.keyreset = true;
            return keyreset;
        }
        else if(this.isFromIndex) {
            this.showIndexDiplomarbeit(this.diplist);
            this.keyreset = true;
            return keyreset;
        }
        
        return false;
        
    }
    
    
    
    
    public void showIndexDiplomarbeit(List<Diplomarbeit> allindexList) {

        int maxszahl = this.berechnenMaxSeitenanzahl(allindexList);
        int anfang, ende;
        
        this.seitenanzahl += 1;

        if (maxszahl != 0) {

            if (allindexList.size() % 10 == 0 && allindexList.size() > 10) {
                System.out.println("------------------------Lebel 1");

                anfang = 0;
                ende = ((seitenanzahl + 1) * 10);

                System.out.println(anfang);
                System.out.println(ende);

                this.diplist = allindexList.subList(anfang, ende);

            } else {

                if (seitenanzahl == 1) {
                     System.out.println("-----------------------Lebel 2");

                    if (allindexList.size() <= 10) {
                        anfang = 0;
                        ende = allindexList.size();
                    } else {
                        anfang = 0;
                        ende = 10;
                    }

                    this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);
                    
                } else if (seitenanzahl < maxszahl && this.seitenanzahl > 1) {
                    System.out.println("---------------------------Lebel 3");
                    anfang = 0;
                    ende = ((seitenanzahl + 1) * 10);

                    System.out.println(anfang);
                    System.out.println(ende);

                    
                   this.diplist = allindexList.subList(anfang, ende);

                } else if (seitenanzahl == maxszahl && this.seitenanzahl > 1) {
                    
                    System.out.println("------------------------Lebel 4");
                    anfang = 0;
                    ende = allindexList.size();

                    this.diplist = allindexList.subList(anfang, ende);

                }
            }

        }

      
    }
    
    
    
    public void showBibDiplomarbeit(List<Diplomarbeit> dibList) {

        int maxszahl = this.berechnenMaxSeitenanzahl(dibList);
        int anfang, ende;
        this.seitenanzahl +=1;

        if (dbService.ListeAllDiplomarbeiten() != null) {

            if (dbService.ListeAllDiplomarbeiten().size() % 10 == 0 && dbService.ListeAllDiplomarbeiten().size() > 10) {

                anfang = 0;
                ende = ((seitenanzahl + 1) * 10);

                System.out.println(anfang);
                System.out.println(ende);

                this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);

            } else {

                if (seitenanzahl == 1) {

                    if (dbService.ListeAllDiplomarbeiten().size() < 10) {
                        anfang = 0;
                        ende = dbService.ListeAllDiplomarbeiten().size();
                        
                    } else {
                        anfang = 0;
                        ende = 10;
                    }

                    this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);

                } else if (seitenanzahl < maxszahl) {
                    
                    anfang = 0;
                    ende = ((seitenanzahl + 1) * 10);

                    System.out.println(anfang);
                    System.out.println(ende);

                    this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);

                } else if (seitenanzahl == maxszahl) {

                    if (dbService.ListeAllDiplomarbeiten().size() <= 10) {
                        anfang = 0;
                        ende = dbService.ListeAllDiplomarbeiten().size();
                        this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);
                        
                    } else {
                        anfang = 0;
                        ende = dbService.ListeAllDiplomarbeiten().size();
                        this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);

                    }

                }
            }
        }
      
    }
    
    
    
    
      public final int berechnenMaxSeitenanzahl(List<Diplomarbeit> diplist) {

        int size = diplist.size();
        int maxszahl = 0;

        if (size % 10 == 0) {
            System.out.println("Lasst sich Teilen!");
            maxszahl = (int) (size / 10);
            System.out.println(size + " mit " + maxszahl + " Seiten");

        } else {

            if (size % 10 > 0) {
                System.out.println("groeer 0 Rest");
                maxszahl = (int) ((size / 10) + 1);
                System.out.println(size + " mit " + maxszahl + " Seiten");
            }

        }

        return maxszahl;

    }  
    
    
    
    private String trefferleiste;

    public String getTrefferleiste() {
        
        this.trefferleiste =  this.allindexList.size() + " von " + dbService.ListeAllDiplomarbeiten().size() + " Treffern anzeigen";
        
        return trefferleiste;
    }

    public void setTrefferleiste(String trefferleiste) {
        this.trefferleiste = trefferleiste;
    }
    


    
    
//------------------------------------------------------------------------------   
    
    
//
//    public void forward(ActionEvent event) {
//
//        if (this.isFromBibliothek) {
//
//            int size = (this.berechnenMaxSeitenanzahl(this.alldiplomarbeiten));
//
//            if (this.seitenanzahl < (size)) {
//                this.seitenanzahl = this.seitenanzahl + 1;
//
//                int anfangListeDip = this.seitenanzahl;
//                this.diplist = this.showBibDiplomarbeit(anfangListeDip, this.alldiplomarbeiten);
//
//            } else {
//
//                int anfangListeDip = this.seitenanzahl;
//                this.diplist = this.showBibDiplomarbeit(anfangListeDip, this.alldiplomarbeiten);
//
//            }
//
//        } else if (this.isFromIndex) {
//
//            if (this.seitenanzahl < (this.berechnenMaxSeitenanzahl(this.allindexList))) {
//                this.seitenanzahl = this.seitenanzahl + 1;
//                int anfangListeDip = this.seitenanzahl;
//                this.diplist = this.showBibDiplomarbeit(anfangListeDip, this.allindexList);
//
//            } else {
//                //Anzeigen der Diplomarbeiten
//                int anfangListeDip = this.seitenanzahl;
//                this.diplist = this.showBibDiplomarbeit(anfangListeDip, this.allindexList);
//
//            }
//
//        }
//
//    }
//
////    public void back(ActionEvent event) {
//
//        if (this.isFromBibliothek) {
//
//            if (this.seitenanzahl > 1) {
//                this.seitenanzahl = this.seitenanzahl - 1;
//                int anfangListeDip = this.seitenanzahl;
//                this.diplist = this.showBibDiplomarbeit(anfangListeDip, this.alldiplomarbeiten);
//            } else {
//                int anfangListeDip = this.seitenanzahl;
//                this.diplist = this.showBibDiplomarbeit(anfangListeDip, this.alldiplomarbeiten);
//            }
//
//        } else if (this.isFromIndex) {
//
//            if (this.seitenanzahl > 1) {
//                this.seitenanzahl = this.seitenanzahl - 1;
//
//                int anfangListeDip = this.seitenanzahl;
//                this.diplist = this.showBibDiplomarbeit(anfangListeDip, this.allindexList);
//            } else {
//                //Anzeigen der Diplomarbeiten
//                int anfangListeDip = this.seitenanzahl;
//                this.diplist = this.showBibDiplomarbeit(anfangListeDip, this.allindexList);
//            }
//        }
//    }
//


////Seitenleiste neu
//    public String getSeitenzahl() {
//        return seitenzahl;
//    }
//
//    public void setSeitenzahl(String seitenzahl) {
//        this.seitenzahl = seitenzahl;
//    }
//
//    public List<Seitenzahl> getSeitenList() {
//        return seitenList;
//    }
//
//    public void setSeitenList(List<Seitenzahl> seitenList) {
//        this.seitenList = seitenList;
//    }
//
//    private void createListeSize(List<Diplomarbeit> diplist) {
//        int i;
//        this.seitenList.clear();
//
//        for (i = 1; i < (this.berechnenMaxSeitenanzahl(diplist) + 1); i++) {
//            Seitenzahl seitz = new Seitenzahl(i);
//            this.seitenList.add(seitz);
//            System.out.println("IsfromBibliothek");
//        }
//
//    }
//
//    public class Seitenzahl {
//
//        int seitenzahl;
//
//        public Seitenzahl(int seitenzahl) {
//            this.seitenzahl = seitenzahl;
//        }
//
//        public int getSeitenzahl() {
//            return seitenzahl;
//        }
//
//        public void setSeitenzahl(int seitenzahl) {
//            this.seitenzahl = seitenzahl;
//        }
//
//    }

    

    

    public void SeitenanzahlLink(ActionEvent event, int seitenanzahl) {

        if (this.isFromBibliothek) {

            this.showBibDiplomarbeitLink(seitenanzahl);

        } else if (this.isFromIndex) {

            this.showIndexDiplomarbeitLink(seitenanzahl);

        }

    }

    public List<Diplomarbeit> showIndexDiplomarbeitLink(int seitenanzahl) {

        int maxszahl = this.berechnenMaxSeitenanzahl(allindexList);
        int anfang, ende;

        System.out.println(seitenanzahl);

        if (maxszahl != 0) {

            this.seitenanzahl = seitenanzahl;

            if (allindexList.size() % 10 == 0 && allindexList.size() > 10) {

                anfang = seitenanzahl * 10;
                ende = ((seitenanzahl + 1) * 10);

                System.out.println(anfang);
                System.out.println(ende);

                this.seitenanzahl = seitenanzahl;
                return this.diplist = allindexList.subList(anfang, ende);

            } else {

                if (seitenanzahl == 1) {

                    if (allindexList.size() < 10) {
                        anfang = 0;
                        ende = allindexList.size();
                    } else {
                        anfang = 0;
                        ende = 10;
                    }

                    return this.diplist = allindexList.subList(anfang, ende);

                } else if (seitenanzahl < maxszahl) {
                    anfang = seitenanzahl * 10;
                    ende = ((seitenanzahl + 1) * 10);

                    System.out.println(anfang);
                    System.out.println(ende);

                    return this.diplist = allindexList.subList(anfang, ende);

                } else if (seitenanzahl == maxszahl) {
                    anfang = seitenanzahl * 10;
                    ende = allindexList.size();

                    return this.diplist = allindexList.subList(anfang, ende);

                }
            }

        }

        return this.diplist;

    }

    public List<Diplomarbeit> showBibDiplomarbeitLink(int seitenanzahl) {

        int maxszahl = this.berechnenMaxSeitenanzahl(this.alldiplomarbeiten);      
        int anfang = 0, ende = 0;

        if (dbService.ListeAllDiplomarbeiten() != null) {

            this.seitenanzahl = seitenanzahl;
            if (dbService.ListeAllDiplomarbeiten().size() % 10 == 0 && dbService.ListeAllDiplomarbeiten().size() > 10) {

                anfang = seitenanzahl * 10;
                ende = ((seitenanzahl + 1) * 10);

                System.out.println(anfang);
                System.out.println(ende);

                this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);

            } else {

                if (seitenanzahl == 1) {

                    if (dbService.ListeAllDiplomarbeiten().size() < 10) {
                        anfang = 0;
                        ende = dbService.ListeAllDiplomarbeiten().size();
                    } else {
                        anfang = 0;
                        ende = 10;
                    }

                    return this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);
                } else if (seitenanzahl < maxszahl) {

                    anfang = seitenanzahl * 10;
                    ende = ((seitenanzahl + 1) * 10);
                    System.out.println(anfang);
                    System.out.println(ende);

                    this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);

                } else if (seitenanzahl == maxszahl) {

                    if (dbService.ListeAllDiplomarbeiten().size() <= 10) {

                        anfang = 0;
                        ende = dbService.ListeAllDiplomarbeiten().size();
                        this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);
                    } else {

                        anfang = (seitenanzahl - 1) * 10;
                        ende = dbService.ListeAllDiplomarbeiten().size();
                        this.diplist = dbService.ListeAllDiplomarbeiten().subList(anfang, ende);

                    }

                }
            }
        }
        return this.diplist;
    }



    public List<Diplomarbeit> showIndexSortDiplomarbeit(int seitenanzahl, List<Diplomarbeit> allindexList) {


        int maxszahl = this.berechnenMaxSeitenanzahl(this.indexSortList);

        if (maxszahl != 0) {

            if (allindexList.size() % 10 == 0) {

                int anfang = seitenanzahl * 10;
                int ende = ((seitenanzahl + 1) * 10);

                System.out.println(anfang);
                System.out.println(ende);

                return this.diplist = allindexList.subList(anfang, ende);

            } else {

                if (seitenanzahl == 1) {
                    int anfang = 0;
                    int ende = 10;
                    return this.diplist = allindexList.subList(anfang, ende);

                } else if (seitenanzahl < maxszahl) {
                    int anfang = seitenanzahl * 10;
                    int ende = ((seitenanzahl + 1) * 10);

                    System.out.println(anfang);
                    System.out.println(ende);

                    return this.diplist = allindexList.subList(anfang, ende);

                } else if (seitenanzahl == maxszahl) {
                    int anfang = seitenanzahl * 10;
                    int ende = allindexList.size();

                    return this.diplist = allindexList.subList(anfang, ende);

                }
            }

        }

        return this.diplist;
    }

    

   
    

    public String autorList(int da_id) {
        
        String autorListefirst = "";
        String autorListesecond = "";
        String fullautorListe = "";

        
        List<Autor> varList = dbService.getAllAutor(da_id);
 
        for(int i = 0; i < varList.size(); i++) {
            
            if(i == 0) {
                autorListefirst = varList.get(i).getFullName();                                                                                                                                                                                   
            }
            else if(i < varList.size()) {
                autorListesecond +=  " , " + varList.get(i).getFullName();
            }
            
            fullautorListe = (autorListefirst + autorListesecond);
            
            
        }
        return fullautorListe;

    }
    
    
    
    
    private String schlagwortfirst;
    private String schlagwortsecond;

    public String getSchlagwortfirst() {
        return schlagwortfirst;
    }

    public void setSchlagwortfirst(String schlagwortfirst) {
        this.schlagwortfirst = schlagwortfirst;
    }

    public String getSchlagwortsecond() {
        return schlagwortsecond;
    }

    public void setSchlagwortsecond(String schlagwortsecond) {
        this.schlagwortsecond = schlagwortsecond;
    }
    
    
        

    public String schlagwortList(int da_id) {
        
        String fullschlagwListe = "";
        String var = "";
        
        System.out.println(da_id);
        List<Schlagwort> varList = dbService.getAllSchlagwoerter(da_id);
        System.out.println(varList);

        
        for (int i = 0; i < varList.size(); i++) {
            
            if(i == 0) {
                var = varList.get(i).getWord();
            }
            else {
                var = " , " + varList.get(i).getWord();
                
            }
                    
            
            fullschlagwListe += var;
        }
      
        return fullschlagwListe;
    }
    
    
    
    public String getOneSchule(int da_id) {
        Schule s = dbService.getOneSchule(dbService.getDiplomarbeit(da_id).getSchule_id());
        return s.getName();
    }
    

   
    
    

    //--------------------------------------------------------------------------
    //Alternative Suche

    String key = "";

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
    
    
    public String sentToBibliothek() {
        
       
        if (this.key.equals("")) {

            return "index.xhtml";
            
        } else if (this.allindexList.isEmpty()) {

            return "index.xhtml";

        } else {
            
            return "bibliothek.xhtml";
            

        }

    }
    
    
    public Object suche() {
        dbService.alternativSuche(this.alterantivKey, this.choice);
        return null;

    }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   


