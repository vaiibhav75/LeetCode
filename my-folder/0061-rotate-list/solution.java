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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode pointer = head;
        int length = 1;
        
        while (pointer.next != null) {
            pointer = pointer.next;
            length++;
        }
        k %= length;
        pointer.next = head;

        for (int i = 0; i < length-k; i++) {
            pointer = pointer.next;
        }
        
        head = pointer.next;
        pointer.next = null;
        
        return head;
        
    }
}
