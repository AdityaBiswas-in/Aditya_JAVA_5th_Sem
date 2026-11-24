import java.util.Scanner;

// a) Custom checked exception
class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class Q2 {
    // d) Method declaring 'throws'
    static void checkMarks(int marks) throws InvalidMarksException {
        // c) & d) 'throw' if marks < 0 or > 100
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        // e) try-catch to handle exception
        try {
            // b) Accept marks for five subjects
            System.out.println("Enter marks for 5 subjects:");
            for (int i = 1; i <= 5; i++) {
                int m = sc.nextInt();
                checkMarks(m);
                total += m;
            }

            // f) Calculate and display total, average, result
            double avg = total / 5.0;
            System.out.println("Total: " + total + " | Average: " + avg);
            System.out.println("Result: " + (avg >= 40 ? "Pass" : "Fail"));

        } catch (InvalidMarksException e) { // e) Handle custom exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
