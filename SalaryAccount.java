public class SalaryAccount extends Account implements Withdrawable {
    public SalaryAccount() {
        super();
    }

    public SalaryAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        deposit(-amount);
    }
}
