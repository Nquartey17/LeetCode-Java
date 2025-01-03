import java.util.Arrays;

public class SortArray {

    public static int[] merge(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];

        int i = 0, j = 0;
        int index = 0;
        while (i < nums1.length || j < nums2.length) {
            int val1 = i == nums1.length ? Integer.MAX_VALUE : nums1[i];
            int val2 = i == nums2.length ? Integer.MAX_VALUE : nums2[j];

            if (val1 <= val2) {
                res[index] = val1;
                i++;
            } else {
                res[index] = val2;
                j++;
            }
            index++;
        }
        return res;
    }

    public static int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int mid = nums.length / 2;

        return merge(sortArray(Arrays.copyOfRange(nums, 0, mid)),
                sortArray(Arrays.copyOfRange(nums, mid, nums.length)));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
