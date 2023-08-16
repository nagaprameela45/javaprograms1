import java.util.Scanner;
class Contains
  {
    public static void main(String args[])
    {
      String s1="hai";
      String s2="welcome to bitlabs";
      boolean value=s1.contains("a");
      System.out.println(value);
     System.out.println(s2.contains("come"));//true
      System.out.println(s2.contains("lbse"));//false
      System.out.println(s2.contains("el"));//true
      
    }
  }
