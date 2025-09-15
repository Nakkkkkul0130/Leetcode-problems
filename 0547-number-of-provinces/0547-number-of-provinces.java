class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                provinces++;
                dfs(i, isConnected, visited);
            }
        }
        return provinces;
    }
    private void dfs(int i, int[][] isConnected, boolean[] visited){
        visited[i] = true;
        int n = isConnected.length;
        for(int j=0;j<n;j++){
            if(isConnected[i][j]==1 && !visited[j]){
                dfs(j, isConnected, visited);
            }
        }
    }
}