class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int[] pos = new int[nums.length];
        // int[] neg = new int[nums.length];
        // int j=0;
        // int k=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>0){
        //         pos[j] = nums[i];
        //         j++;
        //     }
        //     else{
        //         neg[k] = nums[i];
        //         k++;
        //     }
        // }
        // int[] arr = new int[nums.length];
        // int l=0;
        // int m=0;
        // for(int i=0;i<arr.length;i++){
        //     if(i%2==0){
        //         arr[i] = pos[l];
        //         l++;
        //     }
        //     else{
        //         arr[i] = neg[m];
        //         m++;
        //     }
        // }
        // return arr;
        int[] res = new int[nums.length];
        int pos = 0, neg=1;
        for(int num : nums){
            if(num>0){
                res[pos] = num;
                pos+=2;
            }
            else{
                res[neg] = num;
                neg+=2;
            }
        }
        return res;


        

    }
}