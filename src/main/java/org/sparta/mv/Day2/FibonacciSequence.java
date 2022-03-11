package org.sparta.mv.Day2;

public class FibonacciSequence {
    public static int fibonacciFinder(int num){
        if (num <= 0){
            return 0;
        }else if(num < 3){
            return num - 1;
        }else{
            return fibonacciFinder(num-1) + fibonacciFinder(num-2);
        }
    }
}
