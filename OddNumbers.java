import java.util.Scanner;
class OddNumbers
  {
    public static void oddArr(int a[])
    {
    System.out.println("Odd numbers are:");
      for(int i=0;i<a.length;i++)
        {
          if(a[i]%2!=0)
          {
            System.out.println(a[i]+" ");
          }
        }
    }
    public static void main(String []args)
    {
      int arr[]=new int[6];
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
         
        }
       
        oddArr(arr);
   }
  }
