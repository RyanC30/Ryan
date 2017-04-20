/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ryanc
 */
public class CalculatorIT {
    
    public CalculatorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        double a = 1.0;
        double b = 1.0;
        Calculator instance = new Calculator();
        double expResult = 2.0;
        double result = instance.add(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @org.junit.Test
    public void testSubtract() {
        System.out.println("subtract");
        double a = 10.0;
        double b = 5.0;
        Calculator instance = new Calculator();
        double expResult = 5.0;
        double result = instance.subtract(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @org.junit.Test
    public void testMultiply() {
        System.out.println("multiply");
        double a = 2.0;
        double b = 2.0;
        Calculator instance = new Calculator();
        double expResult = 4.0;
        double result = instance.multiply(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @org.junit.Test
    public void testDivide() {
        System.out.println("divide");
        double a = 10.0;
        double b = 5.0;
        Calculator instance = new Calculator();
        double expResult = 2.0;
        double result = instance.divide(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
