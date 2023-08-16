/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee's details.*/
class Employe1
  {
    String name;
    String designation;
    int salary;
     public void insert(String n,String r,int y)
  {
  name=n;
  designation=r;
  salary=y;
  }
public void display()
  {
  System.out.println("name is:"+name);
  System.out.println("designation is:"+designation);
  System.out.println("salary is:"+salary);
}
    public static void main(String args[])
    {
      Employe e1=new Employe();
      e1.name="prameela";
      e1.designation="manager";
      e1.salary=5000;
      Employe e2=new Employe();
      e2.name="naga";
      e2.designation="assistant manager";
      e2.salary=4000;
      e1.display();
    }
  
  }
