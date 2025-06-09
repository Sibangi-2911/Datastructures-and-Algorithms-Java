//Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };Output - 18
public class example6 { 
  public static int secondrowSum(int array[][]){
    int sum=0;
    for(int j=0;j<array[0].length;j++){
        sum+=array[1][j];
      }
    System.out.println(sum);
    return sum;
  }
  public static void main(String args[]){
    int array[][] = {{1,4,9},{11,4,3},{2,2,3}};
    secondrowSum(array);
  }
}
