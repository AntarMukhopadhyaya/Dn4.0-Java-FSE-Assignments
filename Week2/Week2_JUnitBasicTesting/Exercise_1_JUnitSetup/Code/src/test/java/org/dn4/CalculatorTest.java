package org.dn4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(5, 5));
    }
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.subtract(5, 5));
    }
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(30,calc.multiply(3,10));
    }
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(5,calc.divide(15,3));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calc.divide(0,0);
    }
}