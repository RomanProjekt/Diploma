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
import java.util.List;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.http.Part;
import pojo.Autor;
import pojo.Diplomarbeit;
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

    public void pfadbild() {
        //Bild anzeigen im HTML Dokument

        String pfad = "/user/desktop/test/bild.jpg";
        String varpfad = pfad.replaceAll("/", "//c");
        System.out.println(varpfad);

    }

    public void upload_diplomarbeit() throws FileNotFoundException, IOException {

        String vartitel = getTitel();
        String varautor = getAutor();

        //Liste der SchlagwÃ¶rter
        String varschule = getSchule();
        String varschlagwort = getSchlagwort();

        //1. Speichern des Bildes
        this.saveImage();
        //2. Speichern der pdf-Datei
        this.savePdfFile(vartitel);

        List<String> schlagwörter = new ArrayList<>();
        schlagwörter.add(varschule);
        schlagwörter.add(varschlagwort);

        dms.hochladen(vartitel, varautor, varschule, schlagwörter, this.pdfpath, this.imagepath);

    }

    public void saveImage() {

        Part varimage = getImage();
        String filename = varimage.getSubmittedFileName();
        FileImageOutputStream outputStream;

        try {

            try (InputStream in = varimage.getInputStream()) {

                //Absoluten Pfad + neuen Titelnamen oder alten Titelnamen
                File f = new File("/Users/hp/Desktop/" + filename);
                aktuellerimagepfad(f.getPath());
                f.createNewFile();
                outputStream = new FileImageOutputStream(f);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = in.read(buffer)) > 0) {
                    outputStream.write(buffer, 0, length);
                }
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
            f = new File("/Users/hp/Desktop/" + filename + ".pdf");
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

    //Testfunktionen
    public static void main(String[] args) {

    }

}
