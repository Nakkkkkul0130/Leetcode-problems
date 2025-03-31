class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int[] pairsum = new int[n-1];
        for(int i=0;i<n-1;i++){
            pairsum[i]=weights[i]+weights[i+1];

        }
        Arrays.sort(pairsum,0,n-1);
        long mincost = 0; long maxcost=0;
            // doing partition-->k-1 parts divide array in k part
        for(int i=0;i<k-1;i++){
            mincost +=pairsum[i]; 
            maxcost +=pairsum[n-2-i]; 
        }
        return maxcost-mincost;
        
    }
}