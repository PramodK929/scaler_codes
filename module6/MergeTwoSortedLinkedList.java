package module6;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 20};
        int[] b = new int[]{4, 11, 15};
        ListNode A = LinkedListHelper.computeLinkedList(a);
        ListNode B = LinkedListHelper.computeLinkedList(b);
        ListNode res = mergeTwoLL(A, B);
        while(res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }

    private static ListNode mergeTwoLL(ListNode A, ListNode B) {
        ListNode res = null;
        ListNode temp = res;
        if(A == null) return B;
        else if(B == null) return A;
        while(A != null && B != null) {
            if(A.val <= B.val) {
                if(res == null) {
                    ListNode node = new ListNode(A.val);
                    res = node;
                    A = A.next;
                    temp = res;
                } else {
                    ListNode node = new ListNode(A.val);
                    temp.next = node;
                    temp = temp.next;
                    A = A.next;
                }
            } else {
                if(res == null) {
                    ListNode node = new ListNode(B.val);
                    res = node;
                    B = B.next;
                    temp = res;
                } else {
                    ListNode node = new ListNode(B.val);
                    temp.next = node;
                    temp = temp.next;
                    B = B.next;
                }
            }
        }

        if(A == null) temp.next = B;
        else if(B == null) temp.next = A;
        return res;
    }
}
