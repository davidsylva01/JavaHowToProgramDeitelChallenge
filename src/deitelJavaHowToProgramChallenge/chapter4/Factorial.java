package deitelJavaHowToProgramChallenge.chapter4;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateEx(5,2));
    }
    public static int calculateFactorial(int number){
        int factorial = 1;
        for (int i=number;i>1;i--){
            factorial*=i;
        }
        return factorial;
    }
    public static double estimateE(int bound){
        double valueOfE=1;
        for (int i=1;i<=bound;i++){
            valueOfE+=(double) 1/calculateFactorial(i);
        }

        return valueOfE;
    }
    public static double calculateEx(int limit, int x){
        double Ex=1;
        for (int i =1;i<=limit;i++){
            Ex +=(Math.pow(x,i))/calculateFactorial(i);
        }

        return Ex;
    }
}
