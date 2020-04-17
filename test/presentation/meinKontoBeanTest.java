/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Benutzer;
import pojo.Diplomarbeit;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class meinKontoBeanTest {
    
    public meinKontoBeanTest() {
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
     * Test of init method, of class meinKontoBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        meinKontoBean instance = new meinKontoBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of favIsEmpty method, of class meinKontoBean.
     */
    @Test
    public void testFavIsEmpty() {
        System.out.println("favIsEmpty");
        meinKontoBean instance = new meinKontoBean();
        boolean expResult = false;
        boolean result = instance.favIsEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletefav method, of class meinKontoBean.
     */
    @Test
    public void testDeletefav() {
        System.out.println("deletefav");
        Diplomarbeit dip = null;
        meinKontoBean instance = new meinKontoBean();
        instance.deletefav(dip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delteDip method, of class meinKontoBean.
     */
    @Test
    public void testDelteDip() {
        System.out.println("delteDip");
        Diplomarbeit dip = null;
        meinKontoBean instance = new meinKontoBean();
        instance.delteDip(dip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser_id method, of class meinKontoBean.
     */
    @Test
    public void testGetUser_id() {
        System.out.println("getUser_id");
        meinKontoBean instance = new meinKontoBean();
        int expResult = 0;
        int result = instance.getUser_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser_id method, of class meinKontoBean.
     */
    @Test
    public void testSetUser_id() {
        System.out.println("setUser_id");
        int user_id = 0;
        meinKontoBean instance = new meinKontoBean();
        instance.setUser_id(user_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class meinKontoBean.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        meinKontoBean instance = new meinKontoBean();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class meinKontoBean.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        meinKontoBean instance = new meinKontoBean();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class meinKontoBean.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        meinKontoBean instance = new meinKontoBean();
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class meinKontoBean.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        meinKontoBean instance = new meinKontoBean();
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class meinKontoBean.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        meinKontoBean instance = new meinKontoBean();
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastname method, of class meinKontoBean.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "";
        meinKontoBean instance = new meinKontoBean();
        instance.setLastname(lastname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassWd method, of class meinKontoBean.
     */
    @Test
    public void testGetPassWd() {
        System.out.println("getPassWd");
        meinKontoBean instance = new meinKontoBean();
        String expResult = "";
        String result = instance.getPassWd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassWd method, of class meinKontoBean.
     */
    @Test
    public void testSetPassWd() {
        System.out.println("setPassWd");
        String passWd = "";
        meinKontoBean instance = new meinKontoBean();
        instance.setPassWd(passWd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalt method, of class meinKontoBean.
     */
    @Test
    public void testGetSalt() {
        System.out.println("getSalt");
        meinKontoBean instance = new meinKontoBean();
        String expResult = "";
        String result = instance.getSalt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalt method, of class meinKontoBean.
     */
    @Test
    public void testSetSalt() {
        System.out.println("setSalt");
        String salt = "";
        meinKontoBean instance = new meinKontoBean();
        instance.setSalt(salt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class meinKontoBean.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        meinKontoBean instance = new meinKontoBean();
        String expResult = "";
        String result = instance.getRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRole method, of class meinKontoBean.
     */
    @Test
    public void testSetRole() {
        System.out.println("setRole");
        String role = "";
        meinKontoBean instance = new meinKontoBean();
        instance.setRole(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class meinKontoBean.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        meinKontoBean instance = new meinKontoBean();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class meinKontoBean.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        meinKontoBean instance = new meinKontoBean();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateBenutzer method, of class meinKontoBean.
     */
    @Test
    public void testUpdateBenutzer() {
        System.out.println("updateBenutzer");
        meinKontoBean instance = new meinKontoBean();
        Object expResult = null;
        Object result = instance.updateBenutzer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class meinKontoBean.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        meinKontoBean instance = new meinKontoBean();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class meinKontoBean.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        meinKontoBean instance = new meinKontoBean();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoggedInUser method, of class meinKontoBean.
     */
    @Test
    public void testGetLoggedInUser() {
        System.out.println("getLoggedInUser");
        meinKontoBean instance = new meinKontoBean();
        Benutzer expResult = null;
        Benutzer result = instance.getLoggedInUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoggedInUser method, of class meinKontoBean.
     */
    @Test
    public void testSetLoggedInUser() {
        System.out.println("setLoggedInUser");
        Benutzer loggedInUser = null;
        meinKontoBean instance = new meinKontoBean();
        instance.setLoggedInUser(loggedInUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavList method, of class meinKontoBean.
     */
    @Test
    public void testGetFavList() {
        System.out.println("getFavList");
        meinKontoBean instance = new meinKontoBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.getFavList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavList method, of class meinKontoBean.
     */
    @Test
    public void testSetFavList() {
        System.out.println("setFavList");
        List<Diplomarbeit> favList = null;
        meinKontoBean instance = new meinKontoBean();
        instance.setFavList(favList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class meinKontoBean.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        meinKontoBean instance = new meinKontoBean();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class meinKontoBean.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        meinKontoBean instance = new meinKontoBean();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRedList method, of class meinKontoBean.
     */
    @Test
    public void testGetRedList() {
        System.out.println("getRedList");
        meinKontoBean instance = new meinKontoBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.getRedList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRedList method, of class meinKontoBean.
     */
    @Test
    public void testSetRedList() {
        System.out.println("setRedList");
        List<Diplomarbeit> redList = null;
        meinKontoBean instance = new meinKontoBean();
        instance.setRedList(redList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsAltesPasswortInputTextF method, of class meinKontoBean.
     */
    @Test
    public void testIsIsAltesPasswortInputTextF() {
        System.out.println("isIsAltesPasswortInputTextF");
        meinKontoBean instance = new meinKontoBean();
        boolean expResult = false;
        boolean result = instance.isIsAltesPasswortInputTextF();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAltesPasswortInputTextF method, of class meinKontoBean.
     */
    @Test
    public void testSetIsAltesPasswortInputTextF() {
        System.out.println("setIsAltesPasswortInputTextF");
        boolean isAltesPasswortInputTextF = false;
        meinKontoBean instance = new meinKontoBean();
        instance.setIsAltesPasswortInputTextF(isAltesPasswortInputTextF);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendToPasswortRest method, of class meinKontoBean.
     */
    @Test
    public void testSendToPasswortRest() {
        System.out.println("sendToPasswortRest");
        meinKontoBean instance = new meinKontoBean();
        String expResult = "";
        String result = instance.sendToPasswortRest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
