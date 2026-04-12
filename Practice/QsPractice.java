//QUESTION
import java.util.*;
public class QsPractice {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Map<Character, Integer> freq = new HashMap<>();
    StringBuilder result = new StringBuilder();
    boolean hasDuplicate = false;

    for(int i=0;i<input.length();i++){
      char ch = input.charAt(i);
      if(Character.isLetter(ch)){
        int count = freq.getOrDefault(ch, 0)+1;
        freq.put(ch, count);
        if(count==2){
          result.append('?');
          hasDuplicate = true;
        } else{
          result.append(ch);
        }
      } else{
        result.append(ch);
      }
    }

    if(hasDuplicate){
      System.out.println(result.toString());
    } else{
      System.out.print("No duplicates present in the given string");
    }
    sc.close();
  }
}
