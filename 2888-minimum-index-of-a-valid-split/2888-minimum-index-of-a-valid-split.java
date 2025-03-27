class Solution {
    public int minimumIndex(List<Integer> nums) {
        int dominant = -1, count=0;
        for(int num : nums){
            if(count==0){
                dominant=num;
            }
            count+=(num==dominant)?1:-1;
        }
        int totalcount=0;
        for(int num : nums){
            if(num==dominant) totalcount++;
        }
        int leftcount=0;
        int totalelements = nums.size();
        for(int i=0;i<totalelements-1;i++){
            if(nums.get(i)==dominant){
                leftcount++;
            }
            int leftsize=i+1;
            int rightsize=totalelements-leftsize;
            int rightcount=totalcount-leftcount;
            if(leftcount*2>leftsize && rightcount*2>rightsize){
                return i;
            }
        }
        return -1;

    }
}