/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletContext;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;
import pojo.Diplomarbeit;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class pdfviewerBean {

    private Diplomarbeit dip = new Diplomarbeit();;
    private DatabaseManagerService dbService;
    private PDDocument document;
    private int seitenanzahl;
    private int aktuelleseitenanzahl;
    private String varseitenanzahl;
    private String image_pfad;
    
    
    public pdfviewerBean() {
        
    }
    
    @PostConstruct
    void init() {
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
    
    
    
    
    private String generateImageFromPDF(PDDocument doc, int sz) throws IOException {
        //File imageFile = null;
        //imageFile = new File(server_diplomarbeit_pfad + "/template_image.jpg");

        FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
        ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
        
        
        PDFRenderer pdfRenderer = new PDFRenderer(doc);
        BufferedImage bim = pdfRenderer.renderImageWithDPI(sz, 300, ImageType.RGB);
        
        String server_diplomarbeit_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + "/resources/test/";

        ImageIOUtil.writeImage(bim,String.format(server_diplomarbeit_pfad + "/image.%s" ,"jpg"),300);
        
        return server_diplomarbeit_pfad;
    }
    
    

    //Diplomarbeitn ansehen
    public String diplomarbeitansehen(Diplomarbeit diplomarbeit) throws IOException {
         //---------------pdf Seiten in ein Bild speichern!!!--------------
        
        dip = diplomarbeit;
        System.out.println(dip.getPdf());
        document = PDDocument.load(new File(dip.getPdf()));
        System.out.println(document);
//        this.aktuelleseitenanzahl = document.getPages().getCount();
        this.image_pfad = this.generateImageFromPDF(document, 1);


        //-------------------------------------------------------

        return "PDFViewer.xhtml";
    }

    
    public Object hochzaehlen(ActionEvent actionEvent) {
        
        
        if (document.getNumberOfPages() > 0) {

            
            //maxszahl = 2
            if ((this.seitenanzahl < document.getNumberOfPages()) & (this.seitenanzahl > 0)) {
                this.seitenanzahl = this.seitenanzahl + 1;
                String varseitenanzahl = String.valueOf(seitenanzahl);
             
               
            }
          
        }
        
        return null;

    }
    
    
    
}


//--------------------------------------------------------------------------
//        File temp = File.createTempFile(dip.getTitle(), ".pdf");
//        
//        File testPdfFile = new File("D:\AFC150_20180819_0103.pdf");
//        FacesContext fc = FacesContext.getCurrentInstance();
//        ExternalContext ec = fc.getExternalContext();
//
//        ec.responseReset(); 
//        ec.setResponseContentType("application/pdf"); 
//        ec.setResponseContentLength((int)testPdfFile.length()); 
//
//        //Inline
//        //ec.setResponseHeader("Content-Disposition", "inline; filename=\"" + testPdfFile.getName() + "\""); 
//
//        //Attach for Browser
//        ec.setResponseHeader("Content-Disposition", "attachment; filename=\"" + testPdfFile.getName() + "\""); 
//
//        OutputStream output = ec.getResponseOutputStream();
//        Files.copy(testPdfFile.toPath(), output);
//        fc.responseComplete();