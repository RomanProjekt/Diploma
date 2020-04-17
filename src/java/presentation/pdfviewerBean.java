/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletContext;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;
import pojo.Diplomarbeit;
import service.DatabaseManagerService;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PageDrawerParameters;

/**
 *
 * @author hp
 */
public class pdfviewerBean {

    private Diplomarbeit dip;
    private DatabaseManagerService dbService;
    private PDDocument document;
    private int seitenanzahl;
    private int aktuelleseitenanzahl;
    private String varseitenanzahl;
    private String image_pfad;
    private String pdf;
    
    private String server_diplomarbeit_pfad;
    
    
    public pdfviewerBean() {
        
    }
    
    @PostConstruct
    void init() {
        dip = new Diplomarbeit();
    }

    public Diplomarbeit getDip() {
        return dip;
    }

    public void setDip(Diplomarbeit dip) {
        this.dip = dip;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public PDDocument getDocument() {
        return document;
    }

    public void setDocument(PDDocument document) {
        this.document = document;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }

    public int getAktuelleseitenanzahl() {
        return aktuelleseitenanzahl;
    }

    public void setAktuelleseitenanzahl(int aktuelleseitenanzahl) {
        this.aktuelleseitenanzahl = aktuelleseitenanzahl;
    }

    public String getVarseitenanzahl() {
        return varseitenanzahl;
    }

    public void setVarseitenanzahl(String varseitenanzahl) {
        this.varseitenanzahl = varseitenanzahl;
    }

    public String getImage_pfad() {
        return image_pfad;
    }

    public void setImage_pfad(String image_pfad) {
        this.image_pfad = image_pfad;
    }

//    public String getPdf() {
//        return "G:/AK_Projekt/DA_AK/web/resources/pdf/Diplomarbeit12.pdf";
//    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }
    
    

    public String getServer_diplomarbeit_pfad() {
        return server_diplomarbeit_pfad;
    }

    public void setServer_diplomarbeit_pfad(String server_diplomarbeit_pfad) {
        this.server_diplomarbeit_pfad = server_diplomarbeit_pfad;
    }

    

    //Diplomarbeitn ansehen
    public String diplomarbeitansehen(Diplomarbeit diplomarbeit) throws IOException {
        System.out.println("-----------------------------" + diplomarbeit);
        this.pdf = diplomarbeit.getPdf();
        
        System.out.println("-------------------" + this.pdf);
        return "PDFViewer.xhtml";
    }
    
   
    
//    public String readDiplomarbeit() {
//        try {
//            sleep(1000);
//            return this.getServer_diplomarbeit_pfad();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(pdfviewerBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return this.getServer_diplomarbeit_pfad();
//    }

    
//        FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
//        ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
//        server_diplomarbeit_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + "/resources/pdf/" + diplomarbeit.getTitle() + ".pdf";
//        System.out.println(this.server_diplomarbeit_pfad);  
    

}
    
