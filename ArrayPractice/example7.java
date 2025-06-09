//Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,Matrixa11    a12    a13a21    a22    a23Transposed Matrixa11    a21a12    a22a13    a23
public class example7 { 
    public static void printMatrix(int[][] matrix){
      System.out.println("The matrix is : ");
      for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
          System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
    }
  public static void main(String args[]){
    int[][]matrix= { {2,3,7}, {5,6,7} };
    printMatrix(matrix);
    int[][] transpose= new int[matrix[0].length][matrix.length];
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[0].length;j++){
        transpose[j][i] = matrix[i][j];
      }
    }
    printMatrix(transpose);
  }
}
