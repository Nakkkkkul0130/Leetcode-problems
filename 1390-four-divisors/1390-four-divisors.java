class Solution {
    public int sumFourDivisors(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            int sum=0;
            for(int j=1;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    int div1 = j;
                    int div2 = nums[i]/j;
                    if(div1==div2){
                        cnt++;
                        sum+=div1;
                    }
                    else{
                        cnt+=2;
                        sum+=div1+div2;
                    }           
                }
                if (cnt>4) break;
            }
            if(cnt==4){
                res+=sum;
            }
        }
        return res;
    }
}