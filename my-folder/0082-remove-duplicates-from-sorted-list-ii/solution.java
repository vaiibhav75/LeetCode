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
        int[] arr = new int[201];
        while (head != null) {
            arr[head.val+100]++;
            head = head.next;
        }
        ListNode curr = null;
        for (int i = 0; i < 201; i++) {
            if (arr[i] == 1) {
                if (head == null) {
                    head = new ListNode(i-100);
                    curr = head;
                } else {
                    curr.next = new ListNode(i-100);
                    curr = curr.next;
                }
            }
        }
        
        return head;
        
    }
}
