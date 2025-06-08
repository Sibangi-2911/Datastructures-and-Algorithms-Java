//print all the letters one by one
public class str3 {
  public static void printLetters(String name){
    for(int i=0;i<name.length();i++){
      System.out.println(name.charAt(i));
    }
  }
  public static void main(String args[]){
    String name = "Sibangi";
    System.out.println(name.charAt(2));
    printLetters(name);
  }
}
