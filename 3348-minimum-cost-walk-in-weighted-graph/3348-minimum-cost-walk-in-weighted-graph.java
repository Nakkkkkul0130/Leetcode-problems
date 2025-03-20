import java.util.*;

class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(new int[]{edge[1], edge[2]});
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(new int[]{edge[0], edge[2]});
        }

        int[] component = new int[n]; 
        Arrays.fill(component, -1);
        Map<Integer, Integer> minCost = new HashMap<>(); 

        int compId = 0;
        for (int i = 0; i < n; i++) {
            if (component[i] == -1 && graph.containsKey(i)) {
                minCost.put(compId, bfs(graph, component, i, compId)); 
                compId++;
            }
        }

        int[] result = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int si = query[i][0], ti = query[i][1];
            if (si == ti) {
                result[i] = 0; 
            } else if (component[si] != -1 && component[si] == component[ti]) {
                result[i] = minCost.get(component[si]); 
            } else {
                result[i] = -1; 
            }
        }

        return result;
    }

    private int bfs(Map<Integer, List<int[]>> graph, int[] component, int start, int compId) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        component[start] = compId;

        int minAnd = Integer.MAX_VALUE;
        Set<Integer> visited = new HashSet<>();
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0], weight = neighbor[1];
                minAnd &= weight; 
                
                if (!visited.contains(nextNode)) {
                    visited.add(nextNode);
                    component[nextNode] = compId;
                    queue.offer(nextNode);
                }
            }
        }
        return minAnd;
    }
}
