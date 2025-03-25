class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num : nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        return gcd(min,max);

    }
    public int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}