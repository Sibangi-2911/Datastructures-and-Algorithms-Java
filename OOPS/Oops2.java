//Getters and setters
public class Oops2 {
  public static void main(String args[]){
    Pen1 p1 = new Pen1();
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    p1.setTip(12);
    System.out.println(p1.getTip());
    p1.setColor("Yellow");
    System.out.println(p1.getColor());
  }
}
class Pen1{
  private String color;
  private int tip;
  String getColor(){
    return this.color;
  }
  int getTip(){
    return this.tip;
  }
  void setColor(String newColor){
    this.color = newColor;
  }
  void setTip(int tip){
    this.tip = tip;
  }
}
