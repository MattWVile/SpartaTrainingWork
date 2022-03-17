package org.sparta.mv.week2.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

    public static void main(String[] args) {
//        int[] numbers = new int[]{1,2,3,4};
//        arrayChecker(new int[]{1,2,3,4,5}, 8);
        try {
            BufferedReader reader = new BufferedReader(new FileReader("This is my file"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //always runs
            System.out.println("i am in the finally block");
        }

//        try{
//            System.out.println(numbers[10]);
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("MISTAKE!!!");
//            e.printStackTrace();
//        }

    }
    private static int arrayChecker(int[] arr, int position) throws ArrayIndexOutOfBoundsException{
        return arr[position];
    }
}
