/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that takes arguments for each variable and initializes the object.*/
import java.util.Scanner;
class Employe
  {
    String name;
    String designation;
    int salary;
    public void display ()
    {
      System.out.println("name is:"+name);
      System.out.println("designation is:"+designation);
      System.out.println("salary is:"+salary);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Employe employe[]=new Employee[3];
       for(i=0;i<employe.length;i++)
         {
           System.out.println("enter employe name");
           employe[i]=sc.next();
           System.out.println("enter the employe designation");
           employe[i]=sc.next();
           System.out.println("enter the employe salary");
           employe[i]=sc.nextInt();
         }
      for(int i=0;i<employe.length;i++)
        {
          employe[i].display();
        }
      
      
    }
  }
