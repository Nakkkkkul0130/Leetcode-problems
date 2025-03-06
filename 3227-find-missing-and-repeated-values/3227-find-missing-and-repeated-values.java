class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size=n*n;
        HashSet<Integer> hs = new HashSet<>();
        int repeated=-1, missing=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(hs.contains(grid[i][j])){
                    repeated=grid[i][j];
                }
                else{
                    hs.add(grid[i][j]);
                }
            }
        }
        for(int num=1;num<=size;num++){
            if(!hs.contains(num)){
                missing=num;
                break;
            }
        }
        return new int[]{repeated,missing};
    }
}