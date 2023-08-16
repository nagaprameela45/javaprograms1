import java.util.Scanner;
class OddNumberscount
  {
    public static void count(int a[])
    {
      int count=0;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          { 
            count=count+1;
          }
        }
    System.out.println("odd numbers are:"+count);
  }
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array elements:");
      int a[]=new int[6];
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
        count(a);
      }
     
    }
