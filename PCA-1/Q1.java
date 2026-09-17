import java.util.Scanner;

class Details {
    String brand;
    String model;
    double price;

    void display() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Details car1 = new Details();

        System.out.print("Enter brand: ");
        car1.brand = sc.nextLine();

        System.out.print("Enter model: ");
        car1.model = sc.nextLine();

        System.out.print("Enter price: ");
        car1.price = sc.nextDouble();

        System.out.println();
        car1.display();

        sc.close();
    }
}