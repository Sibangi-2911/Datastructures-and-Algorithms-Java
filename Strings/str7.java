//Substrings
public class str7 { 
  public static void printSubstring(String str,int startIndex, int endIndex){
    String substring = "";
    for(int i=startIndex;i<endIndex;i++){
      substring+=str.charAt(i);
    }
    System.out.println(substring);
  }
  public static void main(String args[]){
    String str = "Hello Sibangi";
    System.out.println(str.substring(1,4));
    printSubstring(str, 1, 4);
  }
}
