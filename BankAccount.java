/**
 * ============================================================================
 * Section 1 — Single Responsibility Principle (SRP)
 * ============================================================================
 * 
 * 1. (Warm-up) Distinct "reasons to change" identified in the original bloated BankAccount:
 *    - Reason 1: Changes in database persistence logic or schema (e.g., migrating from JDBC/Hibernate to another ORM/DB).
 *    - Reason 2: Changes in notification/email provider or message format (e.g., switching SMTP provider or adding SMS/WhatsApp).
 *    - Reason 3: Changes in account statement formatting or reporting requirements (e.g., PDF/CSV/HTML statements).
 *    - Reason 4: Changes in tax calculation rules or government financial regulations (e.g., tax rate modifications).
 *    - Reason 5: Changes in core account balance transaction rules (e.g., overdraft limits, balance validation).
 * 
 * 2. (Warm-up) Plain-English one-line "job description" for BankAccount:
 *    "Manages the account balance state by executing valid deposits and withdrawals."
 * ============================================================================
 */
public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
