/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author dople
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;
import javax.sql.DataSource;

public class ConnectionManager {

    private static final String DATASOURCE = "jdbc/akdb";
    private static ConnectionManager connMgrInst = null;
    private DataSource ds = null;

    public static synchronized ConnectionManager getInst() {
        if (connMgrInst == null) {
            connMgrInst = new ConnectionManager();
        }

        return connMgrInst;
    }

    private ConnectionManager() {
        try {
            Context ctx;
            ctx = new javax.naming.InitialContext();
            ds = (DataSource) ctx.lookup("java:comp/env/" + DATASOURCE);
        } catch (NamingException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConn() {
        Connection retVal = null;
        try {
            retVal = ds.getConnection();  //get a connection from the pool

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return retVal;
    }
}
