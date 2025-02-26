class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int m = nums1.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums2.length;
        int[] arr = new int[Math.min(m,n)];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]==nums2[j]){
                arr[k++]=nums1[i];
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        
        return Arrays.copyOfRange(arr,0,k);
    }
}