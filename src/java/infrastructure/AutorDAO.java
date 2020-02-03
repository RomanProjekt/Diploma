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
import pojo.Autor;
import service.ConnectionManager;

/**
 *
 * @author hp
 */
public class AutorDAO {
    
  

    public List<Autor> getAllAutor() {

        List<Autor> listautor = new ArrayList<>();;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from autor")) {
            while (rs.next()) {
                Autor retVal = new Autor(rs.getInt(1), rs.getString(2), rs.getString(3));
                listautor.add(retVal);

            }

//            int columns = rs.getMetaData().getColumnCount();
//            System.out.println("ZeilengrÃ¶ÃŸe Datenbank " + columns);
//            System.out.println("Listsize " + listautor.size());
//
//            for (int i = 0; i < listautor.size(); i++) {
//                System.out.println(listautor.get(i).getFullName());
//            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listautor;
    }
    
    

    public Autor read(int autor_id) {
        Autor retVal = null;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select autor_id, fullname, da_id from diplomarbeit" + "WHERE auto_id =" + autor_id)) {
            if (rs.next()) {
                retVal = new Autor(rs.getInt(1), rs.getString(2), rs.getString(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return retVal;

    }

    public int insert(String fullname, int da_id) {

        int autor_id = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("INSERT INTO autor"
                        + "(autor_id, fullname, da_id) VALUES (?, ?, ?)");) {

            pstmt.setInt(1, autor_id++);
            pstmt.setString(2, fullname);
            pstmt.setInt(3, da_id);
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo

        return autor_id;

    }
    
    
    
    

    public void update(int da_id) {

//        private int autor_id;
//        private String fullName;
//        private String da_id;




    }

}

    

