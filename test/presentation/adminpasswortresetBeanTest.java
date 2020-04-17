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
public class adminpasswortresetBeanTest {
    
    public adminpasswortresetBeanTest() {
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
     * Test of getPw method, of class adminpasswortresetBean.
     */
    @Test
    public void testGetPw() {
        System.out.println("getPw");
        adminpasswortresetBean instance = new adminpasswortresetBean();
        String expResult = "";
        String result = instance.getPw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPw method, of class adminpasswortresetBean.
     */
    @Test
    public void testSetPw() {
        System.out.println("setPw");
        String pw = "";
        adminpasswortresetBean instance = new adminpasswortresetBean();
        instance.setPw(pw);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBestaetigtespw method, of class adminpasswortresetBean.
     */
    @Test
    public void testGetBestaetigtespw() {
        System.out.println("getBestaetigtespw");
        adminpasswortresetBean instance = new adminpasswortresetBean();
        String expResult = "";
        String result = instance.getBestaetigtespw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBestaetigtespw method, of class adminpasswortresetBean.
     */
    @Test
    public void testSetBestaetigtespw() {
        System.out.println("setBestaetigtespw");
        String bestaetigtespw = "";
        adminpasswortresetBean instance = new adminpasswortresetBean();
        instance.setBestaetigtespw(bestaetigtespw);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class adminpasswortresetBean.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        adminpasswortresetBean instance = new adminpasswortresetBean();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class adminpasswortresetBean.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        adminpasswortresetBean instance = new adminpasswortresetBean();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBenutzerid method, of class adminpasswortresetBean.
     */
    @Test
    public void testGetBenutzerid() {
        System.out.println("getBenutzerid");
        adminpasswortresetBean instance = new adminpasswortresetBean();
        String expResult = "";
        String result = instance.getBenutzerid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBenutzerid method, of class adminpasswortresetBean.
     */
    @Test
    public void testSetBenutzerid() {
        System.out.println("setBenutzerid");
        String benutzerid = "";
        adminpasswortresetBean instance = new adminpasswortresetBean();
        instance.setBenutzerid(benutzerid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loggout method, of class adminpasswortresetBean.
     */
    @Test
    public void testLoggout() {
        System.out.println("loggout");
        adminpasswortresetBean instance = new adminpasswortresetBean();
        String expResult = "";
        String result = instance.loggout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsUserfound method, of class adminpasswortresetBean.
     */
    @Test
    public void testGetIsUserfound() {
        System.out.println("getIsUserfound");
        adminpasswortresetBean instance = new adminpasswortresetBean();
        String expResult = "";
        String result = instance.getIsUserfound();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsUserfound method, of class adminpasswortresetBean.
     */
    @Test
    public void testSetIsUserfound() {
        System.out.println("setIsUserfound");
        String isUserfound = "";
        adminpasswortresetBean instance = new adminpasswortresetBean();
        instance.setIsUserfound(isUserfound);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessagePasswort method, of class adminpasswortresetBean.
     */
    @Test
    public void testGetMessagePasswort() {
        System.out.println("getMessagePasswort");
        adminpasswortresetBean instance = new adminpasswortresetBean();
        String expResult = "";
        String result = instance.getMessagePasswort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessagePasswort method, of class adminpasswortresetBean.
     */
    @Test
    public void testSetMessagePasswort() {
        System.out.println("setMessagePasswort");
        String messagePasswort = "";
        adminpasswortresetBean instance = new adminpasswortresetBean();
        instance.setMessagePasswort(messagePasswort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of speichernPasswortAdmin method, of class adminpasswortresetBean.
     */
    @Test
    public void testSpeichernPasswortAdmin() {
        System.out.println("speichernPasswortAdmin");
        Benutzer b = null;
        adminpasswortresetBean instance = new adminpasswortresetBean();
        String expResult = "";
        String result = instance.speichernPasswortAdmin(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
