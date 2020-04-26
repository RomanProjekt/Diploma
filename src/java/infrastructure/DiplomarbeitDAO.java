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

    List<Diplomarbeit> listdp = new ArrayList<>();
    Diplomarbeit retVal;

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
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return listdip;
    }

    public int insert(String title, int user_id, int schule_id, String pdfpath, String imagepath, Date datum) throws FileNotFoundException {
        int retVal = 0;
        int da_id = 0;
        int click_count = 0;
        int download_count = 0;
        int autor_id = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("INSERT INTO diplomarbeit"
                        + "(da_id, titel, autor_id, schule_id, pdf, benutzer_id, datum, bild, download_count, click_count) VALUES (?, ?, ?, ? ,? ,? ,?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);) {

            pstmt.setInt(1, da_id);
            pstmt.setString(2, title);
            pstmt.setInt(3, autor_id);
            pstmt.setInt(4, schule_id);
            pstmt.setString(5, pdfpath);
            pstmt.setInt(6, user_id);
            pstmt.setDate(7, datum);
            pstmt.setString(8, imagepath);
            pstmt.setInt(9, download_count);
            pstmt.setInt(10, click_count);

            retVal = pstmt.executeUpdate();
            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs != null && rs.next()) {
                retVal = rs.getInt(1);
            }

            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo
        return retVal;

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
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo

    }

    public void updateTitle(int da_id, String title) {
        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("UPDATE diplomarbeit SET titel = ?  WHERE da_id = " + da_id)) {

            pstmt.setString(1, title);
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.clo
    }

    public void updateSchule(int daId, int schulId) {
        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("UPDATE diplomarbeit SET schule_id = ?  WHERE da_id = " + daId)) {
            pstmt.setInt(1, schulId);
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //
    }

    public void updateDatum(int daId, Date datum) {
        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("UPDATE diplomarbeit SET datum = ?  WHERE da_id = " + daId)) {
            pstmt.setDate(1, datum);
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //
    }

    public Diplomarbeit getDiplomarbeit(int id) {

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM diplomarbeit WHERE da_id = " + id)) {

            while (rs.next()) {
                retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getInt(10));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return dipList;
    }

    //---------------------------Löschen der Diplomarbeit - nach id---------------------------------------
    public int delete(int id) {

        String query = "delete from diplomarbeit where da_id = ?";
        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt = con.prepareStatement(query);) {

            pstmt.setInt(1, id);
            result = pstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return result;

    }
    //-------------------------Suchleistenfunktion-----------------------------
    public List Suchleiste(String k) { //key = k
        char[] matcher = k.toCharArray();
        String catcher = "";
        int idx = -1;
        for (char c : matcher) {
            idx++;
            if (idx == 0) {
                if (k.toUpperCase().charAt(idx) == c) {
                    catcher = "" + catcher + c;
                } else {
                    if (k.toLowerCase().charAt(idx) == c) {
                        catcher = "" + catcher + ("" + c).toUpperCase();
                    } else {
                        catcher = "" + catcher + c;
                        //break;
                    }
                }
            } else {
                if (k.toUpperCase().charAt(idx) == c) {
                    catcher = "" + catcher + ("" + c).toLowerCase();
                } else {
                    if (k.toLowerCase().charAt(idx) == c) {
                        catcher = "" + catcher + c;
                    } else {
                        catcher = "" + catcher + c;
                        //break;
                    }
                }
            }
        }
        //precaching
        String key = catcher;
        key = k; //test
        //StringBuilder sb = null;
        //if(key.length()>=4){
        //sb = new StringBuilder(key.charAt(0) + key.charAt(1) + key.charAt(2) + key.charAt(3));
        //}
        //String yearKey = catcher.substring(0, 3);
        //if(sb.getClass().equals(String.class)) {
        //String yearKey = sb.toString();
        //}
        List<Diplomarbeit> dipList = new ArrayList<>();
        List<String> queryList = new ArrayList<>();
        //queryList.add("select * from diplomarbeit where da_id like '" + key + "' order by titel desc"); //order by, switch für einzelne kriterien suche
        queryList.add("select * from diplomarbeit where upper(titel) like upper('" + key + "') order by titel desc");
        //queryList.add("select * from diplomarbeit natural join autoren where upper(fullname) like upper('" + key + "') order by titel desc");
        //queryList.add("select * from diplomarbeit natural join autoren where id like '" + key + "' order by titel desc");
        queryList.add("select * from diplomarbeit where datum like '" + key + "' order by titel desc");
        queryList.add("select * from diplomarbeit d, schlagwort_diplomarbeit sd, schlagwort s"
                + "where d.da_id = sd.da_id"
                + "and sd.sw_id = s.id"
                + "and upper(s.name) like upper('" + key + "') order by titel desc");
        queryList.add("select * from diplomarbeit natural join schule where upper(name) like upper('" + key + "') order by titel desc");
        //queryList.add("select * from diplomarbeit natural join benutzer where benutzername like '" + key + "'"
        //        + "or vorname like '" + key + "' or nachname '" + key + "' order by titel desc");
        for (String s : queryList) {
            try (
                    Connection con = ConnectionManager.getInst().getConn();
                    Statement stmt = con.createStatement();
                    //PreparedStatement ps = con.prepareStatement(s);
                    //ResultSet rs = ps.executeQuery();
                    ResultSet rs = stmt.executeQuery(s);
                    ) {
                while (rs.next()) {
                    Diplomarbeit help;
                    help = new Diplomarbeit(rs.getInt("da_id"), rs.getString("titel"), rs.getInt("autor_id"),
                            rs.getInt("schule_id"), rs.getString("pdf"), rs.getInt("benutzer_id"), rs.getDate("datum"),
                            rs.getString("bild"), rs.getInt("download_count"), rs.getInt("click_count"));
                    int cs = 0;
                    if (!dipList.isEmpty()) {
                        for (Diplomarbeit ar : dipList) {
                            if (ar.getDa_id() == help.getDa_id()) {
                                cs = 0;
                                break;
                            } else {
                                cs = 1;
                            }
                        }
                    } else {
                        cs = 1;
                    }
                    if (cs == 1) {
                        dipList.add(help);
                    }
                }
            } catch (Exception e) {
                System.out.println("This be some Exception: " + e);
            }
        }
        return dipList;
    }
    //-------------------------Suchleistenfunktion-----------------------------
    public List Suchleiste2(String k) { //key = k
        char[] matcher = k.toCharArray();
        String catcher = "";
        int idx = -1;
        for (char c : matcher) {
            idx++;
            if (idx == 0) {
                if (k.toUpperCase().charAt(idx) == c) {
                    catcher = "" + catcher + c;
                } else {
                    if (k.toLowerCase().charAt(idx) == c) {
                        catcher = "" + catcher + ("" + c).toUpperCase();
                    } else {
                        catcher = "" + catcher + c;
                        //break;
                    }
                }
            } else {
                if (k.toUpperCase().charAt(idx) == c) {
                    catcher = "" + catcher + ("" + c).toLowerCase();
                } else {
                    if (k.toLowerCase().charAt(idx) == c) {
                        catcher = "" + catcher + c;
                    } else {
                        catcher = "" + catcher + c;
                        //break;
                    }
                }
            }
        }

        // //'d.da_id = sd.da_idand sd.sw_id = s.idand s.name like '%Diplomarbeit%' order by t'
        String key = catcher;
        List<Diplomarbeit> dipList = new ArrayList<>();
        List<String> queryList = new ArrayList<>();
        queryList.add("select * from diplomarbeit where da_id like '%" + key + "%' order by titel desc"); //order by, switch für einzelne kriterien suche
        queryList.add("select * from diplomarbeit where titel like '%" + key + "%' order by titel desc");
        queryList.add("select * from diplomarbeit natural join autoren where fullname like '%" + key + "%' order by titel desc");
        queryList.add("select * from diplomarbeit natural join autoren where id like '%" + key + "%' order by titel desc");
        queryList.add("select * from diplomarbeit where datum like '" + key + "%' order by titel desc");
        queryList.add("select * from diplomarbeit d, schlagwort_diplomarbeit sd, schlagwort s"
                + "where d.da_id = sd.da_id"
                + "and sd.sw_id = s.id"
                + "and s.name like '%" + key + "%' order by titel desc");
        queryList.add("select * from diplomarbeit natural join schule where name like '%" + key + "%' order by titel desc");

        for (String s : queryList) {
            try (
                    Connection con = ConnectionManager.getInst().getConn();
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(s)) {
                while (rs.next()) {
                    Diplomarbeit help;
                    //public Diplomarbeit(int da_id, String title, int autor_id, int schule_id, String pdf, int user_id, Date datum, String bild, int download_count, int click_count)
                    help = new Diplomarbeit(rs.getInt("da_id"), rs.getString("titel"), rs.getInt("autor_id"),
                            rs.getInt("schule_id"), rs.getString("pdf"), rs.getInt("benutzer_id"), rs.getDate("datum"),
                            rs.getString("bild"), rs.getInt("download_count"), rs.getInt("click_count"));
                    int cs = 0;
                    if (!dipList.isEmpty()) {
                        for (Diplomarbeit ar : dipList) {
                            if (ar.getDa_id() == help.getDa_id()) {
                                cs = 0;
                                break;
                            } else {
                                cs = 1;
                            }
                        }
                    } else {
                        cs = 1;
                    }
                    if (cs == 1) {
                        dipList.add(help);
                    }
                }
            } catch (Exception e) {
                System.out.println("This be some Exception: " + e);
            }
        }
        return dipList;
    }

    public boolean read(String titel) {

        boolean ist_gleich = false;
        Diplomarbeit retVal = null;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from diplomarbeit")) {
            while (rs.next()) {
                retVal = new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getInt(10));
            }
            if (retVal.getTitle().equals(titel)) {
                ist_gleich = true;
            } else {
            }

        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return ist_gleich;

    }

    //---------------------------------Test ------------------------------------------
    public int click_count(int click_count, Diplomarbeit dip) {

        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("UPDATE diplomarbeit SET click_count = ?  WHERE da_id = " + dip.getDa_id())) {

            pstmt.setInt(1, click_count);
            result = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return result;

    }

    public int download_count(int download_count, Diplomarbeit dip) {

        int result = 0;

        try (
                Connection con = ConnectionManager.getInst().getConn();
                PreparedStatement pstmt
                = con.prepareStatement("UPDATE diplomarbeit SET download_count = ?  WHERE da_id = " + dip.getDa_id())) {

            pstmt.setInt(1, download_count);
            result = pstmt.executeUpdate();
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return result;
    }

    public int readClickCount(Diplomarbeit dip) {

        ArrayList<Diplomarbeit> dipList = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM diplomarbeit WHERE da_id =" + dip.getDa_id())) {

            while (rs.next()) {
                dipList.add(new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return dipList.get(0).getClick_count();
    }

    public int readDownloadCount(Diplomarbeit dip) {

        ArrayList<Diplomarbeit> dipList = new ArrayList<>();

        try (
                Connection con = ConnectionManager.getInst().getConn();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM diplomarbeit WHERE da_id = " + dip.getDa_id())) {

            while (rs.next()) {
                dipList.add(new Diplomarbeit(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getString(8), rs.getInt(9), rs.getInt(10)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(DiplomarbeitDAO.class.getName()).log(Level.SEVERE, null, ex);
        }  //rs.close(); stmt.close(); con.close(); because of try-with-resources Statement

        return dipList.get(0).getDownload_count();
    }

    //Weitere Suche-------------------------------------------------------------
    public List WeitereSuchleiste(String titel, String autor, String date, String schlagwort) { //key = k

//        this.manipulationKeyword();
//     
//        // //'d.da_id = sd.da_idand sd.sw_id = s.idand s.name like '%Diplomarbeit%' order by t'
//        //String key = catcher;
//        List<Diplomarbeit> dipList = new ArrayList<>();
//        List<String> queryList = new ArrayList<>();
//        queryList.add("select * from diplomarbeit where da_id like '%" + key + "%' order by titel desc"); //order by, switch für einzelne kriterien suche
//        queryList.add("select * from diplomarbeit where titel like '%" + key + "%' order by titel desc");
//        queryList.add("select * from diplomarbeit natural join autoren where fullname like '%" + key + "%' order by titel desc");
//        queryList.add("select * from diplomarbeit natural join autoren where id like '%" + key + "%' order by titel desc");
//        queryList.add("select * from diplomarbeit where datum like '" + key + "%' order by titel desc");
//        queryList.add("select * from diplomarbeit d, schlagwort_diplomarbeit sd, schlagwort s"
//                + "where d.da_id = sd.da_id"
//                + "and sd.sw_id = s.id"
//                + "and s.name like '%" + key + "%' order by titel desc");
//        queryList.add("select * from diplomarbeit natural join schule where name like '%" + key + "%' order by titel desc");
//        
//        for (String s : queryList) {
//            try (
//                    Connection con = ConnectionManager.getInst().getConn();
//                    Statement stmt = con.createStatement();
//                    ResultSet rs = stmt.executeQuery(s)) {
//                while (rs.next()) {
//                    Diplomarbeit help;
//                    //public Diplomarbeit(int da_id, String title, int autor_id, int schule_id, String pdf, int user_id, Date datum, String bild, int download_count, int click_count)
//                    help = new Diplomarbeit(rs.getInt("da_id"), rs.getString("titel"), rs.getInt("autor_id"),
//                            rs.getInt("schule_id"), rs.getString("pdf"), rs.getInt("benutzer_id"), rs.getDate("datum"),
//                            rs.getString("bild"), rs.getInt("download_count"), rs.getInt("click_count"));
//                    int cs = 0;
//                    if (!dipList.isEmpty()) {
//                        for (Diplomarbeit ar : dipList) {
//                            if (ar.getDa_id() == help.getDa_id()) {
//                                cs = 0;
//                                break;
//                            } else {
//                                cs = 1;
//                            }
//                        }
//                    } else {
//                        cs = 1;
//                    }
//                    if (cs == 1) {
//                        dipList.add(help);
//                    }
//                }
//            } catch (Exception e) {
//                System.out.println("This be some Exception: " + e);
//            }
//        }
        return null;
    }

    public String manipulationKeyword() {

//        char[] matcher = k.toCharArray();
//        String catcher = "";
//        
//        int idx = -1;
//        for (char c : matcher) {
//            idx++;
//            if (idx == 0) {
//                if (k.toUpperCase().charAt(idx) == c) {
//                    catcher = "" + catcher + c;
//                } else {
//                    if (k.toLowerCase().charAt(idx) == c) {
//                        catcher = "" + catcher + ("" + c).toUpperCase();
//                    } else {
//                        catcher = "" + catcher + c;
//                        //break;
//                    }
//                }
//            } else {
//                if (k.toUpperCase().charAt(idx) == c) {
//                    catcher = "" + catcher + ("" + c).toLowerCase();
//                } else {
//                    if (k.toLowerCase().charAt(idx) == c) {
//                        catcher = "" + catcher + c;
//                    } else {
//                        catcher = "" + catcher + c;
//                        //break;
//                    }
//                }
//            }
//        }
        return null;

    }

}
