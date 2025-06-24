//Remove duplicates in a string
public class Rec12 {
  public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]){
    //basecase
    if(index == str.length()){
      System.out.println(newStr);
      return;
    }
    //kaam
    char currentChar = str.charAt(index);
    if(map[currentChar-'a']==true){
      //duplicate
      removeDuplicates(str, index+1, newStr, map);
    } else{
      map[currentChar-'a']=true;
      removeDuplicates(str, index+1, newStr.append(currentChar), map);
    }
  }
  public static void main(String args[]){
    String str = "appnnacollege";
    removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
  }
}
