class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int n=grid.length,m=grid[0].length,k=queries.length;
        int[][] queries2=new int[k][2];
        int[] dir=new int[]{0,1,0,-1,0},answer=new int[k];
        for(int i=0;i<k;i++)
            queries2[i]=new int[]{queries[i],i};
        Arrays.sort(queries2,(a,b)->a[0]-b[0]);
        boolean[][] added=new boolean[n][m];
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[2]-b[2]);
        q.add(new int[]{0,0,grid[0][0]});
        added[0][0]=true;
        for(int count=0,i=0;i<k;i++){
            int v=queries2[i][0];
            while(!q.isEmpty()&&q.peek()[2]<v){
                int c=q.peek()[1],r=q.peek()[0];
                count++;
                q.poll();
                for(int j=0;j<4;j++){
                    int nextR=r+dir[j],nextC=c+dir[j+1];
                    if(nextR>=0&&nextR<n&&nextC>=0&&nextC<m&&!added[nextR][nextC]) {
                        q.add(new int[]{nextR, nextC,grid[nextR][nextC]});
                        added[nextR][nextC]=true;
                    }
                }
            }
            answer[queries2[i][1]]=count;
        }
        return answer;
    }
}