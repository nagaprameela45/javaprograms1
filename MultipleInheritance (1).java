class MultipleInheritance
  {
    String make="tata";
  }
class Model extends Vehicle
  {
   String model="scorpio";
    int numDoors=4;
  }
class Convertable extends Model
  {
    boolean b=true;
    public static void main(String args[])
    {
      Convertable c=new Convertable();
      System.out.println(c.make);
      System.out.println(c.model+" "+"the doors are"+c.numDoors);
      System.out.println("is convertible"+c.b);

    }
  }