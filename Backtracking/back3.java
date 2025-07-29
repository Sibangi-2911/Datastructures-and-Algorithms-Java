//find and print all permutations of a string
public class back3 {
  public static void printPermutations(String str, String ans){
    //base case
    if(str.length()==0){
      System.out.println(ans);
      return;
    }
    //recursion case
    for(int i =0;i<str.length();i++){
      char current = str.charAt(i);
      String newStr = str.substring(0, i) + str.substring(i+1);
      printPermutations(newStr, ans+current);
    }
  }
  public static void main(String args[]){
    String str = "abc";
    printPermutations(str, "");
    
  }
}
