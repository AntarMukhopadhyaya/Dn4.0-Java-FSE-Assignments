package org.dn4;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if( b == 0) throw new IllegalArgumentException("Division by zero is not possible");
        return a / b;
    }
}
