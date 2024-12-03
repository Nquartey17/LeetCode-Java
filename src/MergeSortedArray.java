public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //m is num1 length, n is num2 length. solve this array in place
        //Idea: compare values and switch the smallest one first O(m+n)

//        int p1 = m-1, p2 = n-1, i = m+n-1;
//        while(p2 >= 0){
//            if(p1 >= 0 && nums1[p1] > nums2[p2]){
//                nums1[i--] = nums1[p1--];
//            }
//            else {
//                nums1[i--] = nums2[p2--];
//            }
//        }
        for (int i = m+n-1; i >= 0; i--) {
            if (nums2[n-1] > nums1[m-1]) {
                nums1[i] = nums2[n-1];
                n = n-1;
            } else {
                nums1[i] = nums1[m-1];
                m = m-1;
            }
        }


    }

    public static void main(String[] args) {
        //1,2,3,0,0,0
        //2,5,6
    }
}
