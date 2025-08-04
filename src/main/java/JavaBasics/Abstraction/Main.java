package JavaBasics.Abstraction;

import java.util.Scanner;

// Abstraction method
abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {

    @Override
    void makeSound(){
        System.out.println("Bark Bark!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class Main {
    
    // Encapsulation
    
    private static void getUserInput() {
        
        // Get the user input
        
        Scanner animalInput = new Scanner(System.in);

        System.out.println("Choose a Animal (Cat or Dog)");
        String choice = animalInput.nextLine(); 
        
        Animal animal; 
        
        if (choice.equals("cat")) {
            animal = new Cat();
        }
        else if (choice.equals("dog")) {
            animal = new Dog();
        }
        else {
            System.out.println("Invalid input");
            return; 
        }
        
        animal.makeSound();
    }

    public static void main(String[] args) {
        getUserInput();
    }
}
