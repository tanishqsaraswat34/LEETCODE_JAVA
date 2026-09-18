class Solution {
    public int median(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int low=mat[0][0];
        int high=mat[0][cols-1];
        for (int i=1;i<rows;i++){
            low=Math.min(low,mat[i][0]);
            high=Math.max(high,mat[i][cols-1]);
            
        }
        
        while(low<high){
            int mid=(low+high)/2;
            int count=0;
            for(int i=0;i<rows;i++){
                count += countLessEqual(mat[i], mid);
                
            }
            if (count < (rows * cols + 1) / 2) low = mid + 1;
            else  high = mid;
            
        }
        return low;
        
    }
    int countLessEqual(int[] row, int mid) {
            // Binary search in row
            int low = 0, high = row.length;
            while (low < high) {
                int m = (low + high) / 2;
                if (row[m] <= mid) low = m + 1;
                else high = m;
            }
            return low;
        }
}