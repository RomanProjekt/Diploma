/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import pojo.Benutzer;
import java.sql.Connection;
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
                ResultSet rs = stmt.executeQuery("select * from benutzer")) {

            if (rs.next()) {
                retVal = new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort_verschlüsselt"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return retVal;
    }
}
