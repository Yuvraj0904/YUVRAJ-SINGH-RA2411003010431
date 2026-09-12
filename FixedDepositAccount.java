public class FixedDepositAccount extends Account {
    public FixedDepositAccount() {
        super();
    }

    public FixedDepositAccount(double initialBalance) {
        super(initialBalance);
    }

    public FixedDepositAccount(int accountNumber, String name, double initialBalance) {
        super(accountNumber, name, initialBalance);
    }
}
