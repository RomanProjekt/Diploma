/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import pojo.Diplomarbeit;

//import com.itextpdf.kernel.pdf.*;
//import com.itextpdf.kernel.pdf.canvas.parser.PdfTextExtractor;
//import com.itextpdf.layout.Document;
//import com.itextpdf.layout.element.Paragraph;
import service.ConnectionManager;

//import service.ConnectionManager;
//testdatenbank:
/**
 *
 * @author hp
 */
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

        System.out.println("Read Funktion");

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from diplomarbeit")) {
            while (rs.next()) {
                retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getInt(10));
                listdp.add(retVal);
            }

            int columns = rs.getMetaData().getColumnCount();
            System.out.println("Zeilengröße Datenbank" + columns);
            System.out.println("Listsize" + listdp.size());

            for (int i = 0; i < columns; i++) {
                System.out.println(listdp.get(i));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listdp;
    }

    public void einfügen(int da_id, String title, int autor_id, int sw_id, String pdf, String user_id, String datum, String bild, int download_count, int click_count) throws FileNotFoundException {

        Diplomarbeit dp = new Diplomarbeit(da_id, title, autor_id, sw_id, pdf, user_id, datum, bild, download_count, click_count);
//          System.out.println(dp.getDa_id());

        try (
                Connection con = ConnectionManager.getInst().getConn();
                //                Statement stmt = con.createStatement();

                //INSERT INTO tabellen_name (spalte1, spalte2, spalte3, etc.) VALUES ('Wert1', 'Wert2', 'Wert3', etc.)  

                //ResultSet rs = stmt.executeQuery("select * from diplomarbeit")
                //PreparedStatement st = con.prepareStatement("update " + "diplomarbeit" + " set " + "bild" + "=" + null  + "where = da_id" + dp.getDa_id());
                PreparedStatement pstmt = con.prepareStatement("INSERT INTO diplomarbeit(da_id,title,autor_id,sw_id, pdf, user_id, datum, bild, download_count, click_count) VALUES (?, ?, ?, ?, ? ,? ,? ,?, ?, ?)");) {
//                int columns = rs.getMetaData().getColumnCount();
//                System.out.println(columns);
//                System.out.println(rs);

            pstmt.setInt(1, da_id);
            pstmt.setString(2, title);
            pstmt.setInt(3, autor_id);
            pstmt.setInt(4, sw_id);
            pstmt.setString(5, pdf);
            pstmt.setString(6, user_id);
            pstmt.setString(7, datum);
            pstmt.setString(8, bild);
            pstmt.setInt(9, download_count);
            pstmt.setInt(10, click_count);
            pstmt.executeUpdate();
            pstmt.close();

            //while (rs.next()) {
//
//                  retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getBlob(5), rs.getString(6), rs.getString(7), rs.getBlob(8), rs.getInt(9), rs.getInt(10));
//                  listdp.add(retVal);
//
//              }
            // update tbl set imgColumn = 'imgFile?' where keyColumn = 'keyValue?':
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo

    }

    public void ändern(int da_id, String title, int autor_id, int sw_id, String pdf, String user_id, String datum, String bild, int download_count, int click_count) throws FileNotFoundException {

        Diplomarbeit dp = new Diplomarbeit(da_id, title, autor_id, sw_id, pdf, user_id, datum, bild, download_count, click_count);
//          System.out.println(dp.getDa_id());

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                //                ResultSet rs = stmt.executeQuery("select * from diplomarbeit")
                PreparedStatement st = con.prepareStatement("update " + "diplomarbeit" + " set " + "bild" + "=" + null + "where = da_id" + dp.getDa_id());) {
//                int columns = rs.getMetaData().getColumnCount();
//                System.out.println(columns);
//                System.out.println(rs);
//                
//              while (rs.next()) {
//
//                  retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getBlob(5), rs.getString(6), rs.getString(7), rs.getBlob(8), rs.getInt(9), rs.getInt(10));
//                  listdp.add(retVal);
//
//              }

            // update tbl set imgColumn = 'imgFile?' where keyColumn = 'keyValue?':
            File fl = new File("C:/Users/hp/Desktop/A_AK/web/resources/picture/bild01.jpg");
            fis = new FileInputStream(fl);

            st.setBinaryStream(1, fis, (int) fl.length()); // imgFile
//                  st.setString(2, args[6]); // keyValue
            st.executeUpdate();
            System.out.println(fl.length() + " Bytes successfully loaded.");

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo

    }

    public static final String DEST = "test02.pdf";

    public void auslesen() throws IOException {

        //https://www.torsten-horn.de/techdocs/java-sql.htm
        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from diplomarbeit")) {

            rs.next();
            int da_id = rs.getInt(1);
            String title = rs.getString(2);

            System.out.println(da_id + " " + title);

//                Blob pdf = rs.getBlob(5);
//                BufferedInputStream bis = new BufferedInputStream(pdf.getBinaryStream());
//                BufferedImage bufpdf = ImageIO.read(bis);
//                
//                System.out.println(bufpdf);
            StringBuilder buff = new StringBuilder();

//            PdfReader reader = new PdfReader("test02.pdf");
//
//            System.out.println(reader.toString());
//
//            long numberOfPages = reader.getFileLength();
//
//            System.out.println(numberOfPages);
//                PdfDocument pdf = new PdfDocument(new PdfWriter(DEST));
//              try (Document document = new Document(pdf)) {
////                  String line = "Hello! Welcome to iTextPdf";
////                  document.add(new Paragraph(line));
//
//                    System.out.println(document);
//              }
//                JLabel imageLabel = new JLabel( new ImageIcon(bufImage) );
//                JScrollPane jsp = new JScrollPane(imageLabel);
//                Blob bild = rs.getBlob(8);
//                BufferedInputStream bisbild = new BufferedInputStream(bild.getBinaryStream());
//                BufferedImage bufImage = ImageIO.read(bisbild);
//                
//                System.out.println(bufImage);
//                
//                
//                
//                System.out.println(da_id);
//                System.out.println(title);
            //da_id,title,autor_id,sw_id, pdf, user_id, datum, bild, download_count, click_count
//                int columns = rs.getMetaData().getColumnCount();
//                System.out.println(columns);
//                
//                BufferedInputStream bis = new BufferedInputStream( rs.getBinaryStream("bild") );
//                BufferedImage bufImage = ImageIO.read(bis);
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.clos

    }

    public BufferedImage bildauslesen() throws IOException {
        BufferedImage bufImage = null;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select bild from diplomarbeit") //                PreparedStatement st = con.prepareStatement("update " + "diplomarbeit" + " set " + "bild" + "=" + null  + "where = da_id" + dp.getDa_id());
                ) {

            rs.next();
            Blob bild = rs.getBlob(1);
            System.out.println(bild);

            BufferedInputStream bisbild = new BufferedInputStream(bild.getBinaryStream());
            bufImage = ImageIO.read(bisbild);

            System.out.println(bufImage);

//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            ImageIO.write(bufImage, "jpg", baos);
            rs.updateBlob(1, bisbild);

        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); co
        return bufImage;
    }

    public List datendipladen() {

        String titel = null;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                //Id   2006

                ResultSet rs = stmt.executeQuery("select * from diplomarbeit where id =" + titel);
                //PreparedStatement st = con.prepareStatement("update " + "diplomarbeit" + " set " + "bild" + "=" + null  + "where = da_id" + dp.getDa_id());
                PreparedStatement pstmt = con.prepareStatement("INSERT INTO diplomarbeit(da_id,title,autor_id,sw_id, pdf, user_id, datum, bild, download_count, click_count) VALUES (?, ?, ?, ?, ? ,? ,? ,?, ?, ?)");) {

            rs.next();
            String vtitel = rs.getString(1);
            String vautor = rs.getString(2);
            String vschule = rs.getString(1);
            String vdatum = rs.getString(1);

            al.add(vtitel);
            al.add(vautor);
            al.add(vschule);
            al.add(vdatum);

//               while (rs.next()) {
//
//                  retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getBlob(5), rs.getString(6), rs.getString(7), rs.getBlob(8), rs.getInt(9), rs.getInt(10));
//                listdp.add(retVal);
//
//                }
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.c

        return al;
    }

    //Suchleistenfunktion
    public List Suchleiste(String key) { //title, schlagwort, autor, datum
        List<Diplomarbeit> dipList = new ArrayList<>();
        List<String> queryList = new ArrayList<>();
        //diplomarbeiten in die Liste schreiben
        queryList.add("select * from diplomarbeit where title like %key%");
        queryList.add("select * from diplomarbeit natural join autoren where gesamtname like %key%");
        queryList.add("select * from diplomarbeit where datum like %key%");
        queryList.add("select * from diplomarbeit schlagwort natural join schlagwort_diplomarbeit natural join diplomarbeit"
                + "where diplomarbeit_da_id = da_id and id in (schlagwort_id)"
                + "and name like %key" );
        
        for(String s: queryList) {
        
            try (
                    Connection con = ConnectionManager.getInst().getConn();
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(s)) {
                
                while (rs.next()) {
                    dipList.add((Diplomarbeit) rs);
                }
            } catch (SQLException e) {

            }
        }
        
        return dipList;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        DiplomarbeitDAO da = new DiplomarbeitDAO();
//         //da.einfügen(12, "Bild01", 12, 12, null , "Test", "Test" , null , 12, 12);
//        da.auslesen();
//        da.read();
////          da.bildauslesen();
//           da.bildpfad();

    }

    public void datenübertragen() {

        System.out.print("Funktion geht!");

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from diplomarbeit"); //PreparedStatement st = con.prepareStatement("update " + "diplomarbeit" + " set " + "bild" + "=" + null  + "where = da_id" + dp.getDa_id());
                ) {

//                int columns = rs.getMetaData().getColumnCount();
//                
//                for (int i = 0; i < columns; i++) {
//                    System.out.println(listbildpfad.get(i));
//                }
        } catch (SQLException ex) {
            Logger.getLogger(BenutzerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
