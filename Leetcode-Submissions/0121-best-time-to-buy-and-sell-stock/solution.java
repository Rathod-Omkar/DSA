class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,minCost=prices[0],maxProfit=0,ans=0;
        for(int i=0;i<prices.length;i++){
            minCost=Math.min(minCost,prices[i]);
            profit=prices[i]-minCost;
            if(profit>maxProfit){
                maxProfit=profit;
                ans=prices[i]-minCost;
            }
        }
        return ans;
    }
}
