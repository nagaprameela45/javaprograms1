/*Create a class called "BankAccount" with instance variables for storing the account holder's name and account balance. Implement methods to deposit and withdraw money from the account, and display the current balance.*/
import java.util.*;
class BankDetails
 {
 String name="prameela";
 String anumber="123456789101112";
 int amount=10000;
 int deposite;
int withdraw;
  public void depositeamount()
{
Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Amount you want to deposite");
deposite=sc.nextInt();
amount=amount+deposite;
 System.out.println("The Amount "+deposite+"Credited to your account");
  System.out.println("The Amount your account is "+amount);
  }
 public void display()
  {
 System.out.println("The Bank Deatails are");
 System.out.println("Account Holder name"+name);
 System.out.println("Account Number "+anumber);
 System.out.println("The Balance Amount"+amount);
 }
   public void withdrawamount()
  {
 if(amount>withdraw)
   {
   Scanner sc=new Scanner(System.in);
           System.out.println("Enter the Amount you want to Withdraw");
 withdraw=sc.nextInt();
amount=amount-withdraw;
        System.out.println("The Amount "+withdraw+" to your account Sucessfully");
  System.out.println("The Amount your account is "+amount);
  }
  else
  {
 System.out.println("Insufficient Funds");
 }
    }
  public static void main(String[]args)
{
BankDetails bd1=new BankDetails();
Scanner sc=new Scanner(System.in);
System.out.println("The Account Holders name "+bd1.name);
  System.out.println("The Account Holders Account Numbers "+bd1.anumber);
   bd1.display();
 bd1.depositeamount();
 bd1.withdrawamount();
}
 }



   