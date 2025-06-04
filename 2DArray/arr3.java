import java.util.*;

public class arr3 {

  public static int findLargest(int matrix[][], int n, int m) {
    int largest = Integer.MIN_VALUE;
    int rowIndex = -1;
    int colIndex = -1;

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        if(matrix[i][j] > largest) {
          largest = matrix[i][j];
          rowIndex = i;
          colIndex = j;
        }
      }
    }

    System.out.println("Largest number is: " + largest + " at index [" + rowIndex + "," + colIndex + "]");
    return largest;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("rows: ");
    int n = sc.nextInt();
    
    System.out.print("columns: ");
    int m = sc.nextInt();
    
    int matrix[][] = new int[n][m];

    System.out.println("Enter matrix elements:");
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt(); // fixed
      }
    }

    System.out.println("Matrix is:");
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    findLargest(matrix, n, m);
  }
}

