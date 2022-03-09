package org.sparta.mv.Day1;

public class BubbleSort {
    public BubbleSort() {
    }

    public static int[] bubbleSort(int[] numbers) {
        boolean swapped = false;
        while (!swapped) {
            swapped = true;
            for (int count = 1; count < numbers.length; ++count) {
                if (numbers[count - 1] > numbers[count]) {
                    swap(numbers, count);
                    swapped = false;
                }
            }
        }

        return numbers;
    }

    private static void swap(int[] numbers, int count) {
        int placeHolder = numbers[count - 1];
        numbers[count - 1] = numbers[count];
        numbers[count] = placeHolder;
    }

//    public static int[] arrJoin(int[] numbers, int[] numbers2) {
//        int[] joined = new int[numbers.length + numbers2.length];
//        int count = 0;
//        int count2 = false;
//        int[] var5 = numbers;
//        int var6 = numbers.length;
//
//        int var7;
//        int num2;
//        for(var7 = 0; var7 < var6; ++var7) {
//            num2 = var5[var7];
//            joined[count] = num2;
//            ++count;
//        }
//
//        var5 = numbers2;
//        var6 = numbers2.length;
//
//        for(var7 = 0; var7 < var6; ++var7) {
//            num2 = var5[var7];
//            joined[count] = num2;
//            ++count;
//        }
//
//        bubbleSort(joined);
//        return joined;

}

