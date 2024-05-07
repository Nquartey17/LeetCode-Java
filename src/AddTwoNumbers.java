public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static long reverse(long input) {
        long reversed = 0;
        while(input != 0) {
            long digit = input % 10;
            reversed = (reversed * 10) + digit;
            input /= 10;
        }
        return reversed;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long  num1 = 0;
        long num2 = 0;
        while (l1.next != null) {
            num1 = (num1 * 10) + l1.val;
            l1 = l1.next;
        }
        // Add last value
        num1 = (num1 * 10) + l1.val;

        while (l2.next != null) {
            num2 = (num2 * 10) + l2.val;
            l2 = l2.next;
        }
        //Add last value
        num2 = (num2 * 10) + l2.val;

        //reverse the numbers before adding
        num1 = reverse(num1);
        num2 = reverse(num2);

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

        ListNode one1 = new ListNode(9, null);

        ListNode two10 = new ListNode(9, null);
        ListNode two9 = new ListNode(9, two10);
        ListNode two8 = new ListNode(9, two9);
        ListNode two7 = new ListNode(9, two8);
        ListNode two6 = new ListNode(9, two7);
        ListNode two5 = new ListNode(9, two6);
        ListNode two4 = new ListNode(9, two5);
        ListNode two3 = new ListNode(9, two4);
        ListNode two2 = new ListNode(9, two3);
        ListNode two1 = new ListNode(1, two2);

        System.out.println(addTwoNumbers(one1, two1));
    }

}
