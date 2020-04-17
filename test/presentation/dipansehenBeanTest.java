/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.awt.event.ActionEvent;
import java.sql.Date;
import java.time.LocalTime;
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
public class dipansehenBeanTest {
    
    public dipansehenBeanTest() {
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
     * Test of init method, of class dipansehenBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        dipansehenBean instance = new dipansehenBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitel method, of class dipansehenBean.
     */
    @Test
    public void testGetTitel() {
        System.out.println("getTitel");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.getTitel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitel method, of class dipansehenBean.
     */
    @Test
    public void testSetTitel() {
        System.out.println("setTitel");
        String Titel = "";
        dipansehenBean instance = new dipansehenBean();
        instance.setTitel(Titel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class dipansehenBean.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class dipansehenBean.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "";
        dipansehenBean instance = new dipansehenBean();
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchule method, of class dipansehenBean.
     */
    @Test
    public void testGetSchule() {
        System.out.println("getSchule");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.getSchule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchule method, of class dipansehenBean.
     */
    @Test
    public void testSetSchule() {
        System.out.println("setSchule");
        String schule = "";
        dipansehenBean instance = new dipansehenBean();
        instance.setSchule(schule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class dipansehenBean.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        dipansehenBean instance = new dipansehenBean();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class dipansehenBean.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        dipansehenBean instance = new dipansehenBean();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButtonId method, of class dipansehenBean.
     */
    @Test
    public void testGetButtonId() {
        System.out.println("getButtonId");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.getButtonId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButtonId method, of class dipansehenBean.
     */
    @Test
    public void testSetButtonId() {
        System.out.println("setButtonId");
        String buttonId = "";
        dipansehenBean instance = new dipansehenBean();
        instance.setButtonId(buttonId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class dipansehenBean.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class dipansehenBean.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        String result_2 = "";
        dipansehenBean instance = new dipansehenBean();
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeitenanzahl method, of class dipansehenBean.
     */
    @Test
    public void testGetSeitenanzahl() {
        System.out.println("getSeitenanzahl");
        dipansehenBean instance = new dipansehenBean();
        int expResult = 0;
        int result = instance.getSeitenanzahl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeitenanzahl method, of class dipansehenBean.
     */
    @Test
    public void testSetSeitenanzahl() {
        System.out.println("setSeitenanzahl");
        int seitenanzahl = 0;
        dipansehenBean instance = new dipansehenBean();
        instance.setSeitenanzahl(seitenanzahl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagepath method, of class dipansehenBean.
     */
    @Test
    public void testGetImagepath() {
        System.out.println("getImagepath");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.getImagepath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagepath method, of class dipansehenBean.
     */
    @Test
    public void testSetImagepath() {
        System.out.println("setImagepath");
        String imagepath = "";
        dipansehenBean instance = new dipansehenBean();
        instance.setImagepath(imagepath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAktuelle_id method, of class dipansehenBean.
     */
    @Test
    public void testGetAktuelle_id() {
        System.out.println("getAktuelle_id");
        dipansehenBean instance = new dipansehenBean();
        int expResult = 0;
        int result = instance.getAktuelle_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAktuelle_id method, of class dipansehenBean.
     */
    @Test
    public void testSetAktuelle_id() {
        System.out.println("setAktuelle_id");
        int aktuelle_id = 0;
        dipansehenBean instance = new dipansehenBean();
        instance.setAktuelle_id(aktuelle_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBildnamegleich method, of class dipansehenBean.
     */
    @Test
    public void testGetBildnamegleich() {
        System.out.println("getBildnamegleich");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.getBildnamegleich();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBildnamegleich method, of class dipansehenBean.
     */
    @Test
    public void testSetBildnamegleich() {
        System.out.println("setBildnamegleich");
        String bildnamegleich = "";
        dipansehenBean instance = new dipansehenBean();
        instance.setBildnamegleich(bildnamegleich);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPdfnamegleich method, of class dipansehenBean.
     */
    @Test
    public void testGetPdfnamegleich() {
        System.out.println("getPdfnamegleich");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.getPdfnamegleich();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPdfnamegleich method, of class dipansehenBean.
     */
    @Test
    public void testSetPdfnamegleich() {
        System.out.println("setPdfnamegleich");
        String pdfnamegleich = "";
        dipansehenBean instance = new dipansehenBean();
        instance.setPdfnamegleich(pdfnamegleich);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAktDip method, of class dipansehenBean.
     */
    @Test
    public void testGetAktDip() {
        System.out.println("getAktDip");
        dipansehenBean instance = new dipansehenBean();
        Diplomarbeit expResult = null;
        Diplomarbeit result = instance.getAktDip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAktDip method, of class dipansehenBean.
     */
    @Test
    public void testSetAktDip() {
        System.out.println("setAktDip");
        Diplomarbeit aktDip = null;
        dipansehenBean instance = new dipansehenBean();
        instance.setAktDip(aktDip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class dipansehenBean.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        dipansehenBean instance = new dipansehenBean();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class dipansehenBean.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        dipansehenBean instance = new dipansehenBean();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClick_count method, of class dipansehenBean.
     */
    @Test
    public void testGetClick_count() {
        System.out.println("getClick_count");
        dipansehenBean instance = new dipansehenBean();
        int expResult = 0;
        int result = instance.getClick_count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClick_count method, of class dipansehenBean.
     */
    @Test
    public void testSetClick_count() {
        System.out.println("setClick_count");
        int click_count = 0;
        dipansehenBean instance = new dipansehenBean();
        instance.setClick_count(click_count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDownload_count method, of class dipansehenBean.
     */
    @Test
    public void testGetDownload_count() {
        System.out.println("getDownload_count");
        dipansehenBean instance = new dipansehenBean();
        int expResult = 0;
        int result = instance.getDownload_count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDownload_count method, of class dipansehenBean.
     */
    @Test
    public void testSetDownload_count() {
        System.out.println("setDownload_count");
        int download_count = 0;
        dipansehenBean instance = new dipansehenBean();
        instance.setDownload_count(download_count);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateBefore method, of class dipansehenBean.
     */
    @Test
    public void testGetDateBefore() {
        System.out.println("getDateBefore");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.getDateBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateBefore method, of class dipansehenBean.
     */
    @Test
    public void testSetDateBefore() {
        System.out.println("setDateBefore");
        String DateBefore = "";
        dipansehenBean instance = new dipansehenBean();
        instance.setDateBefore(DateBefore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeBefore method, of class dipansehenBean.
     */
    @Test
    public void testGetTimeBefore() {
        System.out.println("getTimeBefore");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.getTimeBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeBefore method, of class dipansehenBean.
     */
    @Test
    public void testSetTimeBefore() {
        System.out.println("setTimeBefore");
        String TimeBefore = "";
        dipansehenBean instance = new dipansehenBean();
        instance.setTimeBefore(TimeBefore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isResetcounter method, of class dipansehenBean.
     */
    @Test
    public void testIsResetcounter() {
        System.out.println("isResetcounter");
        dipansehenBean instance = new dipansehenBean();
        boolean expResult = false;
        boolean result = instance.isResetcounter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResetcounter method, of class dipansehenBean.
     */
    @Test
    public void testSetResetcounter() {
        System.out.println("setResetcounter");
        boolean resetcounter = false;
        dipansehenBean instance = new dipansehenBean();
        instance.setResetcounter(resetcounter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of werteanzeigen method, of class dipansehenBean.
     */
    @Test
    public void testWerteanzeigen() {
        System.out.println("werteanzeigen");
        Diplomarbeit dip = null;
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.werteanzeigen(dip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NowDayBefore method, of class dipansehenBean.
     */
    @Test
    public void testNowDayBefore() {
        System.out.println("NowDayBefore");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.NowDayBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NowYearLocalBefore method, of class dipansehenBean.
     */
    @Test
    public void testNowYearLocalBefore() {
        System.out.println("NowYearLocalBefore");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.NowYearLocalBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NowTimeBefore method, of class dipansehenBean.
     */
    @Test
    public void testNowTimeBefore() {
        System.out.println("NowTimeBefore");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.NowTimeBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NowTimeLocalBefore method, of class dipansehenBean.
     */
    @Test
    public void testNowTimeLocalBefore() {
        System.out.println("NowTimeLocalBefore");
        dipansehenBean instance = new dipansehenBean();
        LocalTime expResult = null;
        LocalTime result = instance.NowTimeLocalBefore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DateBeforFormat method, of class dipansehenBean.
     */
    @Test
    public void testDateBeforFormat() {
        System.out.println("DateBeforFormat");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.DateBeforFormat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ResetCounter method, of class dipansehenBean.
     */
    @Test
    public void testResetCounter() {
        System.out.println("ResetCounter");
        dipansehenBean instance = new dipansehenBean();
        boolean expResult = false;
        boolean result = instance.ResetCounter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of click_count_diplomarbeit method, of class dipansehenBean.
     */
    @Test
    public void testClick_count_diplomarbeit() {
        System.out.println("click_count_diplomarbeit");
        Diplomarbeit dip = null;
        dipansehenBean instance = new dipansehenBean();
        instance.click_count_diplomarbeit(dip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of download_count method, of class dipansehenBean.
     */
    @Test
    public void testDownload_count() {
        System.out.println("download_count");
        dipansehenBean instance = new dipansehenBean();
        instance.download_count();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readClickCount method, of class dipansehenBean.
     */
    @Test
    public void testReadClickCount() {
        System.out.println("readClickCount");
        Diplomarbeit dip = null;
        dipansehenBean instance = new dipansehenBean();
        int expResult = 0;
        int result = instance.readClickCount(dip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDownloadCount method, of class dipansehenBean.
     */
    @Test
    public void testReadDownloadCount() {
        System.out.println("readDownloadCount");
        Diplomarbeit dip = null;
        dipansehenBean instance = new dipansehenBean();
        int expResult = 0;
        int result = instance.readDownloadCount(dip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of download method, of class dipansehenBean.
     */
    @Test
    public void testDownload() throws Exception {
        System.out.println("download");
        dipansehenBean instance = new dipansehenBean();
        Object expResult = null;
        Object result = instance.download();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imagepath_auslesen method, of class dipansehenBean.
     */
    @Test
    public void testImagepath_auslesen() {
        System.out.println("imagepath_auslesen");
        int id = 0;
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.imagepath_auslesen(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bildanzeigen method, of class dipansehenBean.
     */
    @Test
    public void testBildanzeigen() {
        System.out.println("bildanzeigen");
        dipansehenBean instance = new dipansehenBean();
        String expResult = "";
        String result = instance.bildanzeigen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of speichern method, of class dipansehenBean.
     */
    @Test
    public void testSpeichern() {
        System.out.println("speichern");
        dipansehenBean instance = new dipansehenBean();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of löschenDiplomarbeit method, of class dipansehenBean.
     */
    @Test
    public void testLöschenDiplomarbeit() {
        System.out.println("l\u00f6schenDiplomarbeit");
        ActionEvent event = null;
        dipansehenBean instance = new dipansehenBean();
        instance.löschenDiplomarbeit(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diplomarbeitansehen method, of class dipansehenBean.
     */
    @Test
    public void testDiplomarbeitansehen() {
        System.out.println("diplomarbeitansehen");
        Diplomarbeit dip = null;
        dipansehenBean instance = new dipansehenBean();
        instance.diplomarbeitansehen(dip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
