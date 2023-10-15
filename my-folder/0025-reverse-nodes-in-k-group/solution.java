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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode start = head;
        ListNode end = null;
        
        ListNode pointer = start;
        int i = 1;
        
        while (i < k && pointer!= null) {
            pointer = pointer.next;
            i++;
            
            
        }
        end = pointer;
        head = end;
        ListNode next = null;
        
        while (end != null) {
            next = end.next;
            ListNode val = solve(prev,start,end);
            val.next = next;
            prev = val;
            start = next;
            pointer = start;

            int j = 1;

            while (j < k && pointer!= null) {
                pointer = pointer.next;
                j++;


            }
            end = pointer;
        }
        
        return head;
        
        
    }
    
    static ListNode solve (ListNode prev, ListNode pointer, ListNode end) {
        if (pointer == end) {
            if (prev != null) {
                prev.next = pointer;
            }
            
            return pointer;
        }
        
        ListNode val = solve(prev,pointer.next,end);
        val.next = pointer;
        return pointer;
    }
}
