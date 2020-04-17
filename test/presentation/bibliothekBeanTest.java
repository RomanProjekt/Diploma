/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import infrastructure.DiplomarbeitDAO;
import java.sql.Blob;
import java.util.List;
import javax.faces.event.ActionEvent;
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
public class bibliothekBeanTest {
    
    public bibliothekBeanTest() {
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
     * Test of getSumme method, of class bibliothekBean.
     */
    @Test
    public void testGetSumme() {
        System.out.println("getSumme");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getSumme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSumme method, of class bibliothekBean.
     */
    @Test
    public void testSetSumme() {
        System.out.println("setSumme");
        String summe = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setSumme(summe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class bibliothekBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        bibliothekBean instance = new bibliothekBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDipDAO method, of class bibliothekBean.
     */
    @Test
    public void testGetDipDAO() {
        System.out.println("getDipDAO");
        bibliothekBean instance = new bibliothekBean();
        DiplomarbeitDAO expResult = null;
        DiplomarbeitDAO result = instance.getDipDAO();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDipDAO method, of class bibliothekBean.
     */
    @Test
    public void testSetDipDAO() {
        System.out.println("setDipDAO");
        DiplomarbeitDAO dipDAO = null;
        bibliothekBean instance = new bibliothekBean();
        instance.setDipDAO(dipDAO);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsFromIndex method, of class bibliothekBean.
     */
    @Test
    public void testIsIsFromIndex() {
        System.out.println("isIsFromIndex");
        bibliothekBean instance = new bibliothekBean();
        boolean expResult = false;
        boolean result = instance.isIsFromIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsFromIndex method, of class bibliothekBean.
     */
    @Test
    public void testSetIsFromIndex() {
        System.out.println("setIsFromIndex");
        boolean isFromIndex = false;
        bibliothekBean instance = new bibliothekBean();
        instance.setIsFromIndex(isFromIndex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsFromBibliothek method, of class bibliothekBean.
     */
    @Test
    public void testIsIsFromBibliothek() {
        System.out.println("isIsFromBibliothek");
        bibliothekBean instance = new bibliothekBean();
        boolean expResult = false;
        boolean result = instance.isIsFromBibliothek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsFromBibliothek method, of class bibliothekBean.
     */
    @Test
    public void testSetIsFromBibliothek() {
        System.out.println("setIsFromBibliothek");
        boolean isFromBibliothek = false;
        bibliothekBean instance = new bibliothekBean();
        instance.setIsFromBibliothek(isFromBibliothek);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiplist method, of class bibliothekBean.
     */
    @Test
    public void testGetDiplist() {
        System.out.println("getDiplist");
        bibliothekBean instance = new bibliothekBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.getDiplist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiplist method, of class bibliothekBean.
     */
    @Test
    public void testSetDiplist() {
        System.out.println("setDiplist");
        List<Diplomarbeit> diplist = null;
        bibliothekBean instance = new bibliothekBean();
        instance.setDiplist(diplist);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitel method, of class bibliothekBean.
     */
    @Test
    public void testGetTitel() {
        System.out.println("getTitel");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getTitel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitel method, of class bibliothekBean.
     */
    @Test
    public void testSetTitel() {
        System.out.println("setTitel");
        String titel = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setTitel(titel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class bibliothekBean.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class bibliothekBean.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class bibliothekBean.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class bibliothekBean.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeech method, of class bibliothekBean.
     */
    @Test
    public void testGetSpeech() {
        System.out.println("getSpeech");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getSpeech();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeech method, of class bibliothekBean.
     */
    @Test
    public void testSetSpeech() {
        System.out.println("setSpeech");
        String speech = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setSpeech(speech);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFachgebiet method, of class bibliothekBean.
     */
    @Test
    public void testGetFachgebiet() {
        System.out.println("getFachgebiet");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getFachgebiet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFachgebiet method, of class bibliothekBean.
     */
    @Test
    public void testSetFachgebiet() {
        System.out.println("setFachgebiet");
        String fachgebiet = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setFachgebiet(fachgebiet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchlagwort method, of class bibliothekBean.
     */
    @Test
    public void testGetSchlagwort() {
        System.out.println("getSchlagwort");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getSchlagwort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchlagwort method, of class bibliothekBean.
     */
    @Test
    public void testSetSchlagwort() {
        System.out.println("setSchlagwort");
        String schlagwort = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setSchlagwort(schlagwort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class bibliothekBean.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        bibliothekBean instance = new bibliothekBean();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class bibliothekBean.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        bibliothekBean instance = new bibliothekBean();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZahl method, of class bibliothekBean.
     */
    @Test
    public void testGetZahl() {
        System.out.println("getZahl");
        bibliothekBean instance = new bibliothekBean();
        int expResult = 0;
        int result = instance.getZahl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZahl method, of class bibliothekBean.
     */
    @Test
    public void testSetZahl() {
        System.out.println("setZahl");
        int zahl = 0;
        bibliothekBean instance = new bibliothekBean();
        instance.setZahl(zahl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDa_id method, of class bibliothekBean.
     */
    @Test
    public void testGetDa_id() {
        System.out.println("getDa_id");
        bibliothekBean instance = new bibliothekBean();
        int expResult = 0;
        int result = instance.getDa_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDa_id method, of class bibliothekBean.
     */
    @Test
    public void testSetDa_id() {
        System.out.println("setDa_id");
        int da_id = 0;
        bibliothekBean instance = new bibliothekBean();
        instance.setDa_id(da_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class bibliothekBean.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class bibliothekBean.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor_id method, of class bibliothekBean.
     */
    @Test
    public void testGetAutor_id() {
        System.out.println("getAutor_id");
        bibliothekBean instance = new bibliothekBean();
        int expResult = 0;
        int result = instance.getAutor_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor_id method, of class bibliothekBean.
     */
    @Test
    public void testSetAutor_id() {
        System.out.println("setAutor_id");
        int autor_id = 0;
        bibliothekBean instance = new bibliothekBean();
        instance.setAutor_id(autor_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSw_id method, of class bibliothekBean.
     */
    @Test
    public void testGetSw_id() {
        System.out.println("getSw_id");
        bibliothekBean instance = new bibliothekBean();
        int expResult = 0;
        int result = instance.getSw_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSw_id method, of class bibliothekBean.
     */
    @Test
    public void testSetSw_id() {
        System.out.println("setSw_id");
        int sw_id = 0;
        bibliothekBean instance = new bibliothekBean();
        instance.setSw_id(sw_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPdf method, of class bibliothekBean.
     */
    @Test
    public void testGetPdf() {
        System.out.println("getPdf");
        bibliothekBean instance = new bibliothekBean();
        Blob expResult = null;
        Blob result = instance.getPdf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPdf method, of class bibliothekBean.
     */
    @Test
    public void testSetPdf() {
        System.out.println("setPdf");
        Blob pdf = null;
        bibliothekBean instance = new bibliothekBean();
        instance.setPdf(pdf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser_id method, of class bibliothekBean.
     */
    @Test
    public void testGetUser_id() {
        System.out.println("getUser_id");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getUser_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser_id method, of class bibliothekBean.
     */
    @Test
    public void testSetUser_id() {
        System.out.println("setUser_id");
        String user_id = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setUser_id(user_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatum method, of class bibliothekBean.
     */
    @Test
    public void testGetDatum() {
        System.out.println("getDatum");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getDatum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatum method, of class bibliothekBean.
     */
    @Test
    public void testSetDatum() {
        System.out.println("setDatum");
        String datum = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setDatum(datum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBild method, of class bibliothekBean.
     */
    @Test
    public void testGetBild() {
        System.out.println("getBild");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getBild();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBild method, of class bibliothekBean.
     */
    @Test
    public void testSetBild() {
        System.out.println("setBild");
        String bild = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setBild(bild);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDa method, of class bibliothekBean.
     */
    @Test
    public void testGetDa() {
        System.out.println("getDa");
        bibliothekBean instance = new bibliothekBean();
        DiplomarbeitDAO expResult = null;
        DiplomarbeitDAO result = instance.getDa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDa method, of class bibliothekBean.
     */
    @Test
    public void testSetDa() {
        System.out.println("setDa");
        DiplomarbeitDAO da = null;
        bibliothekBean instance = new bibliothekBean();
        instance.setDa(da);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlldiplomarbeiten method, of class bibliothekBean.
     */
    @Test
    public void testGetAlldiplomarbeiten() {
        System.out.println("getAlldiplomarbeiten");
        bibliothekBean instance = new bibliothekBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.getAlldiplomarbeiten();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlldiplomarbeiten method, of class bibliothekBean.
     */
    @Test
    public void testSetAlldiplomarbeiten() {
        System.out.println("setAlldiplomarbeiten");
        List<Diplomarbeit> alldiplomarbeiten = null;
        bibliothekBean instance = new bibliothekBean();
        instance.setAlldiplomarbeiten(alldiplomarbeiten);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAktuelleseitenanzahl method, of class bibliothekBean.
     */
    @Test
    public void testGetAktuelleseitenanzahl() {
        System.out.println("getAktuelleseitenanzahl");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getAktuelleseitenanzahl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAktuelleseitenanzahl method, of class bibliothekBean.
     */
    @Test
    public void testSetAktuelleseitenanzahl() {
        System.out.println("setAktuelleseitenanzahl");
        String aktuelleseitenanzahl = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setAktuelleseitenanzahl(aktuelleseitenanzahl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPfad method, of class bibliothekBean.
     */
    @Test
    public void testGetPfad() {
        System.out.println("getPfad");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getPfad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPfad method, of class bibliothekBean.
     */
    @Test
    public void testSetPfad() {
        System.out.println("setPfad");
        String pfad = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setPfad(pfad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeitenanzahl method, of class bibliothekBean.
     */
    @Test
    public void testGetSeitenanzahl() {
        System.out.println("getSeitenanzahl");
        bibliothekBean instance = new bibliothekBean();
        int expResult = 0;
        int result = instance.getSeitenanzahl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeitenanzahl method, of class bibliothekBean.
     */
    @Test
    public void testSetSeitenanzahl() {
        System.out.println("setSeitenanzahl");
        int seitenanzahl = 0;
        bibliothekBean instance = new bibliothekBean();
        instance.setSeitenanzahl(seitenanzahl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAktuellerBenutzer method, of class bibliothekBean.
     */
    @Test
    public void testGetAktuellerBenutzer() {
        System.out.println("getAktuellerBenutzer");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getAktuellerBenutzer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAktuellerBenutzer method, of class bibliothekBean.
     */
    @Test
    public void testSetAktuellerBenutzer() {
        System.out.println("setAktuellerBenutzer");
        String aktuellerBenutzer = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setAktuellerBenutzer(aktuellerBenutzer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllindexList method, of class bibliothekBean.
     */
    @Test
    public void testGetAllindexList() {
        System.out.println("getAllindexList");
        bibliothekBean instance = new bibliothekBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.getAllindexList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAllindexList method, of class bibliothekBean.
     */
    @Test
    public void testSetAllindexList() {
        System.out.println("setAllindexList");
        List<Diplomarbeit> allindexList = null;
        bibliothekBean instance = new bibliothekBean();
        instance.setAllindexList(allindexList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aktullerBenutzer method, of class bibliothekBean.
     */
    @Test
    public void testAktullerBenutzer() {
        System.out.println("aktullerBenutzer");
        bibliothekBean instance = new bibliothekBean();
        instance.aktullerBenutzer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFromBiblothek method, of class bibliothekBean.
     */
    @Test
    public void testIsFromBiblothek() {
        System.out.println("isFromBiblothek");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.isFromBiblothek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FromBibliothek method, of class bibliothekBean.
     */
    @Test
    public void testFromBibliothek() {
        System.out.println("FromBibliothek");
        ActionEvent event = null;
        bibliothekBean instance = new bibliothekBean();
        instance.FromBibliothek(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FromIndex method, of class bibliothekBean.
     */
    @Test
    public void testFromIndex() {
        System.out.println("FromIndex");
        ActionEvent event = null;
        String key = "";
        bibliothekBean instance = new bibliothekBean();
        instance.FromIndex(event, key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of forward method, of class bibliothekBean.
     */
    @Test
    public void testForward() {
        System.out.println("forward");
        ActionEvent event = null;
        bibliothekBean instance = new bibliothekBean();
        instance.forward(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of back method, of class bibliothekBean.
     */
    @Test
    public void testBack() {
        System.out.println("back");
        ActionEvent event = null;
        bibliothekBean instance = new bibliothekBean();
        instance.back(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of berechnenMaxSeitenanzahl method, of class bibliothekBean.
     */
    @Test
    public void testBerechnenMaxSeitenanzahl() {
        System.out.println("berechnenMaxSeitenanzahl");
        List<Diplomarbeit> diplist = null;
        bibliothekBean instance = new bibliothekBean();
        int expResult = 0;
        int result = instance.berechnenMaxSeitenanzahl(diplist);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeitenzahl method, of class bibliothekBean.
     */
    @Test
    public void testGetSeitenzahl() {
        System.out.println("getSeitenzahl");
        bibliothekBean instance = new bibliothekBean();
        String expResult = "";
        String result = instance.getSeitenzahl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeitenzahl method, of class bibliothekBean.
     */
    @Test
    public void testSetSeitenzahl() {
        System.out.println("setSeitenzahl");
        String seitenzahl = "";
        bibliothekBean instance = new bibliothekBean();
        instance.setSeitenzahl(seitenzahl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeitenList method, of class bibliothekBean.
     */
    @Test
    public void testGetSeitenList() {
        System.out.println("getSeitenList");
        bibliothekBean instance = new bibliothekBean();
        List<bibliothekBean.Seitenzahl> expResult = null;
        List<bibliothekBean.Seitenzahl> result = instance.getSeitenList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeitenList method, of class bibliothekBean.
     */
    @Test
    public void testSetSeitenList() {
        System.out.println("setSeitenList");
        List<bibliothekBean.Seitenzahl> seitenList = null;
        bibliothekBean instance = new bibliothekBean();
        instance.setSeitenList(seitenList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showBibDiplomarbeit method, of class bibliothekBean.
     */
    @Test
    public void testShowBibDiplomarbeit() {
        System.out.println("showBibDiplomarbeit");
        int seitenanzahl = 0;
        List<Diplomarbeit> dibList = null;
        bibliothekBean instance = new bibliothekBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.showBibDiplomarbeit(seitenanzahl, dibList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showIndexDiplomarbeit method, of class bibliothekBean.
     */
    @Test
    public void testShowIndexDiplomarbeit() {
        System.out.println("showIndexDiplomarbeit");
        int seitenanzahl = 0;
        List<Diplomarbeit> allindexList = null;
        bibliothekBean instance = new bibliothekBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.showIndexDiplomarbeit(seitenanzahl, allindexList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SeitenanzahlLink method, of class bibliothekBean.
     */
    @Test
    public void testSeitenanzahlLink() {
        System.out.println("SeitenanzahlLink");
        ActionEvent event = null;
        int seitenanzahl = 0;
        bibliothekBean instance = new bibliothekBean();
        instance.SeitenanzahlLink(event, seitenanzahl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showIndexDiplomarbeitLink method, of class bibliothekBean.
     */
    @Test
    public void testShowIndexDiplomarbeitLink() {
        System.out.println("showIndexDiplomarbeitLink");
        int seitenanzahl = 0;
        bibliothekBean instance = new bibliothekBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.showIndexDiplomarbeitLink(seitenanzahl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showBibDiplomarbeitLink method, of class bibliothekBean.
     */
    @Test
    public void testShowBibDiplomarbeitLink() {
        System.out.println("showBibDiplomarbeitLink");
        int seitenanzahl = 0;
        bibliothekBean instance = new bibliothekBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.showBibDiplomarbeitLink(seitenanzahl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
