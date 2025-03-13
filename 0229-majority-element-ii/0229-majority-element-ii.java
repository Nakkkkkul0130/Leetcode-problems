class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int num : nums){
            hs.put(num, hs.getOrDefault(num,0)+1);
        }
        for(int i=0;i<n;i++){
            if(hs.get(nums[i])>n/3){
                if(!al.contains(nums[i])){
                    al.add(nums[i]);
                }
            }
        }
        return al;

    }
}