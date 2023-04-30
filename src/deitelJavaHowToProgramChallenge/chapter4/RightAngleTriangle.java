package deitelJavaHowToProgramChallenge.chapter4;

public class RightAngleTriangle {
    public static void main(String[] args) {
        drawRightAngle(7);
    }

    public static void drawRightAngle(int base) {
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}