public class StatementGenerator {
    public String generate(BankAccount account) {
        return "Statement for balance: " + account.getBalance();
    }
}
