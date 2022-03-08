package org.sparta.mv;

public class IsPalendromeChecker {
    public static boolean isPalendrome (String word){
        char[] wordArr = word.toLowerCase().toCharArray();
        int wordLen = word.length();
        int lastLetterIndex = wordLen - 1;
        int sameLetters = 0;
        for (int i = 0; i< wordLen/2 ; i++){
            if(wordArr[i] == wordArr[lastLetterIndex]){
                sameLetters ++;
            }
            lastLetterIndex--;
        }
        if(sameLetters >= wordLen/2){
            return true;
        }
        return false;
    }
}
