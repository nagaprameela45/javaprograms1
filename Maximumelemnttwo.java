import java.util.*;
class Maximumelemnttwo
{

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      int max=0;

      System.out.println("enter the row size of an array");

      int r=sc.nextInt();

      System.out.println("enter the column size of an array");

      int c=sc.nextInt();

      
      int a[][]=new int[r][c];

      System.out.println("enter the elements into the array");

      for(int i=0;i<r;i++)

        {

          for(int j=0;j<c;j++)

            {

              a[i][j]=sc.nextInt();

            }

        }

      for(int i=0;i<r;i++)

        for(int j=0;j<c;j++)

          {

            if(a[i][j]>max)

              max=a[i][j];

          }

      System.out.println("the maximum element in the array is"+max);

    }

  }