public class Rec5 {
  public static int fibonacci(int n){
    if(n==0){
      return 0;
    }
    else if(n==1){
      return 1;
    }
    int fibnm1 = fibonacci(n-1);
    int fibnm2 = fibonacci(n-2);
    int fibn = fibnm1 + fibnm2;
    return fibn;
  }
  public static void main(String args[]){
    int n =25;
    System.out.println(fibonacci(n));
  }
}
