public class MinCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        //min length = 2

        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            //avoid bigger values to get to the smallest possible outcome
            dp[i] = Math.min(cost[i] + dp[i-1], cost[i] + dp[i-2]);
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }

    public static void main(String[] args) {
        //1,100,1,1,1,100,1,1,100,1 = 6
        //10,15,20 = 15
        int[] array = new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(array));

    }
}
