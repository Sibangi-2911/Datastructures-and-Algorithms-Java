// code to print numbers from 10 to 1
public class Rec1 {
  public static void printDec(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    System.out.print(n+" ");
    printDec(n-1);
  }
  public static void main(String args[]){
    int n =10;
    printDec(n);
  }
}
