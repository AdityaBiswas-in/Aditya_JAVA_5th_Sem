import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // a) Take input from user
            System.out.print("Enter choice (1-Add, 2-Sub, 3-Mul, 4-Div): ");
            int ch = sc.nextInt();

            System.out.print("\nEnter two numbers:\n");
            int a = sc.nextInt(), b = sc.nextInt();

            // f) Nested try-catch block
            try {
                if (ch == 1)
                    System.out.println("Result: " + (a + b));
                else if (ch == 2)
                    System.out.println("Result: " + (a - b));
                else if (ch == 3)
                    System.out.println("Result: " + (a * b));
                else if (ch == 4)
                    System.out.println("Result: " + (a / b)); // b) Division by zero
                else
                    System.out.println("Invalid choice!");
            } catch (ArithmeticException e) { // b)
                System.out.println("Error: Cannot divide by zero!");
            }

        } catch (InputMismatchException e) { // c)
            System.out.println("Error: Invalid input! Enter numbers only.");
        } catch (Exception e) { // d) Multiple catch
            System.out.println("Error: " + e.getMessage());
        } finally { // e) finally block
            System.out.println("Calculator operation completed.");
            sc.close();
        }
    }
}