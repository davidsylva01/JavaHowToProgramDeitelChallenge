package deitelJavaHowToProgramChallenge.chapter4;

import java.util.Scanner;

public class ReadingNumbersUntilASpecifiedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number");
        int sum= scanner.nextInt();
        while (firstNumber>sum){
            int num = scanner.nextInt();
            sum+=num;
        }
        System.out.println(sum +" is larger than or equal to "+firstNumber);
    }
}
