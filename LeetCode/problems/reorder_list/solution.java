class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode mid = middleNode(head);
        int n = Length(head);
        
        

        ListNode ans = solve(head,mid,n);
    }

    static ListNode solve (ListNode pointer, ListNode mid, int n) {
        if (pointer == mid) {
            if (n%2 == 0) {
                ListNode val = mid.next.next;
                mid.next.next = null;
                return val;
            } else {
                ListNode val = mid.next;
                mid.next = null;
                
                return val;
            }
        }

        ListNode insert = solve(pointer.next, mid, n);

        
        ListNode toReturn = insert.next;

        insert.next = pointer.next;
        pointer.next = insert;

        return toReturn;
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public int Length(ListNode head) {
        int length = 0;
        ListNode pointer = head;
        while (pointer != null) {
            length++;
            pointer = pointer.next;
        }
        return length;
    }
}