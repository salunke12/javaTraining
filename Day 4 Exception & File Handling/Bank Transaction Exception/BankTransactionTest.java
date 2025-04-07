import java.util.Scanner;


class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

 
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }


    public void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Withdrawal failed: Insufficient balance. Available: " + balance + ", Requested: " + amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}


public class BankTransactionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BankAccount account = new BankAccount(5000);

        // Taking withdrawal amount from user
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
        } catch (LowBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        scanner.close(); 
    }
}
