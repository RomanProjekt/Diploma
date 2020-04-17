/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.time.LocalDate;
import java.util.List;
import javax.mail.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class emailpasswortBeanTest {
    
    public emailpasswortBeanTest() {
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
     * Test of init method, of class emailpasswortBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        emailpasswortBean instance = new emailpasswortBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMailSession method, of class emailpasswortBean.
     */
    @Test
    public void testGetMailSession() {
        System.out.println("getMailSession");
        emailpasswortBean instance = new emailpasswortBean();
        Session expResult = null;
        Session result = instance.getMailSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMailSession method, of class emailpasswortBean.
     */
    @Test
    public void testSetMailSession() {
        System.out.println("setMailSession");
        Session mailSession = null;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setMailSession(mailSession);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class emailpasswortBean.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        emailpasswortBean instance = new emailpasswortBean();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class emailpasswortBean.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChecked method, of class emailpasswortBean.
     */
    @Test
    public void testGetChecked() {
        System.out.println("getChecked");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getChecked();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChecked method, of class emailpasswortBean.
     */
    @Test
    public void testSetChecked() {
        System.out.println("setChecked");
        String checked = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setChecked(checked);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReset method, of class emailpasswortBean.
     */
    @Test
    public void testGetReset() {
        System.out.println("getReset");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getReset();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReset method, of class emailpasswortBean.
     */
    @Test
    public void testSetReset() {
        System.out.println("setReset");
        String reset = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setReset(reset);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNoemailformat method, of class emailpasswortBean.
     */
    @Test
    public void testIsNoemailformat() {
        System.out.println("isNoemailformat");
        emailpasswortBean instance = new emailpasswortBean();
        boolean expResult = false;
        boolean result = instance.isNoemailformat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoemailformat method, of class emailpasswortBean.
     */
    @Test
    public void testSetNoemailformat() {
        System.out.println("setNoemailformat");
        boolean noemailformat = false;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setNoemailformat(noemailformat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailList method, of class emailpasswortBean.
     */
    @Test
    public void testGetEmailList() {
        System.out.println("getEmailList");
        emailpasswortBean instance = new emailpasswortBean();
        List<EmailProvider> expResult = null;
        List<EmailProvider> result = instance.getEmailList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailList method, of class emailpasswortBean.
     */
    @Test
    public void testSetEmailList() {
        System.out.println("setEmailList");
        List<EmailProvider> emailList = null;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setEmailList(emailList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNofoundemail method, of class emailpasswortBean.
     */
    @Test
    public void testIsNofoundemail() {
        System.out.println("isNofoundemail");
        emailpasswortBean instance = new emailpasswortBean();
        boolean expResult = false;
        boolean result = instance.isNofoundemail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNofoundemail method, of class emailpasswortBean.
     */
    @Test
    public void testSetNofoundemail() {
        System.out.println("setNofoundemail");
        boolean nofoundemail = false;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setNofoundemail(nofoundemail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNofoundusername method, of class emailpasswortBean.
     */
    @Test
    public void testIsNofoundusername() {
        System.out.println("isNofoundusername");
        emailpasswortBean instance = new emailpasswortBean();
        boolean expResult = false;
        boolean result = instance.isNofoundusername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNofoundusername method, of class emailpasswortBean.
     */
    @Test
    public void testSetNofoundusername() {
        System.out.println("setNofoundusername");
        boolean nofoundusername = false;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setNofoundusername(nofoundusername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isKontofindtf method, of class emailpasswortBean.
     */
    @Test
    public void testIsKontofindtf() {
        System.out.println("isKontofindtf");
        emailpasswortBean instance = new emailpasswortBean();
        boolean expResult = false;
        boolean result = instance.isKontofindtf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKontofindtf method, of class emailpasswortBean.
     */
    @Test
    public void testSetKontofindtf() {
        System.out.println("setKontofindtf");
        boolean kontofindtf = false;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setKontofindtf(kontofindtf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPwresettf method, of class emailpasswortBean.
     */
    @Test
    public void testIsPwresettf() {
        System.out.println("isPwresettf");
        emailpasswortBean instance = new emailpasswortBean();
        boolean expResult = false;
        boolean result = instance.isPwresettf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPwresettf method, of class emailpasswortBean.
     */
    @Test
    public void testSetPwresettf() {
        System.out.println("setPwresettf");
        boolean pwresettf = false;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setPwresettf(pwresettf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPwresetbutton method, of class emailpasswortBean.
     */
    @Test
    public void testIsPwresetbutton() {
        System.out.println("isPwresetbutton");
        emailpasswortBean instance = new emailpasswortBean();
        boolean expResult = false;
        boolean result = instance.isPwresetbutton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPwresetbutton method, of class emailpasswortBean.
     */
    @Test
    public void testSetPwresetbutton() {
        System.out.println("setPwresetbutton");
        boolean pwresetbutton = false;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setPwresetbutton(pwresetbutton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_username method, of class emailpasswortBean.
     */
    @Test
    public void testGetVar_username() {
        System.out.println("getVar_username");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getVar_username();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_username method, of class emailpasswortBean.
     */
    @Test
    public void testSetVar_username() {
        System.out.println("setVar_username");
        String var_username = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setVar_username(var_username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVar_email method, of class emailpasswortBean.
     */
    @Test
    public void testGetVar_email() {
        System.out.println("getVar_email");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getVar_email();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVar_email method, of class emailpasswortBean.
     */
    @Test
    public void testSetVar_email() {
        System.out.println("setVar_email");
        String var_email = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setVar_email(var_email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail_format method, of class emailpasswortBean.
     */
    @Test
    public void testGetEmail_format() {
        System.out.println("getEmail_format");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getEmail_format();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail_format method, of class emailpasswortBean.
     */
    @Test
    public void testSetEmail_format() {
        System.out.println("setEmail_format");
        String email_format = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setEmail_format(email_format);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShow_name method, of class emailpasswortBean.
     */
    @Test
    public void testGetShow_name() {
        System.out.println("getShow_name");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getShow_name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShow_name method, of class emailpasswortBean.
     */
    @Test
    public void testSetShow_name() {
        System.out.println("setShow_name");
        String show_name = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setShow_name(show_name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShow_email method, of class emailpasswortBean.
     */
    @Test
    public void testGetShow_email() {
        System.out.println("getShow_email");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getShow_email();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setShow_email method, of class emailpasswortBean.
     */
    @Test
    public void testSetShow_email() {
        System.out.println("setShow_email");
        String show_email = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setShow_email(show_email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isRight_email_format method, of class emailpasswortBean.
     */
    @Test
    public void testIsRight_email_format() {
        System.out.println("isRight_email_format");
        emailpasswortBean instance = new emailpasswortBean();
        boolean expResult = false;
        boolean result = instance.isRight_email_format();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRight_email_format method, of class emailpasswortBean.
     */
    @Test
    public void testSetRight_email_format() {
        System.out.println("setRight_email_format");
        boolean right_email_format = false;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setRight_email_format(right_email_format);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMax method, of class emailpasswortBean.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        emailpasswortBean instance = new emailpasswortBean();
        int expResult = 0;
        int result = instance.getMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMax method, of class emailpasswortBean.
     */
    @Test
    public void testSetMax() {
        System.out.println("setMax");
        int max = 0;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setMax(max);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailUser method, of class emailpasswortBean.
     */
    @Test
    public void testGetEmailUser() {
        System.out.println("getEmailUser");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getEmailUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailUser method, of class emailpasswortBean.
     */
    @Test
    public void testSetEmailUser() {
        System.out.println("setEmailUser");
        String emailUser = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setEmailUser(emailUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class emailpasswortBean.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMessage method, of class emailpasswortBean.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setMessage(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displaySelectedDa method, of class emailpasswortBean.
     */
    @Test
    public void testDisplaySelectedDa() {
        System.out.println("displaySelectedDa");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.displaySelectedDa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFullTimeBefore method, of class emailpasswortBean.
     */
    @Test
    public void testGetFullTimeBefore() {
        System.out.println("getFullTimeBefore");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getFullTimeBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFullTimeBefore method, of class emailpasswortBean.
     */
    @Test
    public void testSetFullTimeBefore() {
        System.out.println("setFullTimeBefore");
        String FullTimeBefore = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setFullTimeBefore(FullTimeBefore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSendemail method, of class emailpasswortBean.
     */
    @Test
    public void testIsSendemail() {
        System.out.println("isSendemail");
        emailpasswortBean instance = new emailpasswortBean();
        boolean expResult = false;
        boolean result = instance.isSendemail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSendemail method, of class emailpasswortBean.
     */
    @Test
    public void testSetSendemail() {
        System.out.println("setSendemail");
        boolean sendemail = false;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setSendemail(sendemail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeBefore method, of class emailpasswortBean.
     */
    @Test
    public void testGetTimeBefore() {
        System.out.println("getTimeBefore");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getTimeBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeBefore method, of class emailpasswortBean.
     */
    @Test
    public void testSetTimeBefore() {
        System.out.println("setTimeBefore");
        String TimeBefore = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setTimeBefore(TimeBefore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateBefore method, of class emailpasswortBean.
     */
    @Test
    public void testGetDateBefore() {
        System.out.println("getDateBefore");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getDateBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateBefore method, of class emailpasswortBean.
     */
    @Test
    public void testSetDateBefore() {
        System.out.println("setDateBefore");
        String DateBefore = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setDateBefore(DateBefore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatebefore method, of class emailpasswortBean.
     */
    @Test
    public void testGetDatebefore() {
        System.out.println("getDatebefore");
        emailpasswortBean instance = new emailpasswortBean();
        LocalDate expResult = null;
        LocalDate result = instance.getDatebefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatebefore method, of class emailpasswortBean.
     */
    @Test
    public void testSetDatebefore() {
        System.out.println("setDatebefore");
        LocalDate datebefore = null;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setDatebefore(datebefore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class emailpasswortBean.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class emailpasswortBean.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResetCodeBefore method, of class emailpasswortBean.
     */
    @Test
    public void testGetResetCodeBefore() {
        System.out.println("getResetCodeBefore");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getResetCodeBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResetCodeBefore method, of class emailpasswortBean.
     */
    @Test
    public void testSetResetCodeBefore() {
        System.out.println("setResetCodeBefore");
        String resetCodeBefore = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setResetCodeBefore(resetCodeBefore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSicherheitsantwort method, of class emailpasswortBean.
     */
    @Test
    public void testGetSicherheitsantwort() {
        System.out.println("getSicherheitsantwort");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getSicherheitsantwort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSicherheitsantwort method, of class emailpasswortBean.
     */
    @Test
    public void testSetSicherheitsantwort() {
        System.out.println("setSicherheitsantwort");
        String sicherheitsantwort = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setSicherheitsantwort(sicherheitsantwort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompareCode method, of class emailpasswortBean.
     */
    @Test
    public void testGetCompareCode() {
        System.out.println("getCompareCode");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getCompareCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompareCode method, of class emailpasswortBean.
     */
    @Test
    public void testSetCompareCode() {
        System.out.println("setCompareCode");
        String compareCode = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setCompareCode(compareCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZaehler method, of class emailpasswortBean.
     */
    @Test
    public void testGetZaehler() {
        System.out.println("getZaehler");
        emailpasswortBean instance = new emailpasswortBean();
        int expResult = 0;
        int result = instance.getZaehler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZaehler method, of class emailpasswortBean.
     */
    @Test
    public void testSetZaehler() {
        System.out.println("setZaehler");
        int zaehler = 0;
        emailpasswortBean instance = new emailpasswortBean();
        instance.setZaehler(zaehler);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSanswere method, of class emailpasswortBean.
     */
    @Test
    public void testGetSanswere() {
        System.out.println("getSanswere");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getSanswere();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSanswere method, of class emailpasswortBean.
     */
    @Test
    public void testSetSanswere() {
        System.out.println("setSanswere");
        String sanswere = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setSanswere(sanswere);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFullAdditiveCodeSalt method, of class emailpasswortBean.
     */
    @Test
    public void testGetFullAdditiveCodeSalt() {
        System.out.println("getFullAdditiveCodeSalt");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.getFullAdditiveCodeSalt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFullAdditiveCodeSalt method, of class emailpasswortBean.
     */
    @Test
    public void testSetFullAdditiveCodeSalt() {
        System.out.println("setFullAdditiveCodeSalt");
        String FullAdditiveCodeSalt = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.setFullAdditiveCodeSalt(FullAdditiveCodeSalt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class emailpasswortBean.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        emailpasswortBean instance = new emailpasswortBean();
        Object expResult = null;
        Object result = instance.search();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValid method, of class emailpasswortBean.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        String email = "";
        emailpasswortBean instance = new emailpasswortBean();
        boolean expResult = false;
        boolean result = instance.isValid(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reademail method, of class emailpasswortBean.
     */
    @Test
    public void testReademail() {
        System.out.println("reademail");
        String username = "";
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.reademail(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readusername method, of class emailpasswortBean.
     */
    @Test
    public void testReadusername() {
        System.out.println("readusername");
        String email = "";
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.readusername(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of entcryptionEmail method, of class emailpasswortBean.
     */
    @Test
    public void testEntcryptionEmail() {
        System.out.println("entcryptionEmail");
        String email = "";
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.entcryptionEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NowDayBefore method, of class emailpasswortBean.
     */
    @Test
    public void testNowDayBefore() {
        System.out.println("NowDayBefore");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.NowDayBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NowTimeBefore method, of class emailpasswortBean.
     */
    @Test
    public void testNowTimeBefore() {
        System.out.println("NowTimeBefore");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.NowTimeBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class emailpasswortBean.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        emailpasswortBean.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of emailFormat method, of class emailpasswortBean.
     */
    @Test
    public void testEmailFormat() {
        System.out.println("emailFormat");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.emailFormat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compare_port_address method, of class emailpasswortBean.
     */
    @Test
    public void testCompare_port_address() {
        System.out.println("compare_port_address");
        String email_format = "";
        emailpasswortBean instance = new emailpasswortBean();
        EmailProvider expResult = null;
        EmailProvider result = instance.compare_port_address(email_format);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passwort_vergessen method, of class emailpasswortBean.
     */
    @Test
    public void testPasswort_vergessen() {
        System.out.println("passwort_vergessen");
        emailpasswortBean instance = new emailpasswortBean();
        String expResult = "";
        String result = instance.passwort_vergessen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class emailpasswortBean.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String smtpHost = "";
        String smtpPort = "";
        String benutzername = "";
        String passwort = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.login(smtpHost, smtpPort, benutzername, passwort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMail method, of class emailpasswortBean.
     */
    @Test
    public void testSendMail() {
        System.out.println("sendMail");
        String empfaenger = "";
        String betreff = "";
        emailpasswortBean instance = new emailpasswortBean();
        instance.sendMail(empfaenger, betreff);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
