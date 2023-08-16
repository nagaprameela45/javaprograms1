import java.util.Scanner;
class Character1
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println(" Enter the String value: ");
      String  st=sc.nextLine();
      int len=st.length();
      int Alp_count=0;
      int Dig_count=0;
      int Spl_count=0;
      for(int i=0;i<len;i++)
      {
          if(((st.charAt(i)>='a')&&(st.charAt(i)<='z'))||((st.charAt(i)>='A')&&(st.charAt(i)<='Z')))
          {
          Alp_count++;
          }
        else if((st.charAt(i)>='0')&&(st.charAt(i)<='9'))
        {
          Dig_count++;
        }
        else
        {
          Spl_count++;
        }
       }
      System.out.println("Characters in a String: "+Alp_count);
      System.out.println("Numbers in String: "+Dig_count);
      System.out.println("Special Characters in String: "+Spl_count);
    }
  }
