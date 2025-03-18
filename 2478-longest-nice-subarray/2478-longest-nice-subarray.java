class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLen = 0;
        int left = 0;
        int bitwiseAnd = 0;  

        for (int right = 0; right < nums.length; right++) {
            while ((bitwiseAnd & nums[right]) != 0) {
                bitwiseAnd ^= nums[left]; 
                left++; 
            }
            
            bitwiseAnd |= nums[right]; 
            maxLen = Math.max(maxLen, right - left + 1);  
        }

        return maxLen;
    }
}