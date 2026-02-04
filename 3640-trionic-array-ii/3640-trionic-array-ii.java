class Solution {
    public long maxSumTrionic(int[] nums) {
        int l, p, q, r, len = nums.length;
        int i = 0;
        long ans = Long.MIN_VALUE;
        for (; i < len; i++) {
            l = i;
            p = i + 1;

            for (; p < len; p++) {
                if (nums[p] <= nums[p - 1]) {
                    p--;
                    break;
                }
            }
            if (p == len) {
                break;
            }
            i = p;
            if (l == p || nums[p] <= nums[p - 1]) {
                continue;
            }

            q = p + 1;
            for (; q < len; q++) {
                if (nums[q] >= nums[q - 1]) {
                    q--;
                    break;
                }
            }
            if (q == len) {
                break;
            }
            i = q - 1;
            if (p == q || nums[q] == nums[q - 1]) {
                continue;
            }

            r = q + 1;
            for (; r < len; r++) {
                if (nums[r] <= nums[r - 1]) {
                    r--;
                    break;
                }
            }
            if(r == len) {
                r--;
            }
            i = r - 1;
            if (q == r || nums[r] == nums[r - 1]) {
                continue;
            }
            i = q - 1;

            long sumLeft = 0, sumLeftTemp, sumMiddle = 0, sumRight = 0, sumRightTemp;

            sumLeft += (nums[p] + nums[p - 1]);
            sumLeftTemp = sumLeft;
            for (int j = p - 2; j >= l; j--) {
                sumLeftTemp += nums[j];
                if (sumLeftTemp > sumLeft) {
                    sumLeft = sumLeftTemp;
                }
            }

            for (int j = p + 1; j <= q - 1; j++) {
                sumMiddle += nums[j];
            }

            sumRight += (nums[q] + nums[q + 1]);
            sumRightTemp = sumRight;
            for (int j = q + 2; j <= r; j++) {
                sumRightTemp += nums[j];
                if (sumRightTemp > sumRight) {
                    sumRight = sumRightTemp;
                }
            }

            if (ans < sumLeft + sumMiddle + sumRight) {
                ans = sumLeft + sumMiddle + sumRight;
            }
        }
        return ans;
    }
}