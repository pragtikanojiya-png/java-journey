
package BankingSystem;

public class Account {

    private int accountNumber;
    private String accountholder;
    private double balance;
    private int pin;

    public Account(int accountNumber, String accountholder, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.accountholder = accountholder;
        this.balance = balance;
        this.pin = pin;
    }

    // Verify PIN
    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited Successfully!");
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw Successful!");
            System.out.println("Updated Balance: " + balance);
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Account Balance: " + balance);
    }

    // Display account details
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountholder);
        System.out.println("Balance: " + balance);
    }

    // Get account number
    public int getAccountNumber() {
        return accountNumber;
    }
}
