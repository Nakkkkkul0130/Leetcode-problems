class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        if (isZeroArray(nums)) return 0; 

        int left = 0, right = queries.length, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (canReduceToZero(nums.clone(), queries, mid)) {
                result = mid;
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        return result;
    }
     private static boolean isZeroArray(int[] nums) {
        for (int num : nums) {
            if (num > 0) return false;
        }
        return true;
    }
    private static boolean canReduceToZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        for (int i = 0; i < k; i++) {
            int l = queries[i][0], r = queries[i][1], v = queries[i][2];
            diff[l] -= v;
            if (r + 1 < n) diff[r + 1] += v;
        }
        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            nums[i] += curr;
            if (nums[i] > 0) return false; 
        }
        return true;
    }


}