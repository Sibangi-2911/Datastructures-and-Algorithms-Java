//code to print numbers from 1 to 5
public class Rec2 {
  public static void printInc(int n){
    if(n==1){
      System.out.print(n + " ");
      return;
    }
    printInc(n-1);
    System.out.print(n+" ");
  }
  public static void main(String args[]){
    int n = 5;
    printInc(n);
  }
}
