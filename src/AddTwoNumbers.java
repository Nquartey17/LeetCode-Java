import java.util.ArrayList;
import java.util.Collections;

public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (l1.next != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        // Add last value
        list1.add(l1.val);

        while (l2.next != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        //Add last value
        list2.add(l2.val);

        //reverse the numbers before adding
        Collections.reverse(list1);
        Collections.reverse(list2);

        long num1 = 0;
        for (int i : list1) {
            num1 = (num1 * 10) + i;
        }

        long num2 = 0;
        for (int i : list2) {
            num2 = (num2 * 10) + i;
        }

        //total of both values
        long sum = num1 + num2;

        //Remove the last int and add it to list node
        long firstNum = sum % 10;
        sum /= 10;
        ListNode ans = new ListNode((int) firstNum);
        ListNode headCopy = ans;
        while (sum != 0) {
            long value = sum % 10;
            ans.next = new ListNode((int) value);
            ans = ans.next;
            sum /= 10;
        }
        return headCopy;
    }

    public static void main(String[] args) {

        //[6,5,5,6,4,4,2,5,5,1]

        ListNode one9 = new ListNode(7, null);
        ListNode one8 = new ListNode(5, one9);
        ListNode one7 = new ListNode(3, one8);
        ListNode one6 = new ListNode(8, one7);
        ListNode one5 = new ListNode(6, one6);
        ListNode one4 = new ListNode(5, one5);
        ListNode one3 = new ListNode(6, one4);
        ListNode one2 = new ListNode(8, one3);
        ListNode one1 = new ListNode(0, one2);


        ListNode two9 = new ListNode(7, null);
        ListNode two8 = new ListNode(9, two9);
        ListNode two7 = new ListNode(8, two8);
        ListNode two6 = new ListNode(5, two7);
        ListNode two5 = new ListNode(8, two6);
        ListNode two4 = new ListNode(0, two5);
        ListNode two3 = new ListNode(8, two4);
        ListNode two2 = new ListNode(7, two3);
        ListNode two1 = new ListNode(6, two2);

        System.out.println(addTwoNumbers(one1, two1));
    }

}
