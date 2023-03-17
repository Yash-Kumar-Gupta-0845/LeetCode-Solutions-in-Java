class Solution {
    public boolean isValidSudoku(char[][] board) {
      Set<String> seen = new HashSet();
      for(int i=0;i<9;++i){
          for(int j=0;j<9;++j){
              char number = board[i][j];
              if(number != '.'){
                  if(seen.contains(number + "R" + i) || seen.contains(number + "C" + j) || seen.contains(number + "B" + i/3 + "_" + j/3)){
                      return false;
                  }
                  else{
                      seen.add(number + "R" + i);
                      seen.add(number + "C" + j);
                      seen.add(number + "B" + i/3 + "_" + j/3);
                  }
              }
          }
        }
        return true;
    }
}
