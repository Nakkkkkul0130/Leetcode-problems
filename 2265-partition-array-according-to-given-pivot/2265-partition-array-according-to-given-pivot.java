class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] sol = new int[nums.length];
        int cnt=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                sol[index++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                sol[index++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                sol[index++]=nums[i];
            }
        }
        return sol;
        
    }
}