  import java.util.Scanner;
class Calculation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      char option;
      
      do{
        System.out.println("select the operator");
        System.out.print(" + --> Addition"+"\n" + " - ---> Subtraction"+"\n" +"* --> Multplication"+"\n"+"/ - division" );
        char ch=sc.next().charAt(0);
         System.out.println("enter a and b values");
          int a=sc.nextInt();
          int b=sc.nextInt();
        if(ch=='+')
        {
         System.out.println("result of addition is"+ (a+b));
        }
        else if(ch=='-')
        {
          System.out.println("result of subtraction is"+ (a-b));
        }
        else if(ch=='*')
        {
          System.out.println("result of multplication is"+ (a*b));
        }
        else if(ch=='/')
        {
          System.out.println("result of division is"+ (a/b));
        }
                
else {
          System.out.println("invalid operator");
}
        System.out.println("do you want to continue: (y/n)");
        option=sc.next().charAt(0);
      }
        while(option=='y'||option=='Y');
    }
  }
