import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        System.out.println("Rectangle/Square Area: " + rectangle.area());

        SavingsAccount savingsAccount = new SavingsAccount(1000.0);
        CurrentAccount currentAccount = new CurrentAccount(2000.0);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(5000.0);
        SalaryAccount salaryAccount = new SalaryAccount(3000.0);

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

        Bank emailBank = new Bank(new EmailNotificationService());
        emailBank.sendNotification("Transaction processed for accounts");

        Bank smsBank = new Bank(new SMSNotificationService());
        smsBank.sendNotification("Transaction processed for accounts");

        AccountRepository repository = new AccountRepository();
        repository.save(fixedDepositAccount);

        StatementGenerator statementGenerator = new StatementGenerator();
        System.out.println(statementGenerator.generate(fixedDepositAccount));
    }
}
