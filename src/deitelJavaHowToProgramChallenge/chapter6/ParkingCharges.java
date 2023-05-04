package deitelJavaHowToProgramChallenge.chapter6;

public class ParkingCharges {
    double minimumFee = 2.00;
    double additionalCharges = 0.50;
    double maximumCharge = 10;
    double parkingFees = 0;
    double parkCost;
    public double calculateCharge(double hoursParked) {

        if (hoursParked<=3) parkingFees = minimumFee;
        if (hoursParked>3){
            parkCost = (hoursParked -3)*additionalCharges+minimumFee;
            if (parkCost<=maximumCharge){
                parkingFees = parkCost;
            }else {
                parkingFees = maximumCharge;
            }
        }
            return parkingFees;
    }
}
