/*Assignment 2: Bank Account Hierarchy
Create an abstract class called "BankAccount" that has the following abstract methods:
1.	deposit(amount): Adds the given amount to the account balance.
2.	withdraw(amount): Deducts the given amount from the account balance.
3.	get_balance(): Returns the current account balance.
Create concrete classes CheckingAccount and SavingsAccount that inherit from the abstract class "BankAccount." Implement the required methods for each class.
Write a program to:
1.	Create instances of CheckingAccount and SavingsAccount.
2.	Prompt the user to make deposits and withdrawals from each account.
3.	Display the current balance of each account after each transaction*/
import java.util.*;
abstract class BankAccount


  {


    double amount=10000;


    Scanner sc=new Scanner(System.in);


    abstract void depositeAmount(double deposite);


    abstract void withdrawAmount(double withdraw);


    abstract void get_Balance();


  }


class CheckingAccount extends BankAccount


  {


    public void depositeAmount(double deposite)


    {


      amount=amount+deposite;


      System.out.println("Deposited Sucessfully");


      System.out.println("The Total Amount Available in your Account is "+amount);


    }


     public void withdrawAmount(double withdraw)


    {


      amount=amount-withdraw;


      System.out.println("Withdraw Sucessfully");


      System.out.println("The Remaining Account Balance is "+amount);


    }


    public void get_Balance()


    {


      System.out.println("The Amount in the Account is "+amount);


    }


  }


class SavingsAccount extends BankAccount


  {


    public void depositeAmount(double deposite)


    {


      amount=deposite+amount;


      System.out.println("Deposited Sucessfully");


      System.out.println("The Remaining Balance in Account is "+amount);


    }


    public void withdrawAmount(double withdraw)


    {


      amount=amount-withdraw;


      System.out.println("Withdraw Sucessfully");


      System.out.println("The Available Balance in the Account "+amount);


    }


    public void get_Balance()


    {


      System.out.println("The Available Balance in the Account "+amount);


    }


  }


class Bankhier


  {


    public static void main(String[]args)


    {


      Scanner se=new Scanner(System.in);


      BankAccount ca=new CheckingAccount();


      BankAccount sa=new SavingsAccount();


      System.out.println("Enter the Deposite Amount");


      ca.depositeAmount(se.nextDouble());


      System.out.println("Enter The Withdraw Amount");


      ca.withdrawAmount(se.nextDouble());


      ca.get_Balance();


      System.out.println("Enter the Deposite Amount");


      sa.depositeAmount(se.nextDouble());


      System.out.println("Enter The Withdraw Amount");


      sa.withdrawAmount(se.nextDouble());


      sa.get_Balance();


    }


  }
  

