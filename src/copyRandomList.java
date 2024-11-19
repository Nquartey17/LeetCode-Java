
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class copyRandomList {
    public Node copyRandomList(Node head) {
        Node copyHead = head;
        Node res = null;
        //Copy the outer elements
        while (copyHead.next != null) {
            res.next = copyHead.next;
        }
        return head;
    }

    public static void main(String[] args) {
        //[[7,null],[13,0],[11,4],[10,2],[1,0]]
    }
}


