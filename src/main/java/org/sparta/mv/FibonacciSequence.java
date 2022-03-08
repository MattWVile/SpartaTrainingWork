package org.sparta.mv;

public class FibonacciSequence {
    public static int fibonacciFinder(int num){
        int placeHolder = 0;
        if(placeHolder != 0){
            int firstNum = 0;
            int secondNum = 1;
        }
        if(num <= 0){
            return firstNum;
        }else{
            placeHolder = secondNum;
            secondNum += firstNum;
            firstNum = placeHolder;
            num --;
            System.out.println(firstNum +" + " + secondNum );
            fibonacciFinder(num);
        }
        return firstNum;
    }
}
