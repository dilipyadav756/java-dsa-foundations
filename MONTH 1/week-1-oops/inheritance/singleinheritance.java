package inheritance;

class Vehicle {  // Parent class

    void start() {  // Method
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {  // Child class

    void drive() {
        System.out.println("Car is driving");
    }
}

public class singleinheritance {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.start();

        Car c = new Car();
//        c.start();  // Inherited method
//        c.drive();  // Own method
    }
}