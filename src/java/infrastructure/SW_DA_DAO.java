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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.SW_DA;
import pojo.Schlagwort;
import service.ConnectionManager;

/**
 *
 * @author hp
 */
public class SW_DA_DAO {

    public List<SW_DA> getAllSW_DA_Verknüpfungen() {

        List<SW_DA> list_sw_da = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from schlagwort_diplomarbeit")) {

            while (rs.next()) {
                SW_DA retVal = new SW_DA(rs.getInt(1), rs.getInt(2));
                list_sw_da.add(retVal);

            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return list_sw_da;

    }

    public List<Schlagwort> getAllSchlagwoerter(int id) {
        List<Schlagwort> listd_schlagwort = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select id, name, sw_id, da_id from schlagwort join schlagwort_diplomarbeit on schlagwort.id = schlagwort_diplomarbeit.sw_id where da_id = " + id)) {
            while (rs.next()) {
                Schlagwort retVal = new Schlagwort(rs.getInt(1), rs.getString(2));
                listd_schlagwort.add(retVal);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listd_schlagwort;
    }

    public void insert(List<Schlagwort> schlagwoerter, int da_id) {

        for (int i = 0; i < schlagwoerter.size(); i++) {
            insert_var(schlagwoerter.get(i).getTag_id(), da_id);
        }

    }

    public void insert_var(int sw_id, int da_id) {

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("INSERT INTO schlagwort_diplomarbeit (sw_id, da_id) VALUES (?, ?)");) {

            pstmt.setInt(1, sw_id);
            pstmt.setInt(2, da_id);

            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo
    }

    public void insertHashMap(HashMap<Integer, Schlagwort> insMap, int daId) {
        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("INSERT INTO schlagwort_diplomarbeit (sw_id, da_id) values (?, " + daId + " )");) {

            for (Map.Entry<Integer, Schlagwort> entry : insMap.entrySet()) {
                Integer key = entry.getKey();
                Schlagwort value = entry.getValue();
                pstmt.setInt(1, value.getTag_id());

                pstmt.executeUpdate();
            }

            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteSW_DA(HashMap<Integer, Schlagwort> remMap, int da_id) {
        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("DELETE FROM schlagwort_diplomarbeit where sw_id = ? and da_id = " + da_id);) {

            for (Map.Entry<Integer, Schlagwort> entry : remMap.entrySet()) {
                Integer key = entry.getKey();
                Schlagwort value = entry.getValue();
                pstmt.setInt(1, value.getTag_id());

                pstmt.executeUpdate();
            }

            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo
    }

}
