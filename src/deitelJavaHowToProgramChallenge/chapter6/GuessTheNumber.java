package deitelJavaHowToProgramChallenge.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int randomNumber = 1+ random.nextInt(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 1000");
        int guess = scanner.nextInt();
     while (guess!=randomNumber){
         if (guess/randomNumber>250) System.out.println("Guess is too high");
         if (randomNumber/guess>250) System.out.println("Guess is too low");
         if (guess/randomNumber<=250) System.out.println("Guess is high, but quite close");
         if (randomNumber/guess<=250) System.out.println("Guess is low, but quite close");
         if (randomNumber/guess<=25||guess/randomNumber<=25) System.out.println("you're within touching distance");
         System.out.println("Enter another guess");
         guess =scanner.nextInt();
     }
    }
}
