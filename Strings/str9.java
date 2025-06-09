//String Builder - O(26) otherwise in normal case O(26*26)
public class str9 {
  public static void main(String args[]){
    StringBuilder sb = new StringBuilder("");
    for (char ch='a'; ch<='z';ch++){
      sb.append(ch);
    }
    System.out.println(sb);
    System.out.println(sb.length());
    System.out.println(sb.charAt(25));
  }
}
