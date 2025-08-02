package JavaBasics;

import java.util.Scanner;

public class AddNumbers {

    static void MyMethod() {

        // Consider a method which adds two numbers:
        // num1 = 5;, num2 = 3
        // result = num1 + num2

        // Get the user inputs
        System.out.println("Enter your first number: ");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.println("Enter your second number: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();


        // Calculate the result of two Added numbers

        int result = num1 + num2;

        if(num1 >= 0 && num2 >= 0){
            System.out.println("The sum of two added numbers are: " + result);
        }
        else {
            System.out.println("Invalid input");
        }
    }

    static int MyMethod2(int num1, int num2) {
        // Add two numbers num1 and num2
        // Formula would be num1 + num2
        // Return it using a single code

        return num1 + num2;
    }

    public static void MyMethod3(int num1, int num2) {
        // Add the numbers
        // Make it reusable

        int result = num1 + num2;
        int results = MyMethod2(3,3); // You can passed methods at each other

        System.out.println("The added values are: " + result);
        System.out.println("The methods for 2" + results);
    }

    public static void main(String[] args) {
//        MyMethod();
//
//        int result = MyMethod2(1,2);
//        System.out.println("The Results are: " + result);
        MyMethod3(3,3);
    }
}
