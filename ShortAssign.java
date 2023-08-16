import java.util.Scanner;
class ShortAssign
  {
    public static void main(String args[])
    {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter first number:");
      int a=input.nextInt();
      System.out.println("Enter second number:");
      int b=input.nextInt();
      System.out.println("a*=b "+(a*=b));
            System.out.println("a-=b "+(a-=b));
            System.out.println("a/=b "+(a/=b));
            System.out.println("a%=b "+(a%=b));
    }
  }
