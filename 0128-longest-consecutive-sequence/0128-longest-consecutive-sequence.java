class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int max=0;
        for(int num : nums){
            hs.add(num);
        }
        for(int num : hs){
            if(!hs.contains(num-1)){
                int currentnum=num;
                int streak=1;
            while(hs.contains(currentnum+1)){
                currentnum++;
                streak++;
            }
            max=Math.max(max,streak);
            }
        }
        return max;
        
        
    }
}