import java.util.Scanner;
class Character
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value:");
      char ch=sc.next().charAt(0);
      if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
      {
        System.out.println("given value is a Alphabet");
      }
      else if(ch>='0'&&ch<='9')
      {
        System.out.println("given value is a number");
      }
     else{
       System.out.println("given value is a special character");
     }
    }
  }
