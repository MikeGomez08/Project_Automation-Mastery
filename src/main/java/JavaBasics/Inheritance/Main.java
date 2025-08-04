package JavaBasics.Inheritance;

import java.util.Scanner;


class Vehicle {
     String brand;
     int year;

     // Method to Start an Engine
     void startEngine(){
         System.out.println("Engine started!");
     }
 }

 class Car extends Vehicle {

     // Initializing Variables
     int numberOfDoors;

     @Override
     void startEngine() {
         System.out.println("Car Engine started");
     }

     // Car Methods
     void playRadio() {
         System.out.println("Playing radio and the number of doors in this Car is: " + numberOfDoors);
     }
 }

 // Truck Class
 class Truck extends Vehicle{

     // Initialize variable
     double loadCapacity;

     @Override
     void startEngine() {
         System.out.println("Truck engine rumbles to life.");
         }

      // Truck Methods
     void loadCargo(){
         System.out.println("The maximum load capacity " + loadCapacity);
     }
        }

class Motorcycle extends Vehicle {

     // Initialize variable
    boolean hasSidecar;

    @Override
    void startEngine() {
         System.out.println("Motorcycle engine revs. ");
     }

    // Motorcycle Methods
    void popWheelie(){
        System.out.println("Popped a Wheelie and has a sidebar " + hasSidecar);
    }
}


public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Truck(),
                new Motorcycle(),
                new Car()
        };

        // Get the user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice");
        System.out.println("1. Motorcycle");
        System.out.println("2. Car ");
        System.out.println("3. Truck ");
        System.out.println("-----------------------------------");
        int choice = sc.nextInt();


        for (Vehicle v1 : vehicles){
            if(choice == 1 && v1 instanceof Motorcycle) {
                v1.startEngine();
                ((Motorcycle) v1).popWheelie();
                break;
            }
            else if (choice == 2 && v1 instanceof Car) {
                v1.startEngine();
                ((Car) v1).playRadio();
                break;
            }
            else if (choice == 3 && v1 instanceof Truck){
                v1.startEngine();
                ((Truck) v1).loadCargo();
                break;
            }
            else {
                System.out.println("Invalid input");
            }
        }
    }
}
