package deitelJavaHowToProgramChallenge.chapter5;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        for (int row = 0; row <= 7; row++) {
            for (int column = 7; column >= row; column--) {
                System.out.print(" ");
            }
            for (int column = 0; column <= row; column++) {
                System.out.print("*");
            }
            for (int column = 0; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int row = 0; row <= 7; row++) {
//
            for (int column = row; column >= 0; column--) {
                System.out.print(" ");
            }
            for (int column = 7; column >= row; column--) {
                System.out.print("*");
            }
            for (int column = 7; column >= row; column--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
