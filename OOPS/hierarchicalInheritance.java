public class hierarchicalInheritance {
  public static void main(String args[]){
    Mammal Whale = new Mammal();
    Fish goldy = new Fish();
    Bird pigeon = new Bird();
    Whale.eat();
    goldy.color = "Golden";
    System.out.println(goldy.color);
    pigeon.breathe();
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
  void walk(){
    System.out.println("Walks");
  }
}
class Fish extends Animal{
  void swim(){
    System.out.println("Swims");
  }
}
class Bird extends Animal{
  void fly(){
    System.out.println("Flies");
  }
}
