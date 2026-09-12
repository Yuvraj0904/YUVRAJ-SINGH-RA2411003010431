import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAccountRepository implements AccountRepository {
    private final String filePath;

    public FileAccountRepository() {
        this("accounts.txt");
    }

    public FileAccountRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void save(Account account) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(account.getAccountNumber() + "," + account.getName() + "," + account.getBalance());
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Saving account to file: " + account.getAccountNumber());
    }

    @Override
    public Account findById(int accountNumber) {
        File file = new File(filePath);
        if (!file.exists()) {
            return null;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3 && Integer.parseInt(parts[0].trim()) == accountNumber) {
                    int accNum = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double balance = Double.parseDouble(parts[2].trim());
                    return new Account(accNum, name, balance);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
