package com.bridgelabz;

import com.bridgelabz.JUnit.divisionTest.Division;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionTest {
    Division division= new Division();

    @Test
    public void testDivideByZeroThrowsException(){
        Exception exception= assertThrows(ArithmeticException.class, () -> {
            division.divide(8, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());

    }
    @Test
    void testValidDivision() {
        assertEquals(5, division.divide(10, 2));
        assertEquals(-3, division.divide(-9, 3));
    }
}

