//You are given an array prices where prices[i] represents the price of a stock on day i.
//
//Your task is to maximize your profit by choosing one day to buy the stock and a later day to sell it.
//
//You may complete only one transaction (buy once and sell once).
//
//If no profit can be made, return 0.
//
//Example:
//
//Input:
//prices = [7, 1, 5, 3, 6, 4]
//
//Output:
//        5
//        (Buy on day 1 at price = 1, sell on day 4 at price = 6 → profit = 5)

package Arrays.MVIP;

import java.util.*;

public class StockBuySell {

    // TODO: Brute Force Approach (O(n^2))
        public static int maxProfitBrute(int[] prices) {

            int maxProfit = 0;

            for(int i=0; i<prices.length; i++){

                for(int j=i+1; j<prices.length; j++){

                    int profit = prices[j] - prices[i];

                    if(profit > maxProfit){
                        maxProfit = profit;
                    }
                }

            }
            return maxProfit;
        }

    // TODO: Optimal Approach (O(n))
    public static int maxProfitOptimal(int[] prices) {

            int minPriceSoFar = Integer.MAX_VALUE;
            int maxProfit = 0;

            for(int price : prices){

                if(price < minPriceSoFar){
                    minPriceSoFar = price;
                }

                //Possible profit if selling today
                int profitToday = price - minPriceSoFar;

                if(profitToday > maxProfit){
                    maxProfit = profitToday;
                }
            }
            return maxProfit;
    }

    public static void main(String[] args) {

        // Test input (modify as needed)
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Brute Profit:   " + maxProfitBrute(prices));
        System.out.println("Optimal Profit: " + maxProfitOptimal(prices));
    }
}

