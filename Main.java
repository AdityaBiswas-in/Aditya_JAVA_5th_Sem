import java.util.Scanner;

class car {
    String brand;
    int price;

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class SportsCar extends car {
    int speed;

    void displaySpeed() {
        System.out.println("Maximum Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SportsCar car = new SportsCar();

        System.out.print("Enter car brand: ");
        car.brand = sc.nextLine();

        System.out.print("Enter car price: ");
        car.price = sc.nextInt();

        System.out.print("Enter maximum speed: ");
        car.speed = sc.nextInt();

        System.out.println("\nCar Details:");

        car.displayCar();
        car.displaySpeed();

        sc.close();
    }
}
