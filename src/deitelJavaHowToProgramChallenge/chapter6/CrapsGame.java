package deitelJavaHowToProgramChallenge.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsGame {
    private static Status gameStatus;

    public static void main(String[] args) {
        System.out.print( playCrabs());
    }

    private static int currentWager;
    private static int openingBalance =1000;
    private static int balance=openingBalance-currentWager;
    private static final int SNAKE_EYES =2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN=11;
    private static final int BOX_CARS = 12;
    private static int myPoint = 0;

    public static int rollDice() {
        SecureRandom random = new SecureRandom();
        int dye1 = 1 + random.nextInt(6);
        int dye2 = 1 + random.nextInt(6);
        return dye2+dye1;
    }
    public static Status playCrabs() {
        wager(700);
      myPoint =  rollDice();
        switch (myPoint){
            case SEVEN:
            case YO_LEVEN:
                System.out.println("you rolled "+myPoint);
                gameStatus=Status.WON;
                balance+=currentWager*2;
            break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                System.out.println("you rolled "+myPoint);
                gameStatus=Status.LOST;
                break;
            default:
                System.out.println("you rolled "+myPoint+" game on");
                gameStatus=Status.CONTINUE;
        }
        while (gameStatus==Status.CONTINUE){
            int secondRoll = rollDice();
            System.out.println("You rolled "+secondRoll);
            if (secondRoll==myPoint){
                gameStatus=Status.WON;
                balance+=currentWager*2;
            } else if (secondRoll ==SEVEN) {
                gameStatus=Status.LOST;
            }
        }
        System.out.println("Your balance is "+ balance);
        return gameStatus;
    }
    private static void wager(int amount){
        if (amount<= openingBalance){
            balance-=amount;
            System.out.printf("%d wagered. Balance is %d",amount,balance);
        }else {
            while (amount>openingBalance){
                System.out.printf("Invalid amount. Available balance is %d",balance);
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();
                if (input<openingBalance)amount=input;
            }
        }
        currentWager=amount;
    }

}