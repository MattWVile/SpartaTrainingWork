package org.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class IsPalindromeCheckerTest {
    @Test
    void isPalindrome() {
        Assertions.assertEquals(true, IsPalindromeChecker.isPalindrome("racecar"));
        Assertions.assertEquals(false, IsPalindromeChecker.isPalindrome("racecarr"));
        Assertions.assertEquals(false, IsPalindromeChecker.isPalindrome(""));
    }
    @Test
    void longestPalindrome() {
        Assertions.assertEquals("racecar", IsPalindromeChecker.longestPalindrome("I have a racecar that makes me say wow"));
        Assertions.assertEquals("RAceCar", IsPalindromeChecker.longestPalindrome("I have a RAceCar that makes me say wOw"));
        Assertions.assertEquals("There is no palindrome", IsPalindromeChecker.longestPalindrome("I have a car that amazes me"));


    }
}