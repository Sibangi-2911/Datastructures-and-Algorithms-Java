//nQueens on a nXn chessboard so theat no 2 queens attack eachother(All solutions)
public class back4 {
  public static boolean isSafe(char board[][], int row, int col){
    //vertical-up
    for(int i=row-1;i>=0;i--){
      if(board[i][col] == 'Q'){
        return false;
      }
    }
    //right diagonal
    for(int i=row-1, j=col+1; i>=0 && j<board.length;i++,j++){
      if(board[i][j]=='Q'){
        return false;
      }
    }
    //left diagonal
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
      if(board[i][j]=='Q'){
        return false;
      }
    }
    return true;
  }
  public static void nQueens(char board[][], int row){
    //base case
    if(row==board.length){
      printBoard(board);
      return;
    }
    //colummn call
    for(int j=0;j<board.length;j++){
      if((isSafe(board,row,j))){
        board[row][j] = 'Q';
        nQueens(board, row+1);
        board[row][j] = 'X';
      }
    }
  }
  public static void printBoard(char board[][]){
    System.out.println("---------Chess Board-------------");
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board.length;j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    int n = 4;
    char board[][] = new char[n][n];
    //Initialization
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board.length;j++){
        board[i][j] = 'X';
      }
    }
    nQueens(board,0);
  }
}
  