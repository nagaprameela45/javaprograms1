/*Create an abstract class called "Animal" with the following abstract methods:
1.	speak(): Outputs the sound that the animal makes.
2.	move(): Describes how the animal moves.
Create concrete classes Dog, Cat, and Bird that inherit from the abstract class "Animal." Implement the required methods for each class.
Write a program to:
1.	Create instances of Dog, Cat, and Bird.
2.	Display the sound and movement of each animal.*/
abstract class Animal {
    abstract void speak();
    abstract void move();
}
class Dog extends Animal{
  void speak()
    {
      System.out.println("Dog: Running on four legs.");
  }
  void move()
  {
    System.out.println("dogs are running");
  }
  class Cat extends Animal{
    void speak(){
      System.out.println("the cat sounds like meow meow");
    }
    void move()
    {
      System.out.println("the cat moves slowly");
    }
    class Bird extends Animal{
      void speak(){
        System.out.println("the bird sounds like ggg");
      }
      void move(){
        System.out.println("the bird flys");
      }
      class Animalhier{
        public static void main(String args[]){
          Animal animal = new dog();
          Animal animal = new cat();
          Animal animal = new bird();
          System .out.println("the dog is");
          dog.speak();
          dog.move();
          System.out.println("the cat is");
          cat.speak();
          cat.move();
          bird.speak();
          bird.move();
        }
      }
    }
  }
}

  
        
       
  
    
  