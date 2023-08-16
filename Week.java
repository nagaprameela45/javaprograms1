import java.util.Scanner;
class Week{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the  day");
    int day=sc.nextInt();
    switch(day){
        case 1:
        System.out.println("it is monday");
        break;
        case 2:
          System.out.println("it is tuesday");
        break;
        case 3: System.out.println("it is wednesday");
        break;
        case 4:
          System.out.println("it is thursday");
        break;
        case 5:
          System.out.println("it is friday");
        break;
        case 6:
       break;
        case 7:
          System.out.println("it is sunday");
        break;
      default:
        System.out.println("it is not the week of the day");
          
          
      }
  }
}