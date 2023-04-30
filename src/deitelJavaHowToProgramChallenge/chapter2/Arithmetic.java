package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();

        int firstNumberSquare = firstNumber * firstNumber;
        int secondNumberSquare = secondNumber * secondNumber;
        int sum = firstNumberSquare + secondNumberSquare;
        int difference = firstNumberSquare - secondNumberSquare;

        System.out.printf("The square of the numbers is %d and" +
                " %d respectively%nThe sum of the squares %d%nThe " +
                "difference between first and second numbers is %d",firstNumberSquare,secondNumberSquare,sum,difference);
    }
}
