class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for (int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree= new int[numCourses];
        for(int[] p : prerequisites){
            int course=p[0];
            int pre=p[1];
            graph.get(pre).add(course);
            indegree[course]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        int count=0;
        while(!queue.isEmpty()){
            int current=queue.poll();
            count++;
            for(int neighbour:graph.get(current)){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    queue.add(neighbour);

                }
            }

        }
        return count==numCourses;
    }
}