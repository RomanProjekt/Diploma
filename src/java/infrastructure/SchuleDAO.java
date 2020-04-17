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
import pojo.Schule;
import service.ConnectionManager;

/**
 *
 * @author hp
 */
public class SchuleDAO {

    int schule_id;

    public List<Schule> read() {

        List<Schule> listd_schule = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from schule")) {
            while (rs.next()) {
                Schule retVal = new Schule(rs.getInt(1), rs.getString(2));
                listd_schule.add(retVal);
            }

            int columns = rs.getMetaData().getColumnCount();
            System.out.println("ZeilengrÃ¶ÃŸe Datenbank" + columns);
            System.out.println("Listsize" + listd_schule.size());

            for (int i = 0; i < listd_schule.size(); i++) {
                System.out.println(listd_schule.get(i));
            }

            System.out.println("Listsize" + listd_schule.size());
        } catch (SQLException ex) {
            Logger.getLogger(SchuleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listd_schule;
    }

    public Schule readOne(int id) {

        Schule retVal = null;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from schule where schule_id = " + id)) {
            while (rs.next()) {
                retVal = new Schule(rs.getInt(1), rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SchuleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return retVal;
    }

    public void insert(String schule) {

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("INSERT INTO schule"
                        + "(schule_id, name) VALUES (?, ?)");) {

            pstmt.setInt(1, schule_id);
            pstmt.setString(2, schule);

            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(SchuleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo

    }

 
}
