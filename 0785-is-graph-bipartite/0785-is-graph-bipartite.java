class Solution {
    public boolean isBipartite(int[][] graph) {
        
        int n = graph.length;
        int[] color=new int[n];
        for (int i=0;i<n;i++){
            if (color[i]==0){
                if(!dfs(i,1,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean dfs(int node,int currentColor,int[][] graph, int[] color){
        color[node]=currentColor;
        for (int neighbour:graph[node]){
            // uncolored
            if(color[neighbour]==0){
                if(!dfs(neighbour,-currentColor,graph,color)){
                    return false;
                }

            }
            // node is of same color
            if (color[neighbour]==currentColor){
                return false;
            }

        }
        return true;

    }
}