package deitelJavaHowToProgramChallenge.chapter5;

public class CalculatingTheValueOfPi {
    public static void main(String[] args) {
        int controlCount = 1;
        double pi = 0;
        double num = 4;
        for (int i =1; i<50;i+=2){
            if (controlCount%2==0) pi += -1*(num/i);
            if (controlCount%2!=0) pi +=  (num/i);
            System.out.println(pi);
            controlCount++;
        }
    }
}
