class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        getsub(0, nums, subset, ans);
        List<List<Integer>> res = new ArrayList<>(ans);
        return res; 
    }
    private void getsub(int i, int[] arr, List<Integer> subset, Set<List<Integer>> ans){
        if(i==arr.length){
            ans.add(new ArrayList<>(subset));
            return;
        }

        subset.add(arr[i]);
        getsub(i+1, arr, subset, ans);
        subset.remove(subset.size()-1);
        getsub(i+1, arr, subset, ans);
    }
}