/*Assignment 2: Multilevel Inheritance

Create a class called "Vehicle" with the following attributes:
String make
String model
int numDoors
boolean isConvertible*/
class Vehicle{
  String make;
  String model;
  int numdoors;
  class Bike extends Vehicle{
    void display(){
      System.out.println("enter the vehicle make:"+make);
      System.out.println("enter the vehicle model:"+model);
      System.out.println("enter the number doors:"+numdoors);
      class Multipleinheritance{
        public static void main(String args[]){
          Bike b=new Bike();
          b.make="ggg";
          b.model="hhhh";
          b.num=88;
        }
      }
      
    }
  }
}
