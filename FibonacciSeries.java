import java.util.Scanner;
class FibonacciSeries
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int first=0,second=1;
      System.out.println("enter the number upto how many you want");
      int number=sc.nextInt();
      System.out.print(first+" ");
      System.out.print(second+" ");
      for(int i=1;i<=number;i++)
        {
          int third=first+second;
          System.out.print(third+" ");
          first=second;
          second=third;
        }
    }
  }
