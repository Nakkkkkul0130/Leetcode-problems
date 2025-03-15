class Solution {
    public int minCapability(int[] nums, int k) {
        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;

        for (int num : nums) {
            left = Math.min(left, num);
            right = Math.max(right, num);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = 0, i = 0;

            while (i < nums.length) {
                if (nums[i] <= mid) {
                    count++; 
                    i++; 
                }
                i++; 
            }

            if (count >= k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left; 
    }
}