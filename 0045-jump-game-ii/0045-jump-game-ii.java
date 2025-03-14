class Solution {
    public int jump(int[] nums) {
        int minjump=0, curr=0, far=0;
        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far, i+nums[i]);
            if(i==curr){
                minjump++;
                curr=far;
            }
        }
        return minjump;
    }
}