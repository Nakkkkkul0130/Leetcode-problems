class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int l = 0;
        int maxl = 0;
        for(int i=0;i<n;i++){
            while((long)nums[i]>(long)nums[l]*k){
                l++;
            }
            maxl = Math.max(maxl, i-l+1);
        }
        return n-maxl;
    }
}