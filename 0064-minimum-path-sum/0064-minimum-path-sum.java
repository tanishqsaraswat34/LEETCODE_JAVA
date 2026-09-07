class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp= new int[n][m];
        for (int[] row : dp ){
            Arrays.fill(row,-1);
        }
        return calminPath(n-1,m-1,grid,dp);
        
    }
    public int calminPath(int i, int j, int[][] grid, int[][] dp){
        if (i==0 && j==0){
            return grid[0][0];
        }
        if(i<0 || j<0){
            return (int)1e9;

        }

        if (dp[i][j]!=-1){
            return dp[i][j];
        }

        int up=grid[i][j]+  calminPath(i-1,j,grid,dp);
        int down=grid[i][j]+calminPath(i,j-1,grid,dp);
        dp[i][j]=Math.min(up,down);
        return dp[i][j];
    }
}