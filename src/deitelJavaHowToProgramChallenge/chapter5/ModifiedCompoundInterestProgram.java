package deitelJavaHowToProgramChallenge.chapter5;

public class ModifiedCompoundInterestProgram {
    public static void main(String[] args) {
        System.out.println(calculateInterestRate(3500,20,5));
    }
    public static double calculateInterestRate(double principal,double interestRate,int tenureInYears){

        return principal * Math.pow(1+ interestRate/100,tenureInYears);
    }
}
