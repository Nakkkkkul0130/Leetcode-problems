class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = -1;
            for(int j=1;j<nums.length;j++){
                int index = (i+j)%nums.length;
                if(nums[index]>nums[i]){
                    res[i] = nums[index];
                    break;
                }
            }
        }
        return res;
    }
}