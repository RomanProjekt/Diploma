/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Date;
import java.time.LocalDate;
import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import pojo.Diplomarbeit;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class dipansehenBean {

    private Diplomarbeit aktDip;

    //Variablen
    private String titel;
    private String autor;
    private String schule;
    private Date date;
    private int seitenanzahl = 0;
    private int aktuelle_id;
    private String buttonId;
    private String result;
    private String imagepath;

    private String bildnamegleich;
    private String pdfnamegleich;

    private DatabaseManagerService dbService;

    //downlaod-Counter
    private int download_count;
    private int click_count;

    public dipansehenBean() {

    }

    @PostConstruct
    void init() {
        dbService = new DatabaseManagerService();
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String Titel) {
        this.titel = Titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSchule() {
        return schule;
    }

    public void setSchule(String schule) {
        this.schule = schule;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getButtonId() {
        return buttonId;
    }

    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public int getAktuelle_id() {
        return aktuelle_id;
    }

    public void setAktuelle_id(int aktuelle_id) {
        this.aktuelle_id = aktuelle_id;
    }

    public String getBildnamegleich() {
        return bildnamegleich;
    }

    public void setBildnamegleich(String bildnamegleich) {
        this.bildnamegleich = bildnamegleich;
    }

    public String getPdfnamegleich() {
        return pdfnamegleich;
    }

    public void setPdfnamegleich(String pdfnamegleich) {
        this.pdfnamegleich = pdfnamegleich;
    }

    public Diplomarbeit getAktDip() {
        return aktDip;
    }

    public void setAktDip(Diplomarbeit aktDip) {
        this.aktDip = aktDip;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    //------------------Click/Download Counter --------------------------
    public int getClick_count() {
        return click_count;
    }

    public void setClick_count(int click_count) {
        this.click_count = click_count;
    }

    public int getDownload_count() {
        return download_count;
    }

    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }

    //Funktionen
    public String werteanzeigen(Diplomarbeit dip) {
        this.aktDip = dip;
        this.autor = dbService.getOneAutor(aktDip.getDa_id()).getFullName();

        //Schule anzeigen funktioniert noch nicht!!!
        //NullpointExcepiton
        //this.schule = dbService.getOneSchule(aktDip.getSchule_id()).getName();
        dbService.getAktuellPicture(this.aktDip);
        this.click_count_diplomarbeit(this.aktDip);

        return "dipansehen.xhtml";
    }

    
    
    //------------------------Click-Count----------------------------
    public void click_count_diplomarbeit(Diplomarbeit dip) {

        double click_first_grenze = 10E+6;
        double click_second_grenze = 10E+12;

        LocalDate NowDate = LocalDate.now();
        int thisyear = NowDate.getYear();
        int nextyear = thisyear + 1;
        
        this.click_count = this.readClickCount(dip);

        //Wenn ein Jahr vorbeit wird rückgesetzt
        //Testen Jahresübergang
        //Für die Redakteure muss einmal gelten
        if (thisyear != nextyear) {

            if (this.click_count < click_first_grenze) {

                System.out.println("< als 1 Millionen mal geklickt!!!" + this.click_count);
                this.click_count += 1;
                System.out.println("Danach" + this.click_count);
                dbService.click_count(this.click_count, dip);

            } else if (this.click_count > click_first_grenze) {

                this.click_count += 1;
                System.out.println("> als 1 Millionen mal geklickt!!!");
                dbService.click_count(this.click_count, dip);

            } else if (click_second_grenze <= click_second_grenze) {

                this.click_count += 1;
                System.out.println("< 1 Milliarde mal geklickt!!!");
                dbService.click_count(this.click_count, dip);

            } else if (click_second_grenze > click_second_grenze) {

                this.click_count += 1;
                System.out.println("Mehr als 1 Milliarde mal geklickt!!!");
                dbService.click_count(this.click_count, dip);
            }

        } else {
            click_count = 0;
            dbService.click_count(click_count, dip);
        }

    }

    //-----------------Download-Count-Diplomarbeit-------------------------
    public void download_count() {

        double downlaod_first_grenze = 10E+6;
        double download_second_grenze = 10E+12;

        LocalDate NowDate = LocalDate.now();
        int thisyear = NowDate.getYear();
        int nextyear = thisyear + 1;
        
        this.download_count = this.readDownloadCount(this.aktDip);

        //Wenn ein Jahr vorbeit wird rückgesetzt
        //Testen Jahresübergang
        //Für die Redakteure muss einmal gelten
        if (thisyear != nextyear) {

            if (this.download_count < downlaod_first_grenze) {

                System.out.println("< als 1 Millionen mal geklickt!!!");
                download_count += 1;
                System.out.println("Download count:" + download_count);
                dbService.downloadt_count(download_count,  this.aktDip);

            } else if (download_count > downlaod_first_grenze) {

                download_count += 1;
                System.out.println("> als 1 Millionen mal geklickt!!!");
                System.out.println(download_count);
                dbService.downloadt_count(download_count,  this.aktDip);

            } else if (download_count <= download_second_grenze) {

                download_count += 1;
                System.out.println("< 1 Milliarde mal geklickt!!!");
                System.out.println(download_count);
                dbService.downloadt_count(download_count,  this.aktDip);

            } else if (download_count > download_second_grenze) {

                download_count += 1;
                System.out.println("Mehr als 1 Milliarde mal geklickt!!!");
                System.out.println("Download count:" +download_count);
                dbService.downloadt_count(download_count,  this.aktDip);
            }

        } else {
            download_count = 0;
            System.out.println(download_count);
            dbService.downloadt_count(download_count, this.aktDip);
        }

       
    }
    
    
    
    public int readClickCount(Diplomarbeit dip) {
        return dbService.read_clickcount(dip);
    }
    
    public int readDownloadCount(Diplomarbeit dip) {
        return dbService.read_downloadcount(dip);
    }
        
    
    
    
    

    //---------------------Diplomarbeit download---------------------------------
    public Object download() throws IOException {

        FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
        ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
        ExternalContext externalContext = fc.getExternalContext();

        externalContext.responseReset();
        externalContext.setResponseContentType(aktDip.getTitle() + "/.pdf");
        externalContext.setResponseHeader("Content-Disposition", "attachment;filename=\"" + aktDip.getTitle());

        externalContext.setResponseHeader("Content-Disposition", "attachment;filename=\"" + aktDip.getTitle() + ".pdf" + "\"");
        String server_diplomarbeit_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + "/resources/pdf/";
        File file = new File(server_diplomarbeit_pfad + aktDip.getTitle() + ".pdf");

        OutputStream outputStream;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            outputStream = externalContext.getResponseOutputStream();
            byte[] buffer = new byte[5000];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }

//        Files.copy(file.toPath(), outputStream);
        fc.responseComplete();
        this.download_count();

        return null;

    }

    public String imagepath_auslesen(int id) {
        Diplomarbeit dip = dbService.getDiplomarbeit(id);
//        System.out.println(dip);
        String var_imagepath = dip.getBild();
//        System.out.println(var_imagepath);
        return var_imagepath;
    }

    public String bildanzeigen() {
        return this.imagepath;
    }

    //Favouriten
    public void speichern() {
        int b_id = dbService.getLoggedInBenutzer().getUser_id();
        int res = dbService.insertFavouriten(aktDip.getDa_id(), b_id);
        if (res == 1) {
            titel = "Success";
        };
    }

    public void löschenDiplomarbeit(ActionEvent event) {
        dbService.deleteDiplomarbeit(aktDip);
    }

//----------------Alter Code - Diplomarbeit ansehen--------------------------
    public void diplomarbeitansehen() {

        FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
        ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
        String server_diplomarbeit_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + "/resources/pdf/";

        try {

            //Pfad anpassen
            File pdfFile = new File(server_diplomarbeit_pfad + aktDip.getTitle() + ".pdf");

            if (pdfFile.exists()) {

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.out.println("Desktop is not supported!");

                }

            } else {
                System.out.println("File is not exists!");
            }

            System.out.println("Done");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    //---------------------------Test---------------------------
    public static void main(String[] args) {

       

    }

    

}
