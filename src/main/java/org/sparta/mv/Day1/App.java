package org.sparta.mv.Day1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        String palendrome = "Racecar";
        System.out.println(IsPalindromeChecker.isPalindrome(palendrome));
        String palendromeSentence = "I have a racecar that makes me say wow";
        System.out.println(IsPalindromeChecker.longestPalindrome(palendromeSentence));
//        System.out.println(FibonacciSequence.fibonacciFinder(8));
    }
}
