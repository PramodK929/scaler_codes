
import java.util.List;

import module6.ListNode;

public class InsertAtSpecificIndex {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int value = 100;
        int idx = 13;
        System.out.println("=======Before=======");
        ListNode x = head;
        while(x!=null) {
            System.out.print(x.val + " -> ");
            x = x.next;
        }
        System.out.println();
        InsertAtIndex(head, value, idx);
        System.out.println("=======After=======");
        while(head!=null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    private static void InsertAtIndex(ListNode head, int value, int idx) {
        if (head== null){
            ListNode newNode = new ListNode(value);
            head = newNode;
        }
        if (idx==0){
            ListNode newNode = new ListNode(value);
            ListNode tempNode = head;
            newNode.next = tempNode;
            head = newNode;
        }
        ListNode temp = head;
        while (temp.next != null && idx>0) {
            idx--;
            // if(idx == 0) break;
            temp = temp.next;
        }
        ListNode newNode = new ListNode(value);
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
