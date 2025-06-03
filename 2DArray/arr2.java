//search the element
import java.util.*;
public class arr2 {
  public static boolean findKey(int matrix[][], int key){
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        if(matrix[i][j]==key){
          System.out.println("Key found at index: ("+i+","+j+")");
          return true;
        }
      }
    }
    System.out.println("Key not found");
    return false;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int matrix[][] = new int[3][3];
    int key = 5;
    int n= matrix.length;
    int m = matrix[0].length;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        matrix[i][j] = sc.nextInt();
      }
    }
    //output
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }

    findKey(matrix, key);
  }
}
