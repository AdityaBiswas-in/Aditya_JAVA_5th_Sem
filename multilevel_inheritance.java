import java.util.Scanner;

class Car {
    String brand;
    int price;

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class SportsCar extends Car {
    int speed;

    void displaySpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Ferrari extends SportsCar {
    String model;

    void displayModel() {
        System.out.println("Model: " + model);
    }
}

public class multilevel_inheritance  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ferrari car = new Ferrari();

        System.out.print("Enter car brand: ");
        car.brand = sc.nextLine();

        System.out.print("Enter car price: ");
        car.price = sc.nextInt();

        System.out.print("Enter maximum speed: ");
        car.speed = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter car model: ");
        car.model = sc.nextLine();

        System.out.println("\nCar Details:");

        car.displayCar();
        car.displaySpeed();
        car.displayModel();

        sc.close();
    }
}
