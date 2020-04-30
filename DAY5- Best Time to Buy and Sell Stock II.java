class Solution {
    public int maxProfit(int[] prices) {
       int i=0;
        int j=i+1;
        
        int profit=0;
        
        while(j<prices.length){
            
            if(prices[j]>prices[i]){
                profit+=prices[j]-prices[i];
            }
            
            i++;
            j=i+1;
        }
        
        return profit;
    }
}
