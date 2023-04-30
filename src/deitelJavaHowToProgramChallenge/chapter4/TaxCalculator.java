package deitelJavaHowToProgramChallenge.chapter4;

import java.util.Scanner;

public class TaxCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        for (int citizenCount = 1; citizenCount<4;citizenCount++){
            System.out.printf("Enter citizen %d earnings%n",citizenCount);
            double earning = scanner.nextDouble();
            System.out.printf("The total tax for citizen %d is %.2f%n",citizenCount, TaxCalculator.getTotalTax(earning));
        }
    }
    static double totalTax = 0;
    static double taxRate = 0.15;
    static double ceiling = 30000;
    public static double getTotalTax(double earnings) {
        if (earnings<=ceiling)totalTax=(earnings*taxRate);
        if (earnings>ceiling)totalTax=(earnings*taxRate)+0.05*(earnings-ceiling);
        return totalTax;
    }
}
