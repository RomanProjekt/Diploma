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
import java.util.regex.Pattern;
import javax.faces.context.FacesContext;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletContext;
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

    private String titel;
    private String autor;
    private String schule;
    private String schlagwort;

    private Part diplomarbeit;
    private Part image;
    private String pdfpath;
    private String imagepath;

    private DatabaseManagerService dms;
    List<Autor> listautor;
    List<Diplomarbeit> listdiplomarbeit;

    private String result;

    private String bilddatei_fail;
    private String pdfdabei_fail;
    private String titel_fail;

    public uploadBean() {
        dms = new DatabaseManagerService();
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

    public DatabaseManagerService getDms() {
        return dms;
    }

    public void setDms(DatabaseManagerService dms) {
        this.dms = dms;
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

                    dms.hochladen(vartitel, varautor, varschule, schlagwoerter, this.pdfpath, this.imagepath);

                    this.titel = "";
                    this.autor = "";
                    this.schule = "";
                    this.schlagwort = "";

                } else {
                    this.titel_fail = "Titel bitte Ã¤ndern!";
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
            //Muss am Server geÃ¤nder werden!!!!
            
            FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
            ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
            String server_images_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + "/resources/images/";
            
            
            File f = new File(server_images_pfad + bild_name);

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
            //Muss am Wespace geÃ¤ndert werden!!!
            FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
            ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
            String server_pdf_pfad = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + "/resources/pdf/";
                    
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

        List<Diplomarbeit> listdip = dms.ListeAllDiplomarbeiten();

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
