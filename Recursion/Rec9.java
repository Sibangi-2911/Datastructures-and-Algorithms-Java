//print x to the power n
public class Rec9 {
  public static int power(int x, int n){
    if(n==0){
      return 1;
    }
    int pownm1 = power(x, n-1);
    int pow = x*pownm1;
    return pow;
  }
  public static void main(String args[]){
    System.out.println(power(2, 3));
  }
}
