class Solution {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0)
            return ;
        solver(board);
    }
    public boolean solver(char[][] board){
        for(int i=0;i< board.length;i++){
          for(int j=0;j<board[0].length;j++){
              char number = board[i][j];
              if (number == '.'){
                  for(char c = '1'; c <='9' ; c++){
                      if (valid_sudoko(board,i,j,c)){
                          board[i][j] = c;
                          if (solver(board))
                              return true;
                          else
                              board[i][j] = '.';
                      }
                  }
                  return false;
              }
          }
        }
        return true;
    }
    public boolean valid_sudoko(char[][] board, int row, int col, char c){
        int nRow = 3*(row / 3);
        int nCol = 3*(col/3);
      for(int i=0;i<9;i++){
          if(board[i][col] == c)
              return false;
          if(board[row][i] == c)
              return false;
          if(board[nRow + i/3][nCol + i %3] == c)
              return false;
      }
        return true;
    }
}