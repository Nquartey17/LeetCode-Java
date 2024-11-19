import java.math.BigInteger;
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

        //29 0's
        //[1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]
        //[5,6,4]

        ListNode one31 = new ListNode(1, null);
        ListNode one30 = new ListNode(0, one31);
        ListNode one29 = new ListNode(0, one30);
        ListNode one28 = new ListNode(0, one29);
        ListNode one27 = new ListNode(0, one28);
        ListNode one26 = new ListNode(0, one27);
        ListNode one25 = new ListNode(0, one26);
        ListNode one24 = new ListNode(0, one25);
        ListNode one23 = new ListNode(0, one24);
        ListNode one22 = new ListNode(0, one23);
        ListNode one21 = new ListNode(0, one22);
        ListNode one20 = new ListNode(0, one21);
        ListNode one19 = new ListNode(0, one20);
        ListNode one18 = new ListNode(0, one19);
        ListNode one17 = new ListNode(0, one18);
        ListNode one16 = new ListNode(0, one17);
        ListNode one15 = new ListNode(0, one16);
        ListNode one14 = new ListNode(0, one15);
        ListNode one13 = new ListNode(0, one14);
        ListNode one12 = new ListNode(0, one13);
        ListNode one11 = new ListNode(0, one12);
        ListNode one10 = new ListNode(0, one11);
        ListNode one9 = new ListNode(0, one10);
        ListNode one8 = new ListNode(0, one9);
        ListNode one7 = new ListNode(0, one8);
        ListNode one6 = new ListNode(0, one7);
        ListNode one5 = new ListNode(0, one6);
        ListNode one4 = new ListNode(0, one5);
        ListNode one3 = new ListNode(0, one4);
        ListNode one2 = new ListNode(0, one3);
        ListNode one1 = new ListNode(1, one2);



        ListNode two3 = new ListNode(4, null);
        ListNode two2 = new ListNode(6, two3);
        ListNode two1 = new ListNode(5, two2);

        System.out.println(addTwoNumbers(one1, two1));
    }

}
