import java.util.Scanner;
class Atm
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the account balance");
      double balance=sc.nextDouble();
      System.out.println("*****ATM Transactions*****");
      System.out.println("enter your choice");
      System.out.println("1 Deposit"+"\n"+ "2 withdrawl"+"\n"+"3 Balance Inquiry"+"\n"+"4 Change PIN");
      int choice=sc.nextInt();
      switch(choice)
        {
          case 1:
            System.out.println("enter the amount to deposit");
            double depositAmt=sc.nextDouble();
            double total=balance+depositAmt;
            System.out.println("your deposit transaction is successfull"+total);
            break;
        case 2:
        System.out.println("enter the amount to withdraw");
            double withdraw=sc.nextDouble();
            if(balance>withdraw)
            {
              double result=balance-withdraw;
              System.out.println("your withdraw transaction completed");
            }
            else {
              System.out.println("insufficient balance");
          
            }
          break;
          case 3:
            System.out.println("your total balance is"+balance);
            break;
          case 4:
            System.out.println("enter your pin");
            int pin=sc.nextInt();
            if(pin==1234)
            {
              System.out.println("valid pin");
            }
            else
            {
              System.out.println("in valid pin");
              
            }
        }
      
    }
  }
