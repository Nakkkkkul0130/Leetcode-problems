class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int num : nums){
            hs.put(num, hs.getOrDefault(num,0)+1);
        }
        for(int freq : hs.values()){
            if(freq%2!=0){
                return false;
            }
        }
        return true;
    }
}