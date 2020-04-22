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
public class NavBarBean {

   
    public NavBarBean() {
    }
    
    private DatabaseManagerService dbService;
    private boolean isuser;
    private boolean isadmin;
    private boolean isredakteurOrHigher;
    

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public boolean isIsuser() {
        return isuser;
    }

    public void setIsuser(boolean isuser) {
        this.isuser = isuser;
    }

    public boolean isIsadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    public boolean isIsredakteurOrHigher() {
        return isredakteurOrHigher;
    }

    public void setIsredakteurOrHigher(boolean isredakteurOrHigher) {
        this.isredakteurOrHigher = isredakteurOrHigher;
    }

    
    
    
    
    public boolean isUser() {
        return ("User".equals(dbService.getLoggedInBenutzer().getRole())) || (dbService.getLoggedInBenutzer().getRole() == null);
    }
    
    public boolean isAdmin() {
        return ("Admin".equals(dbService.getLoggedInBenutzer().getRole())) && (dbService.getLoggedInBenutzer().getRole() != null);
    }
    
    public boolean isRedakteurOrHigher() {
        return dbService.isRedakteurOrHigher();
    }
    
    public Object isAdminRedirect() {
       return dbService.isAdminRedirect();
    }
    
    public Object isUserRedirect() {
        return dbService.isUserRedirect();
    }
    
    
    
}
