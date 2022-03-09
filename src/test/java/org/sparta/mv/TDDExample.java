package org.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.mv.tdd.FizzBuzzGenerator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDExample {
    //Define what will be build
    //Write tests first
    //Red, Green, Refactor

    //1. RED - Run Test - Test fails
    //2. GREEN - Make test pass - Only write enough to pass test
    //3. REFACTOR - All tests should still pass
    @Test
    @DisplayName("5 should retrun fuzz")
    void fiveShouldReturnFizz() {
        assertEquals("Fizz", FizzBuzzGenerator.getFizzBuzzValue(5));
    }

    @Test
    @DisplayName("Seven should return Buzz")
    void sevenShouldReturnBuzz() {
        assertEquals("Buzz",FizzBuzzGenerator.getFizzBuzzValue(7));
    }

    @Test
    @DisplayName("Two should return 2")
    void twoShouldReturnTwo() {
        assertEquals("2",FizzBuzzGenerator.getFizzBuzzValue(2));
    }

    @Test
    @DisplayName("15 should return FizzBuzz")
    void fifteenShouldReturnFizzBuzz() {
        Assertions.assertEquals("FizzBuzz",FizzBuzzGenerator.getFizzBuzzValue(35));
    }
}
