//code to Print sum of first n natural numbers
public class Rec4 {
  public static int printSum(int n){
    if(n==1){
      return 1;
    }
    int fnm = printSum(n-1);
    int fn = n + fnm;
    return fn;
  }
  public static void main(String args[]){
    int n =5;
    System.out.println(printSum(n));
  }
}
