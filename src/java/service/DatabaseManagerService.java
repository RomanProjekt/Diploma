
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import java.util.ArrayList;
import java.util.List;
import pojo.Benutzer;
import pojo.Diplomarbeit;
import infrastructure.AutorDAO;
import infrastructure.BenutzerDAO;
import infrastructure.DiplomarbeitDAO;
import infrastructure.FavoritenDAO;
import infrastructure.SW_DA_DAO;
import infrastructure.SchlagwortDAO;
import infrastructure.SchuleDAO;
import infrastructure.SicherheitsCodeDAO;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.HashMap;
import javax.annotation.PostConstruct;
import pojo.Autor;
import pojo.SW_DA;
import pojo.Schlagwort;
import pojo.Schule;
import pojo.SicherheitsCode;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.Properties;
import javax.crypto.BadPaddingException;
 
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class DatabaseManagerService {
    
    private Benutzer loggedInBenutzer;
    private Benutzer b;
    private Diplomarbeit dip;
    private SicherheitsCode c;
    
    private BenutzerDAO benutzerDAO;
    private AutorDAO autorDAO;
    private FavoritenDAO favDAO;
    private SchlagwortDAO schlagwDAO;
    private SW_DA_DAO schlagwort_verknuepfungDAO;
    private SchuleDAO schuleDAO;
    private SicherheitsCodeDAO sicherheitsCodeDAO;
    
    
    private List<Schule> SchuleList;
    private int rCode;
    
    private DiplomarbeitDAO diplomarbeitDAO;
    private List<Diplomarbeit> dplist;
    
    private Autor autoren;
    
    
    
    
    //Passwort verschlüsseln
    private SecretKeySpec secretKey;
    private byte[] key;
    private String secondEnc;
    private Session mailSession;

    
    
    public Session getMailSession() {
        return mailSession;
    }

    public void setMailSession(Session mailSession) {
        this.mailSession = mailSession;
    }

    public Autor getAutoren() {
        return autoren;
    }

    public void setAutoren(Autor autoren) {
        this.autoren = autoren;
    }
    
    
    
    
    
    public DatabaseManagerService() {
        benutzerDAO = new BenutzerDAO();
        loggedInBenutzer = new Benutzer();
        dip = new Diplomarbeit();
        dplist = new ArrayList<>();
        b = new Benutzer();
        benutzerDAO = new BenutzerDAO();
        autorDAO = new AutorDAO();
        schlagwDAO = new SchlagwortDAO();
        schlagwort_verknuepfungDAO = new SW_DA_DAO();
        schuleDAO = new SchuleDAO();
        diplomarbeitDAO = new DiplomarbeitDAO();
        favDAO = new FavoritenDAO();
        sicherheitsCodeDAO = new SicherheitsCodeDAO();
        SchuleList = new ArrayList<>();
        
    }
    
    @PostConstruct
    private void init() {    
            //Fehler Nullpoint Exception
            //loggedInBenutzer = new Benutzer();
            SchuleList = new ArrayList<>();
    }
    
    private boolean passwortOK;

    public boolean isPasswortOK() {
        return passwortOK;
    }

    public void setPasswortOK(boolean passwortOK) {
        this.passwortOK = passwortOK;
    }

    //Verschlüsselung:

    public SecretKeySpec getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(SecretKeySpec secretKey) {
        this.secretKey = secretKey;
    }

    public byte[] getKey() {
        return key;
    }

    public void setKey(byte[] key) {
        this.key = key;
    }

    public String getSecondEnc() {
        return secondEnc;
    }

    public void setSecondEnc(String secondEnc) {
        this.secondEnc = secondEnc;
    }
    
    public void getSchulList() {
        SchuleList = schuleDAO.read();
    }
    
    
    
    
    //--------------------------------------------------------------------------
    

    public SicherheitsCodeDAO getSicherheitsCodeDAO() {
        return sicherheitsCodeDAO;
    }

    public void setSicherheitsCodeDAO(SicherheitsCodeDAO sicherheitsCodeDAO) {
        this.sicherheitsCodeDAO = sicherheitsCodeDAO;
    }
    

    //Benutzer
    public Benutzer load(String username) {
        b = benutzerDAO.read(username);
        return b;
    }
    
    public ArrayList<Benutzer> getAllBenutzer() {
        return benutzerDAO.getAllBenutzer();
    }
    
    public int updateBenutzer(Benutzer b) {
        return benutzerDAO.updateBenutzer(b);
    }
    
    public int deleteBenutzer(int id) {
        return benutzerDAO.deleteBenutzer(id);
    }
    
    public int insertBenutzer(Benutzer b) {
        return benutzerDAO.insert(b);
    }
    
    public boolean loggedIn() {
        return loggedInBenutzer.getUsername() != null;
    }
    
    public Object stillLoggedIn() {
        if (loggedInBenutzer.getUsername() == null) {
            return "index.xhtml";
        }
        return null;
    }
    
    public void loggout() {
        loggedInBenutzer = new Benutzer();
    }
    
    public boolean usernameExists(String username) {
        return benutzerDAO.usernameExists(username);
    }
    
    public boolean isUser() {
        return "User".equals(loggedInBenutzer.getRole()) || loggedInBenutzer.getRole() == null;
    }
    
    public boolean isAdmin() {
        return "Admin".equals(loggedInBenutzer.getRole()) && loggedInBenutzer.getRole() != null;
    }
    
    public boolean isRedakteurOrHigher() {
        return !("User".equals(loggedInBenutzer.getRole()) || loggedInBenutzer.getRole() == null);
    }
    
    public Object isAdminRedirect() {
        if (!"Admin".equals(loggedInBenutzer.getRole()) || loggedInBenutzer.getRole() == null) {
            return "unauthorized.xhtml";
        }
        return null;
    }
    
    public Object isUserRedirect() {
        if ("User".equals(loggedInBenutzer.getRole()) || loggedInBenutzer.getRole() == null) {
            return "unauthorized.xhtml";
        }
        return null;
    }
    
    
    public void ReadRole() {
        this.loggedInBenutzer.getRole();
    }
    
    
    
    
    

    ////Getter-Setter
    public Benutzer getB() {
        return b;
    }
    
    public BenutzerDAO getBenutzerDAO() {
        return benutzerDAO;
    }
    
    public void setB(Benutzer b) {
        this.b = b;
    }
    
    public void setBenutzerDAO(BenutzerDAO benutzerDAO) {
        this.benutzerDAO = benutzerDAO;
    }
    
    public int getNextUserId() {
        return benutzerDAO.getNextIdFromUser();
    }
    
    public Benutzer getLoggedInBenutzer() {
        return loggedInBenutzer;
    }
    
    public void setLoggedInBenutzer(Benutzer loggedInBenutzer) {
        this.loggedInBenutzer = loggedInBenutzer;
    }

    //------------------------Diplomarbeit--------------------------------------
    public List<Diplomarbeit> getDplist() {
        return dplist;
    }
    
    public void setDplist(List<Diplomarbeit> dplist) {
        this.dplist = dplist;
    }
    
    public DiplomarbeitDAO getDiplomarbeitDAO() {
        return diplomarbeitDAO;
    }
    
    public void setDiplomarbeitDAO(DiplomarbeitDAO diplomarbeitDAO) {
        this.diplomarbeitDAO = diplomarbeitDAO;
    }
    
    public List<Diplomarbeit> ListeAllDiplomarbeiten() {
        return diplomarbeitDAO.read();
    }
    
    public Diplomarbeit getDiplomarbeit(int id) {
        Diplomarbeit dip = diplomarbeitDAO.getDiplomarbeit(id);
        return dip;
    }

    //Autor
    public AutorDAO getAutorDAO() {
        return autorDAO;
    }
    
    public void setAutorDAO(AutorDAO autorDAO) {
        this.autorDAO = autorDAO;
    }
    
    public void updateAutors(HashMap<Integer, Autor> editMap) {
        this.autorDAO.updateAutors(editMap);
    }
    
    public void deleteAutor(int autId) {
        this.autorDAO.deleteAutor(autId);
    }
    
    public void deleteAutors(HashMap<Integer, Autor> delList) {
        this.autorDAO.deleteAutors(delList);
    }
    
    public void insertAutor(Autor autor) {
        this.autorDAO.insert(autor.getFullName(), autor.getDa_id());
    }
    
    public void insertAutors(HashMap<Integer, Autor> insList) {
        this.autorDAO.insertAutorMap(insList);
    }
    
    public List<Autor> getAllAutor() {
        return autorDAO.getAllAutor();
    }
    
    public List<Autor> getAllAutor(int id) {
        return autorDAO.getAllAutor(id);
    }
    
    public Autor getOneAutor(int id) {
        return autorDAO.read(id);
    }

    //Schlagwort
    public SchlagwortDAO getSchlagwDAO() {
        return schlagwDAO;
    }
    
    public void setSchlagwDAO(SchlagwortDAO schlagwDAO) {
        this.schlagwDAO = schlagwDAO;
    }
    
    public List<Schlagwort> getAllSchlagwörter() {
        return schlagwDAO.read();
    }
    
    public HashMap<String, Integer> getAllSchlagwoerterHashMap() {
        HashMap<String, Integer> allSchlagwoerterMap = new HashMap<>();
        List<Schlagwort> swList = getAllSchlagwörter();
        swList.forEach((schlagwort) -> {
            allSchlagwoerterMap.put(schlagwort.getWord(), schlagwort.getTag_id());
        });
        return allSchlagwoerterMap;
    }
    
    public List<Schlagwort> getAllSchlagwoerter(int id) {
        return schlagwort_verknuepfungDAO.getAllSchlagwoerter(id);
    }
    
    public void insertSchlagwortList(List<Schlagwort> swList) {
        schlagwDAO.insertSchlagwortList(swList);
    }

    //Schlagwort-Verknüpfungstabelle
    public Diplomarbeit getDip() {
        return dip;
    }
    
    public void setDip(Diplomarbeit dip) {
        this.dip = dip;
    }
    
    public Autor getAutor(int id) {
        return autorDAO.read(id);
    }

    //FavoritenDAO
    public FavoritenDAO getFavDAO() {
        return favDAO;
    }
    
    public void setFavDAO(FavoritenDAO favDAO) {
        this.favDAO = favDAO;
    }

    //SW_DA_DAO
    public SW_DA_DAO getSchlagwort_verknuepfungDAO() {
        return schlagwort_verknuepfungDAO;
    }
    
    public void setSchlagwort_verknuepfungDAO(SW_DA_DAO schlagwort_verknuepfungDAO) {
        this.schlagwort_verknuepfungDAO = schlagwort_verknuepfungDAO;
    }
    
    public List<SW_DA> getAllSW_DA_Verknuepfung() {
        return this.schlagwort_verknuepfungDAO.getAllSW_DA_Verknüpfungen();
    }
    
    public void deleteSW_DA(HashMap<Integer, Schlagwort> remMap, int daId) {
        this.schlagwort_verknuepfungDAO.deleteSW_DA(remMap, daId);
    }
    
    public void insertSW_DAMap(HashMap<Integer, Schlagwort> insMap, int daId) {
        this.schlagwort_verknuepfungDAO.insertHashMap(insMap, daId);
    }
    
    

    //Schule
    public SchuleDAO getSchuleDAO() {
        return schuleDAO;
    }
    
    public void setSchuleDAO(SchuleDAO schuleDAO) {
        this.schuleDAO = schuleDAO;
    }
    
    public List<Schule> getSchuleList() {
        return SchuleList;
    }
    
    public void setSchuleList(List<Schule> SchuleList) {
        this.SchuleList = SchuleList;
    }
    
    public List<Schule> getListevonSchulen() {
        return this.schuleDAO.read();
    }
    
    public Schule getOneSchule(int id) {
        return this.schuleDAO.readOne(id);
    }

    public SicherheitsCode getC() {
        return c;
    }

    public void setC(SicherheitsCode c) {
        this.c = c;
    }

    public int getrCode() {
        return rCode;
    }

    public void setrCode(int rCode) {
        this.rCode = rCode;
    }
   
    
    //-----------------------Diplomarbeit hochladen:---------------------------
    public void hochladen(String title, List<Autor> autorList, Schule schule, List<Schlagwort> schlagwoerter, String pdfpath, String imagepath, Date datum) throws FileNotFoundException {
        int var_user_id = this.getLoggedInBenutzer().getUser_id();
        System.out.println(var_user_id);
        int var_da_id = diplomarbeitDAO.insert(title, var_user_id, schule.getSchule_id(), pdfpath, imagepath, datum);
        autorDAO.insertAutorList(autorList, var_da_id);
        schlagwort_verknuepfungDAO.readInsertList(schlagwoerter, var_da_id);

    }
    
    


    //------------------Diplomarbeit löschen---------------------------
    public int deleteDiplomarbeit(Diplomarbeit dip) {

        //delete autor
        autorDAO.deleteAutorDip(dip.getDa_id());

        //delete fav
        favDAO.deleteDip(dip.getDa_id());
        //delete schlag
        schlagwort_verknuepfungDAO.deleteDA(dip.getDa_id());
        
        int rest = diplomarbeitDAO.delete(dip.getDa_id());
        
        return rest;
    }

    //DP Title update
    public void updateDPTitle(int id, String title) {
        diplomarbeitDAO.updateTitle(id, title);
    }

    //DP Schule update
    public void updateDPSchule(int dpId, int schulId) {
        diplomarbeitDAO.updateSchule(dpId, schulId);
    }
    
    public void updateDPDatum(int daId, Date datum) {
        diplomarbeitDAO.updateDatum(daId, datum);
    }

    //Redakteur Liste der DAs
    public List<Diplomarbeit> getRedList() {
        return diplomarbeitDAO.getRedList(loggedInBenutzer.getUser_id());
    }
    
//    public ínt getUserId() {
//        return benutzerDAO.Read
//    }

    //Favouriten einfügen
    public int insertFavouriten(int dp_id, int b_id) {
         System.out.println("---------------------------------- dipid " + dp_id);
         System.out.println("---------------------------------- benutzerid" + b_id);
       
        return this.favDAO.insert(dp_id, this.loggedInBenutzer.getUser_id());
    }
    
    public List<Diplomarbeit> getFavList() {
        return favDAO.getFavList(loggedInBenutzer.getUser_id());
    }
    
    public int deleteFav(Diplomarbeit dip) {
        return favDAO.deleteOne(dip, loggedInBenutzer.getUser_id());
    }

    
    
    
//----------Passwort zurücksetzen im eigenen Programm:--------------------------
    public int updateNewPasswort(String npw, Benutzer b) {
        return benutzerDAO.updateNewPassword(npw, b);
    }
    
    public boolean diplomarbeit(String titel) {
        return diplomarbeitDAO.read(titel);
    }

    
    //----------------------PDFViewer-------------------------------------------
    //Die Variable nur in pdfViewer verwenden!!!
    private Diplomarbeit aktuelleDiplomarbeit;
    
    public Diplomarbeit getAktuelleDiplomarbeit() {
        return aktuelleDiplomarbeit;
    }
    
    public void setAktuelleDiplomarbeit(Diplomarbeit aktuelleDiplomarbeit) {
        this.aktuelleDiplomarbeit = aktuelleDiplomarbeit;
    }
    
    public void getAktuellPicture(Diplomarbeit aktDip) {
        this.aktuelleDiplomarbeit = aktDip;
    }

    //-------------------------------------------------------------------------

    
    //-------------------Click-Zähler------------------------------------------
    public void click_count(int click_count, Diplomarbeit dip) {
        diplomarbeitDAO.click_count(click_count, dip);
    }

    //Download-Zähler
    public void downloadt_count(int download_count, Diplomarbeit dip) {
        diplomarbeitDAO.download_count(download_count, dip);
    }

    public int read_clickcount(Diplomarbeit dip) {
       return diplomarbeitDAO.readClickCount(dip);
    }

    public int read_downloadcount(Diplomarbeit dip) {
       return diplomarbeitDAO.readDownloadCount(dip);
    }
    
    
    //--------------Überprüfen Email in der Datenbank vorhanden-----------------

    public String reademailfound(String reset, boolean nofoundemail) {
        return benutzerDAO.readEmailFound(reset,nofoundemail);
    }

    public String readusernamefound(String reset, boolean nofoundusername) {
        return benutzerDAO.readUsernameFound(reset,nofoundusername);
    }
    
    public String reademail(String reset) {
        return benutzerDAO.readEmail(reset);
    }
    
    public String readusername(String reset) {
        return benutzerDAO.readUsername(reset);
    }

    
    //--------------------------------------------------------------------------
    
    public void insertSicherheitsCode(SicherheitsCode c, Benutzer b) {
        sicherheitsCodeDAO.insertResetCode(c, b);
    }

    public Benutzer readBnId(String username) {
        System.out.println("Benutzername " + username);
        return benutzerDAO.read(username);
    }
 
    //Salts:
     public String composeResetCodeSalt(String benutzername, String date, String time) {
        return benutzername + date + time;
    }
     
    public String composeCompareCodeSalt(String benutzername, String date, String time) {
         return benutzername + date + time;
    }
    
    public String composeSecurityAnswer(String securityanswer, String benutzername, String date, String time) {
           return securityanswer + date + benutzername + time;
    }
    
    public String composeAdditiveCodeSalt(String composeResetCodeSalt, String composeCompareCodeSalt) {
        return composeResetCodeSalt + composeCompareCodeSalt;
    }
    

    
    
    public String composeResetCode(String sicherheitsantwort, String date, String time) {
         return sicherheitsantwort + date + time;
    }
    
    public String composeCompareCode(String sicherheitsantwort, String date, String time) {
        return  sicherheitsantwort + date + time;
    }
    
    public String entcryptionResetCode(String sicherheitsantwort, String date, String time, String dbResetCodeSalt) {
        return this.manipulationCode(this.encrypt(this.composeResetCode(sicherheitsantwort, date, time), dbResetCodeSalt));
    }
    
    public String entcryptionCompareCode(String sicherheitsantwort, String date, String time, String dbCompareCodeSalt) {
        return this.manipulationCode(this.encrypt(this.composeCompareCode(sicherheitsantwort, date, time), dbCompareCodeSalt));
    }
    
    
    
    
    //Verschlüsselung von Parametern:
    
    private String ReturnEncCompCodeSalt;
    private String ReturnEncCompResetCodeSalt;
    private String ReturnSAnswerSalt;
    private String mainKey;
    

    public String getReturnEncCompCodeSalt() {
        return ReturnEncCompCodeSalt;
    }

    public void setReturnEncCompCodeSalt(String ReturnEncCompCodeSalt) {
        this.ReturnEncCompCodeSalt = ReturnEncCompCodeSalt;
    }

    public String getReturnEncCompResetCodeSalt() {
        return ReturnEncCompResetCodeSalt;
    }

    public void setReturnEncCompResetCodeSalt(String ReturnEncCompResetCodeSalt) {
        this.ReturnEncCompResetCodeSalt = ReturnEncCompResetCodeSalt;
    }

    public String getReturnSAnswerSalt() {
        return ReturnSAnswerSalt;
    }

    public void setReturnSAnswerSalt(String ReturnSAnswerSalt) {
        this.ReturnSAnswerSalt = ReturnSAnswerSalt;
    }

    public String getMainKey() {
        return mainKey;
    }

    public void setMainKey(String mainKey) {
        this.mainKey = mainKey;
    }
    
    
    
    
    

    public String entcryptionSecurityAnswer(String securityanswer, int id) {
        String schlüssel = securityanswer + String.valueOf(id);
        //String firstEnc =  this.manipulationCode(this.encrypt(this.composeSecurityAnswer(securityanswer, benutzername, date, time), this.mainEncryption()));
        return this.secondEnc = this.manipulationCode(this.encrypt(schlüssel, this.mainEncryption(securityanswer, id)));
  
    } 
    
    public String entcyptioncompareCodeSalt(String securityanswer, String date, String time) {
       return this.ReturnEncCompCodeSalt = this.manipulationCode(this.encrypt(this.composeResetCodeSalt(securityanswer, date, time), this.secondEnc));
    }

    public String entcyptioncompareResetCodeSalt(String benutzername, String date, String time) {
        return this.ReturnEncCompResetCodeSalt = this.manipulationCode(this.encrypt(this.composeResetCodeSalt(benutzername, date, time), this.ReturnEncCompCodeSalt));
    }

    public String additiveCodeSalt() {
        return this.manipulationCode(this.encrypt((this.composeAdditiveCodeSalt(this.ReturnEncCompCodeSalt, this.ReturnEncCompResetCodeSalt)), this.ReturnEncCompResetCodeSalt));
    }
    
    public String entcryptionSecurityAnswerSalt(String securityanswer, String benutzername, String date , String time) {
        return this.ReturnSAnswerSalt = this.encrypt(securityanswer, secondEnc);
    }
    
    public String mainEncryption(String securityanswer, int id) {
        String schlüssel = (String.valueOf(id) + securityanswer);
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        return argon2.hash(4, 1024 * 1024, 8, schlüssel.toCharArray());
    }
    
    public String ReadAddativeSecSalt(String bnid, String username, String prdate) {
        return (prdate + bnid + username);
    }
    
    public static void main(String[] args) {
        DatabaseManagerService db = new DatabaseManagerService();
        db.mainEncryption("patrick",12);
        db.mainEncryption("patrick",14);
    }
    
    
    
    public String manipulationCode(String code) {
        return code.substring(0, 15);
    }
    
    
    public SicherheitsCode ReadCompareCodeSalt(int benutzer_id) {
        return sicherheitsCodeDAO.ReadCompareCodeSalt(benutzer_id);
    }
    
    public SicherheitsCode ReadResetCodeSalt(int benutzer_id) {
        return sicherheitsCodeDAO.ReadResetCodeSalt(benutzer_id);
    }
    
    public SicherheitsCode ReadAdditiveCodeSalt(int benutzer_id) {
        return sicherheitsCodeDAO.readAdditiveCodeSalt(benutzer_id);
    }
    
    public SicherheitsCode ReadSicherheitsantwort(int benutzer_id) {
        return sicherheitsCodeDAO.readSicherheitsCode(benutzer_id);
    }


    public String Zufallszahl() {
        int min = 1;
        int range = 10;
        String zufallscode = "";
        // generate random numbers within 1 to 10 
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            int rand = (int) (Math.random() * range) + min;
            arr[i] = String.valueOf(rand);
            zufallscode += arr[i];
        }
        return zufallscode;
    }
    
    
      
    
    public void setKey(String myKey) 
    {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); 
            this.secretKey = new SecretKeySpec(key, "AES");
        } 
        catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
    

    public String encrypt(String orginalcode, String dbcodeKey ) {
        try {
            this.setKey(orginalcode);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, this.secretKey);
            
            return Base64.getEncoder().encodeToString(cipher.doFinal(dbcodeKey.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error while encrypting: " + e.toString());
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException | InvalidKeyException ex) {
            ex.printStackTrace();
        }


        return null;
    }

    public String decrypt(String encryptedString, String dbcodeKey) {  
        try {
            this.setKey(encryptedString);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, this.secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(dbcodeKey)));
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }
    
    
    
//    public static void main(String[] args ) {
//        String code = "yrKkg5wqCuvN4NluKiK9NPFFZtPYK19hdIA8oHoLZTw=";
//        System.out.println(code.substring(0, 15));
//    }
    
    public List<Diplomarbeit> ReadSearchKey(String key) { 
         return diplomarbeitDAO.Suchleiste(key);
    }  
     
    
     
     

    
    
   
    
    
    
    //Email zurückseten 
     
        
        static final String absender = "testdiplomarbeit@gmx.at";
        private String FullDate;
     
       public void login(String smtpHost, String smtpPort, String benutzername, String passwort, Benutzer b) {

        // Die Properties der JVM holen
        Properties properties = System.getProperties();

        // Postausgangsserver
        properties.put("mail.smtp.port", smtpPort);
        properties.put("mail.smtp.host", smtpHost);

        // Benutzername
        properties.put("mail.user", benutzername);

        // Passwort
        properties.put("mail.password", passwort);

        //Einstellungen für die STARTTLS Verschlüsselte Übermittlung von E-Mails
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Einstellungen für die SSL Verschlüsselte Übermittlung von E-Mails
        //properties.setProperty("mail.smtps.**ssl.enable", "true");
        //properties.setProperty("mail.smtps.**ssl.required", "true");
        //properties.setProperty("mail.smtps.auth", "true"); 
        //-----------------------------------------------------------
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(benutzername, passwort);
            }
        };

        //---------------------------------------------------------------
        
        this.mailSession = Session.getDefaultInstance(properties, auth);
        this.mailSession.setDebug(true);
        System.out.println("Eingeloggt.");
        this.sendMail(b.geteMail(), "Lieber " + b.getUsername() + " - Hinweis: Passwort wurde zurückgesetzt!", b);

    }

    public void sendMail(String empfaenger, String betreff, Benutzer b) {

        try {
           
            MimeMessage message = new MimeMessage(this.mailSession);
            message.setFrom(new InternetAddress(absender));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(empfaenger));
            message.setSubject(betreff);

                //Versenden der Email:
                message.setContent(
                        "<html>"
                        + "<head>"
                        + "</head>"
                        + "<body>"     
                                
                        + "<h3>Hinweis: Ihr Passwort wurde vor einiger Zeit zurückgesetzt!</h3>"
                        + "<h5>Ihr Passwort wurde am " + this.FullTimeFormat() + " zurückgesetzt." + "</h5>"
                        + " <div class=\"navbox\">"
                        + " <ul id=\"navbox_liste\">"
                        + " <div class=\"addresse\"><li><h5></h5></li></div>\n"
                        + " <div class=\"impressum\"><li><h5>IMPRESSUM</h5></a></li></div>\n"
                        + " <div class=\"datenschutz\"><li><h5>DATENSCHUTZ</h5></a></li></div>\n"
                        + " </ul>\n"
                        + " </div>"
                        + "</body>"
                        + "</html>",
                        "text/html"
                );
                
                
            
                Transport.send(message);

                System.out.println("Sent message successfully....");

            
            
    
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
    
    
    //Nur für die Email
    
    public String NowDateBefore() {       
        SimpleDateFormat formatter = new SimpleDateFormat("dd:MM:yyyy");
        java.util.Date currentTime = new java.util.Date();
        //System.out.println(formatter.format(currentTime));
        return formatter.format(currentTime); 
    }
    
    
    public String NowTimeBefore() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        java.util.Date currentTime = new java.util.Date();
        //System.out.println(formatter.format(currentTime));
        return formatter.format(currentTime);
    }
    
    
    public String FullTimeFormat() {
        System.out.println(this.FullDate);
        return this.FullDate = this.NowDateBefore() + " - " + this.NowTimeBefore();
    }
    
    
    public Benutzer readBenutzer(String username) {
        return benutzerDAO.readBenutzer(username);
    }
    
    public Benutzer readBenutzer(int benutzer_id) {
        return benutzerDAO.read(benutzer_id);
    }

    public int updateAdminNewPasswort(String pw, int benutzerid) {
        return benutzerDAO.updateAdminNewPasswort(pw, benutzerid);
    }

  
    public boolean compare(String email) {
        return benutzerDAO.compareEmail(email);
    }

    

   
    
    
   
  
    
    
}


