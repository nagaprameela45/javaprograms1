/*Create a superclass called "Animal" with the following attributes:

String name
int age
String breed*/
class Animal{
 String name;
  int age;
  String breed;
  void Property()
}
class Lion extends Animal{
  void display(){
    System.out.println("the name of the lion:"+name);
    System.out.println("the age of the lion:"+age);
    System.out.println("the breed of the lion:"+breed);
  }
}
class AnimalSingle{
  public static void main(String args[]){
    Lion l=new Lion();
    lion.Property();
    l.name="chethah";
    l.age=66;
    l.breed="boy";
  }
}