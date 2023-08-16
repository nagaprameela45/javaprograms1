import java.util.Scanner;
class Div
  {
    public static void main(String args[]){
      
 Scanner sc=new Scanner(System.in);
      System.out.println("Enter the numbers from 1 to 50");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          if(i%3==0)
          {
            System.out.println(i);
          }
        }
    }
  }

