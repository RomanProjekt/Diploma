/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.io.File;
import java.util.List;
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

     private File diplomarbeit;
     private Part image;

     private DatabaseManagerService dms;
     List<Autor> listautor;
     List<Diplomarbeit> listdiplomarbeit;

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

     public File getDiplomarbeit() {
          return diplomarbeit;
     }

     public void setDiplomarbeit(File diplomarbeit) {
          this.diplomarbeit = diplomarbeit;
     }

     public Part getImage() {
          return image;
     }

     public void setImage(Part image) {
          this.image = image;
     }

}
