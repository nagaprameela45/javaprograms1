class Shape{
  void area(){
    System.out.println("the square is:");
  }
}
class Square extends Shape{
  void area(){
    System.out.println("area of a square is:"+(side*side));}
  }
class Rectangle extends Shape{
  void area(){
    System.out.println("area of a rectangleis:"+(l+b));
  }
}
class Methodover{
  public static void main(STring args[]){
    Shape s=new Shape();
    s.area();
    Square s =new Square();
    s.area(3*3);
     Rectangle r=new Rectangle();
    s.area(3+5);
  }
  
}
