/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import pojo.Benutzer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.ConnectionManager;

/**
 *
 * @author dople
 */
public class BenutzerDAO {

    public Benutzer read(String username) {
        Benutzer retVal = null;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer where benutzername = '" + username + "'")) {

            if (rs.next()) {
                retVal = new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return retVal;
    }

    public int setBenutzer(Benutzer b) {
        String query = "update benutzer set vorname = ?,nachname = ?,benutzername = ?  where benutzer_id = ?";
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {

            pstmt.setString(1, b.getFirstname());
            pstmt.setString(2, b.getLastname());
            pstmt.setString(3, b.getUsername());
            pstmt.setInt(4, b.getUser_id());
            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        return result;
    }

    public ArrayList<Benutzer> getAllBenutzer() {
        ArrayList<Benutzer> benList = new ArrayList<>();

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer")) {

            while (rs.next()) {
                benList.add(new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return benList;
    }

}
