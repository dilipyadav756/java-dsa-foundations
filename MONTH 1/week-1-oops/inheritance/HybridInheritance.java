package inheritance;

class Vehicle2 {
    void vehicleType() {
        System.out.println("This is a Vehicle");
    }
}

// Interface
interface Fare {
    default void fareInfo() {
        System.out.println("Fare information");
    }
}

// Child class 1
class Car2 extends Vehicle2 {
    void carType() {
        System.out.println("This is a Car");
    }
}

// Child class 2
class Bus extends Vehicle2 implements Fare {
    void busType() {
        System.out.println("This is a Bus");
    }
}

public class HybridInheritance {

    public static void main(String[] args) {

        Car2 car = new Car2();

        car.vehicleType();
        car.carType();

        System.out.println();

        Bus bus = new Bus();

        bus.vehicleType();
        bus.busType();
        bus.fareInfo();
    }
}
