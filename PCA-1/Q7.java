import java.util.Scanner;

class Car {
    String brand;
    String model;
    double price;

    // Parameterized constructor
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

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Input and object creation for Car 1 ---
        System.out.println("Enter details for Car 1:");
        System.out.print("Enter brand: ");
        String brand1 = sc.nextLine();
        System.out.print("Enter model: ");
        String model1 = sc.nextLine();
        System.out.print("Enter price: ");
        double price1 = sc.nextDouble();
        sc.nextLine(); // consume newline
        Car car1 = new Car(brand1, model1, price1);

        // --- Input and object creation for Car 2 ---
        System.out.println("\nEnter details for Car 2:");
        System.out.print("Enter brand: ");
        String brand2 = sc.nextLine();
        System.out.print("Enter model: ");
        String model2 = sc.nextLine();
        System.out.print("Enter price: ");
        double price2 = sc.nextDouble();
        sc.nextLine(); // consume newline
        Car car2 = new Car(brand2, model2, price2);

        // --- Input and object creation for Car 3 ---
        System.out.println("\nEnter details for Car 3:");
        System.out.print("Enter brand: ");
        String brand3 = sc.nextLine();
        System.out.print("Enter model: ");
        String model3 = sc.nextLine();
        System.out.print("Enter price: ");
        double price3 = sc.nextDouble();
        Car car3 = new Car(brand3, model3, price3);

        // Display details of all three cars
        System.out.println("\n=== Car 1 Details ===");
        car1.displayDetails();

        System.out.println("=== Car 2 Details ===");
        car2.displayDetails();

        System.out.println("=== Car 3 Details ===");
        car3.displayDetails();

        sc.close();
    }
}
