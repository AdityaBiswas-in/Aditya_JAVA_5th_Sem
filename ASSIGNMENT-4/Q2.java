import java.util.Scanner;

// a) Abstract class with abstract method calculateArea()
abstract class Shape {
    abstract double calculateArea();
}

// b) Child classes implementing calculateArea()
class Rectangle extends Shape {
    double l, b;
    Rectangle(double l, double b) { this.l = l; this.b = b; }
    double calculateArea() { return l * b; }
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    double calculateArea() { return Math.PI * r * r; }
}

class Triangle extends Shape {
    double b, h;
    Triangle(double b, double h) { this.b = b; this.h = h; }
    double calculateArea() { return 0.5 * b * h; }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // e) Array of Shape (parent class) references
        Shape[] shapes = new Shape[3];

        // c) Take dimensions from user
        System.out.print("Enter Rectangle length & breadth: ");
        shapes[0] = new Rectangle(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter Circle radius: ");
        shapes[1] = new Circle(sc.nextDouble());

        System.out.print("Enter Triangle base & height: ");
        shapes[2] = new Triangle(sc.nextDouble(), sc.nextDouble());

        System.out.println("\n--- Areas of Shapes ---");
        // d), e), f) Runtime polymorphism using Shape reference
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + " Area: " + s.calculateArea());
        }

        sc.close();
    }
}
