package JavaBasics.Encapsulation;

import java.util.Scanner;
public class BankObject {

    public static void inputBankDetails() {

        Scanner inputScanner = new Scanner(System.in);

        // Get the user input
        System.out.println("What is your name: ");
        String name = inputScanner.nextLine();

        System.out.println("How much is the amount your going to put in? ");
        float amount = inputScanner.nextFloat();

        System.out.println("What is your account number? ");
        long accNo = inputScanner.nextLong();

        inputScanner.nextLine();

        System.out.println("What is your email");
        String email = inputScanner.nextLine();

        BankClass bankDetails = new BankClass(amount, accNo, name, email);
        bankDetails.displayInfo();

        inputScanner.close();

    }

    public static void main(String[] args) {
        inputBankDetails();
    }
}
