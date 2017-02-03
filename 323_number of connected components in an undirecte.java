323_number of connected components in an undirected graph.java

public class Solution {
    public int countComponents(int n, int[][] edges) {
        //corner case
        if(n <= 0){
            return 0;
        }
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        boolean[] visited = new boolean[n];
        int count = 0;
        //build a map
        for(int i = 0; i < n; i++){
            map.put(i, new ArrayList<Integer>());
        }
        for(int[] edge : edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        //dfs
        for(int i = 0; i < n; i++){
            if(visited[i]){
                continue;
            }
            helper(map, i, visited);
            count++;
        }
        return count;
    }
    
    public void helper(HashMap<Integer, List<Integer>> map, int cur, boolean[] visited){
        if(visited[cur]){
            return ;
        }
        visited[cur] = true;
        for(int next : map.get(cur)){
            helper(map, next, visited);
        }
        return ;
    }
}