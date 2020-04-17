/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Autor;
import pojo.Diplomarbeit;
import pojo.Schlagwort;
import pojo.Schule;
import service.DatabaseManagerService;

/**
 *
 * @author hp
 */
public class updateDiplomarbeitTest {
    
    public updateDiplomarbeitTest() {
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
     * Test of editDiplomarbeit method, of class updateDiplomarbeit.
     */
    @Test
    public void testEditDiplomarbeit() {
        System.out.println("editDiplomarbeit");
        Diplomarbeit dip = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Object expResult = null;
        Object result = instance.editDiplomarbeit(dip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editAutor method, of class updateDiplomarbeit.
     */
    @Test
    public void testEditAutor() {
        System.out.println("editAutor");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Object expResult = null;
        Object result = instance.editAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAutor method, of class updateDiplomarbeit.
     */
    @Test
    public void testSaveAutor() {
        System.out.println("saveAutor");
        Autor autor = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Object expResult = null;
        Object result = instance.saveAutor(autor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTag method, of class updateDiplomarbeit.
     */
    @Test
    public void testAddTag() {
        System.out.println("addTag");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Object expResult = null;
        Object result = instance.addTag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAutor method, of class updateDiplomarbeit.
     */
    @Test
    public void testAddAutor() {
        System.out.println("addAutor");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Object expResult = null;
        Object result = instance.addAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTag method, of class updateDiplomarbeit.
     */
    @Test
    public void testRemoveTag() {
        System.out.println("removeTag");
        Schlagwort schlagw = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Object expResult = null;
        Object result = instance.removeTag(schlagw);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAutor method, of class updateDiplomarbeit.
     */
    @Test
    public void testRemoveAutor() {
        System.out.println("removeAutor");
        Autor autor = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Object expResult = null;
        Object result = instance.removeAutor(autor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class updateDiplomarbeit.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Object expResult = null;
        Object result = instance.save();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatum method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetDatum() {
        System.out.println("getDatum");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Date expResult = null;
        Date result = instance.getDatum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatum method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetDatum() {
        System.out.println("setDatum");
        Date datum = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setDatum(datum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRealSchule method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetRealSchule() {
        System.out.println("getRealSchule");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Schule expResult = null;
        Schule result = instance.getRealSchule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchulList method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetSchulList() {
        System.out.println("getSchulList");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        List<Schule> expResult = null;
        List<Schule> result = instance.getSchulList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRealSchule method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetRealSchule() {
        System.out.println("setRealSchule");
        Schule realSchule = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setRealSchule(realSchule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchulList method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetSchulList() {
        System.out.println("setSchulList");
        List<Schule> schulList = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setSchulList(schulList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAktDip method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetAktDip() {
        System.out.println("getAktDip");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Diplomarbeit expResult = null;
        Diplomarbeit result = instance.getAktDip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutList method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetAutList() {
        System.out.println("getAutList");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        List<Autor> expResult = null;
        List<Autor> result = instance.getAutList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchule method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetSchule() {
        System.out.println("getSchule");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        String expResult = "";
        String result = instance.getSchule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchlagwortList method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetSchlagwortList() {
        System.out.println("getSchlagwortList");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        List<Schlagwort> expResult = null;
        List<Schlagwort> result = instance.getSchlagwortList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDbService method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetDbService() {
        System.out.println("getDbService");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        DatabaseManagerService expResult = null;
        DatabaseManagerService result = instance.getDbService();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAktDip method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetAktDip() {
        System.out.println("setAktDip");
        Diplomarbeit aktDip = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setAktDip(aktDip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutList method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetAutList() {
        System.out.println("setAutList");
        List<Autor> autList = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setAutList(autList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchule method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetSchule() {
        System.out.println("setSchule");
        String schule = "";
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setSchule(schule);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchlagwortList method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetSchlagwortList() {
        System.out.println("setSchlagwortList");
        List<Schlagwort> schlagwortList = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setSchlagwortList(schlagwortList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDbService method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetDbService() {
        System.out.println("setDbService");
        DatabaseManagerService dbService = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setDbService(dbService);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchlagwort method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetSchlagwort() {
        System.out.println("getSchlagwort");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        String expResult = "";
        String result = instance.getSchlagwort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchlagwort method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetSchlagwort() {
        System.out.println("setSchlagwort");
        String schlagwort = "";
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setSchlagwort(schlagwort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSchlagwortMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetAllSchlagwortMap() {
        System.out.println("getAllSchlagwortMap");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        HashMap<String, Integer> expResult = null;
        HashMap<String, Integer> result = instance.getAllSchlagwortMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAllSchlagwortMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetAllSchlagwortMap() {
        System.out.println("setAllSchlagwortMap");
        HashMap<String, Integer> allSchlagwortMap = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setAllSchlagwortMap(allSchlagwortMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutor method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        String expResult = "";
        String result = instance.getAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutor method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "";
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setAutor(autor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInsertSchlagList method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetInsertSchlagList() {
        System.out.println("getInsertSchlagList");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        List<Schlagwort> expResult = null;
        List<Schlagwort> result = instance.getInsertSchlagList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsertSchlagList method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetInsertSchlagList() {
        System.out.println("setInsertSchlagList");
        List<Schlagwort> insertSchlagList = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setInsertSchlagList(insertSchlagList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAutEdit method, of class updateDiplomarbeit.
     */
    @Test
    public void testIsAutEdit() {
        System.out.println("isAutEdit");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        boolean expResult = false;
        boolean result = instance.isAutEdit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSchlagEdit method, of class updateDiplomarbeit.
     */
    @Test
    public void testIsSchlagEdit() {
        System.out.println("isSchlagEdit");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        boolean expResult = false;
        boolean result = instance.isSchlagEdit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutEdit method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetAutEdit() {
        System.out.println("setAutEdit");
        boolean autEdit = false;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setAutEdit(autEdit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchlagEdit method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetSchlagEdit() {
        System.out.println("setSchlagEdit");
        boolean schlagEdit = false;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setSchlagEdit(schlagEdit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutId method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetAutId() {
        System.out.println("getAutId");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        int expResult = 0;
        int result = instance.getAutId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAutId method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetAutId() {
        System.out.println("setAutId");
        int autId = 0;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setAutId(autId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditAutMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetEditAutMap() {
        System.out.println("getEditAutMap");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        HashMap<Integer, Autor> expResult = null;
        HashMap<Integer, Autor> result = instance.getEditAutMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditAutMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetEditAutMap() {
        System.out.println("setEditAutMap");
        HashMap<Integer, Autor> editAutMap = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setEditAutMap(editAutMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSchlagId method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetSchlagId() {
        System.out.println("getSchlagId");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        int expResult = 0;
        int result = instance.getSchlagId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSchlagId method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetSchlagId() {
        System.out.println("setSchlagId");
        int schlagId = 0;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setSchlagId(schlagId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOldDip method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetOldDip() {
        System.out.println("getOldDip");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        Diplomarbeit expResult = null;
        Diplomarbeit result = instance.getOldDip();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInsAutMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetInsAutMap() {
        System.out.println("getInsAutMap");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        HashMap<Integer, Autor> expResult = null;
        HashMap<Integer, Autor> result = instance.getInsAutMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInsSchlagMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetInsSchlagMap() {
        System.out.println("getInsSchlagMap");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        HashMap<Integer, Schlagwort> expResult = null;
        HashMap<Integer, Schlagwort> result = instance.getInsSchlagMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRemAutMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetRemAutMap() {
        System.out.println("getRemAutMap");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        HashMap<Integer, Autor> expResult = null;
        HashMap<Integer, Autor> result = instance.getRemAutMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRemSchlagMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetRemSchlagMap() {
        System.out.println("getRemSchlagMap");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        HashMap<Integer, Schlagwort> expResult = null;
        HashMap<Integer, Schlagwort> result = instance.getRemSchlagMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOldDip method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetOldDip() {
        System.out.println("setOldDip");
        Diplomarbeit oldDip = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setOldDip(oldDip);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsAutMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetInsAutMap() {
        System.out.println("setInsAutMap");
        HashMap<Integer, Autor> insAutMap = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setInsAutMap(insAutMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInsSchlagMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetInsSchlagMap() {
        System.out.println("setInsSchlagMap");
        HashMap<Integer, Schlagwort> insSchlagMap = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setInsSchlagMap(insSchlagMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRemAutMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetRemAutMap() {
        System.out.println("setRemAutMap");
        HashMap<Integer, Autor> remAutMap = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setRemAutMap(remAutMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRemSchlagMap method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetRemSchlagMap() {
        System.out.println("setRemSchlagMap");
        HashMap<Integer, Schlagwort> remSchlagMap = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setRemSchlagMap(remSchlagMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSchlagwortList method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetAllSchlagwortList() {
        System.out.println("getAllSchlagwortList");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        List<Schlagwort> expResult = null;
        List<Schlagwort> result = instance.getAllSchlagwortList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAllSchlagwortList method, of class updateDiplomarbeit.
     */
    @Test
    public void testSetAllSchlagwortList() {
        System.out.println("setAllSchlagwortList");
        List<Schlagwort> allSchlagwortList = null;
        updateDiplomarbeit instance = new updateDiplomarbeit();
        instance.setAllSchlagwortList(allSchlagwortList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeaheadSchl method, of class updateDiplomarbeit.
     */
    @Test
    public void testGetTypeaheadSchl() {
        System.out.println("getTypeaheadSchl");
        updateDiplomarbeit instance = new updateDiplomarbeit();
        List<String> expResult = null;
        List<String> result = instance.getTypeaheadSchl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
