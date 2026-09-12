/**
 * Main demonstration class for Section 1 — Single Responsibility Principle (SRP).
 * 
 * Demonstrates the separation of concerns:
 * - BankAccount: manages balance and transactions
 * - AccountRepository: handles persistence
 * - NotificationService: handles alerts/notifications
 * - StatementGenerator: handles formatted statement generation
 * 
 * 5. (Wrap-up) Reflection:
 * We ended up with 4 distinct classes: BankAccount, AccountRepository,
 * NotificationService, and StatementGenerator.
 * This design is significantly easier to test because each class has only one reason
 * to change and can be verified in complete isolation using simple, focused unit tests.
 * Testing BankAccount deposit and withdrawal calculations no longer requires configuring
 * database connections or mocking SMTP email servers, eliminating brittle tests and side effects.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== GreenLeaf Bank: Section 1 (SRP) Demo ===");

        // 1. Create a BankAccount instance with initial balance
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Initial Account Balance: " + account.getBalance());

        // 2. Perform deposits and withdrawals
        account.deposit(500.0);
        System.out.println("Deposited 500.0, Current Balance: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Withdrawn 200.0, Current Balance: " + account.getBalance());

        // 3. Use AccountRepository to persist the account
        AccountRepository repository = new AccountRepository();
        repository.save(account);

        // 4. Use NotificationService to dispatch an alert
        NotificationService notificationService = new NotificationService();
        notificationService.send("Transaction successful. Your new balance is " + account.getBalance());

        // 5. Use StatementGenerator to create a formatted statement
        StatementGenerator statementGenerator = new StatementGenerator();
        String statement = statementGenerator.generate(account);
        System.out.println("Generated Statement: " + statement);

        System.out.println("=== SRP Demo Completed Successfully ===");
    }
}
