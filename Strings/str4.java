//Check if a string is a palindrome or not - time complexity O(n)
import java.util.*;
public class str4 {
  public static boolean palindrome(String text){
    int n=text.length();
    for(int i=0;i<text.length()/2;i++){
      if(text.charAt(i)!=text.charAt(n-1-i)){
        System.out.println(text+" is not in palindrome  sequence.");
        return false;
      }
    }
    System.out.println(text+" is in palindrome  sequence.");
    return true;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    palindrome(text);
  }
}
