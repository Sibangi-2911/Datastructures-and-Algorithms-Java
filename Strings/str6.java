//Comparison of strings
public class str6 {
  public static void main(String args[]){
    String str1 = "Tony";
    String str2 = new String("Tony");
    if(str1.equals(str2)){
      System.out.println("Strings are equal");
    }
    else{
      System.out.println("Strings are not equal.");
    }
  }
}
