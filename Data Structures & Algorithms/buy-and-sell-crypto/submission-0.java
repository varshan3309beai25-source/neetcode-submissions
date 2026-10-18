class Solution {
    public int maxProfit(int[] prices) {
        // int p = 0;
        // int maxp = 0;
        // int minp = 0;
        // for(int i=0;i<prices.length-1;i++){
        //     if(prices[i]<prices[i+1]){
        //         minp = prices[i];
        //     }
        //     int diff = prices[i]-minp;
        //     p+=diff;
        //     maxp = Math.max(maxp,p);
        // }
        // return maxp;

        int minp = prices[0];
        int maxp = 0;
        int p=0;
        for(int i=1;i<prices.length;i++){
            int diff = prices[i]-minp;
            p = Math.max(p,diff);
            maxp = Math.max(p,maxp);
            minp = Math.min(minp,prices[i]);
            
        }
        return maxp;
    }
}
