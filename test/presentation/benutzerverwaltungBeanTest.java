/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.util.ArrayList;
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
public class benutzerverwaltungBeanTest {
    
    public benutzerverwaltungBeanTest() {
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
     * Test of init method, of class benutzerverwaltungBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBenutzerList method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetBenutzerList() {
        System.out.println("getBenutzerList");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        ArrayList<Benutzer> expResult = null;
        ArrayList<Benutzer> result = instance.getBenutzerList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBenutzerList method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetBenutzerList() {
        System.out.println("setBenutzerList");
        ArrayList<Benutzer> benutzerList = null;
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setBenutzerList(benutzerList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class benutzerverwaltungBean.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        Object expResult = null;
        Object result = instance.add();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class benutzerverwaltungBean.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        Object expResult = null;
        Object result = instance.delete(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modify method, of class benutzerverwaltungBean.
     */
    @Test
    public void testModify() {
        System.out.println("modify");
        Benutzer b = null;
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        Object expResult = null;
        Object result = instance.modify(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Benutzer b = null;
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        Object expResult = null;
        Object result = instance.save(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveUser method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSaveUser() {
        System.out.println("saveUser");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        Object expResult = null;
        Object result = instance.saveUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelUser method, of class benutzerverwaltungBean.
     */
    @Test
    public void testCancelUser() {
        System.out.println("cancelUser");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        Object expResult = null;
        Object result = instance.cancelUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showNewUser method, of class benutzerverwaltungBean.
     */
    @Test
    public void testShowNewUser() {
        System.out.println("showNewUser");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        Object expResult = null;
        Object result = instance.showNewUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBenutzer method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetBenutzer() {
        System.out.println("getBenutzer");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        Benutzer expResult = null;
        Benutzer result = instance.getBenutzer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        int expResult = 0;
        int result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetFirstname() {
        System.out.println("getFirstname");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetLastname() {
        System.out.println("getLastname");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolle method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetRolle() {
        System.out.println("getRolle");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        String expResult = "";
        String result = instance.getRolle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser_id method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetUser_id() {
        System.out.println("getUser_id");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        int expResult = 0;
        int result = instance.getUser_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class benutzerverwaltungBean.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        int result_2 = 0;
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNewUser method, of class benutzerverwaltungBean.
     */
    @Test
    public void testIsNewUser() {
        System.out.println("isNewUser");
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        boolean expResult = false;
        boolean result = instance.isNewUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewUser method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetNewUser() {
        System.out.println("setNewUser");
        boolean newUser = false;
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setNewUser(newUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetFirstname() {
        System.out.println("setFirstname");
        String firstname = "";
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastname method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetLastname() {
        System.out.println("setLastname");
        String lastname = "";
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setLastname(lastname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRolle method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetRolle() {
        System.out.println("setRolle");
        String rolle = "";
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setRolle(rolle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBenutzer method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetBenutzer() {
        System.out.println("setBenutzer");
        Benutzer benutzer = null;
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setBenutzer(benutzer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser_id method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetUser_id() {
        System.out.println("setUser_id");
        int user_id = 0;
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setUser_id(user_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class benutzerverwaltungBean.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        benutzerverwaltungBean instance = new benutzerverwaltungBean();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
