package com.bridgelabz;

import com.bridgelabz.JUnit.TempratureConverterTest.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TempratureConverterTest {
    private TemperatureConverter temp;

    @BeforeEach
    void setUp(){
        temp=new TemperatureConverter();
    }

    @Test
    void testCelsiusToFahrenheit() {
        Assertions.assertEquals(32.0, temp.celsiusToFahrenheit(0), 0.01);
        Assertions.assertEquals(212.0, temp.celsiusToFahrenheit(100), 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        Assertions.assertEquals(0.0, temp.fahrenheitToCelsius(32), 0.01);
        Assertions.assertEquals(100.0, temp.fahrenheitToCelsius(212), 0.01);
    }
}
