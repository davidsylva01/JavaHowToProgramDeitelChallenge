package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        int negativesCount = 0;
        int positivesCount = 0;
        int zerosCount =0;
        int[] checkedNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int number =0; number<5;number++){
            checkedNumbers[number] = scanner.nextInt();
            if (checkedNumbers[number]>0) positivesCount++;
            if (checkedNumbers[number]<0) negativesCount++;
            if (checkedNumbers[number]==0) zerosCount++;
        }
        System.out.printf("The numbers of positive numbers is %d%nThe number of negative numbers is %d%nThe number of zero values is %d",positivesCount,negativesCount,zerosCount);
    }
}
