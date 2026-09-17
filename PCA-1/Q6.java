import java.util.Scanner;

// Base class
class Vehicle {
    String brand;

    // Constructor to initialize brand
    Vehicle(String brand) {
        this.brand = brand;
    }
}

// Intermediate derived class
class Car extends Vehicle {
    String model;
    double price;

    // Constructor using super() to invoke Vehicle's constructor
    Car(String brand, String model, double price) {
        super(brand);
        this.model = model;
        this.price = price;
    }
}

// Most derived class
class LuxuryCar extends Car {
    String features;

    // Constructor using super() to invoke Car's constructor
    LuxuryCar(String brand, String model, double price, String features) {
        super(brand, model, price);
        this.features = features;
    }

    // Method to display all the information
    void displayDetails() {
        System.out.println("\n--- Luxury Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Features: " + features);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking values from the user
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter luxury features: ");
        String features = sc.nextLine();

        // Creating LuxuryCar object
        LuxuryCar myLuxuryCar = new LuxuryCar(brand, model, price, features);

        // Displaying all details
        myLuxuryCar.displayDetails();

        sc.close();
    }
}
