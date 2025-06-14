//check if a number is power of 2 or not
public class bit9 {
  public static boolean checkPowerof2(int n){
    return (n & (n-1))==0;
  }
  public static void main(String args[]){
    System.out.println(checkPowerof2(8));
  }
}
