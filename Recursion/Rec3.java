//print factorial of a number
public class Rec3 {
  public static int printFac(int n){
    if(n==0){
      return 1;
    }
    int fmn = printFac(n-1);
    int fn = n*fmn;
    return fn;
  }
  public static void main(String args[]){
    int n =5;
    System.out.println(printFac(n));
  }
}
