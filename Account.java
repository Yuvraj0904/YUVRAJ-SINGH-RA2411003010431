public class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
