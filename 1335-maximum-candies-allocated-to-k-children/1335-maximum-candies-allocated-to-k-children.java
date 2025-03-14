class Solution {
    public int maximumCandies(int[] candies, long k) {
        if (k == 0) return 0;  

        int maxCandy = 0;
        for (int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }

        int left = 1, right = maxCandy, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long count = 0;

            for (int candy : candies) {
                count += candy / mid;
            }

            if (count >= k) { 
                result = mid; 
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return result;
    }
}
