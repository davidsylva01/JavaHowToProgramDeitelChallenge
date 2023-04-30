package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class WorldPopulationGrowthRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the growth rate");
        double growthRate = scanner.nextDouble();
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        double worldPopulation2023 = 8;
        double newWorldPopulation = worldPopulation2023 * (1+(Math.pow(growthRate,year-2023)));
        System.out.printf("Estimated world population in %d is %.2f billion",year,newWorldPopulation);
    }
}
