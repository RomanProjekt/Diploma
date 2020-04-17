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
import pojo.SicherheitsCode;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class registerBeanTest {
    
    public registerBeanTest() {
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
     * Test of init method, of class registerBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        registerBean instance = new registerBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class registerBean.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        registerBean instance = new registerBean();
        Object expResult = null;
        Object result = instance.register();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearLogin method, of class registerBean.
     */
    @Test
    public void testClearLogin() {
        System.out.println("clearLogin");
        registerBean instance = new registerBean();
        instance.clearLogin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getB method, of class registerBean.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        registerBean instance = new registerBean();
        Benutzer expResult = null;
        Benutzer result = instance.getB();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setB method, of class registerBean.
     */
    @Test
    public void testSetB() {
        System.out.println("setB");
        Benutzer b = null;
        registerBean instance = new registerBean();
        instance.setB(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class registerBean.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        registerBean instance = new registerBean();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class registerBean.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        registerBean instance = new registerBean();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class registerBean.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class registerBean.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        registerBean instance = new registerBean();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class registerBean.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class registerBean.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        registerBean instance = new registerBean();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class registerBean.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class registerBean.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        registerBean instance = new registerBean();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class registerBean.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class registerBean.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        registerBean instance = new registerBean();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPw method, of class registerBean.
     */
    @Test
    public void testGetPw() {
        System.out.println("getPw");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getPw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPw method, of class registerBean.
     */
    @Test
    public void testSetPw() {
        System.out.println("setPw");
        String pw = "";
        registerBean instance = new registerBean();
        instance.setPw(pw);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class registerBean.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class registerBean.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        registerBean instance = new registerBean();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getC method, of class registerBean.
     */
    @Test
    public void testGetC() {
        System.out.println("getC");
        registerBean instance = new registerBean();
        SicherheitsCode expResult = null;
        SicherheitsCode result = instance.getC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setC method, of class registerBean.
     */
    @Test
    public void testSetC() {
        System.out.println("setC");
        SicherheitsCode c = null;
        registerBean instance = new registerBean();
        instance.setC(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecurityanswer method, of class registerBean.
     */
    @Test
    public void testGetSecurityanswer() {
        System.out.println("getSecurityanswer");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getSecurityanswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecurityanswer method, of class registerBean.
     */
    @Test
    public void testSetSecurityanswer() {
        System.out.println("setSecurityanswer");
        String securityanswer = "";
        registerBean instance = new registerBean();
        instance.setSecurityanswer(securityanswer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompareCodeSalt method, of class registerBean.
     */
    @Test
    public void testGetCompareCodeSalt() {
        System.out.println("getCompareCodeSalt");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getCompareCodeSalt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompareCodeSalt method, of class registerBean.
     */
    @Test
    public void testSetCompareCodeSalt() {
        System.out.println("setCompareCodeSalt");
        String compareCodeSalt = "";
        registerBean instance = new registerBean();
        instance.setCompareCodeSalt(compareCodeSalt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResetCodeSalt method, of class registerBean.
     */
    @Test
    public void testGetResetCodeSalt() {
        System.out.println("getResetCodeSalt");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getResetCodeSalt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResetCodeSalt method, of class registerBean.
     */
    @Test
    public void testSetResetCodeSalt() {
        System.out.println("setResetCodeSalt");
        String resetCodeSalt = "";
        registerBean instance = new registerBean();
        instance.setResetCodeSalt(resetCodeSalt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdditiveCodeSalt method, of class registerBean.
     */
    @Test
    public void testGetAdditiveCodeSalt() {
        System.out.println("getAdditiveCodeSalt");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getAdditiveCodeSalt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdditiveCodeSalt method, of class registerBean.
     */
    @Test
    public void testSetAdditiveCodeSalt() {
        System.out.println("setAdditiveCodeSalt");
        String additiveCodeSalt = "";
        registerBean instance = new registerBean();
        instance.setAdditiveCodeSalt(additiveCodeSalt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateBefore method, of class registerBean.
     */
    @Test
    public void testGetDateBefore() {
        System.out.println("getDateBefore");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getDateBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateBefore method, of class registerBean.
     */
    @Test
    public void testSetDateBefore() {
        System.out.println("setDateBefore");
        String DateBefore = "";
        registerBean instance = new registerBean();
        instance.setDateBefore(DateBefore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeBefore method, of class registerBean.
     */
    @Test
    public void testGetTimeBefore() {
        System.out.println("getTimeBefore");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getTimeBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeBefore method, of class registerBean.
     */
    @Test
    public void testSetTimeBefore() {
        System.out.println("setTimeBefore");
        String TimeBefore = "";
        registerBean instance = new registerBean();
        instance.setTimeBefore(TimeBefore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsSicherheitsAntwortNull method, of class registerBean.
     */
    @Test
    public void testIsIsSicherheitsAntwortNull() {
        System.out.println("isIsSicherheitsAntwortNull");
        registerBean instance = new registerBean();
        boolean expResult = false;
        boolean result = instance.isIsSicherheitsAntwortNull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsSicherheitsAntwortNull method, of class registerBean.
     */
    @Test
    public void testSetIsSicherheitsAntwortNull() {
        System.out.println("setIsSicherheitsAntwortNull");
        boolean isSicherheitsAntwortNull = false;
        registerBean instance = new registerBean();
        instance.setIsSicherheitsAntwortNull(isSicherheitsAntwortNull);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMainKey method, of class registerBean.
     */
    @Test
    public void testGetMainKey() {
        System.out.println("getMainKey");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.getMainKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMainKey method, of class registerBean.
     */
    @Test
    public void testSetMainKey() {
        System.out.println("setMainKey");
        String mainKey = "";
        registerBean instance = new registerBean();
        instance.setMainKey(mainKey);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MainKey method, of class registerBean.
     */
    @Test
    public void testMainKey() {
        System.out.println("MainKey");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.MainKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NowDayBefore method, of class registerBean.
     */
    @Test
    public void testNowDayBefore() {
        System.out.println("NowDayBefore");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.NowDayBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NowTimeBefore method, of class registerBean.
     */
    @Test
    public void testNowTimeBefore() {
        System.out.println("NowTimeBefore");
        registerBean instance = new registerBean();
        String expResult = "";
        String result = instance.NowTimeBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
