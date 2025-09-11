class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        getsub(0, nums, subset, res);
        return res;
        
    }
    private void getsub(int i, int[] arr, List<Integer> subset, List<List<Integer>> res){
        if(i==arr.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(arr[i]);
        getsub(i+1, arr, subset, res);
        subset.remove(subset.size()-1);
        getsub(i+1, arr, subset, res);

    }
}