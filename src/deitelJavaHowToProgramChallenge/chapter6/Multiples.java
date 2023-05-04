package deitelJavaHowToProgramChallenge.chapter6;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(isMultiple(8,4));
    }
    public static boolean isMultiple(int firstNumber, int secondNumber){
        boolean isMultipleOfFirstNumber = false;
        if (firstNumber%secondNumber==0)isMultipleOfFirstNumber=true;
        return isMultipleOfFirstNumber;
    }
}
