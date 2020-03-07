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
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.http.Part;
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

    private String bilddatei_fail;
    private String pdfdabei_fail;
    private String titel_fail;

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

    //Anzeigen von einem Bild
    public void pfadbild() {
        //Bild anzeigen im HTML Dokument

        String pfad = "/user/desktop/test/bild.jpg";
        String varpfad = pfad.replaceAll("/", "//c");
        System.out.println(varpfad);

    }

    public void upload_diplomarbeit() throws FileNotFoundException, IOException {

        String vartitel = getTitel();
        String varautor = getAutor();
        String varschule = getSchule();
        String varschlagwort = getSchlagwort();

        Part varimage = getImage();

        if (diplomarbeit != null) {

            if (varimage != null) {

//                boolean isgleich = this.titel_vergleichen(vartitel);
                if (true) {
                    //1. Speichern des Bildes
                    this.saveImage(vartitel, varimage);

                    //2. Speichern der pdf-Datei
                    this.savePdfFile(vartitel);

                    List<String> schlagwoerter = new ArrayList<>();
                    schlagwoerter.add(varschule);
                    schlagwoerter.add(varschlagwort);

                    dbService.hochladen(vartitel, autList, varschule, schlagList, this.pdfpath, this.imagepath);

                    this.titel = "";
                    this.autor = "";
                    this.schule = "";
                    this.schlagwort = "";

                } else {
                    this.titel_fail = "Titel bitte ändern!";
                }

            } else {
                this.bilddatei_fail = "Bild nicht gefunden!";

            }

        } else {
            this.pdfdabei_fail = "PDF-Datei nicht gefunden!";
        }

    }

    public void saveImage(String change_filename, Part varimage) {

        FileImageOutputStream outputStream;

        //f_name = bild1 , filename = diplomarbeit
        String bild_name = varimage.getSubmittedFileName();
//        String safe_name = this.dateiformatieren(change_filename, bild_name);

        try (InputStream in = varimage.getInputStream()) {

            //Absoluten Pfad + neuen Titelnamen oder alten Titelnamen
//          File f = new File("/Users/hp/Desktop/" + safe_name);
            //Muss am Server geänder werden!!!!
            //       File f = new File("\\Users\\dople\\Desktop\\Schule\\Test\\2019_6abif_da_reit_grof_dopl\\web\\resources\\images" + bild_name);
            File f = new File("\\Users\\hp\\Desktop\\DA_AK\\web\\resources\\images\\" + bild_name);

            //Pfad zum Suchen des aktuellen Bildes:
            String server_pfad = "/resources/images/" + bild_name;
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

    //Funktion pdf-Datei hochladen
    public void savePdfFile(String filename) throws FileNotFoundException, IOException {

        File f;
        FileOutputStream outputStream;

        try (InputStream in = diplomarbeit.getInputStream()) {

            //Absoluten Pfad + neuen Titelnamen oder alten Titelnamen
            //Muss am Wespace geändert werden!!!
            String server_pdf_pfad = "\\Users\\hp\\Desktop\\DA_AK\\web\\resources\\images\\pdf\\";

            f = new File(server_pdf_pfad + filename + ".pdf");
            //"/Users/hp/Desktop/"
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

        }
    }

    public boolean titel_vergleichen(String titel) {

        boolean istgleich = false;

        List<Diplomarbeit> listdip = dbService.ListeAllDiplomarbeiten();

        for (int i = 0; i < listdip.size(); i++) {
            String name = listdip.get(i).getTitle();

            if (!titel.equals(name)) {
                istgleich = true;
                return istgleich;
            } else {
                System.out.println("Name ist schon vorhanden");
                istgleich = false;
            }
        }

        return istgleich;

    }

    public String dateiformatieren(String filename, String bild_name) {

        String[] name = bild_name.split(Pattern.quote("."));
        System.out.println(Arrays.toString(name));
        String bildformat = name[name.length - 1];

        String r_filename = filename + "." + bildformat;
        System.out.println(r_filename);

        return r_filename;

    }

    public static void main(String[] args) {
        uploadBean u = new uploadBean();
        u.dateiformatieren("diplomarbeit", "bild.jpg");
    }

}
