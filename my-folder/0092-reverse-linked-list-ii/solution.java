class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        int x = 1;
        ListNode prev = null;
        ListNode pointer = head;
        while (x < left) {
            prev = pointer;
            pointer = pointer.next;
            x++;
        }

        ListNode start = prev;
        ListNode init = pointer;
        ListNode next = pointer.next;
        while (x < right) {
            pointer.next = prev;
            prev = pointer;
            pointer = next;
            next = next.next;
            x++;
        }
         pointer.next = prev;

        init.next = next;
        if (start != null) {
            start.next = pointer;
            return head;
        } else {
            return pointer;
        }


        
    }
}
