/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.sql.Connection;
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
    
    
        public List<Diplomarbeit> read() {
        
        ArrayList<Diplomarbeit> listfav_dip = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from favouriten")) {
            while (rs.next()) {
                Diplomarbeit retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getString(9), rs.getInt(10), rs.getInt(11));
                listfav_dip.add(retVal);
            }

            int columns = rs.getMetaData().getColumnCount();
            System.out.println("ZeilengrÃ¶ÃŸe Datenbank " + columns);
            System.out.println("Listsize " + listfav_dip.size());

            for (int i = 0; i < listfav_dip.size(); i++) {
                System.out.println(listfav_dip.get(i));
            }
            
            System.out.println("Listsize" + listfav_dip.size());

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listfav_dip;
        
    }
    
    
    
    public void insert() {
        //Test
    }
    
}

    

