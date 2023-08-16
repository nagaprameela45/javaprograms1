import java.util.Scanner;
class Secondlargest
  {
    public static void main(String args[])
    {
      int temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the array elements");
      for(int i=0;i<n;i++)
        {
         a[i]=sc.nextInt(); 
        }
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
             if(a[i]>a[j])
             {
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
              
             }              
            }
        }
      System.out.println("after sorting the elements are");
      for(int i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
      System.out.println("the second largest element is "+a[n-2]);
    }
  }