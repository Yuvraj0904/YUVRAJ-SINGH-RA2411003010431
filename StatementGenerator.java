public class StatementGenerator {
    public String generate(Account account) {
        return "Statement for balance: " + account.getBalance();
    }
}
