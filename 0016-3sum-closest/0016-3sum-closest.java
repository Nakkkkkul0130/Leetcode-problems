class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min_diff = Integer.MAX_VALUE;
        int resultsum = 0;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
                int diff = Math.abs(sum-target);
                if(diff<min_diff){
                resultsum=sum;
                min_diff=diff;
                }
            }            
        }
        return resultsum;
    }
}