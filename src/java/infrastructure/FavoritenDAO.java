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
import pojo.Diplomarbeit;
import service.ConnectionManager;

public class FavoritenDAO {

    public List<Diplomarbeit> getFavList(int id) {

        ArrayList<Diplomarbeit> listfav_dip = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select diplomarbeit.da_id, titel, autor_id, schule_id, pdf, diplomarbeit.benutzer_id, datum, bild, download_count, click_count "
                        + "from favoriten join diplomarbeit on favoriten.da_id = diplomarbeit.da_id "
                        + "where favoriten.benutzer_id = " + id)) {
            while (rs.next()) {
                Diplomarbeit retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getInt(10));
                listfav_dip.add(retVal);
            }

//            int columns = rs.getMetaData().getColumnCount();
//            System.out.println("ZeilengrÃ¶ÃŸe Datenbank " + columns);
//            System.out.println("Listsize " + listfav_dip.size());
//
//            for (int i = 0; i < listfav_dip.size(); i++) {
//                System.out.println(listfav_dip.get(i));
//            }
//
//            System.out.println("Listsize" + listfav_dip.size());
        } catch (SQLException ex) {
            Logger.getLogger(FavoritenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listfav_dip;

    }

    public int insert(int dp_id, int b_id) {
        String query = "insert into favoriten(`benutzer_id`, `da_id`) values(?, ?)";
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {

            pstmt.setInt(1, b_id);
            pstmt.setInt(2, dp_id);

            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FavoritenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        return result;
    }

    public int deleteOne(Diplomarbeit dip, int b_id) {
        String query = "delete from favoriten where benutzer_id = ? and da_id = ?";
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {

            pstmt.setInt(1, b_id);
            pstmt.setInt(2, dip.getDa_id());

            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FavoritenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        return result;
    }

    public void deleteDip(int da_id) {
        String query = "delete from favoriten where da_id = ?";
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {

            pstmt.setInt(1, da_id);

            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FavoritenDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

    }

}
