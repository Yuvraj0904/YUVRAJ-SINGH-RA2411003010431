import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        System.out.println("Rectangle/Square Area: " + rectangle.area());

        SavingsAccount savingsAccount = new SavingsAccount(101, "Alice", 1000.0);
        CurrentAccount currentAccount = new CurrentAccount(102, "Bob", 2000.0);
        SalaryAccount salaryAccount = new SalaryAccount(103, "Charlie", 3000.0);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(104, "David", 5000.0);

        List<Withdrawable> withdrawableAccounts = new ArrayList<>();
        withdrawableAccounts.add(savingsAccount);
        withdrawableAccounts.add(currentAccount);
        withdrawableAccounts.add(salaryAccount);

        for (Withdrawable account : withdrawableAccounts) {
            account.withdraw(100.0);
        }

        fixedDepositAccount.deposit(500.0);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
        System.out.println("Salary Account Balance: " + salaryAccount.getBalance());
        System.out.println("Fixed Deposit Account Balance: " + fixedDepositAccount.getBalance());

        InterestPolicy savingsPolicy = new SavingsInterestPolicy();
        InterestPolicy currentPolicy = new CurrentInterestPolicy();
        InterestPolicy salaryPolicy = new SalaryInterestPolicy();

        System.out.println("Savings Account Interest: " + savingsPolicy.calculate(savingsAccount.getBalance()));
        System.out.println("Current Account Interest: " + currentPolicy.calculate(currentAccount.getBalance()));
        System.out.println("Salary Account Interest: " + salaryPolicy.calculate(salaryAccount.getBalance()));

        ATM atm = new ATM(10000.0);
        atm.deposit(500.0);
        atm.withdraw(200.0);
        System.out.println("ATM Balance: " + atm.getBalance());

        savingsAccount.transfer(150.0, "CurrentAccount");
        savingsAccount.printStatement();

        AccountRepository fileRepo = new FileAccountRepository("accounts.txt");
        NotificationService emailService = new EmailNotificationService();
        Bank fileBank = new Bank(fileRepo, emailService);
        fileBank.processAccount(savingsAccount);

        AccountRepository inMemoryRepo = new InMemoryAccountRepository();
        NotificationService smsService = new SMSNotificationService();
        Bank inMemoryBank = new Bank(inMemoryRepo, smsService);
        inMemoryBank.processAccount(salaryAccount);

        StatementGenerator statementGenerator = new StatementGenerator();
        System.out.println(statementGenerator.generate(fixedDepositAccount));
    }
}
