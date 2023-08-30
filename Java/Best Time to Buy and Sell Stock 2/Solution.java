class Solution {
    public int maxProfit(int[] prices) {
            /**
         * Author: https://github.com/Gabril0
         * Runtime: 1 ms
         * Beats: 86.24%
         * Memory: 43.77 mb
         * Beats: 98.79%
        To solve this, I need to compare the previous price with the current one, and then sum the profits when they are possible.
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