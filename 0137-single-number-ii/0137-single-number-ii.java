class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> res : map.entrySet()){
            if(res.getValue()==1){
                return res.getKey();
            }
        }
        return 0;
        

    }
}