class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer, Integer>>al = new ArrayList<>(freq.entrySet());
        al.sort((a,b)->b.getValue()-a.getValue());

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = al.get(i).getKey();
        }
        return result;
        
    
    }
}