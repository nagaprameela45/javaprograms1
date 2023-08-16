/*In this assignment, you are required to create a class called Calculator that implements method overloading for addition. The Calculator class should have three different methods named add, each with a different number of parameters:

add(a, b): This method should take two integer parameters and return their sum.
add(a, b, c): This method should take three integer parameters and return their sum.
add(a, b, c, d): This method should take four integer parameters and return their sum.*/
class Calculator

  {

    void addition(int a,int b)

    {

      int sum=a+b;

      System.out.println("the sum is"+sum);

    }

    void addition(int a,int b,int c)

    {

      int sum=a+b+c;

      System.out.println("the sum is"+sum);

    }

    void addition(int a,int b,int c,int d)

    {

      int sum=a+b+c+d;

      System.out.println("the sum is"+sum);

    }

  }

class Methodover1

  {

    public static void main(String args[])

    {

      Calculator c=new Calculator();

      c.addition(12,24);

      c.addition(23,45,65);

      c.addition(22,45,34);

    }

  }

 