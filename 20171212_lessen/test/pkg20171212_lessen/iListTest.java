/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171212_lessen;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author _smil
 */
public class iListTest {
    
    public iListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class iList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int aValue = 0;
        iList instance = new iListImpl();
        instance.add(aValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class iList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        iList instance = new iListImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class iList.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int index = 0;
        iList instance = new iListImpl();
        instance.delete(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class iList.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        iList instance = new iListImpl();
        instance.sort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class iList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int aIndex = 0;
        iList instance = new iListImpl();
        int expResult = 0;
        int result = instance.get(aIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class iListImpl implements iList {

        public void add(int aValue) {
        }

        public int size() {
            return 0;
        }

        public void delete(int index) {
        }

        public void sort() {
        }

        public int get(int aIndex) {
            return 0;
        }
    }
    
}
