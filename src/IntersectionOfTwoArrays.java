import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        //no duplicates
        Set<Integer> set = new HashSet<>();
        Set<Integer> values = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                values.add(i);
            }
        }

        int[] ans = new int[values.size()];
        int index = 0;
        for (int i : values) {
            ans[index++] = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
