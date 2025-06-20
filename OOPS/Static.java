public class Static {
  public static void main(String args[]){
    Student s1 = new Student();
    s1.school = "KV";
    s1.setName("Sibangi");
    System.out.println(s1.getName());
    Student s2 = new Student();
    System.out.println(s2.school);
    Student s3 = new Student();
    s3.school = "Xavier";
    System.out.println(s2.school);
    System.out.println(s3.returnPercentage(95, 98, 99));


  }
}
class Student{
  static int returnPercentage(int math, int phy, int chem){
    return (math+phy+chem)/3;
  }
  String name;
  int roll;
  static String school;
  void setName(String name){
    this.name= name;
  }
  String getName(){
    return this.name;
  }
}
