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
            Logger.getLogger(SchlagwortDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listd_schlagwort;
    }
    
    
    

    public void insert(List<Schlagwort> schlagwoerter) {

        for (Schlagwort schlagwort : schlagwoerter) {
            insert_schlagwort(schlagwort.getTag_id(), schlagwort.getWord());
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
            Logger.getLogger(SchlagwortDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo

    }
    
    

    public void insertSchlagwortList(List<Schlagwort> swList) {
        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("INSERT INTO schlagwort"
                        + "(name) VALUES (?)");) {

            for (Schlagwort schlagwort : swList) {
                pstmt.setString(1, schlagwort.getWord());

                pstmt.executeUpdate();
            }

            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(SchlagwortDAO.class.getName()).log(Level.SEVERE, null, ex);
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


        } catch (SQLException ex) {
            Logger.getLogger(SchlagwortDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listschlagwort;

    }
    
    
    public List<Schlagwort> getAllSchlagwörter(int id) {

        List<Schlagwort> listschlagwort = new ArrayList<>();;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from schlagwort WHERE sw_id = " + id)) {
            while (rs.next()) {
                Schlagwort retVal = new Schlagwort(rs.getInt(1), rs.getString(2));
                listschlagwort.add(retVal);

            }


        } catch (SQLException ex) {
            Logger.getLogger(SchlagwortDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listschlagwort;

    }
    
    
    

}
