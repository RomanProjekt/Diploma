///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package presentation;
//
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//import javax.servlet.http.Part;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import pojo.Autor;
//import pojo.Diplomarbeit;
//import pojo.Schlagwort;
//import pojo.Schule;
//import service.DatabaseManagerService;
//
///**
// *
// * @author hp
// */
//public class uploadBeanTest {
//    
//    public uploadBeanTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of isAddmainautor method, of class uploadBean.
//     */
//    @Test
//    public void testIsAddmainautor() {
//        System.out.println("isAddmainautor");
//        uploadBean instance = new uploadBean();
//        boolean expResult = false;
//        boolean result = instance.isAddmainautor();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAddmainautor method, of class uploadBean.
//     */
//    @Test
//    public void testSetAddmainautor() {
//        System.out.println("setAddmainautor");
//        boolean addmainautor = false;
//        uploadBean instance = new uploadBean();
//        instance.setAddmainautor(addmainautor);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isAddfirstautor method, of class uploadBean.
//     */
//    @Test
//    public void testIsAddfirstautor() {
//        System.out.println("isAddfirstautor");
//        uploadBean instance = new uploadBean();
//        boolean expResult = false;
//        boolean result = instance.isAddfirstautor();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAddfirstautor method, of class uploadBean.
//     */
//    @Test
//    public void testSetAddfirstautor() {
//        System.out.println("setAddfirstautor");
//        boolean addfirstautor = false;
//        uploadBean instance = new uploadBean();
//        instance.setAddfirstautor(addfirstautor);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of init method, of class uploadBean.
//     */
//    @Test
//    public void testInit() {
//        System.out.println("init");
//        uploadBean instance = new uploadBean();
//        instance.init();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addAutor method, of class uploadBean.
//     */
//    @Test
//    public void testAddAutor() {
//        System.out.println("addAutor");
//        uploadBean instance = new uploadBean();
//        Object expResult = null;
////        Object result = instance.addAutor();
////        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of editAutor method, of class uploadBean.
//     */
//    @Test
//    public void testEditAutor() {
//        System.out.println("editAutor");
//        Autor autor = null;
//        uploadBean instance = new uploadBean();
//        Object expResult = null;
//        Object result = instance.editAutor(autor);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeAutor method, of class uploadBean.
//     */
//    @Test
//    public void testRemoveAutor() {
//        System.out.println("removeAutor");
//        Autor autor = null;
//        uploadBean instance = new uploadBean();
//        Object expResult = null;
//        Object result = instance.removeAutor(autor);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addSchlagwort method, of class uploadBean.
//     */
//    @Test
//    public void testAddSchlagwort() {
//        System.out.println("addSchlagwort");
//        uploadBean instance = new uploadBean();
//        Object expResult = null;
//        Object result = instance.addSchlagwort();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeSchlagwort method, of class uploadBean.
//     */
//    @Test
//    public void testRemoveSchlagwort() {
//        System.out.println("removeSchlagwort");
//        Schlagwort schlagwort = null;
//        uploadBean instance = new uploadBean();
//        Object expResult = null;
//        Object result = instance.removeSchlagwort(schlagwort);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDatum method, of class uploadBean.
//     */
//    @Test
//    public void testGetDatum() {
//        System.out.println("getDatum");
//        uploadBean instance = new uploadBean();
//        Date expResult = null;
//        Date result = instance.getDatum();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDatum method, of class uploadBean.
//     */
//    @Test
//    public void testSetDatum() {
//        System.out.println("setDatum");
//        Date datum = null;
//        uploadBean instance = new uploadBean();
//        instance.setDatum(datum);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRealSchule method, of class uploadBean.
//     */
//    @Test
//    public void testGetRealSchule() {
//        System.out.println("getRealSchule");
//        uploadBean instance = new uploadBean();
//        Schule expResult = null;
//        Schule result = instance.getRealSchule();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setRealSchule method, of class uploadBean.
//     */
//    @Test
//    public void testSetRealSchule() {
//        System.out.println("setRealSchule");
//        Schule realSchule = null;
//        uploadBean instance = new uploadBean();
//        instance.setRealSchule(realSchule);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSchulList method, of class uploadBean.
//     */
//    @Test
//    public void testGetSchulList() {
//        System.out.println("getSchulList");
//        uploadBean instance = new uploadBean();
//        List<Schule> expResult = null;
//        List<Schule> result = instance.getSchulList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSchulList method, of class uploadBean.
//     */
//    @Test
//    public void testSetSchulList() {
//        System.out.println("setSchulList");
//        List<Schule> schulList = null;
//        uploadBean instance = new uploadBean();
//        instance.setSchulList(schulList);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTitel method, of class uploadBean.
//     */
//    @Test
//    public void testGetTitel() {
//        System.out.println("getTitel");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getTitel();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTitel method, of class uploadBean.
//     */
//    @Test
//    public void testSetTitel() {
//        System.out.println("setTitel");
//        String titel = "";
//        uploadBean instance = new uploadBean();
//        instance.setTitel(titel);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAutor method, of class uploadBean.
//     */
//    @Test
//    public void testGetAutor() {
//        System.out.println("getAutor");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getAutor();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAutor method, of class uploadBean.
//     */
//    @Test
//    public void testSetAutor() {
//        System.out.println("setAutor");
//        String autor = "";
//        uploadBean instance = new uploadBean();
//        instance.setAutor(autor);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSchule method, of class uploadBean.
//     */
//    @Test
//    public void testGetSchule() {
//        System.out.println("getSchule");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getSchule();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSchule method, of class uploadBean.
//     */
//    @Test
//    public void testSetSchule() {
//        System.out.println("setSchule");
//        String schule = "";
//        uploadBean instance = new uploadBean();
//        instance.setSchule(schule);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSchlagwort method, of class uploadBean.
//     */
//    @Test
//    public void testGetSchlagwort() {
//        System.out.println("getSchlagwort");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getSchlagwort();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSchlagwort method, of class uploadBean.
//     */
//    @Test
//    public void testSetSchlagwort() {
//        System.out.println("setSchlagwort");
//        String schlagwort = "";
//        uploadBean instance = new uploadBean();
//        instance.setSchlagwort(schlagwort);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDiplomarbeit method, of class uploadBean.
//     */
//    @Test
//    public void testGetDiplomarbeit() {
//        System.out.println("getDiplomarbeit");
//        uploadBean instance = new uploadBean();
//        Part expResult = null;
//        Part result = instance.getDiplomarbeit();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDiplomarbeit method, of class uploadBean.
//     */
//    @Test
//    public void testSetDiplomarbeit() {
//        System.out.println("setDiplomarbeit");
//        Part diplomarbeit = null;
//        uploadBean instance = new uploadBean();
//        instance.setDiplomarbeit(diplomarbeit);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getImage method, of class uploadBean.
//     */
//    @Test
//    public void testGetImage() {
//        System.out.println("getImage");
//        uploadBean instance = new uploadBean();
//        Part expResult = null;
//        Part result = instance.getImage();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setImage method, of class uploadBean.
//     */
//    @Test
//    public void testSetImage() {
//        System.out.println("setImage");
//        Part image = null;
//        uploadBean instance = new uploadBean();
//        instance.setImage(image);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDbService method, of class uploadBean.
//     */
//    @Test
//    public void testGetDbService() {
//        System.out.println("getDbService");
//        uploadBean instance = new uploadBean();
//        DatabaseManagerService expResult = null;
//        DatabaseManagerService result = instance.getDbService();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDbService method, of class uploadBean.
//     */
//    @Test
//    public void testSetDbService() {
//        System.out.println("setDbService");
//        DatabaseManagerService dbService = null;
//        uploadBean instance = new uploadBean();
//        instance.setDbService(dbService);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getResult method, of class uploadBean.
//     */
//    @Test
//    public void testGetResult() {
//        System.out.println("getResult");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getResult();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setResult method, of class uploadBean.
//     */
//    @Test
//    public void testSetResult() {
//        System.out.println("setResult");
//        String result_2 = "";
//        uploadBean instance = new uploadBean();
//        instance.setResult(result_2);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPdfpath method, of class uploadBean.
//     */
//    @Test
//    public void testGetPdfpath() {
//        System.out.println("getPdfpath");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getPdfpath();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPdfpath method, of class uploadBean.
//     */
//    @Test
//    public void testSetPdfpath() {
//        System.out.println("setPdfpath");
//        String pdfpath = "";
//        uploadBean instance = new uploadBean();
//        instance.setPdfpath(pdfpath);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getImagepath method, of class uploadBean.
//     */
//    @Test
//    public void testGetImagepath() {
//        System.out.println("getImagepath");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getImagepath();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setImagepath method, of class uploadBean.
//     */
//    @Test
//    public void testSetImagepath() {
//        System.out.println("setImagepath");
//        String imagepath = "";
//        uploadBean instance = new uploadBean();
//        instance.setImagepath(imagepath);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBilddatei_fail method, of class uploadBean.
//     */
//    @Test
//    public void testGetBilddatei_fail() {
//        System.out.println("getBilddatei_fail");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getBilddatei_fail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBilddatei_fail method, of class uploadBean.
//     */
//    @Test
//    public void testSetBilddatei_fail() {
//        System.out.println("setBilddatei_fail");
//        String bilddatei_fail = "";
//        uploadBean instance = new uploadBean();
//        instance.setBilddatei_fail(bilddatei_fail);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPdfdabei_fail method, of class uploadBean.
//     */
//    @Test
//    public void testGetPdfdabei_fail() {
//        System.out.println("getPdfdabei_fail");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getPdfdabei_fail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPdfdabei_fail method, of class uploadBean.
//     */
//    @Test
//    public void testSetPdfdabei_fail() {
//        System.out.println("setPdfdabei_fail");
//        String pdfdabei_fail = "";
//        uploadBean instance = new uploadBean();
//        instance.setPdfdabei_fail(pdfdabei_fail);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTitel_fail method, of class uploadBean.
//     */
//    @Test
//    public void testGetTitel_fail() {
//        System.out.println("getTitel_fail");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getTitel_fail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTitel_fail method, of class uploadBean.
//     */
//    @Test
//    public void testSetTitel_fail() {
//        System.out.println("setTitel_fail");
//        String titel_fail = "";
//        uploadBean instance = new uploadBean();
//        instance.setTitel_fail(titel_fail);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isEditAutor method, of class uploadBean.
//     */
//    @Test
//    public void testIsEditAutor() {
//        System.out.println("isEditAutor");
//        uploadBean instance = new uploadBean();
//        boolean expResult = false;
//        boolean result = instance.isEditAutor();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isEditSchlagwort method, of class uploadBean.
//     */
//    @Test
//    public void testIsEditSchlagwort() {
//        System.out.println("isEditSchlagwort");
//        uploadBean instance = new uploadBean();
//        boolean expResult = false;
//        boolean result = instance.isEditSchlagwort();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllSchlagwTypeahead method, of class uploadBean.
//     */
//    @Test
//    public void testGetAllSchlagwTypeahead() {
//        System.out.println("getAllSchlagwTypeahead");
//        uploadBean instance = new uploadBean();
//        List<String> expResult = null;
//        List<String> result = instance.getAllSchlagwTypeahead();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAllSchlagwMap method, of class uploadBean.
//     */
//    @Test
//    public void testGetAllSchlagwMap() {
//        System.out.println("getAllSchlagwMap");
//        uploadBean instance = new uploadBean();
//        Map<String, Integer> expResult = null;
//        Map<String, Integer> result = instance.getAllSchlagwMap();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAutList method, of class uploadBean.
//     */
//    @Test
//    public void testGetAutList() {
//        System.out.println("getAutList");
//        uploadBean instance = new uploadBean();
//        List<Autor> expResult = null;
//        List<Autor> result = instance.getAutList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSchlagList method, of class uploadBean.
//     */
//    @Test
//    public void testGetSchlagList() {
//        System.out.println("getSchlagList");
//        uploadBean instance = new uploadBean();
//        List<Schlagwort> expResult = null;
//        List<Schlagwort> result = instance.getSchlagList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getInsSchlagList method, of class uploadBean.
//     */
//    @Test
//    public void testGetInsSchlagList() {
//        System.out.println("getInsSchlagList");
//        uploadBean instance = new uploadBean();
//        List<Schlagwort> expResult = null;
//        List<Schlagwort> result = instance.getInsSchlagList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListautor method, of class uploadBean.
//     */
//    @Test
//    public void testGetListautor() {
//        System.out.println("getListautor");
//        uploadBean instance = new uploadBean();
//        List<Autor> expResult = null;
//        List<Autor> result = instance.getListautor();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getListdiplomarbeit method, of class uploadBean.
//     */
//    @Test
//    public void testGetListdiplomarbeit() {
//        System.out.println("getListdiplomarbeit");
//        uploadBean instance = new uploadBean();
//        List<Diplomarbeit> expResult = null;
//        List<Diplomarbeit> result = instance.getListdiplomarbeit();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEditAutor method, of class uploadBean.
//     */
//    @Test
//    public void testSetEditAutor() {
//        System.out.println("setEditAutor");
//        boolean editAutor = false;
//        uploadBean instance = new uploadBean();
//        instance.setEditAutor(editAutor);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEditSchlagwort method, of class uploadBean.
//     */
//    @Test
//    public void testSetEditSchlagwort() {
//        System.out.println("setEditSchlagwort");
//        boolean editSchlagwort = false;
//        uploadBean instance = new uploadBean();
//        instance.setEditSchlagwort(editSchlagwort);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAllSchlagwTypeahead method, of class uploadBean.
//     */
//    @Test
//    public void testSetAllSchlagwTypeahead() {
//        System.out.println("setAllSchlagwTypeahead");
//        List<String> allSchlagwTypeahead = null;
//        uploadBean instance = new uploadBean();
//        instance.setAllSchlagwTypeahead(allSchlagwTypeahead);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAllSchlagwMap method, of class uploadBean.
//     */
//    @Test
//    public void testSetAllSchlagwMap() {
//        System.out.println("setAllSchlagwMap");
//        Map<String, Integer> allSchlagwMap = null;
//        uploadBean instance = new uploadBean();
//        instance.setAllSchlagwMap(allSchlagwMap);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAutList method, of class uploadBean.
//     */
//    @Test
//    public void testSetAutList() {
//        System.out.println("setAutList");
//        List<Autor> autList = null;
//        uploadBean instance = new uploadBean();
//        instance.setAutList(autList);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSchlagList method, of class uploadBean.
//     */
//    @Test
//    public void testSetSchlagList() {
//        System.out.println("setSchlagList");
//        List<Schlagwort> schlagList = null;
//        uploadBean instance = new uploadBean();
//        instance.setSchlagList(schlagList);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setInsSchlagList method, of class uploadBean.
//     */
//    @Test
//    public void testSetInsSchlagList() {
//        System.out.println("setInsSchlagList");
//        List<Schlagwort> insSchlagList = null;
//        uploadBean instance = new uploadBean();
//        instance.setInsSchlagList(insSchlagList);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setListautor method, of class uploadBean.
//     */
//    @Test
//    public void testSetListautor() {
//        System.out.println("setListautor");
//        List<Autor> listautor = null;
//        uploadBean instance = new uploadBean();
//        instance.setListautor(listautor);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setListdiplomarbeit method, of class uploadBean.
//     */
//    @Test
//    public void testSetListdiplomarbeit() {
//        System.out.println("setListdiplomarbeit");
//        List<Diplomarbeit> listdiplomarbeit = null;
//        uploadBean instance = new uploadBean();
//        instance.setListdiplomarbeit(listdiplomarbeit);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDateiformat_fail method, of class uploadBean.
//     */
//    @Test
//    public void testGetDateiformat_fail() {
//        System.out.println("getDateiformat_fail");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getDateiformat_fail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDateiformat_fail method, of class uploadBean.
//     */
//    @Test
//    public void testSetDateiformat_fail() {
//        System.out.println("setDateiformat_fail");
//        String dateiformat_fail = "";
//        uploadBean instance = new uploadBean();
//        instance.setDateiformat_fail(dateiformat_fail);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDiplomarbeitenTitel_fail method, of class uploadBean.
//     */
//    @Test
//    public void testGetDiplomarbeitenTitel_fail() {
//        System.out.println("getDiplomarbeitenTitel_fail");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.getDiplomarbeitenTitel_fail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDiplomarbeitenTitel_fail method, of class uploadBean.
//     */
//    @Test
//    public void testSetDiplomarbeitenTitel_fail() {
//        System.out.println("setDiplomarbeitenTitel_fail");
//        String diplomarbeitenTitel_fail = "";
//        uploadBean instance = new uploadBean();
//        instance.setDiplomarbeitenTitel_fail(diplomarbeitenTitel_fail);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of upload_diplomarbeit method, of class uploadBean.
//     */
//    @Test
//    public void testUpload_diplomarbeit() throws Exception {
//        System.out.println("upload_diplomarbeit");
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.upload_diplomarbeit();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of saveImage method, of class uploadBean.
//     */
//    @Test
//    public void testSaveImage() {
//        System.out.println("saveImage");
//        String user_id = "";
//        String vartitel = "";
//        String submittedFileName = "";
//        Part varimage = null;
//        uploadBean instance = new uploadBean();
//        instance.saveImage(user_id, vartitel, submittedFileName, varimage);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of savePdfFile method, of class uploadBean.
//     */
//    @Test
//    public void testSavePdfFile() {
//        System.out.println("savePdfFile");
//        String filename = "";
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.savePdfFile(filename);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of titel_vergleichen method, of class uploadBean.
//     */
//    @Test
//    public void testTitel_vergleichen() {
//        System.out.println("titel_vergleichen");
//        String titel = "";
//        uploadBean instance = new uploadBean();
//        boolean expResult = false;
//        boolean result = instance.titel_vergleichen(titel);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of überprüfuen_Image_StandardFormat method, of class uploadBean.
//     */
//    @Test
//    public void testÜberprüfuen_Image_StandardFormat() {
//        System.out.println("\u00fcberpr\u00fcfuen_Image_StandardFormat");
//        String submittedFileName = "";
//        uploadBean instance = new uploadBean();
//        boolean expResult = false;
//        boolean result = instance.überprüfuen_Image_StandardFormat(submittedFileName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dateiformatieren method, of class uploadBean.
//     */
//    @Test
//    public void testDateiformatieren() {
//        System.out.println("dateiformatieren");
//        String user_id = "";
//        String diplomarbeit_titel = "";
//        String submittedFileName = "";
//        uploadBean instance = new uploadBean();
//        String expResult = "";
//        String result = instance.dateiformatieren(user_id, diplomarbeit_titel, submittedFileName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of main method, of class uploadBean.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        uploadBean.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
//}
