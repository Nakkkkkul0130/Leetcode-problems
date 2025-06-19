class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count=1;
        int groupStart = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-groupStart>k){
                count++;
                groupStart = nums[i];
            }
        }
        return count;
    }
}