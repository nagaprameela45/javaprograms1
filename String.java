/*Create a class StringHelper with a method concatenate that concatenates two strings and returns the result. Implement method overloading for concatenate to handle the following cases:

Concatenate two strings.
Concatenate three strings.
Concatenate a list of strings.

Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:

Perform addition.
Perform subtraction.
Perform multiplication.
Perform division.*/
class Strings
  {
    void concatenate(String str1,String str2)  {
      System.out.println("after concate is:"+str1.concat(str2));
    }
    void concatenate(String str1,String str2,String str3){
      String str=str1.concat(str2);
       System.out.println("after concate is:"+str.concat(str3));
    }
  }
class String{
    public static void main(String args[])
    {
      Strings s=new Strings();
      s.concatenate("Hi","prameela");
      s.concatenate("Welcome","to","india");
    }
  }