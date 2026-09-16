class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int start=edge[0];
            int end=edge[1];
            graph.get(start).add(end);
        }
        boolean[] visited=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,graph,stack,visited);
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        return ans;
        
        
    }
    private void dfs(int node,ArrayList<ArrayList<Integer>> graph,Stack<Integer> stack,boolean[] visited){
        visited[node]=true;
        for(int neighbour:graph.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,graph,stack,visited);
            }
        }
        stack.push(node);
    }
}