class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long longestStreak = 0;
        long countSubArray = 0;
        for(int num : nums){
            if(num==0){
                longestStreak+=1;
            }
            else{
                longestStreak=0;
            }
            countSubArray+=longestStreak;
        }
        return countSubArray;
    }
}