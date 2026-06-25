class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int leftMin = prices[0];
        int n = prices.length;
        for(int i=1;i<n;i++){
            maxProfit = Math.max(maxProfit,prices[i]-leftMin);
            leftMin = Math.min(leftMin,prices[i]);
        }
        return maxProfit;
    }
}
