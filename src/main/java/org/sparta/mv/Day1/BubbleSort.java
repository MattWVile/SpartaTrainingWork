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

    public static int[] arrJoin(int[] numbers, int[] otherNumbers) {
        int numbersCounter = 0;
        int otherNumbersCounter = 0;
        int total = numbers.length + otherNumbers.length;
        int[] sorted = new int[total];
        for(int i = 0 ; i < total ; i++){
            if(numbersCounter >= numbers.length){
                sorted[i] = otherNumbers[otherNumbersCounter];
                otherNumbersCounter++;
            }
            else if(otherNumbersCounter >= otherNumbers.length){
                sorted[i] = numbers[numbersCounter];
                numbersCounter ++;
            }
            else if(numbers[numbersCounter] <= otherNumbers[otherNumbersCounter]){
                sorted[i] = numbers[numbersCounter];
                numbersCounter++;
            }else{
                sorted[i] = otherNumbers[otherNumbersCounter];
                otherNumbersCounter ++;
            }
        }
        return sorted;
    }
}

