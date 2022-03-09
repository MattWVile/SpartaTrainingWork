package org.sparta.mv.tdd;

public class FizzBuzzGenerator {
    public static String getFizzBuzzValue(int i) {
        if(i % 5 == 0 && i % 7 ==0){
            return "FizzBuzz";
        }else if (i % 7 == 0){
            return "Buzz";
        }else if(i % 5 == 0 ){
            return "Fizz";
        }else{
            return String.valueOf(i);
        }
    }
}
