// Number of ways to reach from (0,0) to (n-1,m-1) in a nxm grid
public class back6 {
  public static int gridWays(int i, int j, int n, int m){
    //base case
    if(i==n-1 && j==m-1){
      return 1;
    }
    else if(i==n || j==m){
      return 0;
    }
    int wayRight = gridWays(i, j+1, n, m);
    int wayDown = gridWays(i+1, j, n, m);
    return wayRight + wayDown;
  }
  public static void main(String args[]){
    int n=3,m=3;
    System.out.println(gridWays(0, 0, n, m));
  }
}
