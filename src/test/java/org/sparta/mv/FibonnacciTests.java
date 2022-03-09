package org.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.mv.Day2.FibonacciSequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonnacciTests {
    @Test
    @DisplayName("Fibonnacci Test Should Return The Correct Number In The Sequence")
    void fibonnacciTestShouldReturnTheCorrectNumberInTheSequence() {
        assertEquals((5), FibonacciSequence.fibonacciFinder(4));
    }
    @Test
    @DisplayName("Fibonnacci Test Should Return 0 for 0")
    void fibonnacciTestShouldReturnZeroForZero() {
        assertEquals((0), FibonacciSequence.fibonacciFinder(0));
    }
    @Test
    @DisplayName("Fibonnacci Test Should Return 0 if a negative number is inputted")
    void fibonnacciTestShouldReturnZeroForNegativeNumbers() {
        assertEquals((0), FibonacciSequence.fibonacciFinder(-10));
    }
}
