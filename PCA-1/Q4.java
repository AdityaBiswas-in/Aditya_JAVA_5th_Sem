import java.util.Scanner;

// Base class
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }
}

// Intermediate derived class (multilevel inheritance)
class Car extends Vehicle {
    String model;
    double price;

    Car(String brand, String model, double price) {
        super(brand);
        this.model = model;
        this.price = price;
    }
}

// Most derived class
class SportsCar extends Car {
    double topSpeed;

    SportsCar(String brand, String model, double price, double topSpeed) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
    }

    void displayDetails() {
        System.out.println("\n--- Sports Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from user
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter top speed: ");
        double topSpeed = sc.nextDouble();

        // Creating SportsCar object
        SportsCar mySportsCar = new SportsCar(brand, model, price, topSpeed);

        // Displaying details
        mySportsCar.displayDetails();

        sc.close();
    }
}
