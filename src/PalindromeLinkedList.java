public class PalindromeLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        //whichever node hits the end first is what should end loop
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //slow will be at the halfway point, elements need to be reversed for slow
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode first = head, second = prev;
        while (second != null) {
            if (first.val != second.val) return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }


    public static void main(String[] args) {
        ListNode four = new ListNode(1, null);
        ListNode three = new ListNode(2, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(2, two);
        System.out.println(isPalindrome(one));

    }
}
