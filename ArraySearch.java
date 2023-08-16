import java.util.Scanner;
class ArraySearch
  {
    public static void arraysearch(int a[],int size,int value)
    {
      for(int i=0;i<size;i++)
        {
          if(a[i]==value)
          {
            System.out.println("element found at position: "+i);
            break;
          }
         
        }
    }
      public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array elements");
          for(int i=0;i<size;i++)
          {
            a[i]=sc.nextInt();
          }
        System.out.println("enter the value to search");
        int value=sc.nextInt();
        arraysearch(a,size,value);
        }
    }
 
