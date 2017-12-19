/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20171210_justmassive;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author _smil
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Main.
     */
    /*@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DivMassive method, of class Main.
     */
    @Test(timeout = 100)
    public void testDivMassive() {
        System.out.println("DivMassive");
        int aStart = 1;
        int aFinish = 2;
        int Step = 1;
        Main instance = new Main();
        int[] expResult = new int[]{1,2};
        int[] result = instance.DivMassive(aStart, aFinish, Step);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ShowMassive method, of class Main.
     */
    /*@Test
    public void testShowMassive() {
        System.out.println("ShowMassive");
        int[] aMass = null;
        boolean aLn = false;
        Main instance = new Main();
        instance.ShowMassive(aMass, aLn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReverceMassive method, of class Main.
     */
    /*@Test
    public void testReverceMassive() {
        System.out.println("ReverceMassive");
        int[] aMass = null;
        Main instance = new Main();
        int[] expResult = null;
        int[] result = instance.ReverceMassive(aMass);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
