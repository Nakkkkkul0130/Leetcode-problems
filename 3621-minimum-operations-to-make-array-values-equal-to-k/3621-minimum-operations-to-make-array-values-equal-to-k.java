class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        if (nums[0] < k) return -1;

        Set<Integer> set = new HashSet<>();

        for (int num : nums){
            if (!set.contains(num)) set.add(num);
        }  

        return (nums[0] > k)? set.size() : set.size() - 1;
    }
}