class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[][] dp = new int[len+1][len+1];
        
        for(int level=len-1;level>=0;level--){
            for(int i=0;i<=level;i++){
                dp[level][i] = triangle.get(level).get(i) + Math.min(dp[level+1][i], dp[level+1][i+1]);
            }
        }
        return dp[0][0];
    }
}