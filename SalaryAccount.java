public class SalaryAccount extends Account implements Depositable, Withdrawable {
    public SalaryAccount() {
        super();
    }

    public SalaryAccount(double initialBalance) {
        super(initialBalance);
    }

    public SalaryAccount(int accountNumber, String name, double initialBalance) {
        super(accountNumber, name, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        deposit(-amount);
    }
}
