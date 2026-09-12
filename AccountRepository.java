public interface AccountRepository {
    void save(Account account);
    Account findById(int accountNumber);
}
