import java.util.Scanner;

class Car {
    String brand;
    String model;
    double price;

    // Parameterized constructor to initialize the values
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs from the user
        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        // Creating Car object using the parameterized constructor
        Car myCar = new Car(brand, model, price);

        // Displaying the details
        myCar.displayDetails();

        sc.close();
    }
}
