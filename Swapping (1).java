class Swapping {  
 public static void main(String arg[]) {  
  System.out.println("Before swapping");  
  int x = 10;  
  int y = 20;  
  System.out.println("enter the first number:" + x);  
  System.out.println("enter the second number:" + y);  
System.out.println("After swapping: "+x +"  " + y); ;  
  x = x + y;  
  y = x - y;  
  x = x - y;  
  System.out.println("enter the first number:" + x);  
  System.out.println("enter the second number:" + y);  
 }  
}   
