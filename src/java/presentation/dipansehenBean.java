/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import infrastructure.DiplomarbeitDAO;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.sql.Date;
import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import pojo.Diplomarbeit;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class dipansehenBean {

    DiplomarbeitDAO dao = new DiplomarbeitDAO();

    private Diplomarbeit aktDip;
    private String titel;
    private String autor;
    private String schule;
    private Date date;
    private int seitenanzahl = 0;
    private DatabaseManagerService dms;
    private int aktuelle_id;
    private String buttonId;
    private String result;
    private String imagepath;

    private String bildnamegleich;
    private String pdfnamegleich;

    public dipansehenBean() {

    }

    @PostConstruct
    void init() {
        dms = new DatabaseManagerService();
    }

    public DatabaseManagerService getDms() {
        return dms;
    }

    public void setDms(DatabaseManagerService dms) {
        this.dms = dms;
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

    public DiplomarbeitDAO getDao() {
        return dao;
    }

    public void setDao(DiplomarbeitDAO dao) {
        this.dao = dao;
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

    //Funktionen
    public String werteanzeigen(Diplomarbeit dip) {
        this.aktDip = dip;
        this.autor = dms.getOneAutor(aktDip.getDa_id()).getFullName();
        this.schule = dms.getOneSchule(aktDip.getSchule_id()).getName();
        return "dipansehen.xhtml";
    }

    public void auslesenWerte(int id) {

        if (imagepath != null) {
            imagepath = imagepath_auslesen(id);
        }

        System.out.println("Listengroeße: " + dms.ListeAllDiplomarbeiten().size());

        for (int i = 0; i < dms.ListeAllDiplomarbeiten().size(); i++) {

            if (dms.ListeAllDiplomarbeiten().get(i).getDa_id() == id) {

                titel = dms.ListeAllDiplomarbeiten().get(i).getTitle();
                schule = dms.getListevonSchulen().get(i).getName();
                date = dms.ListeAllDiplomarbeiten().get(i).getDatum();

                for (int j = 0; j < dms.getAllAutor().size(); j++) {
                    if (dms.getAllAutor().get(j).getDa_id() == id) {
                        autor = dms.getAllAutor().get(j).getFullName();

                    }
                }

            }

        }

    }

    //Diplomarbeit download
    public void download() throws IOException {

        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();

        externalContext.responseReset();
        externalContext.setResponseContentType(this.titel + "/.pdf");
        externalContext.setResponseHeader("Content-Disposition", "attachment;filename=\"titel01.pdf\" ");

        externalContext.setResponseHeader("Content-Disposition", "attachment;filename=\"" + this.titel + ".pdf" + "\"");

        //Pfad muss bei Webspace geändert werden!!!
        String pdf_pfad = "C:\\Users\\hp\\Desktop\\DA_AK\\web\\resources\\pdf\\";
        File file = new File(pdf_pfad + this.titel + ".pdf");

        OutputStream outputStream;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            outputStream = externalContext.getResponseOutputStream();
            byte[] buffer = new byte[5000];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        }

        Files.copy(file.toPath(), outputStream);
        context.responseComplete();

    }

    //Diplomarbeitn ansehen
    public void diplomarbeitansehen() {

        String pdf_pfad = "C:\\Users\\hp\\Desktop\\DA_AK\\web\\resources\\pdf\\";

        try {

            //Pfad anpassen
            File pdfFile = new File(pdf_pfad + this.titel + ".pdf");

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

    public String imagepath_auslesen(int id) {
        Diplomarbeit dip = dms.getDiplomarbeit(id);
//        System.out.println(dip);
        String var_imagepath = dip.getBild();
//        System.out.println(var_imagepath);
        return var_imagepath;
    }

    public String bildanzeigen() {
        return this.imagepath;
    }

    //Favouriten
    public void speichern(ActionEvent event) {
        dms.insertFavouriten();
    }

    public void löschenDiplomarbeit(ActionEvent event) {
        dms.deleteDiplomarbeit(this.aktuelle_id);
    }

}
