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
    static ListNode mhead; 
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null) {
            return head;
        }
        mhead = head;
        ListNode prev = null;
        ListNode start = head;
        ListNode end = start;
        ListNode next = null;
        
        while (start != null) {
            int j = 1;
            while (j < k && end.next!= null) {
                end = end.next;
                j++;
            }
            if (j < k) return mhead;
            next = end.next;
            ListNode val = solve(prev,start,end);
            val.next = next;
            prev = val;
            start = next;
            end = start;
            next = null;  
        }
        
        return mhead;
        
        
    }
    
    static ListNode solve (ListNode prev, ListNode pointer, ListNode end) {
        if (pointer == end) {
            if (prev != null) {
                prev.next = pointer;
            } else {
                mhead = pointer;
            }
            return pointer;
        };
        ListNode val = solve(prev,pointer.next,end);
        val.next = pointer;
        return pointer;
    }
}
