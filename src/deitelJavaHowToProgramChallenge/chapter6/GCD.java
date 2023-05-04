package deitelJavaHowToProgramChallenge.chapter6;

public class GCD {
    public static void main(String[] args) {
        System.out.println( getGcd(1701,3768));
    }
    public static int getGcd(int number1, int number2) {
        int gcd = 0;
        int highestNumber = number1;
        int smallNumber = number2;
        int remainder = 0;
        if (number2 > number1) {
            highestNumber = number2;
            smallNumber = number1;}
            remainder = smallNumber;
            while (remainder != 0) {
                remainder = highestNumber % smallNumber;
                highestNumber = smallNumber;
                smallNumber = remainder;
            }

        return highestNumber;
    }
}