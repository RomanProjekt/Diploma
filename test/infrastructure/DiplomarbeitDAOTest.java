/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import java.util.List;
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
public class DiplomarbeitDAOTest {
    
    
    DatabaseManagerService dbService;
    
    public DiplomarbeitDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       dbService = new DatabaseManagerService();
    }
    
    @After
    public void tearDown() {
    }
 
    
    //Testen von Datenbankzugriffen
   
//    @Test
//    public void testRead() {
//        System.out.println("read");
//        List<Diplomarbeit> expResult = null;
//        List<Diplomarbeit> result = dbService.ListeAllDiplomarbeiten();
//        assertTrue(12 == result.size());  
//    }

  
//    @Test
//    public void testInsert() throws Exception {
//        System.out.println("insert");
//        
//        String title = "";
//        int user_id = 0;
//        int schule_id = 0;
//        String pdfpath = "";
//        String imagepath = "";
//        
//        DiplomarbeitDAO instance = new DiplomarbeitDAO();
//        int expResult = 0;
//        instance.insert(title, user_id, schule_id, pdfpath, imagepath);
//        
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    @Test
//    public void testUpdate() {
//        System.out.println("update");
//        int da_id = 0;
//        int autor_id = 0;
//        DiplomarbeitDAO instance = new DiplomarbeitDAO();
//        instance.update(da_id, autor_id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    
//    @Test
//    public void testUpdateTitle() {
//        System.out.println("updateTitle");
//        int da_id = 0;
//        String title = "";
//        DiplomarbeitDAO instance = new DiplomarbeitDAO();
//        instance.updateTitle(da_id, title);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    
//    @Test
//    public void testGetDiplomarbeit() {
//        System.out.println("getDiplomarbeit");
//        int id = 0;
//        DiplomarbeitDAO instance = new DiplomarbeitDAO();
//        Diplomarbeit expResult = null;
//        Diplomarbeit result = instance.getDiplomarbeit(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    
//    @Test
//    public void testGetRedList() {
//        System.out.println("getRedList");
//        int b_id = 0;
//        DiplomarbeitDAO instance = new DiplomarbeitDAO();
//        List<Diplomarbeit> expResult = null;
//        List<Diplomarbeit> result = instance.getRedList(b_id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        int id = 0;
//        DiplomarbeitDAO instance = new DiplomarbeitDAO();
//        int expResult = 0;
//        int result = instance.delete(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    
//    @Test
//    public void testSuchleiste() {
//        System.out.println("Suchleiste");
//        String k = "";
//        DiplomarbeitDAO instance = new DiplomarbeitDAO();
//        List expResult = null;
//        List result = instance.Suchleiste(k);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    
//    @Test
//    public void testRead_String() {
//        System.out.println("read");
//        String titel = "";
//        DiplomarbeitDAO instance = new DiplomarbeitDAO();
//        boolean expResult = false;
//        boolean result = instance.read(titel);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
