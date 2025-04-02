class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);
        int count=0, prefixsum=0;
        for(int num : nums){
            prefixsum+=num;
            int rem = prefixsum%k;
            if(rem<0){
                rem+=k;
            }
            if(hs.containsKey(rem)){
                count+=hs.get(rem);
                hs.put(rem, hs.get(rem)+1);
            }
            else{
                hs.put(rem,1);
            }
            
        }
        return count;
        
        
    }
}