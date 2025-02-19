class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        int h,w;
        while(left<right){
            h = (height[left] < height[right]) ? height[left] : height[right];
            w = right - left;
            maxArea = (h * w > maxArea) ? h * w : maxArea;
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return maxArea;
    }
}