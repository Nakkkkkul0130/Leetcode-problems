class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int left = 0, right = queries.length, result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (canReduceToZero(nums, queries, mid)) {
                result = mid;  
                right = mid - 1;  
            } else {
                left = mid + 1;  
            }
        }
        return result;
    }

    private boolean canReduceToZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] tempNums = nums.clone();
        int[] diff = new int[n + 1]; 

        for (int i = 0; i < k; i++) {
            int l = queries[i][0], r = queries[i][1], v = queries[i][2];
            diff[l] -= v;
            if (r + 1 < n) diff[r + 1] += v;
        }

        int curr = 0;
        for (int i = 0; i < n; i++) {
            curr += diff[i];
            tempNums[i] += curr;  
            if (tempNums[i] > 0) return false;  
        }
        return true;  
    }
}
