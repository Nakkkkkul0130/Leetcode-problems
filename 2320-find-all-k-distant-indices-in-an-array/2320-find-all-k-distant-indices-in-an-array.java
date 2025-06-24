class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keyindices = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if(nums[i]==key){
                keyindices.add(i);
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j : keyindices){
                if(Math.abs(i-j)<=k){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
