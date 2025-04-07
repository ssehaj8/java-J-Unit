package com.bridgelabz;

import com.bridgelabz.JUnit.UserRegistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private UserRegistration user;

    @BeforeEach
    void setUp(){
        user=new UserRegistration();
    }


    @Test
    void shouldRegistrationBeValid() {
        Assertions.assertDoesNotThrow(() -> user.registerUser("Sehaj", "sehaj@example.com", "Password123"));
    }

    @Test
    void shouldUsernameBeEmpty() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                user.registerUser("", "sehaj@example.com", "Password123"));
        Assertions.assertEquals("Username cannot be empty", exception.getMessage());
    }

    @Test
    void shouldValidateEmail() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                user.registerUser("sehaj", "sehaj@gmail.com", "Password123"));
        Assertions.assertEquals("Invalid email format", exception.getMessage());
    }

    @Test
    void shouldCheckIfPasswordIsShort() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                user.registerUser("sehaj", "sehaj@example.com", "12345"));
        Assertions.assertEquals("Password must be at least 8 characters long", exception.getMessage());
    }
}
