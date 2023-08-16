import java.util.Scanner;
class Floating
  {
    public static void main(String args[])
    {
      float a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of a:");
      a=sc.nextFloat();
      System.out.println("Enter the value of b:");
      b=sc.nextFloat();
      float c=a*b;
      System.out.println("The sum is:"+c);
    }
  }
