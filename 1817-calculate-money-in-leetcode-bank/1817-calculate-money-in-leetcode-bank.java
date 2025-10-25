class Solution {
    public int totalMoney(int n) {
        int curr = 1, tot=0;
        for(int i=1;i<=n;i++){
            int k = (i-1)%7;
            int amount = curr + k;
            tot = tot+amount;
            if(i%7==0){
                curr = curr+1;
            }
        }
        return tot;
    }
}