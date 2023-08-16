import java.util.Scanner;

import com.sun.swing.internal.plaf.basic.resources.basic_ja;
class AreaOfRectangle{
  public static void areaOfReactangle(int a,int b)
  {
  int area=a*b;
  System.out.println("area"+area);
}
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter length");
  int a=sc.nextInt();
  System.out.println("enter breadth");
  int b=sc.nextInt();
arearec(a,b);
}
  
}

