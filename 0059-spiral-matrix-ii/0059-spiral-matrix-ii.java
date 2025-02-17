class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int srow=0;
        int scol=0;
        int ecol=matrix.length-1;
        int erow=matrix.length-1;
        int num=1;
        while(srow<=erow && scol<=ecol){
            for(int j=scol;j<=ecol;j++){
                matrix[srow][j]=num++;
            }
            for(int i=srow+1;i<=erow;i++){
                matrix[i][ecol]=num++;
            }
            for(int j=ecol-1;j>=scol;j--){
                if(srow==erow){
                    break;
                }
                matrix[erow][j]=num++;
            }
            for(int i=erow-1;i>=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                matrix[i][scol]=num++;
            }
            srow++;
            scol++;
            erow--;
            ecol--;

        }
        return matrix;
    }
}