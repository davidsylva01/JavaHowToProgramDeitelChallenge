package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class SeparatingTheDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 5-digit number");
        int number = scanner.nextInt();

        System.out.println("The digits of the number are " +number/10000 +"   "+ number/1000%10+"   "+number/100%10+"   "+number/10%10+"   "+number%10);
    }
}
