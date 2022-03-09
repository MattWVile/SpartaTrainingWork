package org.sparta.mv.Day1;

import java.util.Arrays;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        int[] arrayToSort = new int[]{6, 5, 3, 6, 74, 6, 8, 9, 4, 4, 1};
        int[] arrayToSort2 = new int[]{2, 4, 6, 5, 3, 8, 9, 7, 1, 87, 23, 54, 85, 21, 67};
        BubbleSort.bubbleSort(arrayToSort);
        BubbleSort.bubbleSort(arrayToSort2);
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println(Arrays.toString(arrayToSort2));
    }
}
