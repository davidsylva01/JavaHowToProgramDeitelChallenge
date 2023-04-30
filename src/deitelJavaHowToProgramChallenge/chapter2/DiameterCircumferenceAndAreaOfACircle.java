package deitelJavaHowToProgramChallenge.chapter2;

import java.util.Scanner;

public class DiameterCircumferenceAndAreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = scanner.nextDouble();
        double diameter = 2*radius;
        double circumference = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;

        System.out.printf("The diameter is %.3f%nThe circumference is %.3f%nThe area is %.3f",diameter,circumference,area);
    }
}
