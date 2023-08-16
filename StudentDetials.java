import java .util.Scanner;
class StudentDetials
  {
    public static void studentDetials(String name,int rno)
    {
System.out.println("the student name:"+name+"rollno:+rno");
    }
    public static void main(String args[]){
      Scanner Sc=new Scanner(System.in);
      String name=Sc.next();
      int srno=Sc.nextInt();
      studentDetials("prameela",62);
      studentDetials("mounika",64);
    }
   }
  