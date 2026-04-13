//Find frequency of characters in string
import java.util.*;
public class prac6 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    Map<Character, Integer> map = new HashMap<>();
    for(char ch: str.toCharArray()){
      map.put(ch, map.getOrDefault(ch,0)+1);
    }
    System.out.println(map);
  }
}
