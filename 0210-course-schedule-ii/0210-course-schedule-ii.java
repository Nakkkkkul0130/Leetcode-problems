class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites){
            int course = pre[0];
            int preq = pre[1];
            graph.get(preq).add(course);
        }
        boolean[] path = new boolean[numCourses];
        boolean[] visited = new boolean[numCourses];
        List<Integer> result  = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            if(iscycle(graph, visited,path, i,result)){
                return new int[0];
            }
        }

        Collections.reverse(result);
        int[] arr = new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i] = result.get(i);
        }

        return arr;
        
    }
    public boolean iscycle(List<List<Integer>> graph, boolean[] visited, boolean[] path, int courses, List<Integer> result){
        if(path[courses]){
            return true;
        }
        if(visited[courses]){
            return false;
        }

        path[courses] = true;
        for(int neighbour : graph.get(courses)){
            if(iscycle(graph, visited, path, neighbour, result)){
                return true;
            }
        }

        path[courses] = false;
        visited[courses] = true;
        result.add(courses);
        return false;
    }
}