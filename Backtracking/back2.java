//find and print all the subsets of a given string
public class back2 {
  public static void findSubsets(String str, String ans, int i){
    //base case
    if(i == str.length()){
      if(ans.length() == 0){
        System.out.println("null");
      }else{
        System.out.println(ans);
      }
      return;
    }
    //recursion or kaam
    //YES CHOICE
    findSubsets(str, ans+str.charAt(i), i+1);
    //NO CHOICE
    findSubsets(str, ans, i+1);
  }
  public static void main(String args[]){
    String str = "abc";
    findSubsets(str, "", 0);
  }
}
