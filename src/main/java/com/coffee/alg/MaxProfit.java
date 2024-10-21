package com.coffee.alg;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {1,2,3,4,5};
        System.out.println(maxProfitV2(prices2));
//        System.out.println(maxProfit(prices2));
    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int i = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice){
                minPrice = price;
            }else{
                maxProfit = Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }

    public int func2(int[] prices){
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    /**
     * 可多次售卖
     * @param prices
     * @return
     */
    public static int maxProfitV2(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i < prices.length-1 && prices[i+1] - prices[i] >0){
                maxProfit += prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }


}
