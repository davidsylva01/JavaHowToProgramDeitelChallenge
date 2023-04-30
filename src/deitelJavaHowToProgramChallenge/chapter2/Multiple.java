package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scanner.nextInt();
        boolean isMultiple = false;
        if ((firstNumber * 3) % (secondNumber * 2) == 0) isMultiple = true;

        if (isMultiple) {
            System.out.printf("%n Triple of %d is a multiple of double of %d", firstNumber, secondNumber);
        } else {
            System.out.printf("%n Triple of %d is not a multiple of double of %d", firstNumber, secondNumber);

        }
    }
}