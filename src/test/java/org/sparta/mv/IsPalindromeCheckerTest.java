package org.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class IsPalindromeCheckerTest {
    @Test
    void isPalendrome() {
        Assertions.assertEquals(true, IsPalindromeChecker.isPalindrome("racecar"));
        Assertions.assertEquals(false, IsPalindromeChecker.isPalindrome("racecarr"));
        Assertions.assertEquals(false, IsPalindromeChecker.isPalindrome(""));
    }
    @Test
    void longestPalendrome() {
    }
}