package deitelJavaHowToProgramChallenge.chapter6;

public class PerfectNumber {
    public static void main(String[] args) {
        for (int range=1;range<=1000;range++){
            if (isPerfect(range)) System.out.println(range);
        }
    }
    public static boolean isPerfect(int number){
        boolean isPerfect = false;
        int tempSum =0;
        for (int i =1;i<number;i++){
            if (number%i==0){
                tempSum+=i;
            }
        }
        if (tempSum==number)isPerfect=true;
        return isPerfect;
    }
}
