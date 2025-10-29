class Solution {
    public int smallestNumber(int n) {
        int flag=-1;
        for(int i=1;i<=n;i++){
            int j = (int) Math.pow(2,i) - 1;
            if(j>=n){
                flag=j;
                break;
            }
        }
        return flag;
    }
}