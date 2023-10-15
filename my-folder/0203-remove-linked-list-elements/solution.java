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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            if (curr.val == val) {
                if (prev != null) {
                    prev.next = curr.next;
                    curr = curr.next;
                } else {
                    head = curr.next;
                    curr = curr.next;
                }
                continue;
            }
            prev = curr;
            curr = curr.next;
        }
        
        return head;
    }
}
