package module2;

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode node = new ListNode(arr[0]);
        ListNode head = node;
        for(int i=1; i<arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            node.next = newNode;
            node = newNode;
        }
        ListNode result = reverseList(head);
        while(result.next != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    private static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        ListNode next = head.next;
        while(cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
        return next;
    }
}
