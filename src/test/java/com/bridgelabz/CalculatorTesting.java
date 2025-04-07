package com.bridgelabz;

import com.bridgelabz.JUnit.CalculatorTest.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTesting{
    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(10, calculator.add(6, 4));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(6, 4));
        assertEquals(1, calculator.subtract(-2, -3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(24, calculator.multiply(6, 4));
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(3, calculator.divide(6, 2));
        assertEquals(-2, calculator.divide(-6, 3));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

