public class Constructor {
  public static void main(String args[]){
    Student1 s1 = new Student1();
    Student1 s2 = new Student1("Sibangi");
    Student1 s3 = new Student1(4123);
    System.out.println(s1.name);
  }
}
class Student1{
  String name;
  int roll;
  //Non-parametrised constructor
  Student1(){
    System.out.println("Constructor is called...");
  }
  //parameterised constructor
  Student1(String name){
    this.name = name;
  }
  Student1(int roll){
    this.roll = roll;
  }
}
