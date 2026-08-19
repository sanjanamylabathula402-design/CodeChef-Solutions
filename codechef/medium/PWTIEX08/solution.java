class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create BankAccount objects
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        // Deposit money into account1
        account1.deposit(1000);
        System.out.println("Account 1:");
        account1.displayBalance();

        // Withdraw money from account1
        account1.withdraw(500);
        System.out.println("After withdrawal:");
        account1.displayBalance();

        // Try to withdraw more than the balance
        account1.withdraw(700);

        // Deposit money into account2
        account2.deposit(2000);
        System.out.println("\nAccount 2:");
        account2.displayBalance();
    }
}
