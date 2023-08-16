/*Design a class Vehicle with a method start_engine that prints a generic message like "Engine starting." Create two derived classes, Car and Motorcycle, that override the start_engine method with more specific messages like "Car engine starting" and "Motorcycle engine starting.*/
class Vehicle{
  void start_engine(){
    System.out.println("engine starting");
  }
  class Car extends Vehicle{
    void speed(){
      System.out.println("car engine starting");
    }
    class Motorcycle extends Vehicle{
      void drive(){
        System.out.println("motorcycle engine starting");
      }
      class MethodOverriding2{
        public static void main(String args[]){
          MethodOverride2 me=new MethodOverride2();
          me.start_engine();
          me.speed();
          me.drive();
        }
      }
    }
  }
}