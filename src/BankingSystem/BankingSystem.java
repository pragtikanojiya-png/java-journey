
package BankingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingSystem {

    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        while (true) {

            System.out.println("\n===== WELCOME TO BANKING SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Create Account

                    System.out.print("Enter Account Number: ");
                    int accountNumber = sc.nextInt();

                    if (findAccount(accountNumber) != null) {
                        System.out.println("Account already exists!");
                        break;
                    }

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Deposit: ");
                    double balance = sc.nextDouble();

                    if (balance < 0) {
                        System.out.println("Invalid initial deposit!");
                        break;
                    }

                    System.out.print("Set 4-digit PIN: ");
                    int pin = sc.nextInt();

                    if (pin < 1000 || pin > 9999) {
                        System.out.println("PIN must contain exactly 4 digits!");
                        break;
                    }

                    Account acc = new Account(accountNumber, name, balance, pin);
                    accounts.add(acc);

                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    // Deposit

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    acc = findAccount(accountNumber);

                    if (acc == null) {
                        System.out.println("Account Not Found!");
                        break;
                    }

                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();

                    if (acc.verifyPin(pin)) {
                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextDouble();
                        acc.deposit(amount);
                    } else {
                        System.out.println("Incorrect PIN!");
                    }
                    break;

                case 3:
                    // Withdraw

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    acc = findAccount(accountNumber);

                    if (acc == null) {
                        System.out.println("Account Not Found!");
                        break;
                    }

                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();

                    if (acc.verifyPin(pin)) {
                        System.out.print("Enter Withdrawal Amount: ");
                        double amount = sc.nextDouble();
                        acc.withdraw(amount);
                    } else {
                        System.out.println("Incorrect PIN!");
                    }
                    break;

                case 4:
                    // Check Balance

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    acc = findAccount(accountNumber);

                    if (acc == null) {
                        System.out.println("Account Not Found!");
                        break;
                    }

                    System.out.print("Enter PIN: ");
                    pin = sc.nextInt();

                    if (acc.verifyPin(pin)) {
                        acc.checkBalance();
                    } else {
                        System.out.println("Incorrect PIN!");
                    }
                    break;

                case 5:
                    // Display All Accounts

                    if (accounts.isEmpty()) {
                        System.out.println("No Accounts Available!");
                    } else {
                        for (Account a : accounts) {
                            a.displayAccount();
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Banking System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    // Search account by account number
    public static Account findAccount(int accountNumber) {

        for (Account a : accounts) {
            if (a.getAccountNumber() == accountNumber) {
                return a;
            }
        }

        return null;
    }
}
