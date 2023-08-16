import java.util.Scanner;
class Arraydeleting
{

    public static void delete(int a[],int size,int pos)

    {

      for(int i=0;i<size-1;i++)

        {

         if(i==pos)

         {

           a[i]=a[i+1];

         }

          else if(i>pos)

          {

            a[i]=a[i+1];

          }

        }

      System.out.println("after deleting the elements");

      for(int i=0;i<size-1;i++)

        {

        System.out.print(a[i]+" ");

    }

    }

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      System.out.println("enter the size of the array");

      int size=sc.nextInt();

      int a[]=new int[size];

      System.out.println("enter the array elements");

      for(int i=0;i<size;i++)

        {

          a[i]=sc.nextInt();

        }

      System.out.println("enter the position to be deleteed");

      int pos=sc.nextInt();

      delete(a,size,pos);

    }

  }