class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int n=adj.size();
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int start=0;
        dfshelper(start,adj,result,visited);
        return result;
        
    }
    private void dfshelper(int start, ArrayList<ArrayList <Integer>> adj , ArrayList<Integer> result ,boolean[] visited){
        visited[start]=true;
        result.add(start);
        for (int u : adj.get(start)){
            if(!visited[u]){
                dfshelper(u,adj,result,visited);
            }
        
        }
    }
}