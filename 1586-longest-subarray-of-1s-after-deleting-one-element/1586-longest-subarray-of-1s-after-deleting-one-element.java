class Solution {
    public int longestSubarray(int[] nums) {
        int j=0, len=0, zerocnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zerocnt++;
                while(zerocnt>1){
                    if(nums[j]==0){
                        zerocnt--;
                        }
                     j++;
                    }
                }
            len = Math.max(len, i-j);
        }
        return len;
    }
}