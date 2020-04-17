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
public class loginBeanTest {
    
    public loginBeanTest() {
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
     * Test of init method, of class loginBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        loginBean instance = new loginBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkF5 method, of class loginBean.
     */
    @Test
    public void testCheckF5() {
        System.out.println("checkF5");
        loginBean instance = new loginBean();
        instance.checkF5();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of load method, of class loginBean.
     */
    @Test
    public void testLoad() {
        System.out.println("load");
        loginBean instance = new loginBean();
        Object expResult = null;
        Object result = instance.load();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loggout method, of class loginBean.
     */
    @Test
    public void testLoggout() {
        System.out.println("loggout");
        loginBean instance = new loginBean();
        Object expResult = null;
        Object result = instance.loggout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onLoad method, of class loginBean.
     */
    @Test
    public void testOnLoad() {
        System.out.println("onLoad");
        loginBean instance = new loginBean();
        String expResult = "";
        String result = instance.onLoad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getB method, of class loginBean.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        loginBean instance = new loginBean();
        Benutzer expResult = null;
        Benutzer result = instance.getB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class loginBean.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        loginBean instance = new loginBean();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBenID method, of class loginBean.
     */
    @Test
    public void testGetBenID() {
        System.out.println("getBenID");
        loginBean instance = new loginBean();
        int expResult = 0;
        int result = instance.getBenID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class loginBean.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        loginBean instance = new loginBean();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPw method, of class loginBean.
     */
    @Test
    public void testGetPw() {
        System.out.println("getPw");
        loginBean instance = new loginBean();
        String expResult = "";
        String result = instance.getPw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPw method, of class loginBean.
     */
    @Test
    public void testSetPw() {
        System.out.println("setPw");
        String pw = "";
        loginBean instance = new loginBean();
        instance.setPw(pw);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class loginBean.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        loginBean instance = new loginBean();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setB method, of class loginBean.
     */
    @Test
    public void testSetB() {
        System.out.println("setB");
        Benutzer b = null;
        loginBean instance = new loginBean();
        instance.setB(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class loginBean.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        loginBean instance = new loginBean();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBenID method, of class loginBean.
     */
    @Test
    public void testSetBenID() {
        System.out.println("setBenID");
        int benID = 0;
        loginBean instance = new loginBean();
        instance.setBenID(benID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class loginBean.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        loginBean instance = new loginBean();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class loginBean.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        loginBean instance = new loginBean();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
