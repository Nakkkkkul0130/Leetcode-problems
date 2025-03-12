class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int sum=0, prevrem=0;
        for(int num : nums){
            sum+=num;
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(hs.contains(rem)){
                return true;
            }
            hs.add(prevrem);
            prevrem=rem;

        }
        return false;
    }
}