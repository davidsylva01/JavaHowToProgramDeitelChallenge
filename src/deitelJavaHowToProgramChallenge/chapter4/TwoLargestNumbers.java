package deitelJavaHowToProgramChallenge.chapter4;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int largestNumber = scanner.nextInt();
        int smallestNumber = largestNumber;
        int secondLargestNumber = smallestNumber;
        for (int count = 1; count<10;count++){
            int number = scanner.nextInt();
            if(number>largestNumber)largestNumber =number;
            if(number<smallestNumber)smallestNumber =number;

            if (number!=largestNumber&&number>secondLargestNumber)secondLargestNumber = number;
        }
        System.out.printf("The largest number is %d%nThe second largest is %d%nThe smallest is%d",largestNumber,secondLargestNumber,smallestNumber);
    }
}
