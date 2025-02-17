class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> sol = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int srow=0, scol=0, erow=m-1, ecol=n-1;
        while(srow<=erow && scol<=ecol){
            //top
            for(int j=scol;j<=ecol;j++){
                sol.add(matrix[srow][j]);
            }
            //right
            for(int i=srow+1;i<=erow;i++){
                sol.add(matrix[i][ecol]);
            }
            //bottom
            for(int j=ecol-1;j>=scol;j--){
                if(srow==erow){
                    break;
                }
                sol.add(matrix[erow][j]);
            }
            //left
            for(int i=erow-1;i>=srow+1;i--){
                if(scol==ecol){
                    break;
                }
                sol.add(matrix[i][scol]);
            }
            srow++;
            scol++;
            erow--;
            ecol--;
        }
        return sol;
    }
}