//Tower of Hanoi
public class Rec19 {
  public static void towerOfHanoi(int n, String source, String helper, String destination){
    if(n==1){
      System.out.println("transfer"+n+ "disk from "+source+" to"+destination);
      return;
    }
    towerOfHanoi(n-1, source, destination, helper);
    System.out.println("transfer "+n+ " disk from "+source+" to"+destination);
    towerOfHanoi(n-1, helper, source, destination);
  }
  public static void main(String args[]){
    int n =3;
    towerOfHanoi(n, "S", "H", "D");
  }
}
