package deitelJavaHowToProgramChallenge.chapter5;

public class PythagoreanTriples {
    public static void main(String[] args) {
        for (int hypotenuse =1;hypotenuse<100;hypotenuse++){
            for (int side1=1;side1<=hypotenuse;side1++){
                for (int side2=1;side2<=side1;side2++){
                    if (side2*side2+side1*side1 ==hypotenuse*hypotenuse){
                        System.out.println(side1+" "+side2+" "+hypotenuse);
                    }
                }
            }
        }
    }
}
