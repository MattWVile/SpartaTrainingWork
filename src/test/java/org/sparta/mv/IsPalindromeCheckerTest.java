package org.sparta.mv;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.mv.Day2.IsPalindromeChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IsPalindromeCheckerTest {
    @Test
    @DisplayName ("Palindrome checker")
    void isPalindrome() {
        assertEquals(true, IsPalindromeChecker.isPalindrome("racecar"));
        assertEquals(false, IsPalindromeChecker.isPalindrome("racecarr"));
        assertEquals(false, IsPalindromeChecker.isPalindrome(""));
    }
    @Test
    @DisplayName ("Longest palindrome checker")
    void longestPalindrome() {
        assertEquals("racecar", IsPalindromeChecker.longestPalindrome("I have a racecar that makes me say wow"));
        assertEquals("RAceCar", IsPalindromeChecker.longestPalindrome("I have a RAceCar that makes me say wOw"));
        assertEquals("There is no palindrome", IsPalindromeChecker.longestPalindrome("I have a car that amazes me"));
    }

//    @Test
//    void fibonacciFinder(){
////        Assertions.assertEquals(0, FibonacciSequence.fibonacciFinder(0));
////        Assertions.assertEquals(0, FibonacciSequence.fibonacciFinder(-2));
////        Assertions.assertEquals(8, FibonacciSequence.fibonacciFinder(6));
//    }
}