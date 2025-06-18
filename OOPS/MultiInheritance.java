public class MultiInheritance {
  public static void main(String args[]){
    Dog Sheru = new Dog();
    Sheru.eat();
    Sheru.legs = 4;
    System.out.println("Dog has "+ Sheru.legs+ " legs.");
  }
}
class Animal{
  String color;
  void eat(){
    System.out.println("Eats");
  }
  void breathe(){
    System.out.println("breathes");
  }
}

class Mammal extends Animal{
  int legs;
}

class Dog extends Mammal{
  String breed;
}
