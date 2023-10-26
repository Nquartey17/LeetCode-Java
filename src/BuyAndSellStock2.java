public class BuyAndSellStock2 {

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 0; i < prices.length -1; i++) {
            if (prices[i] < prices[i+1]) {
                totalProfit += prices[i+1] - prices[i];
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] prices = {2,2,5};
        System.out.println(maxProfit(prices));
    }
}
