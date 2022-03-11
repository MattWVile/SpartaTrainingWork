package org.sparta.mv.Day2;

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
        System.out.println(FibonacciSequence.fibonacciFinder(1));
        System.out.println(FibonacciSequence.fibonacciFinder(2));
        System.out.println(FibonacciSequence.fibonacciFinder(3));
        System.out.println(FibonacciSequence.fibonacciFinder(4));
        System.out.println(FibonacciSequence.fibonacciFinder(5));
        System.out.println(FibonacciSequence.fibonacciFinder(6));
        System.out.println(FibonacciSequence.fibonacciFinder(7));
    }
}
