public class RotateArray {
    //move array k steps, try to solve in O(1)
    public static void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        rotate(array, 6);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //5,6,7,1,2,3,4
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

    }
}
