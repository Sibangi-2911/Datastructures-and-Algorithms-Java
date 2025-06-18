

public class inheritance {
  public static void main(String args[]){
    Fish shark = new Fish();
    shark.eat();
  }
}
//base class or parent class
class Animal{
  String color;
  void eat(){
    System.out.println("Eats");
  }
  void breathe(){
    System.out.println("breathes");
  }
}
//Derived class or child class
class Fish extends Animal{
  int fins;
  void swim(){
    System.out.println("Swims in water");
  }
}
