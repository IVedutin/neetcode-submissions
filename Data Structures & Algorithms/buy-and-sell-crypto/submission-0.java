class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int slow = 0;
        for(int fast = 1; fast < prices.length ; fast++){
            int razn = prices[fast] - prices[slow];
            profit = razn > profit? razn: profit;
            if(prices[slow] > prices[fast]){
                slow = fast;
            }
        }
        return profit;
    }
}
