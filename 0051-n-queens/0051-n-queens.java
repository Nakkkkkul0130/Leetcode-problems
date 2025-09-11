class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '.');
        }
        nqueen(n, 0, board, ans);
        return ans;
        
    }

    private boolean issafe(int n, int row, int col, char[][] board){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1; i>=0 && j<n; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;

    }

    private void nqueen(int n, int row, char[][] board, List<List<String>> ans)
    {
        if(row==n){
            List<String> config = new ArrayList<>();
            for(int i=0;i<n;i++){
                config.add(new String(board[i]));
            }
            ans.add(config);
            return;
        }
        for(int j=0;j<n;j++){
            if(issafe(n,row,j,board)){
                board[row][j] = 'Q';
                nqueen(n,row+1, board, ans);
                board[row][j] = '.';
            }
        }
    }
}