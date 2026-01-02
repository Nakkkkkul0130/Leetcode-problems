class Solution {
    public int repeatedNTimes(int[] nums) 
    {
        Map<Integer,Integer>mpp =new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(mpp.containsKey(nums[i])) return nums[i];
            mpp.put(nums[i],1);
        }
        return -1;
    }
}