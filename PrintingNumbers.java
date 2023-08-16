import java.util.Scanner;
class PrintingNumbers
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number from where you want to print");
      int a=sc.nextInt();
      System.out.println("enter the number upto which u want to print");
      int b=sc.nextInt();
      for(int i=a;i<=b;i++)
        {
        System.out.println(i);
        }
      }
  }

    