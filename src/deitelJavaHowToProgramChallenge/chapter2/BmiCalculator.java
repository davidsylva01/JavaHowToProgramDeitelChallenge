package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please input your weight in kilogram");
        double weightInKg = scanner.nextDouble();
        System.out.println("input your height in Meters");
        double heightInMeters = scanner.nextDouble();
        System.out.println("Your BMI is "+ calculateBmi(weightInKg,heightInMeters));
    }

    public static double calculateBmi(double weightInKg,double heightInMeters){
        double bmi = weightInKg/(heightInMeters*heightInMeters);
        return bmi;
    }
}
