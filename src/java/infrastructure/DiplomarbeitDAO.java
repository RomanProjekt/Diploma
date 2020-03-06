/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Diplomarbeit;

//import com.itextpdf.kernel.pdf.*;
//import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;
//import com.itextpdf.layout.Document;
//import com.itextpdf.layout.element.Paragraph;
import service.ConnectionManager;

public class DiplomarbeitDAO {

    private Connection connection;
    List<Diplomarbeit> listdp = new ArrayList<>();
    Diplomarbeit retVal;
    List<String> al = new ArrayList<>();
    //Funktion einfügen
    FileInputStream fis = null;
    Connection cn = null;
    PreparedStatement st = null;
    BufferedImage image = null;

    public List<Diplomarbeit> read() {

        ArrayList<Diplomarbeit> listdip = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from diplomarbeit")) {
            while (rs.next()) {
                retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getInt(10));
                listdip.add(retVal);
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listdip;
    }

    public void insert(String title, int user_id, int schule_id, String pdfpath, String imagepath) throws FileNotFoundException {

        int da_id = 0;
        int click_count = 0;
        int download_count = 0;
        int autor_id = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("INSERT INTO diplomarbeit"
                        + "(da_id, titel, autor_id, schule_id, pdf, benutzer_id, datum, bild, download_count, click_count) VALUES (?, ?, ?, ? ,? ,? ,?, ?, ?, ?)");) {

            pstmt.setInt(1, da_id);
            pstmt.setString(2, title);
            pstmt.setInt(3, autor_id);
            pstmt.setInt(4, schule_id);
            pstmt.setString(5, pdfpath);
            pstmt.setInt(6, user_id);
            pstmt.setDate(7, Date.valueOf(LocalDate.now()));
            pstmt.setString(8, imagepath);
            pstmt.setInt(9, download_count);
            pstmt.setInt(10, click_count);

            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo

    }

    public void update(int da_id, int autor_id) {

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("UPDATE diplomarbeit SET autor_id = ?  WHERE da_id = " + da_id)) {

            pstmt.setInt(1, autor_id);
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo

    }

    public void updateTitle(int da_id, String title) {
        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("UPDATE diplomarbeit SET title = ?  WHERE da_id = " + da_id)) {

            pstmt.setString(1, title);
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo
    }

    public Diplomarbeit getDiplomarbeit(int id) {

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM diplomarbeit WHERE da_id = " + id)) {

            while (rs.next()) {
                retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getString(9), rs.getInt(10), rs.getInt(11));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return retVal;

    }

    public List<Diplomarbeit> getRedList(int b_id) {
        ArrayList<Diplomarbeit> dipList = new ArrayList<>();
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT da_id, titel, autor_id, schule_id, pdf, benutzer_id, datum, bild, download_count, click_count FROM diplomarbeit WHERE benutzer_id = " + b_id)) {

            while (rs.next()) {
                dipList.add(new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return dipList;
    }

    public int delete(int id) {

        String query = "delete from diplomarbeit where da_id = ?";
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

    //Suchleistenfunktion
    public List Suchleiste(String key) { //id, title, schlagwort, autor, datum
        List<Diplomarbeit> dipList = new ArrayList<>();
        List<String> queryList = new ArrayList<>();
        Diplomarbeit help = new Diplomarbeit(20, "K", 1, 1, "K", 1, new Date(2020 - 12 - 12), "K", 1, 1);
        //diplomarbeiten in die Liste schreiben
        queryList.add("select * from diplomarbeit where da_id like '%" + key + "%'");
        queryList.add("select * from diplomarbeit where title like '%" + key + "%'");
        queryList.add("select * from diplomarbeit natural join autoren where fullname like '%" + key + "%'");
        queryList.add("select * from diplomarbeit where datum like '" + key + "-__" + "-__" + "'");
        queryList.add("select * from diplomarbeit schlagwort natural join diplomarbeit and name like '%" + key + "%'");

        for (String s : queryList) {

            try (
                    Connection con = ConnectionManager.getInst().getConn();
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(s)) {

                while (rs.next()) {

                    help.setDa_id(rs.getInt("da_id"));
                    help.setTitle(rs.getString("title"));
                    help.setAutor_id(rs.getInt("autor_id"));
                    help.setPdf(rs.getString("pdf"));
                    help.setUser_id(rs.getInt("user_id"));
                    help.setDatum(rs.getDate("datum"));
                    help.setBild(rs.getString("bild"));
                    help.setDownload_count(rs.getInt("download_count"));
                    help.setClick_count(rs.getInt("click_count"));

                    Diplomarbeit dblcheck = dipList.get(help.getDa_id()); //testing

                    if (!help.equals(dblcheck)) {
                        dipList.add(help);
                    }

                    //dipList.add((Diplomarbeit) rs); //konvertieren, umschichten
                }
            } catch (SQLException e) {
                System.out.println("This be some Exception: " + e);
            }
        }
        //dipList.add(new Diplomarbeit(20,"K",1,1,"K",1,"K","K",1,1));
        return dipList;
    }

}
