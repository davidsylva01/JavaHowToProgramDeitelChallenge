package deitelJavaHowToProgramChallenge.chapter3.accountTask;

public class AccountImpl {
    public static void main(String[] args) {
        Account account = new Account("Okon",500);
        System.out.println(account.displayAccount(account));
    }
}
