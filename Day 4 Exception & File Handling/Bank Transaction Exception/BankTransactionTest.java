import java.util.Scanner;

// Custom exception class
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Withdrawal failed: Insufficient balance. Available: " + balance + ", Requested: " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

// Main class
public class BankTransactionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating account with initial balance 5000
        BankAccount account = new BankAccount(5000);

        // Taking withdrawal amount from user
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
        } catch (LowBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        scanner.close(); // Always good to close the scanner
    }
}
