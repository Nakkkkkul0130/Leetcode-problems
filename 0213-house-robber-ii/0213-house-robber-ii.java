class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(splitrobbing(nums, 0, n-2), splitrobbing(nums, 1, n-1));
    }
    private int splitrobbing(int[] nums, int start, int end){
        int first = 0;
        int second = 0;
        for(int i=start;i<=end;i++){
            int currsum = Math.max(second, nums[i]+first);
            first=second;
            second=currsum;
        }
        return second;
    }
}