import java.util.*;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        //bit manipulation, changes answers one way or back depending on duplicates
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

}
