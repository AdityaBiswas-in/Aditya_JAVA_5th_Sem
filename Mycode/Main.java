import java.util.Scanner;

abstract class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void start();
    public abstract void stop();
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + " oooooyeeee");
    }

    @Override
    public void stop() {
        System.out.println(getBrand() + " bom bom");
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter car brand: ");
            String brand = input.nextLine();

            Vehicle myCar = new Car(brand);
            myCar.start();
            myCar.stop();
        }
    }
}
