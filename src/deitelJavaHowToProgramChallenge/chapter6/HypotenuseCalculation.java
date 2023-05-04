package deitelJavaHowToProgramChallenge.chapter6;

public class HypotenuseCalculation {

    double hypotenuse;
    public double calculateHypotenuse(double side1,double side2) {
        double hypoSquare =Math.pow(side1,2) + Math.pow(side2,2);
        hypotenuse = Math.sqrt(hypoSquare);

        return hypotenuse;
    }
}
