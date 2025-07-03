class Solution {
    public int possibleStringCount(String word, int k) {
        int mod = 1000000007;
        int n = word.length();
        List<Integer> al = new ArrayList<>();

        int i=0;
        while(i<n){
            int j = i+1;
            while(j<n && word.charAt(i)==word.charAt(j)){
                j++;
            }
            al.add(j-i);        // storing the freq of each char
            i=j;
        }

        long total = 1;
        for(int num : al){
            total = (total * num)%mod;
        }

        if(k<=al.size()) return (int) total;
        int dp[] = new int[k];
        dp[0] = 1;

        for(int count : al){
            long sum=0;
            int newDp[] = new int[k];
            for(int j=1;j<k;j++){
                sum = (sum + dp[j-1])%mod;
                if(count < j){
                    sum = (sum - dp[j-count-1]+mod)%mod;
                }
                newDp[j] = (int) sum;
            }
            dp = newDp;
        }

        long invalid = 0;
        for(int j=al.size();j<k;j++){
            invalid = (invalid + dp[j]) % mod;
        }

        return (int) (total-invalid + mod) % mod;

    }
}