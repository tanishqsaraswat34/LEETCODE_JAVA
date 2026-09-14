class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n=arr.length;
        int platforms=1;
        int res=1;
        int i=1,j=0;
        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                platforms++;
                i++;
            }
            else{
                platforms--;
                j++;
            }
            res=Math.max(platforms,res);
        }
        return res;
    }
}
