public class InterestCalculator {
    public double calculate(String accountType, double balance) {
        if (accountType.equals("Savings")) {
            return balance * 0.04;
        } else if (accountType.equals("Current")) {
            return balance * 0.01;
        } else if (accountType.equals("Salary")) {
            return balance * 0.05;
        }
        return 0;
    }
}
