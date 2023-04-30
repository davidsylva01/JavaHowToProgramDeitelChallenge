package deitelJavaHowToProgramChallenge.chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        System.out.println(calculateSalesPersonsEarnings(20,30,50,100));
    }
    static int totalValue = 0;

    public static double calculateSalesPersonsEarnings(int... valueOfItemsSold) {
        for (int i : valueOfItemsSold) {
            totalValue += i;
        }

        return 200 + (0.09 * totalValue);
    }

}