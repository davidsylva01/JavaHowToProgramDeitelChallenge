package deitelJavaHowToProgramChallenge.chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int milesDriven = 0,gallonsUsed = 0;
        int tripsCount =0;
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.println("Enter number of miles driven or -1 to quit");
        milesDriven = scanner.nextInt();
        System.out.println("Enter number of gallons used or -1 to quit");
        gallonsUsed = scanner.nextInt();
        if (milesDriven>0&&gallonsUsed>0) {
            tripsCount++;
            double mpg =  GasMileage.getMilesPerGallon(milesDriven,gallonsUsed);
            totalGallons +=gallonsUsed;
            totalMiles+=milesDriven;
            System.out.printf("The MPG for trip%d is %.2f",tripsCount,mpg);
        }

        while (milesDriven!=-1 && gallonsUsed!=-1){
            System.out.println("Enter number of miles driven or -1 to quit");
            milesDriven = scanner.nextInt();
            System.out.println("Enter number of gallons used or -1 to quit");
            gallonsUsed = scanner.nextInt();
            if (milesDriven>0&&gallonsUsed>0) {
                tripsCount++;
              double mpg =  GasMileage.getMilesPerGallon(milesDriven,gallonsUsed);
                totalGallons +=gallonsUsed;
                totalMiles+=milesDriven;
                System.out.printf("The MPG for trip%d is %.2f",tripsCount,mpg);
            }
        }
        System.out.printf("The total MPG for the %d trips is %.2f",tripsCount,getMilesPerGallon(totalMiles,totalGallons));
    }

    private int milesDriven;
    private int gallonsUsed;

    public GasMileage(int milesDriven, int gallonsUsed) {
        this.milesDriven = milesDriven;
        this.gallonsUsed = gallonsUsed;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public int getGallonsUsed() {
        return gallonsUsed;
    }

    public void setGallonsUsed(int gallonsUsed) {
        this.gallonsUsed = gallonsUsed;
    }
    public static double getMilesPerGallon(int milesDriven, int gallonsUsed){
        double mpg =(double) milesDriven/gallonsUsed;
        return mpg;
    }
}
