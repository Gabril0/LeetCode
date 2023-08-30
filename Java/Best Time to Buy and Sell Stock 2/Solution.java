class Solution {
    public int maxProfit(int[] prices) {
            /**
         * Author: https://github.com/Gabril0
         * Runtime: 2 ms
         * Beats: 83.18%
         * Memory: 60.80 mb
         * Beats: 72.67%
        To solve this, I need to get all the numbers and store the lowest and the highest profit, then compare the positions until I get the highest.
        */
        int previous = prices[0];
        int profit = 0;
        for(int price : prices){
            if(previous < price){
                profit += price - previous;
            }
            previous = price;
        }
        return profit;
    }
}