/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Diplomarbeit;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class pdfviewerBeanTest {
    
    public pdfviewerBeanTest() {
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
     * Test of init method, of class pdfviewerBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        pdfviewerBean instance = new pdfviewerBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDip method, of class pdfviewerBean.
     */
    @Test
    public void testGetDip() {
        System.out.println("getDip");
        pdfviewerBean instance = new pdfviewerBean();
        Diplomarbeit expResult = null;
        Diplomarbeit result = instance.getDip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDip method, of class pdfviewerBean.
     */
    @Test
    public void testSetDip() {
        System.out.println("setDip");
        Diplomarbeit dip = null;
        pdfviewerBean instance = new pdfviewerBean();
        instance.setDip(dip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class pdfviewerBean.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        pdfviewerBean instance = new pdfviewerBean();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class pdfviewerBean.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        pdfviewerBean instance = new pdfviewerBean();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDocument method, of class pdfviewerBean.
     */
    @Test
    public void testGetDocument() {
        System.out.println("getDocument");
        pdfviewerBean instance = new pdfviewerBean();
        PDDocument expResult = null;
        PDDocument result = instance.getDocument();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDocument method, of class pdfviewerBean.
     */
    @Test
    public void testSetDocument() {
        System.out.println("setDocument");
        PDDocument document = null;
        pdfviewerBean instance = new pdfviewerBean();
        instance.setDocument(document);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeitenanzahl method, of class pdfviewerBean.
     */
    @Test
    public void testGetSeitenanzahl() {
        System.out.println("getSeitenanzahl");
        pdfviewerBean instance = new pdfviewerBean();
        int expResult = 0;
        int result = instance.getSeitenanzahl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeitenanzahl method, of class pdfviewerBean.
     */
    @Test
    public void testSetSeitenanzahl() {
        System.out.println("setSeitenanzahl");
        int seitenanzahl = 0;
        pdfviewerBean instance = new pdfviewerBean();
        instance.setSeitenanzahl(seitenanzahl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAktuelleseitenanzahl method, of class pdfviewerBean.
     */
    @Test
    public void testGetAktuelleseitenanzahl() {
        System.out.println("getAktuelleseitenanzahl");
        pdfviewerBean instance = new pdfviewerBean();
        int expResult = 0;
        int result = instance.getAktuelleseitenanzahl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAktuelleseitenanzahl method, of class pdfviewerBean.
     */
    @Test
    public void testSetAktuelleseitenanzahl() {
        System.out.println("setAktuelleseitenanzahl");
        int aktuelleseitenanzahl = 0;
        pdfviewerBean instance = new pdfviewerBean();
        instance.setAktuelleseitenanzahl(aktuelleseitenanzahl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVarseitenanzahl method, of class pdfviewerBean.
     */
    @Test
    public void testGetVarseitenanzahl() {
        System.out.println("getVarseitenanzahl");
        pdfviewerBean instance = new pdfviewerBean();
        String expResult = "";
        String result = instance.getVarseitenanzahl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVarseitenanzahl method, of class pdfviewerBean.
     */
    @Test
    public void testSetVarseitenanzahl() {
        System.out.println("setVarseitenanzahl");
        String varseitenanzahl = "";
        pdfviewerBean instance = new pdfviewerBean();
        instance.setVarseitenanzahl(varseitenanzahl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage_pfad method, of class pdfviewerBean.
     */
    @Test
    public void testGetImage_pfad() {
        System.out.println("getImage_pfad");
        pdfviewerBean instance = new pdfviewerBean();
        String expResult = "";
        String result = instance.getImage_pfad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage_pfad method, of class pdfviewerBean.
     */
    @Test
    public void testSetImage_pfad() {
        System.out.println("setImage_pfad");
        String image_pfad = "";
        pdfviewerBean instance = new pdfviewerBean();
        instance.setImage_pfad(image_pfad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPdf method, of class pdfviewerBean.
     */
    @Test
    public void testGetPdf() {
        System.out.println("getPdf");
        pdfviewerBean instance = new pdfviewerBean();
        String expResult = "";
        String result = instance.getPdf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPdf method, of class pdfviewerBean.
     */
    @Test
    public void testSetPdf() {
        System.out.println("setPdf");
        String pdf = "";
        pdfviewerBean instance = new pdfviewerBean();
        instance.setPdf(pdf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServer_diplomarbeit_pfad method, of class pdfviewerBean.
     */
    @Test
    public void testGetServer_diplomarbeit_pfad() {
        System.out.println("getServer_diplomarbeit_pfad");
        pdfviewerBean instance = new pdfviewerBean();
        String expResult = "";
        String result = instance.getServer_diplomarbeit_pfad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServer_diplomarbeit_pfad method, of class pdfviewerBean.
     */
    @Test
    public void testSetServer_diplomarbeit_pfad() {
        System.out.println("setServer_diplomarbeit_pfad");
        String server_diplomarbeit_pfad = "";
        pdfviewerBean instance = new pdfviewerBean();
        instance.setServer_diplomarbeit_pfad(server_diplomarbeit_pfad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diplomarbeitansehen method, of class pdfviewerBean.
     */
    @Test
    public void testDiplomarbeitansehen() throws Exception {
        System.out.println("diplomarbeitansehen");
        Diplomarbeit diplomarbeit = null;
        pdfviewerBean instance = new pdfviewerBean();
        String expResult = "";
        String result = instance.diplomarbeitansehen(diplomarbeit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
