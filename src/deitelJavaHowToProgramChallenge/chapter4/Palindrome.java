package deitelJavaHowToProgramChallenge.chapter4;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(12321));
    }
    static int[] numArray;
    static boolean isPalindrome = true;
    public static int[] convertNumberToArray(int number){
        int numberLength = (int)Math.log10(number)+1;
         numArray = new int[numberLength];
         int count = numberLength;
        for (int i =0;i<count;i++){
           numArray[i] = number/(int)Math.pow(10,numberLength-1);
           number%=(int)Math.pow(10,numberLength-1);
           numberLength--;
        }
        return numArray;

    }
    public static boolean isNumberPalindrome(int number){
        convertNumberToArray(number);
        int counter = 0;
        for (int i= numArray.length-1;i>=0;i--){
            if (numArray[i]!=numArray[counter])isPalindrome=false;
//            System.out.println(numArray[i] + " " +numArray[counter]);
            counter++;

        }
       return isPalindrome;
    }
}
