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
public class AListTest {
    
    public AListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class AList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int aValue = 0;
        AList instance = new AList();
        instance.add(aValue);
        int expResult = 0;
        
        assertEquals(expResult, instance.get(instance.size()-1));
    }
     
    @Test
    public void testSize() {
        System.out.println("size");
        AList instance = new AList();
        instance.add(0);
        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class AList.
     
    @Test
    public void testDelete() {
        System.out.println("delete");
        int index = 0;
        AList instance = new AList();
        instance.delete(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AList.
     
    @Test
    public void testToString() {
        System.out.println("toString");
        AList instance = new AList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sort method, of class AList.
     
    @Test
    public void testSort() {
        System.out.println("sort");
        AList instance = new AList();
        instance.sort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class AList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int aIndex = 0;
        AList instance = new AList();
        instance.add(1);
        int expResult = 1;
        int result = instance.get(aIndex);
        assertEquals(expResult, result);   
    }
    
}
