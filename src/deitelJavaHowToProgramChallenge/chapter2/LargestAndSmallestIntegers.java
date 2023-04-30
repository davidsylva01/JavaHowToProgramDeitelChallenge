package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 5 numbers");
        int firstEntry = scanner.nextInt();
        int smallest = firstEntry;
        int largest = firstEntry;
        for (int i = 0; i<4; i++){
            int number = scanner.nextInt();
            if (number <smallest)smallest=number;
            if (number >largest)largest=number;
        }
        System.out.printf("The smallest number is %d%nThe largest number is%d",smallest,largest);
    }
}
