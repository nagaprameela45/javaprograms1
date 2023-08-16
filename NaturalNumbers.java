import java.util.Scanner;
class NaturalNumbers{
      public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number from where you want to print");
      int first=sc.nextInt();
      System.out.println("enter the number upto which u want to print");
      int last=sc.nextInt();
      for(int i=1;i<=last;i++)
        {
        System.out.println(i);
        }
      }
  }

    
