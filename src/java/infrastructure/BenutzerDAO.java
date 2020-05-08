/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.io.Serializable;
import pojo.Benutzer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.SicherheitsCode;
import service.ConnectionManager;

/**
 *
 * @author dople
 */
public class BenutzerDAO implements Serializable {

    public Benutzer read(String username) {
        Benutzer retVal = null;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer where benutzername = '" + username + "'")) {

            if (rs.next()) {
                retVal = new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort"), rs.getString("salt"), rs.getString("rolle"), rs.getString("email"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return retVal;
    }

    public boolean usernameExists(String username) {
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer where benutzername = '" + username + "'")) {

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return false;
    }

    public int insert(Benutzer b) {
        String query = "insert into benutzer(`benutzer_id`, `benutzername`, `vorname`, `nachname`, `email`, `passwort`, `salt`, `rolle`) values(NULL, ?, ?, ?, ?, ?, ?, ?)";
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {

            pstmt.setString(1, b.getUsername());
            pstmt.setString(2, b.getFirstname());
            pstmt.setString(3, b.getLastname());
            pstmt.setString(4, b.geteMail());
            pstmt.setString(5, b.getPassWd());
            pstmt.setString(6, b.getSalt());
            pstmt.setString(7, b.getRole());

            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        return result;
    }

    public int updateBenutzer(Benutzer b) {
        String query = "update benutzer set vorname = ?,nachname = ?,benutzername = ?, rolle = ?  where benutzer_id = ?";
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {

            pstmt.setString(1, b.getFirstname());
            pstmt.setString(2, b.getLastname());
            pstmt.setString(3, b.getUsername());
            pstmt.setString(4, b.getRole());
            pstmt.setInt(5, b.getUser_id());
            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        return result;
    }

    public int deleteBenutzer(int id) {
        String query = "delete from benutzer where benutzer_id = ?";
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {

            pstmt.setInt(1, id);
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
                benList.add(new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("rolle")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return benList;
    }

    
    
    public int getNextIdFromUser() {
        int lastId = -1;
        List intList = new ArrayList<>();
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select id from benutzer")) {

            while (rs.next()) {
                intList.add(rs);
                lastId = intList.size();
            }
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        lastId = intList.size();
        return lastId;
    }
    
    
    
    public int updateNewPassword(String npw, Benutzer b) {
        
        System.out.println("-------------------------" + b.getFirstname() + b.getLastname() + b.getPassWd());
        
        //String query = "update benutzer set vorname = ?,nachname = ?,benutzername = ?, rolle = ?  where benutzer_id = ?";
        //"select * from benutzer where email = '" + reset + "'"
        //String query = "UPDATE benutzer SET passwort = ? WHERE benutzer_id = ?";
        String query = "UPDATE benutzer SET passwort = ? WHERE benutzer_id = '" + b.getUser_id() + "'";
        System.out.println(b.getUser_id());
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {
                

            pstmt.setString(1, npw);
            System.out.println("Passwort zurückgesetz");
            result = pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return result;
    }
    
    
//------------------------------------------------------------------------------

    public String readEmailFound(String reset, boolean nofoundemail) {
        
        Benutzer retVal = null;
        nofoundemail = false;
        String var_email;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer where email = '" + reset + "'")) {
                nofoundemail = true;

            if (rs.next()) {
                retVal = new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort"), rs.getString("salt"), rs.getString("rolle"), rs.getString("email"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        if (retVal != null) {
            var_email = retVal.getUsername();
        } else {
            var_email = null;
        }

        return var_email;
    }

    public String readUsernameFound(String reset, boolean nofoundusername) {

        Benutzer retVal = null;
        nofoundusername = false;
        String var_username;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer where benutzername = '" + reset + "'")) {
                nofoundusername = true;
            if (rs.next()) {
                retVal = new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort"), rs.getString("salt"), rs.getString("rolle"), rs.getString("email"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        
        if(retVal != null && nofoundusername == true) { 
           var_username = retVal.getUsername();  
        }
        else {
            var_username = null;
        }

        return var_username;
    }

    
    public String readEmail(String reset) {
        
        Benutzer retVal = null; 
        String var_email;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer where benutzername = '" + reset + "'")) {
            

            if (rs.next()) {
                retVal = new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort"), rs.getString("salt"), rs.getString("rolle"), rs.getString("email"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        if (retVal != null) {
            var_email = retVal.geteMail();
        } else {
            var_email = null;
        }

        return var_email;
        
    }

    public String readUsername(String email) {
        
        Benutzer retVal = null;
        String var_username;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer where email = '" + email + "'")) {
         

            if (rs.next()) {
                retVal = new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort"), rs.getString("salt"), rs.getString("rolle"), rs.getString("email"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        if (retVal != null) {
            var_username = retVal.getUsername();
        } else {
            var_username = null;
        }

        return var_username;
        
    }
    
    
    
    public Benutzer readBenutzer(String username) {
        
        System.out.println("------------------ inder Datenbank " + username);
        Benutzer retVal = null;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer where benutzername = '" + username + "'")) {

            while (rs.next()) {
                retVal = new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort"), rs.getString("salt"), rs.getString("rolle"), rs.getString("email"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return retVal;
        
        
    }
    
    
    
    
      public Benutzer read(int benutzer_id) {
        Benutzer retVal = null;

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer where benutzer_id = '" + benutzer_id + "'")) {

            if (rs.next()) {
                retVal = new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort"), rs.getString("salt"), rs.getString("rolle"), rs.getString("email"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return retVal;
    }

    public int updateAdminNewPasswort(String pw, int benutzerid) {
        //String query = "update benutzer set vorname = ?,nachname = ?,benutzername = ?, rolle = ?  where benutzer_id = ?";
        //"select * from benutzer where email = '" + reset + "'"
        //String query = "UPDATE benutzer SET passwort = ? WHERE benutzer_id = ?";
        String query = "update benutzer SET passwort = ? where benutzer_id = '" + benutzerid + "'";
        
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {
                

            pstmt.setString(1, pw);
            System.out.println("Passwort zurückgesetz");
            result = pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return result;
    }

    public boolean compareEmail(String email) {
        
        Benutzer retVal = null;
        boolean nofoundemail = false;
        

        //use try-with-resources for best practice
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from benutzer where email = '" + email + "'")) {
                

            if (rs.next()) {
                retVal = new Benutzer(rs.getInt("benutzer_id"), rs.getString("benutzername"), rs.getString("vorname"), rs.getString("nachname"), rs.getString("passwort"), rs.getString("salt"), rs.getString("rolle"), rs.getString("email"));
            }
            
            

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        
       nofoundemail = retVal == null;

        return nofoundemail;
        
    }

    public int insert(Benutzer b, SicherheitsCode c) {
     
        String query = "insert into benutzer(`benutzer_id`, `benutzername`, `vorname`, `nachname`, `email`, `passwort`, `salt`, `rolle`, `sicherheitscode` ) values(NULL, ?, ?, ?, ?, ?, ?, ?, ?)";
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {

            pstmt.setString(1, b.getUsername());
            pstmt.setString(2, b.getFirstname());
            pstmt.setString(3, b.getLastname());
            pstmt.setString(4, b.geteMail());
            pstmt.setString(5, b.getPassWd());
            pstmt.setString(6, b.getSalt());
            pstmt.setString(7, b.getRole());
            pstmt.setInt(7, c.getSicherheitscode_id());

            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement
        return result;
    
    }

  
   
 
    
}
