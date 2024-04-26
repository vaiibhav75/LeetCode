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
    ListNode pointer = null;
    public ListNode reverseList(ListNode head) {
        solve(head);
        return this.pointer;
    }
    
    public ListNode solve (ListNode head) {
        if (head == null || head.next == null) return this.pointer = head;
        solve(head.next).next = head;
        head.next = null;
        return head;
    }
}
