

class Person

  {

    int age;

    String name;

    Person(int age,String name)

    {

      this.age=age;

      this.name=name;

    }

  }

class Employee extends Person{

  int empid;

  float salary;

  Employee(int age,String name,int empid,float salary)

  {

    super(age,name); //reusing parent constructor

    this.empid=empid;

    this.salary=salary;    

  }

  void display()

  {

    System.out.println(age+" "+name+" "+empid+" "+salary);

  }

}

class Superthis

  {

    public static void main(String args[])

    {

     Employee employee=new Employee(32,"sowjanya",12,12000.0f);

      employee.display();     

    }

  }