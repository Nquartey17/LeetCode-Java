

public class GetIntersectionNode {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Idea: skip to same starting point and find matching value
        ListNode copyA = headA; int countA = 1;
        ListNode copyB = headB; int countB = 1;
        //Count number of elements
        while (copyA.next != null) {
            countA = countA + 1;
            copyA = copyA.next;
        }

        while (copyB.next != null) {
            countB = countB + 1;
            copyB = copyB.next;
        }

        //start at the same point
        int sumDifference = 0;
        if (countB > countA) {
            sumDifference = countB - countA;
            while (sumDifference > 0) {
                headB = headB.next;
                sumDifference = sumDifference - 1;
            }
        }
        else if (countA > countB) {
            sumDifference = countA - countB;
            while (sumDifference > 0) {
                headA = headA.next;
                sumDifference = sumDifference - 1;
            }
        }

        boolean intersectionNode = false;
        while (headA.next != null) {
            if (headA.equals(headB)) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public static void main(String[] args) {
//        intersectVal = 8, listA = [4,1,8,4,5],
//        listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
        ListNode A5 = new ListNode(5);
        ListNode A4 = new ListNode(4);
        ListNode A3 = new ListNode(8);
        ListNode A2 = new ListNode(1);
        ListNode A1 = new ListNode(4);
        A1.next = A2; A2.next = A3; A3.next = A4; A4.next = A5;

        ListNode B4 = A3;
        ListNode B3 = new ListNode(1);
        ListNode B2 = new ListNode(6);
        ListNode B1 = new ListNode(5);
        B1.next = B2; B2.next = B3; B3.next = B4;

        System.out.println(getIntersectionNode(A1, B1));



    }
}
