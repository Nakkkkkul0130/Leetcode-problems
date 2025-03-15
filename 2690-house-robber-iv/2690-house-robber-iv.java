class Solution {
    public int minCapability(int[] nums, int k) {
        int left=Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for(int num : nums){
            left = Math.min(left,num);
            right = Math.max(right,num);
        }
        while(left<right){
            int mid = left+(right-left)/2;
            if(canrob(nums,k,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    private boolean canrob(int[] nums, int k, int capable){
        int cnt=0; int i=0;
        while(i<nums.length){
            if(nums[i]<=capable){
                cnt++;
                i++;
            }
            i++;
        }
        return cnt>=k;
    }
}