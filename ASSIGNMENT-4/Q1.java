import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // a) Constructor to initialize details
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // b) Getter and setter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // c) & d) deposit() with positive validation
    public void deposit(double amount) throws Exception {
        if (amount <= 0)
            throw new Exception("Deposit amount must be positive!");
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // c) & e) withdraw() with validation and exceptions
    public void withdraw(double amount) throws Exception {
        if (amount <= 0)
            throw new Exception("Withdrawal amount must be positive!");
        if (amount > balance)
            throw new Exception("Insufficient balance!");
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // f) Display details and balance
    public void display() {
        System.out.println("Holder: " + accountHolder + " | AccNo: " + accountNumber + " | Balance: " + balance);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // a) Initialize account
            System.out.print("Enter Name, Account No, Initial Balance: ");
            BankAccount acc = new BankAccount(sc.next(), sc.next(), sc.nextDouble());
            acc.display(); // f)

            // c) & d) Deposit
            System.out.print("Enter deposit amount: ");
            acc.deposit(sc.nextDouble());
            acc.display(); // f)

            // c) & e) Withdraw
            System.out.print("Enter withdrawal amount: ");
            acc.withdraw(sc.nextDouble());
            acc.display(); // f)

            // e) Testing exception with invalid amount
            System.out.println("\nTesting invalid withdrawal:");
            acc.withdraw(999999);

        } catch (Exception e) {
            // e) Handle exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
