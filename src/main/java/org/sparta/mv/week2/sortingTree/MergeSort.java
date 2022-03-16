package org.sparta.mv.week2.sortingTree;

public class MergeSort {
    public static int[] splitMergesort(int[] array){
        int midPoint = array.length / 2;
        int[] splitArray1 = new int[midPoint];
        int[] splitArray2 = new int[midPoint];
        int counter = 0;
        if (array.length == 1){
            return array;
        } else {
            for (int i = 0; i <= midPoint -1 ;i++){
                splitArray1[i] = array[i];

            }
            for(int j =midPoint; j <= array.length - 1 ; j++){
                splitArray2[counter] = array[j];
            }

        }
        return splitArray1;
    }
}
