import java.util.Scanner;
class PowerNumber{
  public static void main(String args[]){
    int base,power;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter base value");
    base=sc.nextInt();
    System.out.println("enter power value");
    power=sc.nextInt();
    int result=1;
    for(int i=1;i<=power;i++){
      result=result*base;
    }
    System.out.println("the result is:"+result);
  }
  }
