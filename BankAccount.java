public class BankAccount extends Account implements Withdrawable {
    public BankAccount() {
        super();
    }

    public BankAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        deposit(-amount);
    }
}
