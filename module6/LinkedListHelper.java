package module6;

public class LinkedListHelper {

    public static ListNode computeLinkedList(int[] arr) {
        ListNode head = null;
        ListNode temp = null;
        for(int i=0; i<arr.length; i++) {
            if(temp == null) {
                ListNode node = new ListNode(arr[i]);
                head = node;
                temp = head;
            } else {
                ListNode node = new ListNode(arr[i]);
                temp.next = node;
                temp = temp.next;
            }
        }
        return head;
    }
}
