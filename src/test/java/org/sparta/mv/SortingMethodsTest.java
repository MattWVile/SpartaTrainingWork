package org.sparta.mv;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.mv.Day1.BubbleSort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingMethodsTest {
    @Test
    @DisplayName("Bubble sort sorts duplicates")
    void bubbleSortShouldSortWithDuplicates() {
        int[] in = {6, 5, 3, 6, 74, 6, 8, 9, 4, 4, 1};
        int[] out = {1, 3, 4, 4, 5, 6, 6, 6, 8, 9, 74};
        
        Assertions.assertEquals(Arrays.toString(out), Arrays.toString(BubbleSort.bubbleSort(in)));
    }

    @Test
    @DisplayName("Array join sort sorts")
    void arrayJoinSortShouldSort() {
        int[] in = {6,7,8,9,10};
        int[] in2 = {1,2,3,4,5};
        int[] out = {1,2,3,4,5,6,7,8,9,10};
        Assertions.assertEquals(Arrays.toString(out), Arrays.toString(BubbleSort.arrJoin(in,in2)));
    }
}
