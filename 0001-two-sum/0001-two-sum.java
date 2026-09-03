class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] arrwithindex=new int[n][2];
        for (int i=0;i<n;i++){
            arrwithindex[i][0]=nums[i];
            arrwithindex[i][1]=i;
        }
        Arrays.sort(arrwithindex,(a,b)->Integer.compare(a[0],b[0]));
        int start=0;
        int end=n-1;
        while(start<end){
            int sum=arrwithindex[start][0]+arrwithindex[end][0];
            if (sum==target){
                return new int[] {arrwithindex[start][1],arrwithindex[end][1]};

            }
            if(sum<target){
                start++;
            }
            else{
                end--;

            }

        }
        return new int[] {-1,-1};
        
    }
}