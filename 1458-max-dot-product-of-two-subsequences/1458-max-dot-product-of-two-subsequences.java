class Solution {
    Integer dp[][];
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        dp = new Integer[n][m];
        return maxdp(0,0,nums1,nums2);
    }
    private int maxdp(int i, int j,int[] nums1, int[] nums2){
        if(i>=nums1.length || j>=nums2.length){
            return Integer.MIN_VALUE;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        int prod = nums1[i] * nums2[j];
        int inc = prod + Math.max(0, maxdp(i+1, j+1, nums1,nums2));
        int exc1 = maxdp(i+1,j,nums1,nums2);
        int exc2 = maxdp(i,j+1, nums1,nums2);
        return dp[i][j] = Math.max(inc, Math.max(exc1,exc2));
    }
}