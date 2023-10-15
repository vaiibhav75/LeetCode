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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int x = solve(head,n);
        
        if (x == n) {
            return head.next;
        } else {
            return head;
        }
    }
    
    static int solve (ListNode pointer, int n) {
        if (pointer.next == null) {
            return 1;
        }
        
        int x = solve(pointer.next,n);
        
        if (x == n) {
            pointer.next = pointer.next.next;
        }
        return x+1;
    }
}