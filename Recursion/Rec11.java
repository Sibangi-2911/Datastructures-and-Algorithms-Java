//Tiling Problem
public class Rec11 {
  public static int tilingProblem(int n){ // floor dize is 2Xn
    //Base Case
    if(n==0 || n==1){
      return 1;
    }
    //kaam
    //vertical choice
    int fnm1 = tilingProblem(n-1);
    //horizontal choice
    int fnm2 = tilingProblem(n-2);
    //total ways
    int totWays = fnm1+fnm2;
    return totWays;
  }
  public static void main(String args[]){
    System.out.println(tilingProblem(3));
  }
}
