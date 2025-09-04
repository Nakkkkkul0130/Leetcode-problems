class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int found=-1;
        for(int i=0;i<nums1.length;i++){
            res[i]=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    found=j;
                    break;
            }
            }
            for(int k=found+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    res[i] = nums2[k];
                    break;
            }
        }
        }
        return res;
    }
}