public class Bank {
    private final AccountRepository repository;
    private final NotificationService notificationService;

    public Bank(AccountRepository repository, NotificationService notificationService) {
        this.repository = repository;
        this.notificationService = notificationService;
    }

    public void processAccount(Account account) {
        repository.save(account);
        notificationService.send("Account " + account.getAccountNumber() + " processed with balance " + account.getBalance());
    }

    public void sendNotification(String message) {
        notificationService.send(message);
    }

    public AccountRepository getRepository() {
        return repository;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
