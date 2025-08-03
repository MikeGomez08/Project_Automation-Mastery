package JavaBasics;
import java.util.Scanner;

public class CarClass {
//
//    // Constructor - Default constructor
//    CarClass() {}
//
//    // Constructor - Paramaterized
//    CarClass(String color) {}

    // Access Modifiers
    private String color;
    private int price;
    private double weight;

    // Methods
    public static void start() {
        System.out.println("Please insert the key");
    }

    public static void accelerate() {
        System.out.println("Please step on the accelarator");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayCar() {
        System.out.println("The color of your car is " + color + "The total price of your car is " + price +
                "The weight of your car is " + weight
                );
    }

    public static void main(String[] args) {

    }
}
