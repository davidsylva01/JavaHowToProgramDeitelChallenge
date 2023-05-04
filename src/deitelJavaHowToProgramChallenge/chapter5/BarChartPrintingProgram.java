package deitelJavaHowToProgramChallenge.chapter5;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        String result1 ="",result2="",result3="",result4="",result5="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int count =1;count<=5;count++){
            int number = scanner.nextInt();;
            switch (count){
                case 1:
                    int firstNumber=number;
                    for (int i = 1; i<=firstNumber; i++) {
                       result1+= ("*");
                    }
                    break;
                case 2:
                    int secondNumber=number;
                    for (int i = 1; i<=secondNumber; i++) {
                        result2+= ("*");
                    }
                    break;
                case 3:
                    int thirdNumber = number;
                    for (int i = 1; i<=thirdNumber; i++) {
                        result3+= ("*");
                    }
                    break;
                case 4:
                    int fourthNumber = number;
                    for (int i = 1; i<=fourthNumber; i++) {
                        result4+= ("*");
                    }
                    break;
                case 5:
                    int fifthNumber = number;
                    for (int i = 1; i<=fifthNumber; i++) {
                        result5+= ("*");
                    }
            }

        }
        System.out.println(result1 +"\n"+result2+"\n"+result3+"\n"+result4+"\n"+result5);
    }
}
