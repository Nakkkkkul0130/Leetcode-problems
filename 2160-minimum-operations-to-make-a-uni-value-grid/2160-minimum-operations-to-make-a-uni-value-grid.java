class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
        int[] arr=new int[n*m];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[c++]=grid[i][j];
            }
        }
        Arrays.sort(arr);
        int median=arr[c/2];
        int ans=0;
        for(int i=0;i<c;i++){
            if(arr[i]%x!=median%x){
                return -1;
            }
            ans+=Math.abs((median-arr[i])/x);
        }
        return ans; 
    }
}