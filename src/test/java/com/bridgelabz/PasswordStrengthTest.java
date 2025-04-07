package com.bridgelabz;

import com.bridgelabz.JUnit.PasswordStrengthTest.PasswordStrength;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordStrengthTest {
    private PasswordStrength pwd;

    @BeforeEach
    void setUp(){
        pwd=new PasswordStrength();
    }


    @Test
    void shouldBeValid() {
        Assertions.assertTrue(pwd.isValid("StrongPassword1"));
    }


    @Test
    void shouldCheckLength(){
        Assertions.assertFalse(pwd.isValid("Sanya"));
    }

    @Test
    void shouldCheckIfPasswordHasUppercase(){
        Assertions.assertFalse(pwd.isValid("sanya6789"));
    }

    @Test
    void shouldCheckIfPasswordHasDigit(){
        Assertions.assertFalse(pwd.isValid("sanya@345"));
    }
}
