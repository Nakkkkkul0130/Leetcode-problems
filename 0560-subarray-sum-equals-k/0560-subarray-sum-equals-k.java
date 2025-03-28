class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int cnt=0;
        int ps=0;
        hm.put(0,1);
        
        for(int num : nums){
            ps+=num;
            // if(hm.containsKey(ps-k)){
            //     cnt+=hm.get(ps-k);
            // }
            // hm.put(ps,hm.getOrDefault(ps,0)+1);
            cnt+=hm.getOrDefault((ps-k),0);
            hm.put(ps,(hm.getOrDefault(ps,0)+1));
        }
        return cnt;
    
    }
}