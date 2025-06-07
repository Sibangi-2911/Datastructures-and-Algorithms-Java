import java.util.*;
public class str1 {
  public static void main(String args[]){
    char ch[] = {'a','b','c','d'};
    String str = "xyz";
    String str2 = new String("xyz");
    //Strings are immutable
    Scanner sc = new Scanner(System.in);
    String name;
    name = sc.next(); //This takes only word
    System.out.println("My name is "+name);
    String fullname;
    fullname = sc.nextLine(); // this takes a line as input
    System.out.println("My fullname is "+fullname);
  }
}
