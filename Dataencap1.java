/*Assignment 1: Create a Class with Encapsulation

Create a class named "Person" with private attributes: name, age, and email.
Provide public getter and setter methods for each attribute.
Write a displayInfo() method within the class to display all the details of the person.
In the main method, create an object of the class and set values for the attributes using setter methods. Then, call the displayInfo() method to show the details of the person.*/
class Person

  {

    private String name;

    private int age;

    private String email;

    public void setName(String name)

    {

      this.name=name;

    }

    public void setAge(int age)

    {

      this.age=age;

    }

    public void setEmail(String email)

    {

      this.email=email;

    }

    public String getName()

    {

      return name;

    }

    public int getAge()

    {

      return age;

    }

    public String getEmail()

    {

      return email;

    }

    public void display()

    {

      System.out.println("the name of the person is "+getName());

      System.out.println("the age is "+getAge());

      System.out.println("email id is "+getEmail());

    }

  }

class Dataencap1

  {

    public static void main(String args[])

    {

      Person p=new Person();

      p.setName("prameela");

      p.setAge(23);

      p.setEmail("pramee123@gmail.com");

      p.display();

    }

  }




