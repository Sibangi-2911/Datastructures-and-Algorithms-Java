import java.util.*;

public class arr4 {

  public static int findsmallest(int matrix[][], int n, int m) {
    int smallest = Integer.MAX_VALUE;
    int rowIndex = -1;
    int colIndex = -1;

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < m; j++) {
        if(matrix[i][j] < smallest) {
          smallest = matrix[i][j];
          rowIndex = i;
          colIndex = j;
        }
      }
    }

    System.out.println("Largest number is: " + smallest + " at index [" + rowIndex + "," + colIndex + "]");
    return smallest;
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

    findsmallest(matrix, n, m);
  }
}
