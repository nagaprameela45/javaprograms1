class Person{
  String name="prameela";
 String adress="vijayawada";
  void disply(){
    System.out.println(name+" "+adress);
  }
  }
  class Student extends Person{
    String name="divya";
    String =tenali;
    void display(){
    System.out.println(name+" "+super.adress);
    }
  }
class Super{
  public static void main(String args[]){
    Student s=new Student();
    s.display();
  }
}
