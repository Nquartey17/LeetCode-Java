public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static int reverse(int input) {
        int reversed = 0;
        while(input != 0) {
            int digit = input % 10;
            reversed = (reversed * 10) + digit;
            input /= 10;
        }
        return reversed;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0;
        int num2 = 0;
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
        int sum = num1 + num2;

        //Remove the last int and add it to list node
        int firstNum = sum % 10;
        sum /= 10;
        ListNode ans = new ListNode(firstNum);
        ListNode headCopy = ans;
        while (sum != 0) {
            int value = sum % 10;
            ans.next = new ListNode(value);
            ans = ans.next;
            sum /= 10;
        }
        return headCopy;
    }

    public static void main(String[] args) {
        ListNode one3 = new ListNode(3, null);
        ListNode one2 = new ListNode(4, one3);
        ListNode one1 = new ListNode(2, one2);

        ListNode two3 = new ListNode(4, null);
        ListNode two2 = new ListNode(6, two3);
        ListNode two1 = new ListNode(5, two2);

        System.out.println(addTwoNumbers(one1, two1));
    }

}
