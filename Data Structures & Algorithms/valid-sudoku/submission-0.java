class Solution {
    public boolean check(int i,int j,char ch,char[][] board){
        for(int k=0;k<9;k++){
            if(board[i][k]==ch) return false;
            if(board[k][j]==ch) return false;
        }
        int x = (i/3)*3;
        int y = (j/3)*3;
        for(int k=x;k<x+3;k++){
            for(int l=y;l<y+3;l++){
                if(board[k][l]==ch) return false;
            }
        }
        return true;
        
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char ch = board[i][j];
                    board[i][j] = '.';
                    if(!check(i,j,ch,board)) return false;
                    board[i][j] = ch;
                }
            }
        }
        return true;
    }
}
