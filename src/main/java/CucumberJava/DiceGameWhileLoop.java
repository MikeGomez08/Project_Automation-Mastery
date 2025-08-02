package CucumberJava;

import java.util.Scanner;

public class DiceGameWhileLoop {
    public static void main(String[] args) {

        System.out.println("Enter the dice number");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();

        while (guess < 10) {
            if (guess > 6) {
                System.out.println("You have won the game");
                break;
            }
            else {
                System.out.println("You have lost the game, Please Try again");
                break;
            }
        }
    }
}
