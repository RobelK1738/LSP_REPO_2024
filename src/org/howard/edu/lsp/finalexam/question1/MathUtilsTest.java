package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    public void setUp() {
        mathUtils = new MathUtils();
    }

    // Factorial Tests
    @Test
    public void factorial_shouldReturnOneForZero() {
        assertEquals(1, mathUtils.factorial(0), "0! = 1");
    }

    @Test
    public void factorial_shouldReturnOneForOne() {
        assertEquals(1, mathUtils.factorial(1), "1! = 1");
    }

    @Test
    public void factorial_shouldReturnCorrectValueForPositiveInput() {
        assertEquals(120, mathUtils.factorial(5), "5 != 120");
    }

    @Test
    public void factorial_shouldThrowExceptionForNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1),
                "throw IllegalArgumentException");
    }

    // isPrime Tests
    @Test
    public void isPrime_shouldReturnFalseForNumbersLessThanTwo() {
        assertFalse(mathUtils.isPrime(0), "0 is not prime");
        assertFalse(mathUtils.isPrime(1), "1 is not prime ");
    }

    @Test
    public void isPrime_shouldReturnTrueForPrimeNumbers() {
        assertTrue(mathUtils.isPrime(2), "2 is prime");
        assertTrue(mathUtils.isPrime(13), "13 is prime");
    }

    @Test
    public void isPrime_shouldReturnFalseForNonPrimeNumbers() {
        assertFalse(mathUtils.isPrime(4), "4 is not prime");
        assertFalse(mathUtils.isPrime(15), "15 is not prime");
    }

    // GCD Tests
    @Test
    public void gcd_shouldThrowExceptionWhenBothInputsAreZero() {
        assertThrows(IllegalArgumentException.class, () -> mathUtils.gcd(0, 0),
                "throw IllegalArgumentException");
    }

    @Test
    public void gcd_shouldReturnAbsoluteValueOfNonZeroInputWhenOtherIsZero() {
        assertEquals(5, mathUtils.gcd(5, 0), "GCD should be 5");
        assertEquals(7, mathUtils.gcd(0, 7), "GCD should be 7");
    }

    @Test
    public void gcd_shouldReturnCorrectValueForTwoPositiveIntegers() {
        assertEquals(6, mathUtils.gcd(54, 24), "GCD should be 6");
    }

    @Test
    public void gcd_shouldReturnCorrectValueForNegativeInputs() {
        assertEquals(6, mathUtils.gcd(-54, -24), "GCD should be 6");
        assertEquals(6, mathUtils.gcd(-54, 24), "GCD should be 6");
    }
}
