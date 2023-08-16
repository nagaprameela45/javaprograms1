import java.util.*;
class Arraysort
  {
    public static void sortascend(int a[],int n)
    {
      int temp=0;
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
            {
              if(a[i]<a[j])
              {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
        }
    }
      System.out.println("Array Elements After Sorting in Ascending order");
      for(int i=0;i<n;i++)
        {
      System.out.println(a[i]);
        }
    }
      public static void sortdecend(int a[],int n)
    {
      int temp=0;
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
            {
              if(a[i]>a[j])
              {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
        }
    }
      System.out.println("Array Elements After Sorting Decending Order");
      for(int i=0;i<n;i++)
        {
      System.out.println(a[i]);
        }
  }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Size Of the array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the Elements in the Array");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Elements before Sorting");
      for(int i=0;i<n;i++)
        {
          System.out.println(a[i]+"");
        }
      sortascend(a, n);
      sortdecend(a, n);
    }
  }