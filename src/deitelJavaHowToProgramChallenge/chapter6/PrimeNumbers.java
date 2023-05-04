package deitelJavaHowToProgramChallenge.chapter6;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i=2;i<100;i++){
            if (isPrime(i)) System.out.println(i);
        }
    }
    public static boolean isPrime(int number){
        boolean isPrime = true;
        for (int i = 2;i<number;i++){
                if (number%i==0)isPrime=false;
        }
        return isPrime;
    }
}
