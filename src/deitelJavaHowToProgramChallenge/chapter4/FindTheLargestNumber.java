package deitelJavaHowToProgramChallenge.chapter4;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int largestNumber = scanner.nextInt();
        for (int count = 1; count<10;count++){
        int number = scanner.nextInt();
        if(number>largestNumber)largestNumber =number;
        }
        System.out.printf("The largest number is %d",largestNumber);
    }
}
