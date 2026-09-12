public class ATM implements Depositable, Withdrawable {
    private double balance;

    public ATM() {
        this.balance = 0.0;
    }

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
