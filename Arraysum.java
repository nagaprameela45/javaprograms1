import java.util.Scanner;
class Arraysum
  {
    public static void main(String args[])
    {
      int sum=0;
      int size=5;
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
      System.out.println("enter the  array elemnts");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(int i=0;i<=size;i++)
        {
          sum=sum+arr[i];
          System.out.println(sum);
        }
        }
    }
  