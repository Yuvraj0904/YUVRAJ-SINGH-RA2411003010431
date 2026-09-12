public class CurrentAccount extends Account implements Depositable, Withdrawable {
    public CurrentAccount() {
        super();
    }

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    public CurrentAccount(int accountNumber, String name, double initialBalance) {
        super(accountNumber, name, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        deposit(-amount);
    }
}
