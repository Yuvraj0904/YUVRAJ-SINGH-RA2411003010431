public class SavingsAccount extends Account implements Depositable, Withdrawable, Transferable, StatementProvider {
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public SavingsAccount(int accountNumber, String name, double initialBalance) {
        super(accountNumber, name, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        deposit(-amount);
    }

    @Override
    public void transfer(double amount, String toAccount) {
        withdraw(amount);
        System.out.println("Transferred " + amount + " to " + toAccount);
    }

    @Override
    public void printStatement() {
        System.out.println("Statement for " + getName() + ": balance = " + getBalance());
    }
}
