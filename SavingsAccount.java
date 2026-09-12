public class SavingsAccount extends Account implements Withdrawable {
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        deposit(-amount);
    }
}
