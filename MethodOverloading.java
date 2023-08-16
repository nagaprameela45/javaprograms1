class Square
{
  void area()
  {
    System.out.println("the square is:");
  }
  void area(float side)
  {
    System.out.println("area of a square is:"+(side*side));}
  void area(float length,float breadth)
  {
    System.out.println("area of the rectangle is:"+(length+breadth));
  }
  class MethodOverloading
  {
    public static void main(String args[])
    {
      Square s=new Square();
      s.area();
      s.area();
    }
  }
  }


    

  

