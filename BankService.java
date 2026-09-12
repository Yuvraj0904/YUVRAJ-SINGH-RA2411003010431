public interface BankService {
    void deposit(double amount);
    void withdraw(double amount);
    void transfer(double amount, String toAccount);
    void printStatement();
    void applyForLoan();
}
