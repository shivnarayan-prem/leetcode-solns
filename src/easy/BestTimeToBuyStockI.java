package easy;
public class BestTimeToBuyStockI {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) minPrice = prices[i];
            if(maxProfit < (prices[i] - minPrice)) maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[] {7, 1, 5, 3, 6, 4};
        System.out.println(prices.length);
        System.out.println(maxProfit(prices));
    }
}
