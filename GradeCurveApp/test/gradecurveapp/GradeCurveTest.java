/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecurveapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sky
 */
public class GradeCurveTest {
    
    public GradeCurveTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        System.out.println("test start");
    }
    
    @After
    public void tearDown() {
        System.out.println("test end");
    }

    /**
     * Test of lowerGrade method, of class GradeCurve.
     */
    @Test
    public void testLowerGrade() {
        System.out.println("lowerGrade");
        int g = 10;
        GradeCurve instance = new GradeCurve();
        int expResult = 5;
        int result = instance.lowerGrade(g);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
