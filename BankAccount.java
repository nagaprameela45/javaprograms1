/*Create a class named "Student" with private attributes: name, rollNumber, age, and marks.
Implement getter and setter methods for all attributes.
Ensure that the marks attribute can only be accessed through getter and setter methods, not directly.
Add a method named calculateGrade() that calculates the grade based on the marks and returns it as a string (e.g., "A+", "B", "C", etc.).
Add a method named displayDetails() that displays the student's name, roll number, age, marks, and grade.
In the main method, create an array of Student objects to store information for multiple students. Prompt the user to input data for each student, calculate their grades, and display their details*/
import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private int pin;

 public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

 public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Updated balance: " + balance);
    }

   public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Updated balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount();
        account.setAccountNumber("123456789");
        account.setAccountHolderName("John Doe");
        account.setBalance(1000.0);
        account.setPin(1234);

        System.out.println("Welcome, " + account.getAccountHolderName() + "!");
        System.out.println("Your account number is: " + account.getAccountNumber());
        System.out.println("Your current balance is: " + account.getBalance());

        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        scanner.close();
    }
}
