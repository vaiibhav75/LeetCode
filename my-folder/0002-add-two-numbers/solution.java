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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode pointer = ans;
        int carry = 0;
        ListNode prev = null;
        while (l1 != null && l2 != null) {
            int val = carry+l1.val + l2.val;
            pointer.val = val%10;
            carry = val/10;
            
            ListNode next = new ListNode();
            pointer.next = next;
            prev = pointer;
            pointer = next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int val = carry+l1.val;
            pointer.val = val%10;
            carry = val/10;

            ListNode next = new ListNode();
            pointer.next = next;
            prev = pointer;
            pointer = next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int val = carry+l2.val;
            pointer.val = val%10;
            carry = val/10;

            ListNode next = new ListNode();
            pointer.next = next;
            prev = pointer;
            pointer = next;
            l2 = l2.next;
        }

        pointer.val = carry;

        if (carry == 0) {
            prev.next = null;
        }
        
        return ans;
    }
}
