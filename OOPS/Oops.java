// creating classes in oops
public class Oops {
  public static void main(String args[]){
    Pen p1 = new Pen();
    p1.setColor("Blue");
    p1.setTip(5);
    System.out.println("Color is: "+p1.color);
    System.out.println("Pen Tip is: "+p1.tip);
    p1.color = "Yellow";
    System.out.println("Updated color is : "+p1.color);

    Student s1 = new Student();
    s1.name = "Sibangi";
    System.out.println("Name is : "+ s1.name);
    s1.age = 22;
    System.out.println("Age is : "+s1.age);
    s1.calcPercentage(99, 95, 96);
    System.out.println("Percentage = "+ s1.percentage);
    s1.setName("Seetal");
    System.out.println("Updated Name: "+s1.name);
}
}
class Pen{
  String color;
  int tip;

  void setColor(String newColor){
    color=newColor;
  }
  void setTip(int newTip){
    tip=newTip;
  }
}
class Student{
  String name;
  int age;
  float percentage;

  void calcPercentage(int phy, int chem, int maths){
    percentage = (phy+chem+maths)/3;
  }
  void setName(String newName){
    name =newName;
  }
}
