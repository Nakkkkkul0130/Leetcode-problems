class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int l = j + 1;       
                int r = n - 1;       

                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];

                    if (sum == target) {
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[l]);
                        li.add(nums[r]);
                        res.add(li);
                        l++;
                        r--;
                    }
                    else if (sum < target) {
                        l++;  
                    } 
                    else {
                        r--;  
                    }
                }
            }
        }
        Set<List<Integer>> set = new HashSet<>(res); 
        System.out.print(set);
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}
