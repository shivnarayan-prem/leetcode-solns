package medium;

public class BestTimeToBuySellStockII {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] {1 ,2 , 3, 9, 3, 1, 5};
        System.out.println(maxProfit(prices));
    }
}
