package com.bridgelabz;

import com.bridgelabz.JUnit.EvenNumberCheckerTest.EvenNumberChecker;
import com.bridgelabz.JUnit.EvenNumberCheckerTest.ParameterizedTest;
import com.bridgelabz.JUnit.EvenNumberCheckerTest.ValueSource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class EvenNumberCheckerTest {
    private EvenNumberChecker checkNumber;

    @BeforeEach
    void setUp() {
        checkNumber = new EvenNumberChecker();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    public void shouldReturnTrueIfNumberIsEven(int number) {
        Assertions.assertTrue(checkNumber.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 6, 8})
    public void shouldReturnFalseIfNumberIsNotEven(int number) {
        Assertions.assertFalse(checkNumber.isEven(number));
    }
}