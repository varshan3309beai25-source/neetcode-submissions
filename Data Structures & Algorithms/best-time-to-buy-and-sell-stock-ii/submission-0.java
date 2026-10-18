class Solution {
    public int maxProfit(int[] prices) {
        
        int p = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                int diff = prices[i+1]-prices[i];
                p+=diff;
            }
        }
        return p;
    }
}