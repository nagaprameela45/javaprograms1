import java.util.Scanner;
class PasswordCheck

  {

    public static void main(String args[])

    {

      Scanner sc=new Scanner(System.in);

      System.out.println("enter a String");

      String str=sc.next();

     int uCount=0,lCount=0,dCount=0,sCount=0;

      if(str.length()>=8)

      {

         for(int i=0;i<str.length();i++)

           {

             if(str.charAt(i)>='a' && str.charAt(i)<='z')

             {

               lCount++;

             }

             else if(str.charAt(i)>='A' && str.charAt(i)<='Z')

             {

               uCount++;

             }

             else if(str.charAt(i)>='0' && str.charAt(i)<='9')

              {

              dCount++;

              }

             else

               sCount++;

           }

      }

      else{

        System.out.println("Password should be minimum 8 ");

      }

        if(lCount>0 && uCount>0 && dCount>0 && sCount>0)

        {

          System.out.println("passowrd is Strong");


        }

      else

          System.out.println("weak");

      }

    }
