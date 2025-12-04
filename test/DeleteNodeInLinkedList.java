package test;

import module6.ListNode;

public class DeleteNodeInLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        int idx = 3;
        ListNode res = deleteAtIndex(head, idx);
        while(res!=null) {
            System.out.print(res.val + " -> ");
            res = res.next;
        }
        System.out.println();
    }

    private static ListNode deleteAtIndex(ListNode head, int idx) {
        if(idx == 0) {
            head = head.next;
        } else {
            ListNode temp = head;
            while(temp != null && idx > 1) {
                idx--;
                temp = temp.next;
            }
            if(temp.next != null) {
                temp.next = temp.next.next;
            }
        }    
        return head;  
    }
}
