package org.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.mv.Day1.Dog;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {
    @Test
    @DisplayName("Checking dog is able to talk to his owner")

    void checkingDogIsAbleToTalkToHisOwner() {
        Dog clifford = new Dog("Clifford", "BigRed", 10);
        String owner = "The owner";
        assertEquals("Clifford speaks to his owner, The owner", clifford.speak(owner, clifford));
    }

    @Test
    @DisplayName("Should be able to view dog name")
    void shouldBeAbleToViewDogName() {
        Dog clifford = new Dog("Clifford", "BigRed", 10);
        Assertions.assertEquals("Clifford",clifford.getName());
    }
    @Test
    @DisplayName("Should be able to view dog breed")
    void shouldBeAbleToViewDogBreed() {
        Dog clifford = new Dog("Clifford", "BigRed", 10);
        Assertions.assertEquals("Clifford",clifford.getName());
    }
    @Test
    @DisplayName("Should be able to view dog Age")
    void shouldBeAbleToViewDogAge() {
        Dog clifford = new Dog("Clifford", "BigRed", 10);
        Assertions.assertEquals("Clifford",clifford.getName());
    }
}
