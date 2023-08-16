class Parrot{
  void fly(){
    System.out.println("flying");
  }}
  class Sparrow extends Parrot{
    void eat(){
      System.out.println("eating");
    }
  }
class Baby extends Sparrow{
  void cry(){
    System.out.println("Crying");
  }
}
  class MultilevelInheritance{
    public static void main(String args[]){
      Baby b=new Baby();
      b.cry();
      b.eat();
      b.fly();
    }
  }
