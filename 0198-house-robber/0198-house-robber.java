class Solution {
    public int rob(int[] nums) {
       int first = 0;
       int second = 0;
       for(int num : nums){
        int currsum = Math.max(second, first+num);
        first = second;
        second = currsum;
       }
       return second;
    }
}