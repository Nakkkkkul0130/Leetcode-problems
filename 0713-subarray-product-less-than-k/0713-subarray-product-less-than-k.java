class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;

        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     int prod = 1;
        //     for (int j = i; j < nums.length; j++) {
        //         prod *= nums[j];
        //         if (prod < k) {
        //             count++;
        //         } else {
        //             break; 
        //         }
        //     }
        // }
        // return count;
        int prod = 1, count = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) {
                prod /= nums[left++];
            }
            count += right - left + 1;
        }
        return count;
    }
}
