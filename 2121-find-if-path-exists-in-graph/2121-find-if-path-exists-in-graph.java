class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }
        boolean[] vis = new boolean[n];
        return dfs(source, destination, graph, vis);

    }
    private boolean dfs(int u, int dest, ArrayList<Integer>[] graph, boolean[] vis){
        if(u==dest) return true;
        vis[u]=true;
        for(int v : graph[u]){
            if(!vis[v]){
                if(dfs(v, dest, graph, vis)) return true;
            }
        }
        return false;

    }
}