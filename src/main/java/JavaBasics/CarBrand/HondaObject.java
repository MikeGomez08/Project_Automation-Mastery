package JavaBasics.CarBrand;

import JavaBasics.CarClass;

public class HondaObject {

    public static void hondaDetails() {

        CarClass honda = new CarClass();

        System.out.println("Here is your honda details: ");
        honda.setColor("Red");
        honda.setWeight(123.423434);
        honda.setPrice(3434);
        honda.displayCar();
    }

    public static void main(String[] args) {
        hondaDetails();
    }

}
