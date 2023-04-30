package deitelJavaHowToProgramChallenge.chapter3.accountTask;

public class Account {
    private String accountName;
    private double accountBalance;

    public Account(String accountName, double accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    public String displayAccount(Account account){
        return account.toString();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
