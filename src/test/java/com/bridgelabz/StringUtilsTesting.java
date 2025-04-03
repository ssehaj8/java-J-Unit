package com.bridgelabz;

import com.bridgelabz.JUnit.BasicJUnitTesting.StringUtilsTest.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleH", utils.reverse("Hello"));
        assertEquals("321", utils.reverse("123"));
        assertEquals("", utils.reverse(""));
        assertNull(utils.reverse(null)); // Test for null input
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("racecar"));
        assertTrue(utils.isPalindrome("Mom")); // Case insensitive check
        assertFalse(utils.isPalindrome("hello"));
        assertFalse(utils.isPalindrome(null)); // Null input should return false
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertEquals("WORLD", utils.toUpperCase("world"));
        assertEquals("", utils.toUpperCase(""));
        assertNull(utils.toUpperCase(null)); // Test for null input
    }
}

