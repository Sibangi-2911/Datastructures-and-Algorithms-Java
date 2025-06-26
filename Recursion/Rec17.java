//Write a program to findLength of aStringusing Recursion.
public class Rec17 {
  public static int findLength(String str){
    if(str.length()==0){
      return 0;
    }
    return findLength(str.substring(1))+1;
  }
  public static void main(String args[]){
    System.out.println(findLength("abcde"));
  }
}
