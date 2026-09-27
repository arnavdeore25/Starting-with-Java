package Polymorphism;


class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car starting");
    }
}
class ElectricCar extends Vehicle {
    void start() {
        System.out.println("Electric car starting");
    }
}
public class MethodOverridding {
        public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new ElectricCar();
        v1.start();
        v2.start();
    }
}

