/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.io.File;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import pojo.Benutzer;
import service.DatabaseManagerService;
import pojo.Diplomarbeit;

/**
 *
 * @author hp
 */
public class meinKontoBean {
    
    private Benutzer loggedInUser;
    private int user_id;
    private String username;
    private String firstname;
    private String lastname;
    private String passWd;
    private String salt;
    private String role;
    private String email;
    private List<Diplomarbeit> favList;
    private String message;
    private List<Diplomarbeit> redList;
    private DatabaseManagerService dbService;

    //Passowort zurücksetzen:
    private boolean isAltesPasswortInputTextF;
    
    
    
    public meinKontoBean() {
    }
    
    @PostConstruct
    public void init() {
        favList = dbService.getFavList();
        if (dbService.isRedakteurOrHigher()) {
            redList = dbService.getRedList();
        }
        
        
    }
    
    public boolean favIsEmpty() {
        return favList.isEmpty();
    }
    
    public void deletefav(Diplomarbeit dip) {
        System.out.println("OK" + "-------------------------------------");
        if (dbService.deleteFav(dip) == 1) {
            favList = dbService.getFavList();
            message = "";
        } else {
            message = "Something went wrong";
        }
    }
    
    public void delteDip(Diplomarbeit dip) {
        
        dbService.deleteDiplomarbeit(dip);
        this.deletePDFFile(dip.getPdf());
        this.deleteImageFile(dip.getBild());
        this.deleteTextFile(dip.getTextname());
        
        
    }

    //Getter-Setter
    public int getUser_id() {
        return user_id;
    }
    
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getPassWd() {
        return passWd;
    }
    
    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }
    
    public String getSalt() {
        return salt;
    }
    
    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Object updateBenutzer() {
        return null;
    }
    
    public DatabaseManagerService getDbService() {
        return dbService;
    }
    
    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }
    
    public Benutzer getLoggedInUser() {
        return loggedInUser;
    }
    
    public void setLoggedInUser(Benutzer loggedInUser) {
        this.loggedInUser = loggedInUser;
    }
    
    public List<Diplomarbeit> getFavList() {
        return favList;
    }
    
    public void setFavList(List<Diplomarbeit> favList) {
        this.favList = favList;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public List<Diplomarbeit> getRedList() {
        return redList;
    }
    
    public void setRedList(List<Diplomarbeit> redList) {
        this.redList = redList;
    }
    
     public boolean deletePDFFile(String filepath) {
        
        
        FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
        ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
        String server_pdf_path = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + filepath;
         
        boolean del = false;
        File file = new File(server_pdf_path);
        if (file.exists()) {
            del = file.delete();
        }
        return del;
    }
     
     
      public boolean deleteImageFile(String filepath) {
        
        
        FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
        ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
        String server_pdf_path = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + filepath;
         
        boolean del = false;
        File file = new File(server_pdf_path);
        if (file.exists()) {
            del = file.delete();
        }
        return del;
    }
      
      
        public boolean deleteTextFile(String filepath) {
        
        
        FacesContext fc = (FacesContext) FacesContext.getCurrentInstance();
        ServletContext sc = (ServletContext) fc.getExternalContext().getContext();
        String server_pdf_path = sc.getRealPath("").replaceAll("\\\\", "/").replaceAll("/build", "") + filepath;
         
        boolean del = false;
        File file = new File(server_pdf_path);
        if (file.exists()) {
            del = file.delete();
        }
        return del;
    }
    
    
    
    
    
    
    
  //----------------------------------------------------------------------------

  
    public boolean isIsAltesPasswortInputTextF() {
        return isAltesPasswortInputTextF;
    }

    public void setIsAltesPasswortInputTextF(boolean isAltesPasswortInputTextF) {
        this.isAltesPasswortInputTextF = isAltesPasswortInputTextF;
    }
    
    
    public String sendToPasswortRest() {
        
        if(this.dbService.isRedakteurOrHigher() || this.dbService.isUser()) {
            this.isAltesPasswortInputTextF = true;
            return "passwort_reset.xhtml";
        }
        else {
            this.isAltesPasswortInputTextF = false;
            return "index.xhtml";
        }
        
  
        
    }

   

   
    

    
   
    
  
    
    
    
    
    
    
    
}
