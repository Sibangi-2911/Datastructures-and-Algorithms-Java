//check even or odd using bitwise operator
import java.util.*;
public class bit2 {
  public static void evenorodd(int n){
    int bitMask =1;
    if((n & bitMask)==0){
      System.out.println(n+" is even.");
    }
    else{
      System.out.println(n+" is odd.");
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number to check odd/even: ");
    int n = sc.nextInt();
    evenorodd(n);
  }
}
