package deitelJavaHowToProgramChallenge.chapter1;

import java.util.Scanner;

public class CarbonFootprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.printf("Dear %s, welcome to Jainda carbon footprint calculator %n Which country do you live in? %n",name);
        String country = scanner.nextLine();

        System.out.println("How many Kilowatts of electricity do you consume monthly?");
        double elect = scanner.nextDouble();
        System.out.println("How many litres of petrol do you consume monthly?");
        double petrol = scanner.nextDouble();
        System.out.println("How many Kilograms of natural gas do you consume monthly?");
        double gas = scanner.nextDouble();

        double carbonFootprint = (elect * 0.4659 + petrol * 0.55 + gas * 0.5) /3;

        System.out.printf("Your carbon footprint is %.3f",carbonFootprint);
    }
}
