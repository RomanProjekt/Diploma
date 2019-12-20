/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import infrastructure.DiplomarbeitDAO;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import net.bootsfaces.utils.FacesMessages;
import pojo.Diplomarbeit;

/**
 *
 * @author hp
 */
public class dipansehenBean  {

    
    DiplomarbeitDAO dao = new DiplomarbeitDAO();
   
    
    public dipansehenBean() {
    }
    
     private String titel;
     private String autor;
     private String schule;
     private String date;
     

    public dipansehenBean(String titel, String autor, String schule, String date) {
        this.titel = titel;
        this.autor = autor;
        this.schule = schule;
        this.date = date;
    }

    public String getTitel() throws FileNotFoundException {
        
        
     
//         = di.datendipladen();
//        titel = "Titel01"; 
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
        
//        schule = "Htl Pinkafeld";
        return schule;
    }

    public void setSchule(String schule) {
        this.schule = schule;
    }

    public String getDate() {
        
//        date = "12.12.2020";
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
  
    
    private String buttonId; 
    private String result;
    private final String submitb = "form:submitButton";     
    
    
    public void print(ActionEvent event) {
        
       
                
      
		//Get submit button id
		buttonId = event.getComponent().getClientId();
                       
                        
                if(buttonId.equals(submitb)) {
                    
                    result = "wahr";
                }
                else
                    result = "falsch";
                    
                    
                  
            
        
        
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

   
    
    
   
    
   
  

   
     
     
    
}
