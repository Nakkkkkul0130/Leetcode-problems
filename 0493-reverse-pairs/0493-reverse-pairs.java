class Solution {
    public int reversePairs(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if((long)nums[i]>2*nums[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        return mergeSort(nums, 0, nums.length - 1);
    }
     private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0; 

        int mid = left + (right - left) / 2;

        int countLeft = mergeSort(nums, left, mid);
        int countRight = mergeSort(nums, mid + 1, right);

        int crossCount = countCrossPairs(nums, left, mid, right);

        merge(nums, left, mid, right);

        return countLeft + countRight + crossCount;
    }
    private int countCrossPairs(int[] nums, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;

        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j - (mid + 1);
        }

        return count;
    }
    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];

        System.arraycopy(temp, 0, nums, left, temp.length);
    }
    
}