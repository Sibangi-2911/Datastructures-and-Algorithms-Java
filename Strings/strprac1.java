//CounthowmanytimeslowercasevowelsoccurredinaStringenteredbytheuser
import java.util.*;
public class strprac1 {
  public static int vowelCount(String user){
    int count =0;
    for(int i=0;i<user.length();i++){
      char ch = user.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        count++;
      }
    }
    System.out.println("total vowels= "+count);
    return count;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your string to count the vowels: ");
    String user = sc.nextLine();
    vowelCount(user);
  }
}
