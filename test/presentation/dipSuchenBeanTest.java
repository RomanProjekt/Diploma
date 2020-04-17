/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import infrastructure.DiplomarbeitDAO;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Diplomarbeit;

/**
 *
 * @author hp
 */
public class dipSuchenBeanTest {
    
    public dipSuchenBeanTest() {
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
     * Test of init method, of class dipSuchenBean.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        dipSuchenBean instance = new dipSuchenBean();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectDA method, of class dipSuchenBean.
     */
    @Test
    public void testSelectDA() {
        System.out.println("selectDA");
        dipSuchenBean instance = new dipSuchenBean();
        Object expResult = null;
        Object result = instance.selectDA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recentDa method, of class dipSuchenBean.
     */
    @Test
    public void testRecentDa() {
        System.out.println("recentDa");
        dipSuchenBean instance = new dipSuchenBean();
        Object expResult = null;
        Object result = instance.recentDa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displaySelectedDa method, of class dipSuchenBean.
     */
    @Test
    public void testDisplaySelectedDa() {
        System.out.println("displaySelectedDa");
        dipSuchenBean instance = new dipSuchenBean();
        String expResult = "";
        String result = instance.displaySelectedDa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKey method, of class dipSuchenBean.
     */
    @Test
    public void testGetKey() {
        System.out.println("getKey");
        dipSuchenBean instance = new dipSuchenBean();
        String expResult = "";
        String result = instance.getKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKey method, of class dipSuchenBean.
     */
    @Test
    public void testSetKey() {
        System.out.println("setKey");
        String key = "";
        dipSuchenBean instance = new dipSuchenBean();
        instance.setKey(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDaList method, of class dipSuchenBean.
     */
    @Test
    public void testGetDaList() {
        System.out.println("getDaList");
        dipSuchenBean instance = new dipSuchenBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.getDaList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDaList method, of class dipSuchenBean.
     */
    @Test
    public void testSetDaList() {
        System.out.println("setDaList");
        List<Diplomarbeit> daList = null;
        dipSuchenBean instance = new dipSuchenBean();
        instance.setDaList(daList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedDa method, of class dipSuchenBean.
     */
    @Test
    public void testGetSelectedDa() {
        System.out.println("getSelectedDa");
        dipSuchenBean instance = new dipSuchenBean();
        Diplomarbeit expResult = null;
        Diplomarbeit result = instance.getSelectedDa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedDa method, of class dipSuchenBean.
     */
    @Test
    public void testSetSelectedDa() {
        System.out.println("setSelectedDa");
        Diplomarbeit selectedDa = null;
        dipSuchenBean instance = new dipSuchenBean();
        instance.setSelectedDa(selectedDa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecentDaList method, of class dipSuchenBean.
     */
    @Test
    public void testGetRecentDaList() {
        System.out.println("getRecentDaList");
        dipSuchenBean instance = new dipSuchenBean();
        List<Diplomarbeit> expResult = null;
        List<Diplomarbeit> result = instance.getRecentDaList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecentDaList method, of class dipSuchenBean.
     */
    @Test
    public void testSetRecentDaList() {
        System.out.println("setRecentDaList");
        List<Diplomarbeit> recentDaList = null;
        dipSuchenBean instance = new dipSuchenBean();
        instance.setRecentDaList(recentDaList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRender method, of class dipSuchenBean.
     */
    @Test
    public void testGetRender() {
        System.out.println("getRender");
        dipSuchenBean instance = new dipSuchenBean();
        boolean expResult = false;
        boolean result = instance.getRender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRender method, of class dipSuchenBean.
     */
    @Test
    public void testSetRender() {
        System.out.println("setRender");
        boolean render = false;
        dipSuchenBean instance = new dipSuchenBean();
        instance.setRender(render);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRender2 method, of class dipSuchenBean.
     */
    @Test
    public void testGetRender2() {
        System.out.println("getRender2");
        dipSuchenBean instance = new dipSuchenBean();
        boolean expResult = false;
        boolean result = instance.getRender2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRender2 method, of class dipSuchenBean.
     */
    @Test
    public void testSetRender2() {
        System.out.println("setRender2");
        boolean render2 = false;
        dipSuchenBean instance = new dipSuchenBean();
        instance.setRender2(render2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIssearchbib method, of class dipSuchenBean.
     */
    @Test
    public void testIsIssearchbib() {
        System.out.println("isIssearchbib");
        dipSuchenBean instance = new dipSuchenBean();
        boolean expResult = false;
        boolean result = instance.isIssearchbib();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIssearchbib method, of class dipSuchenBean.
     */
    @Test
    public void testSetIssearchbib() {
        System.out.println("setIssearchbib");
        boolean issearchbib = false;
        dipSuchenBean instance = new dipSuchenBean();
        instance.setIssearchbib(issearchbib);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObj method, of class dipSuchenBean.
     */
    @Test
    public void testGetObj() {
        System.out.println("getObj");
        dipSuchenBean instance = new dipSuchenBean();
        DiplomarbeitDAO expResult = null;
        DiplomarbeitDAO result = instance.getObj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObj method, of class dipSuchenBean.
     */
    @Test
    public void testSetObj() {
        System.out.println("setObj");
        DiplomarbeitDAO obj = null;
        dipSuchenBean instance = new dipSuchenBean();
        instance.setObj(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchList method, of class dipSuchenBean.
     */
    @Test
    public void testSearchList() {
        System.out.println("searchList");
        dipSuchenBean instance = new dipSuchenBean();
        String expResult = "";
        String result = instance.searchList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
