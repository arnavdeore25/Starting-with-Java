package Abstraction;

abstract class VehicleDetail {
    abstract void startEngine();
        void fuelType() {
        System.out.println("This vehicle uses fuel.");
    }
}
class Car extends VehicleDetail {
    void startEngine() {
        System.out.println("Car engine started with key ignition.");
    }
}


public class Vehicle {
     public static void main(String[] args) {
        
        VehicleDetail myCar = new Car(); 
        myCar.startEngine(); 
        myCar.fuelType(); 
    }
}
