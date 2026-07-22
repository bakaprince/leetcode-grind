class Solution {
    public int maxProfit(int[] prices) {
        int cheapestStock=prices[0];
        int maxProfit=0;

        for(int i=1;i<prices.length;i++){

            if(prices[i]<cheapestStock){
                cheapestStock=prices[i];
            }

            int currentProfit=prices[i]-cheapestStock;
            if(currentProfit>maxProfit){
                maxProfit=currentProfit;
            }

        }
        return maxProfit;
    }
}