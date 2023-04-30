package deitelJavaHowToProgramChallenge.chapter4;

import java.util.Arrays;

public class EnforcingPrivacyWithCryptography {
    public static void main(String[] args) {
        int[] encryptedNumber = {0,1,8,9};
        System.out.println(decryptNumber(encryptedNumber));
    }
    public static int[] separateNumbers(int number) {
        int numLength = (int)Math.log10(number)+1;
        int[] numArray = new int[numLength];
        int counterControl = numLength;
        for (int i =0; i<counterControl;i++){
            numArray[i]= (int) (number/Math.pow(10,numLength-1));
            number%=(int)Math.pow(10,numLength-1);
            numLength--;
        }
        return numArray;
    }

    public static int[] encryptNumbers(int numbers) {
        int[] separatedNumbers = separateNumbers(numbers);
        int[] encryptedNum = new int[separatedNumbers.length];
        int[] tempNumber = new int[separatedNumbers.length];
        for (int i =0;i< separatedNumbers.length;i++){
             tempNumber[i] = (separatedNumbers[i]+7)%10;
        }

        encryptedNum[0] = tempNumber[2];
        encryptedNum[1] = tempNumber[3];
        encryptedNum[2] = tempNumber[0];
        encryptedNum[3] = tempNumber[1];

        return encryptedNum;

    }

    public static int decryptNumber(int[] encryptedNumber) {
        int[] decryptedNumber = new int[encryptedNumber.length];
        int[] tempArray = new int[encryptedNumber.length];
        String num ="";
        tempArray[0] = encryptedNumber[2];
        tempArray[1] = encryptedNumber[3];
        tempArray[2] = encryptedNumber[0];
        tempArray[3] = encryptedNumber[1];

        for (int i=0; i<encryptedNumber.length; i++){
            decryptedNumber[i]= (tempArray[i]+10-7)%10;
            num+=decryptedNumber[i];
        }
        return Integer.parseInt(num);
    }
}
