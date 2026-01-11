package dsa.arrays;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int cheapest = prices[0];
        for (int n : prices) {
            if (cheapest > n) {
                cheapest = n;
            } else if ((n - cheapest) > maxProfit) {
                maxProfit = n - cheapest;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices1));

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices2));
    }
}

