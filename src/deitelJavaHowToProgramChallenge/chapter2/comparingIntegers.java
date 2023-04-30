package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class comparingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int square = number * number;

        if (number>100){
            System.out.println("Number is greater than 100");
        } else if (square>100) {
            System.out.println("The square of the Number is greater than 100");
        }else if (number==100){
            System.out.println("The Number is 100");
        }else {
            System.out.println("The square of the Number is less than 100");
        }
    }
}
