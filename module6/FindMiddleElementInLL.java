package module6;

public class FindMiddleElementInLL {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
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
        int result = findMiddleElement(head);
        System.out.println("Middle element : " + result);
    }

    private static int findMiddleElement(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(fast.next != null && fast.next.next == null) return fast.next.val;
        while(fast.next!=null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast.next!=null && fast.next.next == null) slow = slow.next;
        }
        return slow.val;
    }
}
