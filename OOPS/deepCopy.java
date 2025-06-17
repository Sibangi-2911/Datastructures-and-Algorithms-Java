public class deepCopy {
  public static void main(String args[]){
    Student2 s1 = new Student2();
    s1.name = "Sibangi";
    s1.roll = 1234;
    s1.password = "abcdef";
    s1.marks[0]=90;
    s1.marks[1]=100;
    s1.marks[2]=96;
    Student2 s2 = new Student2(s1); //shallow copy
    s2.password = "xyz";
    s1.marks[0] = 100;
    for(int i=0;i<3;i++){
      System.out.println(s2.marks[i]);
    }
  }
}
class Student2{
  String name;
  int roll;
  String password;
  int marks[];
  Student2(Student2 s1){
    marks = new int[3];
    this.name = s1.name;
    this.roll = s1.roll;
    for(int i=0;i<marks.length;i++){
      this.marks[i]=s1.marks[i];
    }
  }
  Student2(){
    System.out.println("Constructor is called...");
    marks = new int[3];
  }
}