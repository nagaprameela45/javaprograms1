/*Create a class called "Car" with instance variables for storing the make, model, and year of a car. Implement a method named setCarDetails that takes arguments for each variable and initializes the object. Display the car's details using a separate method.*/
class Car
 {
 String make,model;
  int year;
 public void setCarDetails(String m,String mo,int y)
{
 make=m;
model=mo;
year=y;
}
 public void carDisplay()
    {

      System.out.println("the making company of car is "+make);

      System.out.println("the model name is " + model);

      System.out.println("the year of manufacturer is "+year);

    }

    public static void main(String args[])

    {

      Car car=new Car();

      car.setCarDetails("tata","safari",1998);

      car.carDisplay();

    }

  }