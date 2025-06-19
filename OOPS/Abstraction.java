public class Abstraction {
  public static void main(String args[]){
    Horse h = new Horse();
    Chicken ch = new Chicken();
    h.eat();
    h.walk();
    System.out.println(h.color);
    ch.eat();
    ch.walk();
    System.out.println(ch.color);
  }
}
abstract class Animal{
  String color;
  //Constructor
  Animal(){
    color="brown";
    System.out.println("Animal constructor is called");
  }
  //Non-Abstract method
  void eat(){
    System.out.println("Animal eats");
  }
  //Abstract Method - no implementation eritten, its subclasses will tell how it will be implemented
  abstract void walk();
}
class Horse extends Animal{
  Horse(){
    System.out.println("Horse Constructor is called");
  }
  void changeColor(){
    color = "dark brown";
  }
  void walk(){
    System.out.println("Horse walks on 4 legs");
  }
}
class Chicken extends Animal{
  Chicken(){
    System.out.println("Chicken constructor is called");
  }
  void changeColor(){
    color="yellow";
  }
  void walk(){
    System.out.println("Chicken walks on 2 legs");
  }
}