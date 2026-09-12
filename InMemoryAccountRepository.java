import java.util.HashMap;
import java.util.Map;

public class InMemoryAccountRepository implements AccountRepository {
    private final Map<Integer, Account> accounts = new HashMap<>();

    @Override
    public void save(Account account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Saving account to in-memory database: " + account.getAccountNumber());
    }

    @Override
    public Account findById(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
