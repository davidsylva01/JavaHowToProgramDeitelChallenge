package deitelJavaHowToProgramChallenge.chapter6;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        System.out.println(calculateDistance(2,2,4,5));
    }
    public static double calculateDistance(double row1,double column1, double row2, double column2){
        return Math.sqrt(Math.pow((row2-row1),2)+Math.pow((column2-column1),2));
    }
}
