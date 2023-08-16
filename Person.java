/*Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.*/
import java.util.Scanner;
class Person
  {
    String name;
    int age;
    String adress;
    public void display()
    {
      System.out.println("name:"+name);
      System.out.println("age:"+age);
      System.out.println("adress:"+adress);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      personArray person[]=new personArray[3];
      for(i=0;i<=person.length;i++)
          {
        
 System.out.println("Enter person"+i+"detials");
            System.out.println("Enter the person name");
            person[i].name=sc.next();
            System.out.println("Enter the person age");
            person[i].age=sc.nextInt();
            System.out.println("Enter the Adress");
            person[i].adress=sc.next();
            for(int i=0;i<=person.length;i++)
                {
                  person[i].display();
              
                }
          }
    }
  }

        
        
        
      