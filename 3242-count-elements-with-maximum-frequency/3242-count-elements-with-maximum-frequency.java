class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
            max = Math.max(max, mp.get(num));
        }
        int count=0;
        for(int val : mp.values()){
            if(val==max){
                count++;
            }
        }
        return count*max;
        
    }
}