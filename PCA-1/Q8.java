import java.util.Scanner;

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }
}

class Car extends Vehicle {
    String model;
    double price;

    Car(String brand, String model, double price) {
        super(brand);
        this.model = model;
        this.price = price;
    }
}

class ElectricCar extends Car {
    double batteryCapacity;

    ElectricCar(String brand, String model, double price, double batteryCapacity) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    void displayDetails() {
        System.out.println("\n--- Electric Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolCar extends Car {
    double mileage;

    PetrolCar(String brand, String model, double price, double mileage) {
        super(brand, model, price);
        this.mileage = mileage;
    }

    void displayDetails() {
        System.out.println("\n--- Petrol Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Electric Car:");
        System.out.print("Enter brand: ");
        String eBrand = sc.nextLine();

        System.out.print("Enter model: ");
        String eModel = sc.nextLine();

        System.out.print("Enter price: ");
        double ePrice = sc.nextDouble();

        System.out.print("Enter battery capacity (in kWh): ");
        double batteryCapacity = sc.nextDouble();
        sc.nextLine();

        ElectricCar ev = new ElectricCar(eBrand, eModel, ePrice, batteryCapacity);

        System.out.println("\nEnter details for Petrol Car:");
        System.out.print("Enter brand: ");
        String pBrand = sc.nextLine();

        System.out.print("Enter model: ");
        String pModel = sc.nextLine();

        System.out.print("Enter price: ");
        double pPrice = sc.nextDouble();

        System.out.print("Enter mileage (in km/l): ");
        double mileage = sc.nextDouble();

        PetrolCar petrolCar = new PetrolCar(pBrand, pModel, pPrice, mileage);

        ev.displayDetails();
        petrolCar.displayDetails();

        sc.close();
    }
}
