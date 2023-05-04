package deitelJavaHowToProgramChallenge.chapter6;

import deitelJavaHowToProgramChallenge.chapter4.EnforcingPrivacyWithCryptography;

public class CalculatingTheSumOfDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(4423));
    }
    public static int addDigits(int numbers){
        int sum=0;
     int[] separatedNumbers = EnforcingPrivacyWithCryptography.separateNumbers(numbers);
        for (int number:separatedNumbers){
            sum+=number;
        }
        return sum;
    }
}
