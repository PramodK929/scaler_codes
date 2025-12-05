 package test;

import module6.ListNode;

public class IntersectionNode {
    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(6);
        A.next = new ListNode(2);
        A.next.next = new ListNode(3);
        B.next = A.next;
        A.next.next.next = new ListNode(4);
        A.next.next.next.next = new ListNode(5);

        System.out.println("A list:");
        ListNode tempA = A;
        ListNode tempB = B;
        printList(tempA);
        System.out.println("======= End A ========");

        System.out.println("B list:");
        printList(tempB);
        System.out.println("======= End B ========");

        System.out.println("******* Reversed - A *******");
        ListNode revA = reverseLL(A);
        printList(revA);

        System.out.println("*** B list:");
        printList(tempB);
        System.out.println("======= End B ========");

        System.out.println("******* Reversed - B *******");
        ListNode revB = reverseLL(B);
        printList(revB);


    }

    public static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    } 
}
