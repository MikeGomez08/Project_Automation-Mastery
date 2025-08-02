package CucumberJava;

import java.util.Scanner;

public class DiceProgram {
    public static void main(String[] args) {

//        Input of the dice
        System.out.println("Enter your dice number:");
        Scanner sc = new Scanner(System.in);
        int guess =  sc.nextInt();

//        Logic
        if (guess >= 5) {
            System.out.println("Congrats you have won the game");
        }
        else if (guess <= 0) {
            System.out.println("Invalid Input");
        }
        else {
            System.out.println("You have lost the game");
        }
    }
}
