package deitelJavaHowToProgramChallenge.chapter3.heartRateTask;

public class HeartRateMain {
    public static void main(String[] args) {
        HeartRate heartRate = new HeartRate("David","Sylva",1993);
        System.out.println("age is "+ heartRate.calculateAge());
        System.out.println("Max heart rate is "+ heartRate.getMaximumHeartRate());
        System.out.println("min heartrate is "+ heartRate.targetHeartRange());
    }
}
