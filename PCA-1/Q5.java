import java.util.Scanner;

// Base class
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void displayVehicleInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Intermediate derived class
class Car extends Vehicle {
    String model;
    double price;

    Car(String brand, String model, double price) {
        super(brand);
        this.model = model;
        this.price = price;
    }

    void displayCarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

// Most derived class
class ElectricCar extends Car {
    double batteryCapacity;

    ElectricCar(String brand, String model, double price, double batteryCapacity) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    void displayElectricCarInfo() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    // Method to display all combined details using the separate functions
    void displayCompleteDetails() {
        System.out.println("\n--- Electric Car Details ---");
        displayVehicleInfo();
        displayCarInfo();
        displayElectricCarInfo();
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from the user
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter battery capacity (in kWh): ");
        double batteryCapacity = sc.nextDouble();

        // Creating ElectricCar object
        ElectricCar ev = new ElectricCar(brand, model, price, batteryCapacity);

        // Displaying complete details
        ev.displayCompleteDetails();

        sc.close();
    }
}
