/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Autor;

/**
 *
 * @author hp
 */
public class AutorDAOTest {
    
    public AutorDAOTest() {
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
     * Test of getAllAutor method, of class AutorDAO.
     */
    @Test
    public void testGetAllAutor_0args() {
        System.out.println("getAllAutor");
        AutorDAO instance = new AutorDAO();
        List<Autor> expResult = null;
        List<Autor> result = instance.getAllAutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllAutor method, of class AutorDAO.
     */
    @Test
    public void testGetAllAutor_int() {
        System.out.println("getAllAutor");
        int id = 0;
        AutorDAO instance = new AutorDAO();
        List<Autor> expResult = null;
        List<Autor> result = instance.getAllAutor(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class AutorDAO.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        int da_id = 0;
        AutorDAO instance = new AutorDAO();
        Autor expResult = null;
        Autor result = instance.read(da_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AutorDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String fullname = "";
        int da_id = 0;
        AutorDAO instance = new AutorDAO();
        instance.insert(fullname, da_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAutorList method, of class AutorDAO.
     */
    @Test
    public void testInsertAutorList() {
        System.out.println("insertAutorList");
        List<Autor> insAut = null;
        int da_id = 0;
        AutorDAO instance = new AutorDAO();
        instance.insertAutorList(insAut, da_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertAutorMap method, of class AutorDAO.
     */
    @Test
    public void testInsertAutorMap() {
        System.out.println("insertAutorMap");
        HashMap<Integer, Autor> insMap = null;
        AutorDAO instance = new AutorDAO();
        instance.insertAutorMap(insMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAutors method, of class AutorDAO.
     */
    @Test
    public void testUpdateAutors() {
        System.out.println("updateAutors");
        HashMap<Integer, Autor> editMap = null;
        AutorDAO instance = new AutorDAO();
        instance.updateAutors(editMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAutor method, of class AutorDAO.
     */
    @Test
    public void testDeleteAutor() {
        System.out.println("deleteAutor");
        int id = 0;
        AutorDAO instance = new AutorDAO();
        instance.deleteAutor(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAutorDip method, of class AutorDAO.
     */
    @Test
    public void testDeleteAutorDip() {
        System.out.println("deleteAutorDip");
        int dip_id = 0;
        AutorDAO instance = new AutorDAO();
        instance.deleteAutorDip(dip_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAutors method, of class AutorDAO.
     */
    @Test
    public void testDeleteAutors() {
        System.out.println("deleteAutors");
        HashMap<Integer, Autor> delMap = null;
        AutorDAO instance = new AutorDAO();
        instance.deleteAutors(delMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AutorDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int da_id = 0;
        AutorDAO instance = new AutorDAO();
        instance.update(da_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
