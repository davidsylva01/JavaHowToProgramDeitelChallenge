package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class StatisticsForTheGreatPyramidOfGiza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the estimated number of stones used");
        int stones = scanner.nextInt();
        System.out.println("Enter the Average weight of each stone in kg");
        double averageWeight = scanner.nextDouble();
        System.out.println("Enter the Number of years taken to build the pyramid (assuming a year comprises 365 days)");
        int numberOfYears = scanner.nextInt();

        double howMuchBuiltPerYear = stones*averageWeight/numberOfYears;
        double howMuchBuiltPerHour = howMuchBuiltPerYear/365/24;
        double howMuchBuiltPerMinute = howMuchBuiltPerHour/60;

        System.out.printf("The estimated weight of stones built per year, hour and minute are %.2f, %.2f and %.2f",howMuchBuiltPerYear,howMuchBuiltPerHour,howMuchBuiltPerMinute);
    }
}
