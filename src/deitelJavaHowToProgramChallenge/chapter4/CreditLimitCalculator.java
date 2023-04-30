package deitelJavaHowToProgramChallenge.chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        checkCreditLimit();

    }

    private static int accountNumber;
    private static int beginningBal;
    private static int charges;
    private static int credits;
    private static int creditLimit;

    public static int calculateNewBalance(int accountNumber, int creditLimit, int beginningBal, int charges, int credits) {
       int newBal = beginningBal + charges - credits;
       return newBal;
    }
    public static void checkCreditLimit() {
        System.out.println("How many customers are you testing for?");
        java.util.Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size > 0) {
            for (int customerList = 0; customerList < size; customerList++) {
                System.out.println("Enter account number for customer "+ (customerList+1));
                accountNumber = scanner.nextInt();
                System.out.println("Enter the credit limit, beginning balance, charges and credits for account number " + accountNumber);
                for (int customerDetails = 0;customerDetails<4;customerDetails++){
                    int entry = scanner.nextInt();
                    switch (customerDetails){
                        case 0:
                            creditLimit = entry;
                        case 1:
                            beginningBal = entry;
                        case 2:
                            charges = entry;
                        case 3:
                            credits = entry;
                    }
                }
               int newBal = calculateNewBalance(accountNumber,creditLimit,beginningBal,charges,credits);
                System.out.println("The new balance is "+newBal+". The credit limit is "+creditLimit);
                if (creditLimit > newBal) System.out.println("account number "+ accountNumber+ " Credit Limit exceeded");
                if (creditLimit <= newBal) System.out.println("account number "+ accountNumber+" Balance okay");
            }

        }
    }
}
