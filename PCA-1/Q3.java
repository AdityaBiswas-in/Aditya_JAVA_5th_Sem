import java.util.Scanner;

class Car {
    String brand;
    String model;
    double price;

    // Constructor 1: with only brand
    Car(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.price = 0.0;
    }

    // Constructor 2: with brand and model
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
    }

    // Constructor 3: with brand, model, and price
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("-----------------------------");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Object 1: using Constructor 1 (only brand) ---
        System.out.println("Enter details for Car 1 (brand only):");
        System.out.print("Enter brand: ");
        String brand1 = sc.nextLine();
        Car car1 = new Car(brand1);

        // --- Object 2: using Constructor 2 (brand and model) ---
        System.out.println("\nEnter details for Car 2 (brand and model):");
        System.out.print("Enter brand: ");
        String brand2 = sc.nextLine();
        System.out.print("Enter model: ");
        String model2 = sc.nextLine();
        Car car2 = new Car(brand2, model2);

        // --- Object 3: using Constructor 3 (brand, model, and price) ---
        System.out.println("\nEnter details for Car 3 (brand, model, and price):");
        System.out.print("Enter brand: ");
        String brand3 = sc.nextLine();
        System.out.print("Enter model: ");
        String model3 = sc.nextLine();
        System.out.print("Enter price: ");
        double price3 = sc.nextDouble();
        Car car3 = new Car(brand3, model3, price3);

        // Display details of each car
        System.out.println("\n=== Details of Car 1 ===");
        car1.displayDetails();

        System.out.println("=== Details of Car 2 ===");
        car2.displayDetails();

        System.out.println("=== Details of Car 3 ===");
        car3.displayDetails();

        sc.close();
    }
}
