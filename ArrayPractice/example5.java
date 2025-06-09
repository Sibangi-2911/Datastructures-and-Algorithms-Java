//Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2
public class example5 { 
  public static int print7(int array[][]){
    int count=0;
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array[0].length;j++){
        if(array[i][j]==7){
          count+=1;
        }
      }
    }
    System.out.println("No. of 7's are: "+count);
    return count;
  }
  public static void main(String args[]){
    int array[][] = {{4,7,8},{8,8,7}};
    print7(array);
  } 
}