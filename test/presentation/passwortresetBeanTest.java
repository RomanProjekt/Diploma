/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Benutzer;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class passwortresetBeanTest {
    
    public passwortresetBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class passwortresetBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        passwortresetBean instance = new passwortresetBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPw method, of class passwortresetBean.
     */
    @Test
    public void testGetPw() {
        System.out.println("getPw");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getPw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPw method, of class passwortresetBean.
     */
    @Test
    public void testSetPw() {
        System.out.println("setPw");
        String pw = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setPw(pw);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBestaetigtespw method, of class passwortresetBean.
     */
    @Test
    public void testGetBestaetigtespw() {
        System.out.println("getBestaetigtespw");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getBestaetigtespw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBestaetigtespw method, of class passwortresetBean.
     */
    @Test
    public void testSetBestaetigtespw() {
        System.out.println("setBestaetigtespw");
        String bestaetigtespw = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setBestaetigtespw(bestaetigtespw);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class passwortresetBean.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        passwortresetBean instance = new passwortresetBean();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class passwortresetBean.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        passwortresetBean instance = new passwortresetBean();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBenutzername method, of class passwortresetBean.
     */
    @Test
    public void testGetBenutzername() {
        System.out.println("getBenutzername");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getBenutzername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBenutzername method, of class passwortresetBean.
     */
    @Test
    public void testSetBenutzername() {
        System.out.println("setBenutzername");
        String benutzername = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setBenutzername(benutzername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltesPasswort method, of class passwortresetBean.
     */
    @Test
    public void testGetAltesPasswort() {
        System.out.println("getAltesPasswort");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getAltesPasswort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltesPasswort method, of class passwortresetBean.
     */
    @Test
    public void testSetAltesPasswort() {
        System.out.println("setAltesPasswort");
        String altesPasswort = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setAltesPasswort(altesPasswort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBestaetigtesAltesPasswort method, of class passwortresetBean.
     */
    @Test
    public void testGetBestaetigtesAltesPasswort() {
        System.out.println("getBestaetigtesAltesPasswort");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getBestaetigtesAltesPasswort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBestaetigtesAltesPasswort method, of class passwortresetBean.
     */
    @Test
    public void testSetBestaetigtesAltesPasswort() {
        System.out.println("setBestaetigtesAltesPasswort");
        String bestaetigtesAltesPasswort = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setBestaetigtesAltesPasswort(bestaetigtesAltesPasswort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAltesPasswortNULL method, of class passwortresetBean.
     */
    @Test
    public void testIsAltesPasswortNULL() {
        System.out.println("isAltesPasswortNULL");
        passwortresetBean instance = new passwortresetBean();
        boolean expResult = false;
        boolean result = instance.isAltesPasswortNULL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltesPasswortNULL method, of class passwortresetBean.
     */
    @Test
    public void testSetAltesPasswortNULL() {
        System.out.println("setAltesPasswortNULL");
        boolean altesPasswortNULL = false;
        passwortresetBean instance = new passwortresetBean();
        instance.setAltesPasswortNULL(altesPasswortNULL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCompareOldPassword method, of class passwortresetBean.
     */
    @Test
    public void testIsCompareOldPassword() {
        System.out.println("isCompareOldPassword");
        passwortresetBean instance = new passwortresetBean();
        boolean expResult = false;
        boolean result = instance.isCompareOldPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompareOldPassword method, of class passwortresetBean.
     */
    @Test
    public void testSetCompareOldPassword() {
        System.out.println("setCompareOldPassword");
        boolean compareOldPassword = false;
        passwortresetBean instance = new passwortresetBean();
        instance.setCompareOldPassword(compareOldPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEingabeSicherheitsantwort method, of class passwortresetBean.
     */
    @Test
    public void testGetEingabeSicherheitsantwort() {
        System.out.println("getEingabeSicherheitsantwort");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getEingabeSicherheitsantwort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEingabeSicherheitsantwort method, of class passwortresetBean.
     */
    @Test
    public void testSetEingabeSicherheitsantwort() {
        System.out.println("setEingabeSicherheitsantwort");
        String eingabeSicherheitsantwort = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setEingabeSicherheitsantwort(eingabeSicherheitsantwort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbSicherheitscode method, of class passwortresetBean.
     */
    @Test
    public void testGetDbSicherheitscode() {
        System.out.println("getDbSicherheitscode");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getDbSicherheitscode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbSicherheitscode method, of class passwortresetBean.
     */
    @Test
    public void testSetDbSicherheitscode() {
        System.out.println("setDbSicherheitscode");
        String dbSicherheitscode = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setDbSicherheitscode(dbSicherheitscode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isComparedbSicherheitscode method, of class passwortresetBean.
     */
    @Test
    public void testIsComparedbSicherheitscode() {
        System.out.println("isComparedbSicherheitscode");
        passwortresetBean instance = new passwortresetBean();
        boolean expResult = false;
        boolean result = instance.isComparedbSicherheitscode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComparedbSicherheitscode method, of class passwortresetBean.
     */
    @Test
    public void testSetComparedbSicherheitscode() {
        System.out.println("setComparedbSicherheitscode");
        boolean comparedbSicherheitscode = false;
        passwortresetBean instance = new passwortresetBean();
        instance.setComparedbSicherheitscode(comparedbSicherheitscode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddativeSecSalt method, of class passwortresetBean.
     */
    @Test
    public void testGetAddativeSecSalt() {
        System.out.println("getAddativeSecSalt");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getAddativeSecSalt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddativeSecSalt method, of class passwortresetBean.
     */
    @Test
    public void testSetAddativeSecSalt() {
        System.out.println("setAddativeSecSalt");
        String addativeSecSalt = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setAddativeSecSalt(addativeSecSalt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompareSecCode method, of class passwortresetBean.
     */
    @Test
    public void testGetCompareSecCode() {
        System.out.println("getCompareSecCode");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getCompareSecCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompareSecCode method, of class passwortresetBean.
     */
    @Test
    public void testSetCompareSecCode() {
        System.out.println("setCompareSecCode");
        String compareSecCode = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setCompareSecCode(compareSecCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class passwortresetBean.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class passwortresetBean.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessagePasswort method, of class passwortresetBean.
     */
    @Test
    public void testGetMessagePasswort() {
        System.out.println("getMessagePasswort");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.getMessagePasswort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessagePasswort method, of class passwortresetBean.
     */
    @Test
    public void testSetMessagePasswort() {
        System.out.println("setMessagePasswort");
        String messagePasswort = "";
        passwortresetBean instance = new passwortresetBean();
        instance.setMessagePasswort(messagePasswort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowmessage method, of class passwortresetBean.
     */
    @Test
    public void testIsShowmessage() {
        System.out.println("isShowmessage");
        passwortresetBean instance = new passwortresetBean();
        boolean expResult = false;
        boolean result = instance.isShowmessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowmessage method, of class passwortresetBean.
     */
    @Test
    public void testSetShowmessage() {
        System.out.println("setShowmessage");
        boolean showmessage = false;
        passwortresetBean instance = new passwortresetBean();
        instance.setShowmessage(showmessage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShowmessagePasswort method, of class passwortresetBean.
     */
    @Test
    public void testIsShowmessagePasswort() {
        System.out.println("isShowmessagePasswort");
        passwortresetBean instance = new passwortresetBean();
        boolean expResult = false;
        boolean result = instance.isShowmessagePasswort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShowmessagePasswort method, of class passwortresetBean.
     */
    @Test
    public void testSetShowmessagePasswort() {
        System.out.println("setShowmessagePasswort");
        boolean showmessagePasswort = false;
        passwortresetBean instance = new passwortresetBean();
        instance.setShowmessagePasswort(showmessagePasswort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loggout method, of class passwortresetBean.
     */
    @Test
    public void testLoggout() {
        System.out.println("loggout");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.loggout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of speichernPasswortUser method, of class passwortresetBean.
     */
    @Test
    public void testSpeichernPasswortUser() {
        System.out.println("speichernPasswortUser");
        String username = "";
        String prdate = "";
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.speichernPasswortUser(username, prdate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of speichernPasswortBenutzer method, of class passwortresetBean.
     */
    @Test
    public void testSpeichernPasswortBenutzer() {
        System.out.println("speichernPasswortBenutzer");
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.speichernPasswortBenutzer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CompareOldPassword method, of class passwortresetBean.
     */
    @Test
    public void testCompareOldPassword() {
        System.out.println("CompareOldPassword");
        passwortresetBean instance = new passwortresetBean();
        boolean expResult = false;
        boolean result = instance.CompareOldPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CompareSicherheitsAntwort method, of class passwortresetBean.
     */
    @Test
    public void testCompareSicherheitsAntwort() {
        System.out.println("CompareSicherheitsAntwort");
        Benutzer b = null;
        String prdate = "";
        passwortresetBean instance = new passwortresetBean();
        boolean expResult = false;
        boolean result = instance.CompareSicherheitsAntwort(b, prdate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of composeEmailCompareSecCode method, of class passwortresetBean.
     */
    @Test
    public void testComposeEmailCompareSecCode() {
        System.out.println("composeEmailCompareSecCode");
        Benutzer b = null;
        String prdate = "";
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.composeEmailCompareSecCode(b, prdate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of composePasswortResetBeanCompareSecCode method, of class passwortresetBean.
     */
    @Test
    public void testComposePasswortResetBeanCompareSecCode() {
        System.out.println("composePasswortResetBeanCompareSecCode");
        Benutzer b = null;
        String prdate = "";
        passwortresetBean instance = new passwortresetBean();
        String expResult = "";
        String result = instance.composePasswortResetBeanCompareSecCode(b, prdate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
