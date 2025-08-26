class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            int l = i+1;
            int r = n-1;
            while(l<r){
                long sum = (long) nums[i]+nums[l]+nums[r];
                if(sum==0){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[l]);
                    ans.add(nums[r]);
                    result.add(ans);
                    l++;
                    r--;
                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;
                }
            }  
        }
        HashSet<List<Integer>> hs = new HashSet<>(result);
        System.out.print(hs);
        List<List<Integer>> finals = new ArrayList<>(hs);
        return finals;
    }
}