 import java.util.Scanner;
class Double
  {
    public static void main(String args[])
    {
      Double a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value:");
      a=sc.nextDouble();
      System.out.println("enter b value:");
      b=sc.nextDouble();
      Double c=a+b;
      System.out.println("the sum is:"+c);
    }
  }
