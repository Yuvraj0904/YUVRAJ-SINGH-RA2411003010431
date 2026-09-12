public class CurrentAccount extends Account implements Withdrawable {
    public CurrentAccount() {
        super();
    }

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        deposit(-amount);
    }
}
