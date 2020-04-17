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
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Benutzer;
import pojo.SicherheitsCode;
import service.ConnectionManager;

/**
 *
 * @author hp
 */
public class SicherheitsCodeDAO {

    
    
    
//    public String readResetCode(int bn_id) {    
//        
//        SicherheitsCode retVal = null;
//
//        //use try-with-resources for best practice
//        try (
//                Connection con = ConnectionManager.getInst().getConn();
//                Statement stmt = con.createStatement();
//                ResultSet rs = stmt.executeQuery("select * from sicherheitsCode where benutzer_id = '" + bn_id + "'")) {
//
//            if (rs.next()) {
//                 retVal = new  SicherheitsCode(rs.getInt("sicherheitsCode_id"), rs.getInt("benutzer_id"), rs.getString("sicherheitsantwort"), rs.getString("comparecodesalt"), rs.getString("resetcodesalt"), rs.getString("additiveCodeSalt"));
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(SicherheitsCodeDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
//        
//        return retVal.getSicherheitsantwort();
//    }

    
    
    public int insertResetCode(SicherheitsCode c, Benutzer b) {
        String query = "insert into sicherheitsCode(`sicherheitsCode_id`, `benutzer_id`, `sicherheitsantwort`, `comparecodesalt` , `resetcodesalt`, `additiveCodeSalt` ) values (?, ?, ?, ? , ? , ?)";
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {

            pstmt.setInt(1, c.getSicherheitscode_id());
            pstmt.setInt(2, b.getUser_id());
            pstmt.setString(3, c.getSicherheitsantwort());
            pstmt.setString(4, c.getCompareCodeSalt());
            pstmt.setString(5, c.getRestCodeSalt());
            pstmt.setString(6, c.getAdditiveCodeSalt());
            

            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SicherheitsCodeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        
        return result;
        
    }


    public SicherheitsCode readAdditiveCodeSalt(int benutzer_id) {
        
        SicherheitsCode retVal = null;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from sicherheitsCode where benutzer_id = '" + benutzer_id + "'")) {

            if (rs.next()) {
                 retVal = new  SicherheitsCode(rs.getInt("sicherheitsCode_id"), rs.getInt("benutzer_id"), rs.getString("sicherheitsantwort"),  rs.getString("comparecodesalt"), rs.getString("resetcodesalt"), rs.getString("additiveCodeSalt"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SicherheitsCodeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        
        return retVal;
    }

    public SicherheitsCode ReadCompareCodeSalt(int benutzer_id) {
        
        SicherheitsCode retVal = null;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from sicherheitsCode where benutzer_id = '" + benutzer_id + "'")) {

            if (rs.next()) {
                 retVal = new  SicherheitsCode(rs.getInt("sicherheitsCode_id"), rs.getInt("benutzer_id"), rs.getString("sicherheitsantwort"), rs.getString("comparecodesalt"), rs.getString("resetcodesalt"), rs.getString("additiveCodeSalt"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SicherheitsCodeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        
        return retVal;
    }

    public SicherheitsCode ReadResetCodeSalt(int benutzer_id) {
        
        SicherheitsCode retVal = null;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from sicherheitsCode where benutzer_id = '" + benutzer_id + "'")) {

            if (rs.next()) {
                 retVal = new  SicherheitsCode(rs.getInt("sicherheitsCode_id"), rs.getInt("benutzer_id"), rs.getString("comparecodesalt"), rs.getString("comparecodesalt"), rs.getString("resetcodesalt"), rs.getString("additiveCodeSalt"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SicherheitsCodeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        
        return retVal;
    }

    public SicherheitsCode readSicherheitsCode(int benutzer_id) {
             
        SicherheitsCode retVal = null;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from sicherheitsCode where benutzer_id = '" + benutzer_id + "'")) {

            if (rs.next()) {
                 retVal = new  SicherheitsCode(rs.getInt("sicherheitsCode_id"), rs.getInt("benutzer_id"), rs.getString("sicherheitsantwort"), rs.getString("comparecodesalt"), rs.getString("resetcodesalt"), rs.getString("additiveCodeSalt"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(SicherheitsCodeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        
        return retVal;
    }

   

  

   

    

    
    
    
    
    
    
        
    
    
}
