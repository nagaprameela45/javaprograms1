/*Create a class called "Product" with instance variables for storing the product name, price, and quantity. Implement a constructor that takes arguments for each variable and initializes the object.*/
import java.util.Scanner;
class Product
  {
    String name;
    int price;
    int quantity;
    public void display()
    {
      System.out.println("name is:"+name);
      System.out.println("price is:"+price);
      System.out.println("quantity is:"+quantity);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ProductArray product[]=new ProductArray();
      for(i=0;i<product.length;i++)
        {
          product[i]=new ProductArray();
          System.out.println("Enter product"+i+"detials");
          System.out.println("Enter the product name");
          product[i].name=sc.next();
          System.out.println("Enter the product price ");
          product[i].price=sc.nextInt();
          System.out.println("Enter the product quantity");
          product[i].quantity=sc.nextInt();
          for(i=0;i<product.length;i++)
            {
              product[i].display();
            }
          
        }
    }
      
    }
  