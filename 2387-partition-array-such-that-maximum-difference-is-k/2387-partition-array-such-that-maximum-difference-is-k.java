class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count=1; // We need at least one group
        int groupStart = nums[0];
        for(int i=1;i<nums.length;i++){
            // If current number can't go into this group
            if(nums[i]-groupStart>k){
                count++;    // Making a new group
                groupStart = nums[i];   // Starting new group from here
            }
        }
        return count;
    }
}