/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.component.behavior.FacesBehavior;
import javax.faces.context.FacesContext;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletContext;
import javax.servlet.http.Part;
import org.apache.naming.NamingEntry;
import pojo.Autor;
import pojo.Diplomarbeit;
import pojo.Schlagwort;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class uploadBean {

    private boolean editAutor = false;
    private boolean editSchlagwort = false;

    private List<String> allSchlagwTypeahead;
    private Map<String, Integer> allSchlagwMap;
    private List<Autor> autList;
    private List<Schlagwort> schlagList;
    private List<Schlagwort> insSchlagList;

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

    //----------------Neue Code----------------
    private boolean addmainautor;
    private boolean addfirstautor;

    public boolean isAddmainautor() {
        return addmainautor;
    }

    public void setAddmainautor(boolean addmainautor) {
        this.addmainautor = addmainautor;
    }

    public boolean isAddfirstautor() {
        return addfirstautor;
    }

    public void setAddfirstautor(boolean addfirstautor) {
        this.addfirstautor = addfirstautor;
    }

    private String mainautor;
    private String firstautor;
    private String secondautor;

    public String getMainautor() {
        return mainautor;
    }

    public void setMainautor(String mainautor) {
        this.mainautor = mainautor;
    }

    public String getFirstautor() {
        return firstautor;
    }

    public void setFirstautor(String firstautor) {
        this.firstautor = firstautor;
    }

    public String getSecondautor() {
        return secondautor;
    }

    public void setSecondautor(String secondautor) {
        this.secondautor = secondautor;
    }

    //--------------------Ende neuer Code----------------------------
    //--------------------Derzeitiger Code---------------------------
    public uploadBean() {
        allSchlagwTypeahead = new ArrayList<>();
        schlagList = new ArrayList<>();
        autList = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        allSchlagwMap = dbService.getAllSchlagwoerterHashMap();
        allSchlagwMap.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            Integer value = entry.getValue();
            allSchlagwTypeahead.add(key);
        });
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
        String varautor = getAutor();
        String varschule = getSchule();
        String varschlagwort = getSchlagwort();
        Part varimage = getImage();

//        boolean isgleich = this.titel_vergleichen(vartitel);
        if (diplomarbeit != null) {

            if (varimage != null) {

                //Titel überprüfen - wegen einem Redakteur --- der mehrere Schüler besitzt 
                //Dateiformat überprüfen 
                //Imagedatei überprüft -- Richtiges Format
                String submittedFileName = varimage.getSubmittedFileName();
                String user_id = String.valueOf(dbService.getLoggedInBenutzer().getUser_id());
                System.out.println(user_id);
                boolean image_standartformat = this.überprüfuen_Image_StandardFormat(submittedFileName);

                //pdfdatei überprüft -- Richtiges Format
                boolean diplomarbeit_dateiformat = this.überprüfen_PDF_StandardFormat(diplomarbeit.getSubmittedFileName());

                if (image_standartformat && diplomarbeit_dateiformat) {

                    //1.Funktionen: Speichern des Bildes
                    this.saveImage(user_id, vartitel, submittedFileName, varimage);

                    //2. Funktionen: Speichern der pdf-Datei
                    this.savePdfFile(vartitel);

                    List<String> schlagwoerter = new ArrayList<>();
                    schlagwoerter.add(varschule);
                    schlagwoerter.add(varschlagwort);

                    //3.Funktionen: Hochladen der Diplomarbeit
                    if (!(autList.size() <= 0)) {
                        dbService.hochladen(vartitel, autList, varschule, schlagList, this.pdfpath, this.imagepath);
                    } else {
                        String message = "Sie müssen mindestens einen Autor eintragen!";
                    }

                    this.titel = "";
                    this.autor = "";
                    this.schule = "";
                    this.schlagwort = "";

                } else {
                    this.dateiformat_fail = "kein richtiges Dateiformat!" + "Bild: png, jpeg, gif, jpg" + "Diplomarbeit: pdf-Format";
                }

            } else {
                this.bilddatei_fail = "Bild nicht gefunden!";
            }

        } else {
            this.pdfdabei_fail = "Keine PDF-Datei gefunden!";
        }
        return "index.xhtml?faces-redirect=true";

    }

    //-----------------------Bild speichern----------------------------------------------
    public void saveImage(String user_id, String vartitel, String submittedFileName, Part varimage) {

        FileImageOutputStream outputStream;
        String change_image_title = this.dateiformatieren(user_id, vartitel, submittedFileName);

        try (InputStream in = varimage.getInputStream()) {

            //Verknüpfen der user_id mit dem Bildtitel
            String image_pfad = "/resources/images/images_diplomarbeiten/";

            FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
            ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
            String server_images_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + image_pfad;

            File f = new File(server_images_pfad + change_image_title);

            //Pfad zum Suchen des aktuellen Bildes:
            String server_pfad = image_pfad + change_image_title;
            aktuellerimagepfad(server_pfad);

            f.createNewFile();
            outputStream = new FileImageOutputStream(f);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }

    //-----------Funktion pdf-Datei hochladen----------------------
    public void savePdfFile(String filename) {

        File f;
        FileOutputStream outputStream;

        try (InputStream in = diplomarbeit.getInputStream()) {
            FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
            ServletContext sc = (ServletContext) fc.getExternalContext().getContext();

            String server_pdf_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + "/resources/pdf/";

            f = new File(server_pdf_pfad + filename + ".pdf");
            aktuellerpdfpfad(f.getPath());

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

    }

    public boolean titel_vergleichen(String titel) {
        return dbService.diplomarbeit(titel);
    }

    //-----------------Überprüfen des Images-Datei-Formats--------------
    public boolean überprüfuen_Image_StandardFormat(String submittedFileName) {

        boolean formatvergleich = false;

        String[] standartformat = {"png", "jpeg", "gif", "jpg"};

        String[] name = submittedFileName.split(Pattern.quote("."));
        System.out.println(Arrays.toString(name));

        String bildformat = name[name.length - 1];
        System.out.println(bildformat);

        for (String format : standartformat) {
            if (bildformat.equals(format)) {
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

        if (PDF_Format.equals("pdf")) {
            formatvergleich = true;
            System.out.println("Das derzeitige Bildformat enstpricht dem Standartformat");
        }

        return formatvergleich;

    }

    //-------------------Test---------------------------------
    public static void main(String[] args) {

        uploadBean u = new uploadBean();
        u.überprüfuen_Image_StandardFormat("diplomarbeit.jpg");

    }

}
