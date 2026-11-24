import java.util.Scanner;

// e) Custom exceptions
class InvalidAmountException extends Exception {
    InvalidAmountException(String s) {
        super(s);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String s) {
        super(s);
    }
}

class BankAccount {
    // Private data members
    private String accountHolder, accountNumber;
    private double balance;

    // a) Constructor to initialize details
    public BankAccount(String holder, String accNo, double bal) {
        this.accountHolder = holder;
        this.accountNumber = accNo;
        this.balance = bal;
    }

    // b) Getter and setter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String h) {
        this.accountHolder = h;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // c) & d) deposit() with validation
    public void deposit(double amt) throws InvalidAmountException {
        if (amt <= 0)
            throw new InvalidAmountException("Deposit must be positive!");
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    // c) & e) withdraw() with validation and exceptions
    public void withdraw(double amt) throws InvalidAmountException, InsufficientBalanceException {
        if (amt <= 0)
            throw new InvalidAmountException("Withdrawal must be positive!");
        if (amt > balance)
            throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amt;
        System.out.println("Withdrawn: " + amt);
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
            // a) Initialize details
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Account Number: ");
            String accNo = sc.nextLine();
            System.out.print("Enter Initial Balance: ");
            double bal = sc.nextDouble();
            BankAccount acc = new BankAccount(name, accNo, bal);
            acc.display(); // f)
            // c) & d) Deposit
            System.out.print("\nEnter deposit amount: ");
            acc.deposit(sc.nextDouble());
            acc.display(); // f)
            // c) & e) Withdraw
            System.out.print("\nEnter withdrawal amount: ");
            acc.withdraw(sc.nextDouble());
            acc.display(); // f)
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
