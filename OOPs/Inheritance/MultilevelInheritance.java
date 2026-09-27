package Inheritance;

class Company {

    String companyName;
    String location;

    Company(String companyName, String location) {
        this.companyName = companyName;
        this.location = location;
    }

    void displayCompany() {
        System.out.println("Company: " + companyName);
        System.out.println("Location: " + location);
    }
}


class Vehicle extends Company {

    String vehicleName;
    int speed;

    Vehicle(String companyName, String location, String vehicleName, int speed) {
        super(companyName, location);
        this.vehicleName = vehicleName;
        this.speed = speed;
    }

    void displayVehicle() {
        displayCompany();
        System.out.println("Vehicle: " + vehicleName);
        System.out.println("Speed: " + speed + " km/h");
    }
}


class ElectricCar extends Vehicle {

    int batteryCapacity;
    int range;

    ElectricCar(String companyName, String location,
                String vehicleName, int speed,
                int batteryCapacity, int range) {

        super(companyName, location, vehicleName, speed);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    void displayElectricCar() {
        displayVehicle();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Range: " + range + " km");
    }
}


public class MultilevelInheritance {

    public static void main(String[] args) {

        ElectricCar car = new ElectricCar(
                "Tesla",
                "California",
                "Model 3",
                201,
                75,
                500
        );

        car.displayElectricCar();
    }
}