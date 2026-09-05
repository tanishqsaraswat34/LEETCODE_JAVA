class Solution {
    public int maxProduct(int[] nums) {
        int len=nums.length;
        int res=nums[0];
        int minProd=nums[0];
        int maxProd=nums[0];
        for (int i=1;i<len;i++){
            int curr=nums[i];
            if (curr<0){
                int temp=minProd;
                minProd=maxProd;
                maxProd=temp;
            }
            minProd=Math.min(curr,minProd*curr);
            maxProd=Math.max(curr,maxProd*curr);
            res=Math.max(res,maxProd);

        }
        return res;
    }
}