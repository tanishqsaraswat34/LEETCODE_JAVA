class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for (int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] p : prerequisites){
            int course=p[0];
            int pre=p[1];
            graph.get(pre).add(course);
        }
        int[] state= new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(state[i]==0){
                if (dfs(i,graph,state)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean dfs(int node,ArrayList<ArrayList<Integer>>graph,int[] state){
        if (state[node]==1){
            return true;
        }
        if(state[node]==2){
            return false;
        }
        state[node]=1;
        for(int neighbours:graph.get(node)){
            if(dfs(neighbours,graph,state)){
                return true;
            }
        }
        state[node]=2;
        return false;
    }
}