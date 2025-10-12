class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        // int maxf = Integer.MIN_VALUE;
        // for(int k=0;k<n;k++){
        //     int[] rot = new int[n];
        //     for(int i=0;i<n;i++){
        //         rot[(i+k)%n] = nums[i];
        //     }
        //     int f=0;
        //     for(int i=0;i<n;i++){
        //         f+=i*rot[i];
        //     }
        //     maxf = Math.max(maxf,f);
        // }
        // return maxf;
        long sum = 0, f=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            f+=(long)i*nums[i];
        }
        long maxf = f;
        for(int i=1;i<n;i++){
            f = f + sum - (long)n * nums[n-i];
            maxf = Math.max(maxf,f);
        }
        return (int) maxf;
    }
}
