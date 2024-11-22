public class BuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;
        for (int i = 0; i < prices.length; i++) {
            minValue = Math.min(minValue, prices[i]);
            maxValue = Math.max(maxValue, prices[i] - minValue);
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
//        7,1,5,3,6,4
        System.out.println(maxProfit(prices));
    }
}
