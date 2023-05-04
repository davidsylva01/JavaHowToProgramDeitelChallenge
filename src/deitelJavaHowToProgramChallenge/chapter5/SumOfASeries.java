package deitelJavaHowToProgramChallenge.chapter5;

public class SumOfASeries {
    public static void main(String[] args) {
        System.out.println( sumNumbersUpTo(100));
    }
    public static Object sumNumbersUpTo(int bound){
        int sum = 0;;
        for (int i=0;i<=bound;i++){
            sum+=i;
            System.out.println( i+" ---> "+sum);
        }
        return "";
    }
}
