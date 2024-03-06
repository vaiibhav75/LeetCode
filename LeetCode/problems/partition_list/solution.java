/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode head1 = null;
        ListNode head2 = null;
        ListNode curr1 = null;
        ListNode curr2 = null;

        while (head != null) {
            if (head.val < x) {
                if (head1 == null) {
                    head1 = new ListNode(head.val);
                    curr1 = head1;
                } else {
                    curr1.next = new ListNode(head.val);
                    curr1 = curr1.next;
                }
            } else {
                if (head2 == null) {
                    head2 = new ListNode(head.val);
                    curr2 = head2;
                } else {
                    curr2.next = new ListNode(head.val);
                    curr2 = curr2.next;
                }
            }
            head = head.next;
        }
        
        if (head1 == null) {
            return head2;
        }
        
        curr1.next = head2;
        return head1;
    }
}