class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] pre: prerequisites){
            int course = pre[0];
            int preq = pre[1];
            graph.get(preq).add(course);
        }

        boolean[] path = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        
        for(int i=0;i<numCourses;i++){
            if(iscycle(graph, path,visited, i)){
                return false;
            }
        }
        return true;
    }
    public boolean iscycle(List<List<Integer>> graph,boolean[] path,boolean[] visited, int courses){
        if(path[courses]){
            return true;
        }
        if(visited[courses]){
            return false;
        }
        path[courses]=true;

        for(int neighbour : graph.get(courses)){
            if(iscycle(graph, path,visited, neighbour)){
                return true;
            }
        }

        path[courses] = false;
        visited[courses] = true;

        return false;
    }
}