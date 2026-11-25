class Solution {
    public int maxProfit(int[] prices) {
        int maxiProfit = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int currProfit = 0;
                currProfit = prices[j] - prices[i];
                maxiProfit = Math.max(maxiProfit, currProfit);
            }
        }
        if(maxiProfit < 0){
            return 0;
        }
        return maxiProfit;
    }
}
