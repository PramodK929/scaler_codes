public class DeleteLinkedList {

    public ListNode deleteNode(ListNode A, int B) {
        if (A == null) {
            return null;
        }
        if (B == 0) {
            return A.next;
        }
        ListNode current = A;
        for (int i = 0; i < B - 1; i++) {
            if (current.next != null) {
                current = current.next;
            } else {
                return A; // If B is greater than the length of the list
            }
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        return A;
    }
    
}
