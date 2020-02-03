/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Diplomarbeit;

//import com.itextpdf.kernel.pdf.*;
//import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;
//import com.itextpdf.layout.Document;
//import com.itextpdf.layout.element.Paragraph;
import service.ConnectionManager;

//import service.ConnectionManager;
//testdatenbank:
/**
 *
 * @author hp
 */
public class DiplomarbeitDAO {

    private Connection connection;
    List<Diplomarbeit> listdp = new ArrayList<>();
    Diplomarbeit retVal;
    List<String> al = new ArrayList<>();
    //Funktion einfügen
    FileInputStream fis = null;
    Connection cn = null;
    PreparedStatement st = null;
    BufferedImage image = null;
    
    
    
    public List<Diplomarbeit> read() {
        
        
        
        ArrayList<Diplomarbeit> listdip = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from diplomarbeit")) {
            while (rs.next()) {
                retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getString(9), rs.getInt(10), rs.getInt(11));
                listdip.add(retVal);
            }

            int columns = rs.getMetaData().getColumnCount();
            System.out.println("ZeilengrÃ¶ÃŸe Datenbank " + columns);
            System.out.println("Listsize " + listdip.size());

            for (int i = 0; i < listdip.size(); i++) {
                System.out.println(listdip.get(i));
            }
            
            System.out.println("Listsize" + listdip.size());

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listdip;
    }
    
    
    

    

    public void insert(String title, int user_id, int schule_id, String pdfpath, String imagepath) throws FileNotFoundException {
        
            int da_id = 0;
            int click_count = 0;
            int download_count = 0;

            try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = 
                con.prepareStatement("INSERT INTO diplomarbeit"
                + "(da_id, titel, autor_id, schule_id, pdf, user_id, datum, bild, download_count, click_count) VALUES (?, ?, ?, ?, ? ,? ,? ,?, ?, ?)");) {
               
                pstmt.setInt(1, da_id);
                pstmt.setString(2, title);
                pstmt.setInt(3, 0);
                pstmt.setInt(4, schule_id);
                pstmt.setString(5, pdfpath);
                pstmt.setInt(6, user_id);
                pstmt.setDate(7, Date.valueOf(LocalDate.now()));
                pstmt.setString(8, imagepath);
                pstmt.setInt(9, download_count);
                pstmt.setInt(10, click_count);
            
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo

    }
    

    
    public void update(int da_id, int autor_id) {
        
         try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = 
                con.prepareStatement("UPDATE diplomarbeit SET autor_id = ? WHERE da_id =" + da_id )) {

                pstmt.setInt(1, autor_id);
                
                pstmt.executeUpdate();
                pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo
            
    }
    
    
   
    
    public Diplomarbeit getDiplomarbeit(int id) {

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM diplomarbeit WHERE da_id = " + id)) {
            
                while(rs.next()) {
                    retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getString(9), rs.getInt(10), rs.getInt(11));
                }
                
                System.out.println(retVal);
            
           

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return retVal;
        
    }
    
    
    
    
    
     //Testfunktionen
     public static void main(String[] args) throws FileNotFoundException {
        DiplomarbeitDAO dao = new DiplomarbeitDAO();
        
        //Update-Metode hat funktioniert
//        dao.update(2091, 5000, 2000);
        
        //Insert-Methode hat funktioniert
//        dao.insert("string", 0, 0, "string", "string");
        
        //getDiplomarbeit hat (nicht) funktioniert
        dao.getDiplomarbeit(20);
    }

  
  

   
    


    
    

    

    

    //Suchleistenfunktion
    public List Suchleiste(String key) { //id, title, schlagwort, autor, datum
        List<Diplomarbeit> dipList = new ArrayList<>();
        List<String> queryList = new ArrayList<>();
        Diplomarbeit help = new Diplomarbeit(20,"K",1,1,1,"K",1,new Date(2020-12-12),"K",1,1);
        //diplomarbeiten in die Liste schreiben
        queryList.add("select * from diplomarbeit where da_id like '%"+key+"%'");
        queryList.add("select * from diplomarbeit where titel like '%"+key+"%'");
        //queryList.add("select * from diplomarbeit natural join autoren where gesamtname like '%"+key+"%'");
        //queryList.add("select * from diplomarbeit where datum like '%"+key+"%'");
        //queryList.add("select * from diplomarbeit schlagwort natural join schlagwort_diplomarbeit natural join diplomarbeit"
        //       + "where diplomarbeit_da_id = da_id and id in (schlagwort_id)"
        //        + "and name like '%"+key+"%'" );
        
        for(String s: queryList) {
        
            try (
                    Connection con = ConnectionManager.getInst().getConn();
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(s)) {
                
                while (rs.next()) { //oder mit spaltennamen
                    
                    /*help.setDa_id(rs.getInt(1));
                    help.setTitle(rs.getString(2));
                    help.setAutor_id(rs.getInt(3));
                    help.setSw_id(rs.getInt(4)); //?? nur 1 sw id ??
                    help.setPdf(rs.getString(5));
                    help.setUser_id(rs.getInt(6));
                    help.setDatum(rs.getString(7));
                    help.setBild(rs.getString(8));
                    help.setDownload_count(rs.getInt(9));
                    help.setClick_count(rs.getInt(10));*/
                    
                    help.setDa_id(rs.getInt("da_id"));
                    help.setTitle(rs.getString("titel"));
                    help.setAutor_id(rs.getInt("autor_id"));
                    help.setSw_id(rs.getInt("sw_id"));
                    help.setPdf(rs.getString("pdf"));
                    help.setUser_id(rs.getInt("benutzer_id")); //user_id heißt in der datenbank benutzer_id
                    help.setDatum(rs.getDate(2020-12-20));
                    help.setBild(rs.getString("bild"));
                    help.setDownload_count(rs.getInt("download_count"));
                    help.setClick_count(rs.getInt("click_count"));
                    
                    dipList.add(help);
                    
                    //dipList.add((Diplomarbeit) rs); //konvertieren, umschichten
                    
                }
            } catch (SQLException e) {
                    System.out.println("This be some Exception: "+e);
            }
        }
        //dipList.add(new Diplomarbeit(20,"K",1,1,"K",1,"K","K",1,1));
        return dipList;
    }
    
    

}