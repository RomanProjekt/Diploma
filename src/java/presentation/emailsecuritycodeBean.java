/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.regex.Pattern;
import pojo.Benutzer;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class emailsecuritycodeBean {

    /**
     * Creates a new instance of emailsecuritycodeBean
     */
    public emailsecuritycodeBean() {
    }

    private String eingaberesetcode;
    private String FullTimeAfter;
    private DatabaseManagerService dbService;
    private String TimeAfter;
    private String DateAfter;
    
    private String restCodeAfter;
    private String comparecodeafter;
    private String username;
    private String fullresetcode;
    private String dbCompareCodeSalt;
    

    private boolean isdateformat;
    private boolean istimeformat;
    private boolean SicherheitsAntwortFeld;
    private String prBeantime;
    

    public String getEingaberesetcode() {
        return eingaberesetcode;
    }

    public void setEingaberesetcode(String eingaberesetcode) {
        this.eingaberesetcode = eingaberesetcode;
    }

    public String getFullTimeAfter() {
        return FullTimeAfter;
    }

    public void setFullTimeAfter(String FullTimeAfter) {
        this.FullTimeAfter = FullTimeAfter;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public String getTimeAfter() {
        return TimeAfter;
    }

    public void setTimeAfter(String TimeAfter) {
        this.TimeAfter = TimeAfter;
    }

    public String getDateAfter() {
        return DateAfter;
    }

    public void setDateAfter(String DateAfter) {
        this.DateAfter = DateAfter;
    }

    public String getRestCodeAfter() {
        return restCodeAfter;
    }

    public void setRestCodeAfter(String restCodeAfter) {
        this.restCodeAfter = restCodeAfter;
    }

    public String getComparecodeafter() {
        return comparecodeafter;
    }

    public void setComparecodeafter(String comparecodeafter) {
        this.comparecodeafter = comparecodeafter;
    }

    public boolean isIsdateformat() {
        return isdateformat;
    }

    public void setIsdateformat(boolean isdateformat) {
        this.isdateformat = isdateformat;
    }

    public boolean isIstimeformat() {
        return istimeformat;
    }

    public void setIstimeformat(boolean istimeformat) {
        this.istimeformat = istimeformat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullresetcode() {
        return fullresetcode;
    }

    public void setFullresetcode(String fullresetcode) {
        this.fullresetcode = fullresetcode;
    }

    public String getDbCompareCodeSalt() {
        return dbCompareCodeSalt;
    }

    public void setDbCompareCodeSalt(String dbCompareCodeSalt) {
        this.dbCompareCodeSalt = dbCompareCodeSalt;
    }
    
    public boolean isSicherheitsAntwortFeld() {
        return SicherheitsAntwortFeld;
    }

    public void setSicherheitsAntwortFeld(boolean SicherheitsAntwortFeld) {
        this.SicherheitsAntwortFeld = SicherheitsAntwortFeld;
    }

    public String getPrBeantime() {
        return prBeantime;
    }

    public void setPrBeantime(String prBeantime) {
        this.prBeantime = prBeantime;
    }
    
    
   

    public String displaySelectedDa() { 
        return "fg_passwort_reset?faces-redirect=true&amp;includeViewParams=true";                 
    }
    
    public String back() {
        return "switchda";
    } 

    public String NowDateAfter() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date currentTime = new Date();
        //System.out.println(formatter.format(currentTime));
        return this.DateAfter = formatter.format(currentTime);
    }

    public String NowTimeAfter() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date currentTime = new Date();
        //System.out.println(formatter.format(currentTime));
        return this.TimeAfter = formatter.format(currentTime);
    }

    public String FullTimeFormat() {
        this.FullTimeAfter = this.NowDateAfter() + "-" + this.NowTimeAfter();
        System.out.println(this.FullTimeAfter);
        return this.FullTimeAfter;
    }

//    public String FullTimeAfterFormat() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime currentTime = LocalDateTime.now();
//        System.out.println(currentTime.format(formatter));
//        return this.DateAfter = currentTime.format(formatter);
//    }

    public boolean compareTimeDiff(String fulltimeBefore) throws ParseException {
       
        LocalTime startTime =  LocalTime.now();
        this.istimeformat = false;
        long diff;
        long resetTime = 1800;
        int timebefore = this.TimeConverter(fulltimeBefore);
        int timeafter = this.TimeConverter(startTime.toString());
        diff = timeafter - timebefore;
        System.out.println(diff);
        if(diff < resetTime) {
            return this.istimeformat = true;
        }

        return this.istimeformat = false;

    }
    
    public int TimeConverter(String time) {
        
        String[] time_first_arr = time.split(Pattern.quote(":"));
        int h = Integer.valueOf(time_first_arr[0]);
        int m = Integer.valueOf(time_first_arr[1]);
        String vs = time_first_arr[2];
        String[] vs_first_arr = vs.split(Pattern.quote("."));
        int s = Integer.valueOf(vs_first_arr[0]);
        int convH = h * 60 * 60;
        int convM = m * 60;
        int fulltime = convH + convM + s;
        System.out.println(fulltime);
        return fulltime; 
    }
    
   

    public boolean compareDateFormat(String datebefore) {
        LocalDate date = LocalDate.now();
        
        String dateafter =  date.toString();
        if (dateafter.equals(datebefore)) {
            return this.isdateformat = true;
        }

        return this.isdateformat = false;
    }

  
    
    
    
    
     //RESETCODECOMPARE2 Verschlüsselung mit AES 
     public String resetCodeCompare(String resetcode, String securityanswere, String datebefore, String fulltimeBefore, String username, String comparecodebefore) throws ParseException {
        int zähler = 0;
        this.username = username;
        this.prBeantime = datebefore + fulltimeBefore;
       

        Benutzer b = dbService.readBnId(username);
        this.dbCompareCodeSalt = (dbService.ReadCompareCodeSalt(b.getUser_id()).getCompareCodeSalt());
        this.comparecodeafter = dbService.manipulationCode(dbService.encrypt(dbService.composeCompareCode(securityanswere, datebefore, fulltimeBefore), dbCompareCodeSalt));
        System.out.println("Comparecodeafter-----" + this.comparecodeafter);
        System.out.println("CompareCodebefore-----" + comparecodebefore);
        this.fullresetcode = dbService.manipulationCode(dbService.encrypt(resetcode, (dbService.ReadAdditiveCodeSalt(b.getUser_id())).getAdditiveCodeSalt()));
        //------------------------------------------------------------------------------------------------------------------------------------------------------------
        
        System.out.println("Rsesetcode: ------" + resetcode);
        System.out.println("Datum:-----" + datebefore);
        System.out.println("FullTime ist für die Zeitdiffernz:" + fulltimeBefore);
        System.out.println("Username-----" + username);
        System.out.println("Eingabecode" + this.eingaberesetcode);

        System.out.println(this.fullresetcode);
        //dbCompareCodeSalt muss noch aus der Datenbank geholt werden
        

        if (this.comparecodeafter.compareTo(comparecodebefore) == 0) {

            System.out.println("---------------" + this.eingaberesetcode);
            

            //2020-04-02 13:01:56
            if (compareDateFormat(datebefore)) {

                if (this.compareTimeDiff(fulltimeBefore)) {

                    if (this.eingaberesetcode != null && !("".equals(this.eingaberesetcode))) {
                        
                        if (this.eingaberesetcode.equals(this.fullresetcode)) {
                            System.out.println("Passwort ist richtig!!!");
                            this.SicherheitsAntwortFeld = true;
                            this.eingaberesetcode = "";
                            return this.displaySelectedDa();
                            

                        } else {           
                            System.out.println("ResetCode ist null!");
                            if (zähler < 3) {
                                zähler += 1;
                                System.out.println(zähler);
                                return "email_securitycode.xhtml?faces-redirect=true&amp;includeViewParams=true";
                            } else {
                                return "index.xhtml";
                            }
                        }

                    } else {
                        System.out.println("Reset Code ist null");
                        return "index.xhtml";
                    }

                } 
                
                else {
                    System.out.println("Zeitüberschreitung - Code ist nicht mehr gültig!");
                    return "index.xhtml";
                }

            } else {
                System.out.println("Datumüberschreitung - Code ist nicht mehr gültig!");
                return "index.xhtml";
            }

        } else {
            System.out.println("------------Vergleichscode ist nicht gleich!!!");
            return "index.xhtml";

        }

    }
     
     
     
     
     
     
     public String composeFullResetCode(String username, String resetcode) {    
        Benutzer b = dbService.readBnId(username);
        return dbService.encrypt(resetcode, dbService.ReadAdditiveCodeSalt(b.getUser_id()).getAdditiveCodeSalt());
     }
    
    
    
    
    
    
    
    
    
    
    
    
    

}