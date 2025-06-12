//anagrams means both strings having same letters but words are different

import java.util.Arrays;

public class strprac2 {
  public static void main(String args[]){
    String str1 = "heart";
    String str2 = "earth";
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    

    if(str1.length()==str2.length()){
      char[] str1chararray = str1.toCharArray();
      char[] str2chararray = str2.toCharArray();

      Arrays.sort(str1chararray);
      Arrays.sort(str2chararray);

      boolean result = Arrays.equals(str1chararray, str2chararray);

      if(result){
        System.out.println(str1+" and "+str2+" are anagrams of eachother.");
      }
      else{
        System.out.println(str1+" and "+str2+" are not anagrams of eachother.");
      }
    }
    else{
      System.out.println(str1+" and "+str2+" are not anagrams of eachother.");
    }
  }
}
