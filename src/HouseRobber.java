public class HouseRobber {

    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0]; //first house value

        //The first house has been accounted for so start at second house
        for (int i = 1; i < nums.length; i++) {
            dp[i+1]= Math.max(dp[i],dp[i-1]+nums[i]); //Previous max or old max + new house
        }


        return dp[nums.length]; //The last element with always be the most amount
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,1,1,2}));
    }
}
