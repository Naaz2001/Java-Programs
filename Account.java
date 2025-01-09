import java.util.Scanner;

public class Account {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create accounts with dummy values
        Account account1 = new Account("Account 1", 1234, 100);
        Account account2 = new Account("Account 2", 5678, 50);

        // Display initial account details
        System.out.println("Initial Account Details:");
        account1.displayDetails();
        account2.displayDetails();

        // Get deposit and withdrawal details
        System.out.print("Enter amount to deposit (from Account 1 to Account 2): ");
        double depositAmount = scan.nextDouble();

        // Directly perform deposit and withdrawal based on balance limitations
        // (assuming positive deposit and withdrawal within available balance)
        double actualDeposit = Math.min(depositAmount, account1.getBalance());
        account1.withdraw(actualDeposit);
        account2.deposit(actualDeposit);

        // Display updated account details
        System.out.println("\nUpdated Account Details:");
        account1.displayDetails();
        account2.displayDetails();
    }
}

class DisplayAccount {

    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // No deposit or withdraw methods needed in this simplified version
}