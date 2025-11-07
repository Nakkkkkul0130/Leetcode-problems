class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
        
    }
    private void backtrack(List<List<Integer>> res, List<Integer> path, int[] nums){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int num : nums){
            if(path.contains(num)) continue;
            path.add(num);
            backtrack(res, path,nums);
            path.remove(path.size()-1);
        }
    }

}