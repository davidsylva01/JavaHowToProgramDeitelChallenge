package deitelJavaHowToProgramChallenge.chapter4;

public class CreatingAComparator {
    public static void main(String[] args) {
        System.out.println(comparator(5,9));
    }
    static int key;
    public static int comparator(int firstNumber,int secondNumber){
        if (firstNumber>secondNumber)key = 1;
        if(firstNumber<secondNumber)key = -1;
        if (firstNumber==secondNumber)key = 0;
        return key;
    }
}
