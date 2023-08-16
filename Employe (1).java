/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that initializes these variables and display the employee's details.*/
class  Employe
  {
    String name;
    int salary;
    String designation;
    public void display()
    {
      System.out.println("the name of the employee:"+name);
      System.out.println("the salary of the employe:"+salary);
      System.out.println("the designation of the employe:+designation");
    }
    public static void main(String args[])
    {
      Employe e1=new Employe();
      e1.name="prameela";
      e1.salary=50000;
      e1.designation="manager";
      Employe e2=new Employe();
      e2.name="sushma";
      e2.salary=4000;
      e2.designation="assistant manager";
      e1.display();
    }
  }