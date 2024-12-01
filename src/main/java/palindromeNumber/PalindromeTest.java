package palindromeNumber;

import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    SolutionPalindrome solutionPalindrome = new SolutionPalindrome();
    @Test
    public void testSingleDigitNumbers() {
        assertTrue(solutionPalindrome.isPolindrome(0));
        assertTrue(solutionPalindrome.isPolindrome(5));
        assertTrue(solutionPalindrome.isPolindrome(9));
    }

    @Test
    public void testTwoDigitNumbers() {
        assertFalse(solutionPalindrome.isPolindrome(10));
        assertTrue(solutionPalindrome.isPolindrome(11));
    }

    @Test
    public void testPositiveNumbers() {
        assertTrue(solutionPalindrome.isPolindrome(121));
        assertFalse(solutionPalindrome.isPolindrome(123));
        assertTrue(solutionPalindrome.isPolindrome(1221));
    }

    @Test
    public void testNegativeNumbers() {
        assertFalse(solutionPalindrome.isPolindrome(-121));
        assertFalse(solutionPalindrome.isPolindrome(-12321));
    }

    @Test
    public void testLargeNumbers() {
        assertTrue(solutionPalindrome.isPolindrome(1234321));
        assertFalse(solutionPalindrome.isPolindrome(2147483647));
    }
}
