import java.util.Scanner;
class EvenOdd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=20;
    if(num % 2 == 0)
    {
    System.out.println("enter the number");
      int even=sc.nextInt();
      System.out.println("the number is even");
    }
    else{
      if(num %2!=0){
       System.out.println("the number is an odd number");
    }
    }
  
