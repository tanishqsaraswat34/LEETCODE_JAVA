class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid,int row,int col){
        // out of bound
        if (row<0 || row>=grid.length || col<0 || col>=grid[0].length){
            return;
        }
        // water or viisited
        if(grid[row][col]=='0'){
            return;
        }
        // visited
        grid[row][col]='0';
        // up
        dfs(grid,row-1,col);
        // down
        dfs(grid,row+1,col);
        // left 
        dfs(grid,row,col-1);
        // right
        dfs(grid,row,col+1);
    }

}