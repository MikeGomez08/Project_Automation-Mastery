package JavaBasics.ErrorHandling;

import java.util.Scanner;

public class BankAccount {

    private Double balance;

    // Constructor
    public BankAccount() {
        this.balance = 10000.0;
    }

    // Custom Exception
    public static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    // Method to withdraw money
    private void withdraw(Double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Values cannot be negative or zero: " + amount);
        } else if (amount > this.balance) {
            throw new InsufficientFundsException("It exceeds the amount that your balance has.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal successful. Your current balance is: " + this.balance);
        }
    }

    // Method to get current balance
    public Double getBalance() {
        return this.balance;
    }

    // Method to interact with user
    private void getUserInput() throws InsufficientFundsException {
        System.out.println("Current balance is " + getBalance());
        System.out.print("Enter the amount you want to withdraw: ");

        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        withdraw(amount);
    }

    // Main method
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.getUserInput();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient funds: " + e.getMessage());
        }
    }
}
