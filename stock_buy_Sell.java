class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int mininvest = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            mininvest =Math.min(mininvest,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-mininvest);
        }
        return maxprofit; 
    }
}
