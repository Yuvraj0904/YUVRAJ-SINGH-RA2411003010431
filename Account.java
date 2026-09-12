public class Account implements Depositable {
    private int accountNumber;
    private String name;
    private double balance;

    public Account() {
        this(0, "Default", 0.0);
    }

    public Account(double initialBalance) {
        this(0, "Default", initialBalance);
    }

    public Account(int accountNumber, String name, double initialBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
