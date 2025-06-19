public class hybridInheritance {
  public static void main(String args[]){
    Mammal Whale = new Mammal();
    Fish goldy = new Fish();
    Bird pigeon = new Bird();
    Tuna salt = new Tuna();
    Human man = new Human();
    Peacock bird = new Peacock();
    Whale.eat();
    goldy.color = "Golden";
    System.out.println(goldy.color);
    pigeon.breathe();
    salt.eat();
    man.color="skin color";
    System.out.println("Humans have "+ man.color);
    bird.breathe();
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
class Fish extends Animal{
  int fins;
  void swim(){
    System.out.println("Swims in water");
  }
}
class Bird extends Animal{
  int wings;
  void fly(){
    System.out.println("Bird flies");
  }
}
class Mammal extends Animal{
  int legs;
}
class Peacock extends Bird{
  void nationalBird(){
    System.out.println("It is the national animal");
  }
}
class Tuna extends Fish{
  void saltWater(){
    System.out.println("It is a salt water fish.");
  }
}
class Human extends Mammal{
  void warmBlood(){
    System.out.println("Humans are warm blooded.");
  }
}
