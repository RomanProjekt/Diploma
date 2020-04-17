/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class alertBean {

    /**
     * Creates a new instance of alertBean
     */
    
    
    private DatabaseManagerService dbService;
    private boolean passwortalert;
    
    
    public alertBean() {
        dbService = new DatabaseManagerService();
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public boolean isPasswortalert() {
        return passwortalert;
    }

    public void setPasswortalert(boolean passwortalert) {
        this.passwortalert = passwortalert;
    }
    
    public boolean passwortResetOk(boolean link) {
//         return dbService.passwortResetOk(link);
        return true;
    }
    
    
    
    
    
}
