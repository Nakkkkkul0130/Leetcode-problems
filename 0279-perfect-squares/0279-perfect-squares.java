class Solution {
    private int[] dp;
        public int numSquares(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n);
        
        }
        private int helper(int n){
            if(n==0){
                return 0;
            }
            if(dp[n]!=-1){
                return dp[n];
            }
            // if(dp[n]==-1){
                int i=1;
                int m=Integer.MAX_VALUE;
                while(i*i<=n){
                    m=Math.min(m,helper(n-i*i));
                    i++;
                }
                dp[n]=1+m;
                return dp[n];
            }
}