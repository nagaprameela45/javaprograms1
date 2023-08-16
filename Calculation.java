/*
Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:
perform addition.
Perform subtraction.
Perform multiplication.
Perform division*/
class MathOperations{
  void add(int a,int b){
    System.out.println("addition of two numbers is:"+(a+b));
  }
    void sub(int a,int b){
      System.out.println("subraction of two numbers is:"+(a-b));
    }
  void mul(int a,int b){
    System.out.println("multiplication of two numbers is:"+(a*b));
  }
  void div(float a,float b){
    System.out.println("division of two numbers is:"+(a/b));
  }
  class Calculation{
    public static void main(String args[]){
      Calculation c=new Calculation();
      c.add(10,20);
      c.sub(20,30);
      c.mul(40,50);
      c.div(60,70);
    }
  }
}


  
      
  
