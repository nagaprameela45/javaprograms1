 import java.util.Scanner;
class Calculator{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the  a value:");
    int a=sc.nextInt();
    System.out.println("enter the  b value:");
    int b=sc.nextInt();
    System.out.println("select any operator to performe the operators provied the list:");
    char ch=sc.next().charAt(0);
    switch(ch)
      {
        case 1:
          System.out.println("a+b");
          break;
        case 2:
          System.out.println("a-b");
          break;
        case 3:
          System.out.println("a*b" );
          break;
        case 4:
          System.out.println("a/b");
          break;
        case 5:
          System.out.println("a%b");
          break;
        default:
          System.out.println("enter the valid input");
          break;
      }
   
      }
}

        
    
    