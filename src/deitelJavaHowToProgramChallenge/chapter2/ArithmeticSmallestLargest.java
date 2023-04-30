package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first numbers");
       int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum/3;
        int product = firstNumber * secondNumber * thirdNumber;
        int smallest = firstNumber;
        if (secondNumber<smallest)smallest =secondNumber;
        if (thirdNumber<smallest)smallest = thirdNumber;
        int largest = firstNumber;
        if (secondNumber>largest)largest =secondNumber;
        if (thirdNumber>largest)largest = thirdNumber;

        System.out.printf("The sum is %d%nThe average is %d%n" +
                "The product is %d%nThe smallest is%d%nThe largest is %d%n",
                sum,average,product,smallest,largest);
    }
}
