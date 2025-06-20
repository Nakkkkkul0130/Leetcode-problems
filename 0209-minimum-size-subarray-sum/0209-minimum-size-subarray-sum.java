class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minlength = Integer.MAX_VALUE;
        int start = 0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                minlength = Math.min(minlength, i-start+1);
                sum-=nums[start];
                start++;
            }
        }
        return (minlength == Integer.MAX_VALUE) ? 0 : minlength;
    }
}