public class BuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else if(prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
//        7,1,5,3,6,4
        System.out.println(maxProfit(prices));
    }
}
