class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i,j;
        for(i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        if(i>=0){
            for(j=n-1;j>i;j--){
                if(nums[j]>nums[i]){
                    break;
                }
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
                start++;
                end--;
            
        }
    }
}