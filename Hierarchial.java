class Animal{
  void run(){
    System.out.println("eating");
  }
}
class lion extends Animal{
  void eat(){
    System.out.println("eating");
  }
}
class Tiger extends Animal{
  void bark(){
    System.out.println("barking");
  }
}
class Hierarchial{
  public static void main(String args[]){
     Tiger t=new Tiger();
    t.bark();
    t.run();
  }
}