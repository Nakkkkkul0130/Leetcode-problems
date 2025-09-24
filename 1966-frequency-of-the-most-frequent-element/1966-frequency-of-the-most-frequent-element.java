class Solution {
    public int maxFrequency(int[] nums, int k) {
        // Arrays.sort(nums);
        // HashMap<Integer, Integer> mp = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        //     int temp = nums[i];
        //     for(int j=0;j<k;j++){
        //         temp++;
        //         mp.put(temp,mp.getOrDefault(temp,0)+1);
        //     }
        // }
        // int max = Collections.max(mp.values());
        // return max;
        Arrays.sort(nums);
        long total = 0;
        int left = 0;
        int res = 1;
        for (int right = 1; right < nums.length; right++) {
            total += (long)(nums[right] - nums[right - 1]) * (right - left);
            while (total > k) {
                total -= nums[right] - nums[left];
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}