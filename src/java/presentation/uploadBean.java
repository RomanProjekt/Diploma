/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.http.Part;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import pojo.Autor;
import pojo.Diplomarbeit;
import pojo.Schlagwort;
import pojo.Schule;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class uploadBean implements Serializable {

    private boolean editAutor = false;
    private boolean editSchlagwort = false;

    private List<String> allSchlagwTypeahead;
    private Map<String, Integer> allSchlagwMap;
    private List<Autor> autList;
    private List<Schlagwort> schlagList;
    private List<Schlagwort> insSchlagList;
    private List<Schule> schulList;
    private Schule realSchule;
    private Date datum;

    private String titel;
    private String autor;
    private String schule;
    private String schlagwort;

    private Part diplomarbeit;
    private Part image;
    private String pdfpath;
    private String imagepath;

    private DatabaseManagerService dbService;
    List<Autor> listautor;
    List<Diplomarbeit> listdiplomarbeit;

    private String result;

    //---------------Fail------------------------
    private String bilddatei_fail;
    private String pdfdabei_fail;
    private String titel_fail;
    private String dateiformat_fail;
    private String diplomarbeitenTitel_fail;


   
    //--------------------Derzeitiger Code---------------------------
    public uploadBean() {
        allSchlagwTypeahead = new ArrayList<>();
        schlagList = new ArrayList<>();
        autList = new ArrayList<>();
        datum = new Date();
    }

    @PostConstruct
    public void init() {
        allSchlagwMap = dbService.getAllSchlagwoerterHashMap();
        allSchlagwMap.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            Integer value = entry.getValue();
            allSchlagwTypeahead.add(key);
        });
        schulList = dbService.getSchuleList();
        datum = new Date();
    }

    public Object addAutor() {
        if (!"".equals(autor) && autor != null) {
            Autor aut = new Autor(0, autor, 0);
            this.autList.add(aut);

        }
        autor = "";
        return null;
    }

    public Object editAutor(Autor autor) {
        editAutor = !editAutor;
        return null;
    }

    public Object removeAutor(Autor autor) {
        autList.remove(autor);
        return null;
    }
    
     public void removeAutoren(ValueChangeEvent event) {
        autList.remove(event.getNewValue().toString());
    }
    
  

    public Object addSchlagwort() {
        if (!"".equals(schlagwort) && schlagwort != null) {

            if (allSchlagwMap.containsKey(schlagwort)) {
                Schlagwort schlag = new Schlagwort(allSchlagwMap.get(schlagwort), schlagwort);
                schlagList.add(schlag);

            } else {
                Schlagwort schlag = new Schlagwort(0, schlagwort);
                schlagList.add(schlag);
            }
        }
        schlagwort = "";
        return null;
    }

    public Object removeSchlagwort(Schlagwort schlagwort) {
        schlagList.remove(schlagwort);
        return null;
    }

    //-------------------GET- und SET-Methoden--------------------------
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Schule getRealSchule() {
        return realSchule;
    }

    public void setRealSchule(Schule realSchule) {
        this.realSchule = realSchule;
    }

    public List<Schule> getSchulList() {
        return schulList;
    }

    public void setSchulList(List<Schule> schulList) {
        this.schulList = schulList;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
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

    public String getSchlagwort() {
        return schlagwort;
    }

    public void setSchlagwort(String schlagwort) {
        this.schlagwort = schlagwort;
    }

    public Part getDiplomarbeit() {
        return diplomarbeit;
    }

    public void setDiplomarbeit(Part diplomarbeit) {
        this.diplomarbeit = diplomarbeit;
    }

    public Part getImage() {
        return image;
    }

    public void setImage(Part image) {
        this.image = image;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getPdfpath() {
        return pdfpath;
    }

    public void setPdfpath(String pdfpath) {
        this.pdfpath = pdfpath;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    private void aktuellerpdfpfad(String path) {
        this.pdfpath = path;
    }

    private void aktuellerimagepfad(String path) {
        this.imagepath = path;
    }

    public String getBilddatei_fail() {
        return bilddatei_fail;
    }

    public void setBilddatei_fail(String bilddatei_fail) {
        this.bilddatei_fail = bilddatei_fail;
    }

    public String getPdfdabei_fail() {
        return pdfdabei_fail;
    }

    public void setPdfdabei_fail(String pdfdabei_fail) {
        this.pdfdabei_fail = pdfdabei_fail;
    }

    public String getTitel_fail() {
        return titel_fail;
    }

    public void setTitel_fail(String titel_fail) {
        this.titel_fail = titel_fail;
    }

    public boolean isEditAutor() {
        return editAutor;
    }

    public boolean isEditSchlagwort() {
        return editSchlagwort;
    }

    public List<String> getAllSchlagwTypeahead() {
        return allSchlagwTypeahead;
    }

    public Map<String, Integer> getAllSchlagwMap() {
        return allSchlagwMap;
    }

    public List<Autor> getAutList() {
        return autList;
    }

    public List<Schlagwort> getSchlagList() {
        return schlagList;
    }

    public List<Schlagwort> getInsSchlagList() {
        return insSchlagList;
    }

    public List<Autor> getListautor() {
        return listautor;
    }

    public List<Diplomarbeit> getListdiplomarbeit() {
        return listdiplomarbeit;
    }

    public void setEditAutor(boolean editAutor) {
        this.editAutor = editAutor;
    }

    public void setEditSchlagwort(boolean editSchlagwort) {
        this.editSchlagwort = editSchlagwort;
    }

    public void setAllSchlagwTypeahead(List<String> allSchlagwTypeahead) {
        this.allSchlagwTypeahead = allSchlagwTypeahead;
    }

    public void setAllSchlagwMap(Map<String, Integer> allSchlagwMap) {
        this.allSchlagwMap = allSchlagwMap;
    }

    public void setAutList(List<Autor> autList) {
        this.autList = autList;
    }

    public void setSchlagList(List<Schlagwort> schlagList) {
        this.schlagList = schlagList;
    }

    public void setInsSchlagList(List<Schlagwort> insSchlagList) {
        this.insSchlagList = insSchlagList;
    }

    public void setListautor(List<Autor> listautor) {
        this.listautor = listautor;
    }

    public void setListdiplomarbeit(List<Diplomarbeit> listdiplomarbeit) {
        this.listdiplomarbeit = listdiplomarbeit;
    }

    public String getDateiformat_fail() {
        return dateiformat_fail;
    }

    public void setDateiformat_fail(String dateiformat_fail) {
        this.dateiformat_fail = dateiformat_fail;
    }

    public String getDiplomarbeitenTitel_fail() {
        return diplomarbeitenTitel_fail;
    }

    public void setDiplomarbeitenTitel_fail(String diplomarbeitenTitel_fail) {
        this.diplomarbeitenTitel_fail = diplomarbeitenTitel_fail;
    }

    public String upload_diplomarbeit() throws FileNotFoundException, IOException {

        String vartitel = getTitel();
       

        java.sql.Date realDate = new java.sql.Date(datum.getTime());

//        boolean isgleich = this.titel_vergleichen(vartitel);
        if (diplomarbeit != null) {

           

//                String submittedFileName = varimage.getSubmittedFileName();
                String user_id = String.valueOf(dbService.getLoggedInBenutzer().getUser_id());
                System.out.println(user_id);
//                boolean image_standartformat = this.überprüfuen_Image_StandardFormat(submittedFileName);

                boolean diplomarbeit_dateiformat = this.überprüfen_PDF_StandardFormat(diplomarbeit.getSubmittedFileName());
                if (diplomarbeit_dateiformat) {

                    
                    String pdfpfad = this.savePdfFile(vartitel);
                    String imagepfad = this.showImageFromPDF(vartitel);
                    
                    
                    //3.Funktionen: Hochladen der Diplomarbeit
                    if (!(autList.size() <= 0&& realDate == null)) {
                        dbService.hochladen(vartitel, autList, realSchule, schlagList, pdfpfad, imagepfad, realDate);
                        return "index.xhtml?faces-redirect=true";
                    } else {
                        this.autoralert = true;
                    }
                        

                    this.titel = "";
                    this.autor = "";
                    this.schule = "";
                    this.schlagwort = "";

                } else {
                    this.dateiformat_fail = "kein richtiges pdf-Format";
                }

           

        } else {
//            this.pdfdabei_fail = "Keine PDF-Datei gefunden!";
        }
        return "uploadDip.xhtml";
        

    }

    //-----------------------Bild aus der pdf Datei anzeigen-------------------------------------
    
    
    private String server_pdf_pfad;

    public String getServer_pdf_pfad() {
        return server_pdf_pfad;
    }

    public void setServer_pdf_pfad(String server_pdf_pfad) {
        this.server_pdf_pfad = server_pdf_pfad;
    }
    
    
    
    
    
    public String showImageFromPDF(String name) throws IOException {
        
        BufferedImage image;
        String image_pfad = "/resources/images/images_diplomarbeiten/" + name + ".png";

        FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
        ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
        String server_images_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + image_pfad;
        
//      File file3 = new File("C:\\Users\\hp\\Desktop\\document.pdf");
        File file3 = new File(this.server_pdf_pfad);
        System.out.println(file3.getAbsolutePath());
        System.out.println(file3.getName());
       
        
        

        if (file3.exists()) {

            //Instantiating the PDFRenderer class
            try (PDDocument document = PDDocument.load(file3)) {
                //Instantiating the PDFRenderer class
                PDFRenderer renderer = new PDFRenderer(document);
                //Rendering an image from the PDF document
                image = renderer.renderImage(0);
                //Writing the image to a file
                ImageIO.write(image, "JPEG", new File(server_images_pfad));
                System.out.println("Image created");
                //Closing the document
                document.close();  
            }

        }
        else {
            System.out.println("PDf ist nicht vorhanden!");
        }

        
        return image_pfad;
       
        
    }
    
    
    public static void main(String[] args) throws IOException {
        uploadBean up = new uploadBean();
//        up.showImageFromPDF();
    }
            
            
    
    
    
    
    
    
    
    

    //-----------Funktion pdf-Datei hochladen----------------------
    public String savePdfFile(String filename) {

        File f;
        FileOutputStream outputStream;
        String pdf_pfad = "/resources/pdf/";
        String aktuellerpfad = null;

        try (InputStream in = diplomarbeit.getInputStream()) {
            FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
            ServletContext sc = (ServletContext) fc.getExternalContext().getContext();

            this.server_pdf_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + "resources/pdf/" + filename + ".pdf";

            System.out.println(server_pdf_pfad);
            aktuellerpfad = pdf_pfad + filename + ".pdf";
            this.aktuellerpdfpfad(aktuellerpfad);

            f = new File(this.server_pdf_pfad);
            

            f.createNewFile();
            outputStream = new FileOutputStream(f);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            in.close();
            outputStream.close();

        } catch (FileNotFoundException fnfex) {
            System.out.println(fnfex.getMessage());
        } catch (IOException ioex) {
            System.out.println(ioex.getMessage());
        }
        
        return aktuellerpfad;

    }

    public boolean titel_vergleichen(String titel) {
        return dbService.diplomarbeit(titel);
    }

    //-----------------Überprüfen des Images-Datei-Formats--------------
    public boolean überprüfuen_Image_StandardFormat(String submittedFileName) {

        boolean formatvergleich = false;
        System.out.println("-----------------------------------" + submittedFileName);

        String[] standartformat = {"png", "jpeg", "gif", "jpg"};

        String[] name = submittedFileName.split(Pattern.quote("."));
        System.out.println(Arrays.toString(name));

        String bildformat = name[name.length - 1];
        System.out.println(bildformat);

        for (String format : standartformat) {
            if (bildformat.equalsIgnoreCase(format)) {
                formatvergleich = true;
                System.out.println("Das derzeitige Bildformat enstpricht dem Standartformat");
            }
        }

        return formatvergleich;

    }

    //---------------------Diplomarbeit Titel umformartieren -------------------------
    public String dateiformatieren(String user_id, String diplomarbeit_titel, String submittedFileName) {

        String[] name = submittedFileName.split(Pattern.quote("."));

        String new_image_titel = diplomarbeit_titel + user_id + "." + name[name.length - 1];

        System.out.println(new_image_titel);

        return new_image_titel;
    }
    
     
    
    

    //--------------------Überpüfen des PDF Formats----------------------
    private boolean überprüfen_PDF_StandardFormat(String submittedFileName) {

        boolean formatvergleich = false;

        String[] name = submittedFileName.split(Pattern.quote("."));
        System.out.println(Arrays.toString(name));

        String PDF_Format = name[name.length - 1];

        if (PDF_Format.equalsIgnoreCase("pdf")) {
            formatvergleich = true;
            System.out.println("Das derzeitige Bildformat enstpricht dem Standartformat");
        }

        return formatvergleich;

    }

  
    private boolean autoralert;

    public boolean isAutoralert() {
        return autoralert;
    }

    public void setAutoralert(boolean autoralert) {
        this.autoralert = autoralert;
    }

  
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------  
    
//    public void saveImage(String user_id, String vartitel, String submittedFileName, Part varimage) {
//
//        FileImageOutputStream outputStream;
//        String change_image_title = this.dateiformatieren(user_id, vartitel, submittedFileName);
//
//        try (InputStream in = varimage.getInputStream()) {
//
//            //Verknüpfen der user_id mit dem Bildtitel
//            String image_pfad = "/resources/images/images_diplomarbeiten/";
//
//            FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
//            ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
//            String server_images_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + image_pfad;
//
//            File f = new File(server_images_pfad + change_image_title);
//
//            //Pfad zum Suchen des aktuellen Bildes:
//            String server_pfad = image_pfad + change_image_title;
//            aktuellerimagepfad(server_pfad);
//
//            f.createNewFile();
//            outputStream = new FileImageOutputStream(f);
//            byte[] buffer = new byte[1024];
//            int length;
//            while ((length = in.read(buffer)) > 0) {
//                outputStream.write(buffer, 0, length);
//            }
//            outputStream.close();
//
//        } catch (IOException e) {
//            e.printStackTrace(System.out);
//        }
//
//    }
    
    
    
    
    
  

    
    
 
    
    
    

}
