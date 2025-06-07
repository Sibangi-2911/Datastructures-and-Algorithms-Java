//search in sorted matrix taking top and right approach dtarting from element (n-1,0)
public class arr9 { 
  public static boolean searchSorted(int matrix[][], int key){
    int row = matrix.length-1;
    int col =0;
    while(row<matrix.length && col>=0){
      if(matrix[row][col]==key){
        System.out.println("Key found at index ("+row+","+col+")");
        return true;
      }
      else if(key <matrix[row][col]){
        row--;
      }
      else{
        col++;
      }
    }
    System.out.println("Key is not found!!!");
    return false;
  }
  public static void main(String args[]){
    int matrix[][] = {
      {10,20,30,40},
      {15,25,35,45},
      {27,29,37,48},
      {32,33,39,50},
    };
    int key =33;
    searchSorted(matrix, key);
  }
}
