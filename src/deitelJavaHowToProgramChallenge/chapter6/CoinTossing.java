package deitelJavaHowToProgramChallenge.chapter6;

import java.security.SecureRandom;
import java.util.Objects;

public class CoinTossing {
    static String side;
    public static void main(String[] args) {
        int headCount=0;
        int tailCount=0;
        for (int i=0;i<1000;i++){
            tossCoin();
            switch (tossCoin()){
                case "Head":
                    headCount++;
                    break;
                case "Tail":
                    tailCount++;
            }
        }
        System.out.println(headCount+" "+tailCount);
    }
    public static String tossCoin(){

        SecureRandom random = new SecureRandom();
        int toss = 1+random.nextInt(2);
        if (toss==1){
            side = "Head";
        }else{
            side = "Tail";
        }
        return side;
    }
    public static String flip(){
        if (Objects.equals(side, "Tail"))side="Head";
        if (Objects.equals(side, "Head"))side="Tail";
        return side;
    }
}
