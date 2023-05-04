package deitelJavaHowToProgramChallenge.chapter5;

public class IntegersDivisibleBy3 {
    public static void main(String[] args) {
        System.out.println("The divisors of 3 are:");
        for (int divisor=1;divisor<=30;divisor++){
            if (divisor%3==0) System.out.println(divisor);
        }
    }
}
