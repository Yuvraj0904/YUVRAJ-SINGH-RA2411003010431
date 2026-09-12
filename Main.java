public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount(1000.0);
        BankAccount currentAccount = new CurrentAccount(2000.0);
        BankAccount salaryAccount = new SalaryAccount(3000.0);

        InterestPolicy savingsPolicy = new SavingsInterestPolicy();
        InterestPolicy currentPolicy = new CurrentInterestPolicy();
        InterestPolicy salaryPolicy = new SalaryInterestPolicy();

        System.out.println("Savings Account Interest: " + savingsPolicy.calculate(savingsAccount.getBalance()));
        System.out.println("Current Account Interest: " + currentPolicy.calculate(currentAccount.getBalance()));
        System.out.println("Salary Account Interest: " + salaryPolicy.calculate(salaryAccount.getBalance()));

        Bank emailBank = new Bank(new EmailNotificationService());
        emailBank.sendNotification("Salary account created with balance " + salaryAccount.getBalance());

        Bank smsBank = new Bank(new SMSNotificationService());
        smsBank.sendNotification("Salary account created with balance " + salaryAccount.getBalance());

        AccountRepository repository = new AccountRepository();
        repository.save(salaryAccount);

        StatementGenerator statementGenerator = new StatementGenerator();
        System.out.println(statementGenerator.generate(salaryAccount));
    }
}
