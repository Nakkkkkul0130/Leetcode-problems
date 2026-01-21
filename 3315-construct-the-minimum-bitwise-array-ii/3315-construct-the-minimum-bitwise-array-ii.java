class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            int k = nums.get(i);
            ans[i] = -1;

            if(k % 2 == 0){
                ans[i] = -1;
            }
            else{
                // for(int x = 0; x <= k; x++){
                //     int sm = x | (x + 1);  
                //     if(sm == k){
                //         ans[i] = x;   
                //         break;
                //     }
                // }
                int temp = k;
                int count = 0;
                while((temp & 1) == 1){
                    count++;
                    temp >>= 1;
                }

                int x = k - (1 << (count - 1));

                if((x | (x + 1)) == k){
                    ans[i] = x;
                } else {
                    ans[i] = -1;
                }  
            }
        }
        return ans;
    }
}