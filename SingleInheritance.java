class Singlefish{
    void swim() {
      System.out.println("swimming");
    }
}
    class Crocodile extends Singlefish {
      void bark() {
        System.out.println("barking");
      }
    }
      class SingleInheritance {
      public static void main(String args[]){
      Crocodile c=new Crocodile();  
        c.bark();
        c.swim();
      }
        }
  
    
  