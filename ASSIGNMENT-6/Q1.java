import java.io.*;
import java.util.Scanner;

public class Q1 {
    // File path on Windows Desktop
    static File file = new File(System.getProperty("user.home") + "\\Desktop\\student.txt");

    // b), c), e) Write, append, or overwrite
    static void saveRecord(String data, boolean append) throws IOException {
        FileWriter fw = new FileWriter(file, append);
        fw.write(data + "\n");
        fw.close();
        System.out.println("Saved successfully!");
    }

    // d) Read and display all stored records
    static void displayRecords() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        System.out.println("\n--- Stored Student Records ---");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // a) Create the file if it does not exist
            if (!file.exists())
                file.createNewFile();

            while (true) {
                System.out.println("\n1.Write 2.Append 3.Read 4.Overwrite 5.Exit");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();
                sc.nextLine(); // consume newline

                if (ch == 5)
                    break;

                if (ch == 1 || ch == 2 || ch == 4) {
                    // b) Take details from user
                    System.out.print("Enter Name, Roll No, Dept: ");
                    String details = sc.nextLine();

                    // b) Write (append=false), c) Append (append=true), e) Overwrite (append=false)
                    saveRecord(details, ch == 2);
                } else if (ch == 3) {
                    // d) Read and display
                    displayRecords();
                } else {
                    System.out.println("Invalid choice!");
                }
            }
        }
        // f) Handle FileNotFoundException and IOException
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}