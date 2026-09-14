class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n=val.length;
        double[][] items=new double[n][2];
        for(int i=0;i<n;i++){
            items[i][0]=val[i];
            items[i][1]=wt[i];
        }
        
        Arrays.sort(items,(a,b)->Double.compare(b[0]/b[1],a[0]/a[1]));
        double totalValue=0.0;
        for(int i=0;i<n;i++){
            double value=items[i][0];
            double weight=items[i][1];
            if(weight<=capacity){
                totalValue+=value;
                capacity-=weight;
                
            }
            else{
                totalValue+=(value/weight)*capacity;
                break;
            }
            
        }
        return totalValue;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}