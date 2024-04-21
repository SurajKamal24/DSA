package leetcodedaily;

import java.util.*;

public class FindIfPathExistsInGraph {
    private boolean dfs(int node, int destination, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (node == destination) {
            return true;
        }
        visited.add(node);
        for (int neighbour : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbour)) {
                if (dfs(neighbour, destination, graph, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        Set<Integer> visited = new HashSet<>();
        return dfs(source, destination, graph, visited);
    }

    public static void main(String[] args) {
        System.out.println(new FindIfPathExistsInGraph().validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2));
    }
}
