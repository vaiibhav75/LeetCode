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
    public ListNode sortList(ListNode head) {
        return insertionSortList(head);
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode sorted = insertionSortList(head.next);
        
        if (head.val <= sorted.val) {
            head.next = sorted;
            return head;
        }
        
        ListNode curr = sorted;
        
        while (curr.next != null && head.val > curr.next.val) {
            curr = curr.next;
        }
        
       
        head.next = curr.next;
        curr.next = head;
        
        return sorted;
        
        
        
    }
}