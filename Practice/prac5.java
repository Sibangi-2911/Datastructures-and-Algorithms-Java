//Given a string, print the first non-repeating character.If none, print -1.
import java.util.*;
public class prac5 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Map<Character, Integer> map = new LinkedHashMap<>();
    for(char ch: str.toCharArray()){
      map.put(ch, map.getOrDefault(ch, 0)+1);
    }
    for(char ch: map.keySet()){
      if(map.get(ch)==1){
        System.out.println(ch);
        return;
      }
    }
    System.out.println("-1");
  }
}
