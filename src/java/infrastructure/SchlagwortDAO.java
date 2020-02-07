/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Schlagwort;
import service.ConnectionManager;



public class SchlagwortDAO {
    
    int tag_id;
    

    
    
    public List<Schlagwort> read() {
        
        List<Schlagwort> listd_schlagwort = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from schlagwort")) {
            while (rs.next()) {
                Schlagwort retVal = new Schlagwort(rs.getInt(1), rs.getString(2));
                listd_schlagwort.add(retVal);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listd_schlagwort;
    }

    
    
    
    
    
    public void insert(List<String> schlagwoerter) {

        for(int i = 0; i < schlagwoerter.size(); i++) {
            insert_schlagwort(this.tag_id, schlagwoerter.get(i));
        }
        
    }
    
    
    public void insert_schlagwort(int tag_id, String schlagwort) {
        
         
         try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("INSERT INTO schlagwort"
                        + "(id, name) VALUES (?, ?)");) {

                pstmt.setInt(1, this.tag_id);
                pstmt.setString(2, schlagwort);


            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo
        
    }
    
    
    

    
    public List<Schlagwort> getAllSchlagwörter() {
        
        List<Schlagwort> listschlagwort = new ArrayList<>();;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from schlagwort")) {
            while (rs.next()) {
                Schlagwort retVal = new Schlagwort(rs.getInt(1), rs.getString(2));
                listschlagwort.add(retVal);

            }

            int columns = rs.getMetaData().getColumnCount();
            System.out.println("Zeilengr Datenbank " + columns);
            System.out.println("Listsize " + listschlagwort.size());

            for (int i = 0; i < listschlagwort.size(); i++) {
                System.out.println(listschlagwort.get(i).getTag_id() + " " + listschlagwort.get(i).getWord());
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listschlagwort;
        
    }
      
    
}

    

