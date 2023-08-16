import java.util.Scanner;
class CopyingElements
  {
    public static void copying(int a1[],int b2[],int size)
    {
      for(int i=0;i<size;i++)
        {
          b2[i]=a1[i];
        }
      System.out.println("The newly created array elements are");
      for(int i=0;i<size;i++)
        {
          System.out.println("b2["+i+"]"+" is "+b2[i]);
        }
    }
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size=sc.nextInt();
      int a1[]=new int[size];
    int b2[]=new int[size];
      System.out.println("Enter the array elements");
    for(int i=0;i<size;i++)
      {
        a1[i]=sc.nextInt();
      }
    copying(a1,b2,size);
    }
}