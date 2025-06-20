public class Interfaces {
  public static void main(String args[]){
    Bear b = new Bear();
    b.diet();
    b.teeth();
  }
}
interface Herbivore{
  void diet();
  void teeth();
}
interface Carnivore{
  void diet();
  void teeth();
}
class Bear implements Herbivore, Carnivore{
  public void diet(){
    System.out.println("It eats both plants and meat");
  }
  public void teeth(){
    System.out.println("There are four types of teeth: incisors (I), canines (C), premolars (P), and molars (M).");
  }
}
