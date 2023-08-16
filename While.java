  import java.util.Scanner;
class While
  {
    public static void main(String args[])
    {   
   Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      int number=sc.nextInt();
      System.out.println("the numbers are");
      int i=1;
      while(i<=number)
        {
          System.out.print(i+" ");
          i++;
        }
     
    }
  }
    
 
