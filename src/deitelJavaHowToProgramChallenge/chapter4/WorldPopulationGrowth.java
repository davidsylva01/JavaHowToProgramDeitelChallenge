package deitelJavaHowToProgramChallenge.chapter4;

import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the World Population growth rate");
        double growthRate = scanner.nextDouble();
        System.out.println("Enter the current World Population");
        double basePopulation = scanner.nextDouble();
        double population = basePopulation +(growthRate/100*basePopulation);
        double numericalIncrease = population-basePopulation;


        System.out.printf("Year \t Population \t Numerical Increase%n");
        for (int i = 1; i <= 75; i++) {
            System.out.printf("%d\t%.2f\t%.2f%n",i,population, numericalIncrease);
            basePopulation=population;
            population+=(growthRate/100*basePopulation);
        }
    }
}