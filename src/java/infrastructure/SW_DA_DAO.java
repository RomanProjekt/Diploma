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
import pojo.SW_DA;
import pojo.Schlagwort;
import service.ConnectionManager;


/**
 *
 * @author hp
 */
public class SW_DA_DAO {
    
    private List<SW_DA> list_sw_da;

    public List<SW_DA> getList_sw_da() {
        return list_sw_da;
    }

    public void setList_sw_da(List<SW_DA> list_sw_da) {
        this.list_sw_da = list_sw_da;
    }

    
    public List<SW_DA> getAllSW_DA_Verknüpfungen() {

        list_sw_da = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from sw_da")) {

            while (rs.next()) {
                SW_DA retVal = new SW_DA(rs.getInt(1), rs.getInt(2));
                list_sw_da.add(retVal);

            }

            int columns = rs.getMetaData().getColumnCount();
            System.out.println("ZeilengrÃ¶ÃŸe Datenbank " + columns);
            System.out.println("Listsize " + list_sw_da.size());

            for (int i = 0; i < list_sw_da.size(); i++) {
                System.out.println(list_sw_da.get(i).getSw_id() + " " + list_sw_da.get(i).getDa_id());
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return list_sw_da;

    }
    
    
    

    public void insert(List<Schlagwort> schlagwort, int da_id) {
        for (int i = 0; i < schlagwort.size(); i++) {
            insert_var(schlagwort.get(i).getWord(), da_id);
        }

    }

    public void insert_var(String schlagwort, int da_id) {

        int sw_id = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("INSERT INTO sw_da" + "(sw_id, da_id) VALUES (?, ?)");) {

            pstmt.setInt(1, sw_id);
            pstmt.setInt(2, da_id);

            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo
    }
    
    
   //Testfunktionen
    public static void main(String[] args) {}

}

    

