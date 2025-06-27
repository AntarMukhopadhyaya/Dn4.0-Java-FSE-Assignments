package org.dn4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorFixtureTest {
    private Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Object created: " + calculator);
    }
    @AfterEach
    public void tearDown() {
        System.out.println("Object destroyed: " + calculator);
    }
    @Test
    public void testAddition(){
        //Act
        int result = calculator.add(1,2);
        //Assert
        assertEquals(3,result);

    }
    @Test
    public void testSubtraction(){
        int result = calculator.subtract(10,4);
        assertEquals(6,result);
    }
    @Test
    public void testMultiplication(){
        int result = calculator.multiply(10,4);
        assertEquals(40,result);
    }
    @Test
    public void testDivision(){
        int result = calculator.divide(10,5);
        assertEquals(2,result);
    }
    @Test
    public void testDivideByZeroThrowsException(){
        ArithmeticException ex = assertThrows(ArithmeticException.class,() -> {
            calculator.divide(10,0);
        });
        assertEquals("Divide by zero", ex.getMessage());
    }
}
