package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        boolean isDivisibleBy3 = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number%3==0) isDivisibleBy3 = true;

        if (isDivisibleBy3){
            System.out.printf("%n%d is divisible by 3",number);
        }else{
            System.out.printf("%n%d is not divisible by 3",number);
        }
    }
}
