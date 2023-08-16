import java.util.Scanner;
class StudentGrading
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println(" enter physics marks:");
      int physics=sc.nextInt();
      System.out.println(" enter social marks:");
      int social=sc.nextInt();
      System.out.println(" enter science marks:");
      int science=sc.nextInt();
      System.out.println(" enter maths marks:");
      int maths=sc.nextInt();
     System.out.println(" enter  english marks:");
     int english=sc.nextInt();
    double total=physics+social+science+maths+english;
    double percentage=(total/500)*100;
    System.out.println("Percentage= "+percentage);
      if(percentage<=40)
      {
        System.out.println("FAIL");
      }
      else if((percentage>40)&&(percentage<=50))
      {
        System.out.println("E Grade");
      }
      else if((percentage>50)&&(percentage<=60))
      {
        System.out.println("D Grade");
      }
      else if((percentage>60)&&(percentage<=70))
      {
        System.out.println("C Grade");
      }
      else if((percentage>70)&&(percentage<=80))
      {
        System.out.println("B Grade");
      }
      else if((percentage>80)&&(percentage<=100))
      {
        System.out.println("A Grade");
      }
      else
        System.out.println("Invalid");
    }
  }
    