package leetcodedaily;

import java.util.ArrayList;
import java.util.List;

public class AllAncestorsOfANodeInADirectedAcyclicGraph {
    private void dfs(List<Integer>[] graph, int parent, int current, List<List<Integer>> res, boolean[] visit) {
        visit[current] = true;
        for (int dest : graph[current]) {
            if (! visit[dest]) {
                res.get(dest).add(parent);
                dfs(graph, parent, dest, res, visit);
            }
        }
    }
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge: edges) {
            graph[edge[0]].add(edge[1]);
        }
        for (int i = 0; i < n; i++) {
            dfs(graph, i, i, res, new boolean[n]);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new AllAncestorsOfANodeInADirectedAcyclicGraph().getAncestors(5, new int[][]{{0,1}, {1,2}, {2,3}, {0,2}, {1,3}, {2,4}}));
    }
}
