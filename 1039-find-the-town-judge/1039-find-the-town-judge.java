class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length==0){
            return n;
        }
        int[] freq = new int[n+1];
        for(int[] arr : trust){
            freq[arr[0]]--;
            freq[arr[1]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==n-1){
                return i;
            }
        }
        return -1;

    }
}