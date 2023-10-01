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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pointer = new ListNode();
        pointer = head;
        remove(pointer);
        return head;
    }
    
    
    static void remove (ListNode pointer) {
        
        if (pointer == null || pointer.next == null) {
            return;
        }
        
        if (pointer.next.val == pointer.val) {
            pointer.next = pointer.next.next;
            remove(pointer);
        } else {
            remove(pointer.next);
        }
    }
}

