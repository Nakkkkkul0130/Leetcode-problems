class Solution {
    public long maxMatrixSum(int[][] matrix) {
         long TotalSum=0;
        int NegativeCount=0;
        int minAbsValue=Integer.MAX_VALUE;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int r=0;r<=m-1;r++ ){
            for(int c=0;c<=n-1;c++){
                int value=matrix[r][c];
                int absValue=Math.abs(value);
                TotalSum+=absValue;
                if(value<0){
                    NegativeCount++;
                }
                minAbsValue=Math.min(minAbsValue,absValue);
            }
            
        }
        if(NegativeCount%2==0){
            System.out.print(TotalSum);
                return TotalSum;
        }
        else{
            long res= TotalSum-2*minAbsValue;
            System.out.print(res);
            return res;
        }
       
        
    }
}