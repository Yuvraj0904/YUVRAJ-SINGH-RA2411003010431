public class BankAccount extends Account implements Withdrawable {
    public BankAccount() {
        super();
    }

    public BankAccount(double initialBalance) {
        super(initialBalance);
    }

    public BankAccount(int accountNumber, String name, double initialBalance) {
        super(accountNumber, name, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        deposit(-amount);
    }
}
