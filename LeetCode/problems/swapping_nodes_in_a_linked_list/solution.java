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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        temp = head;
        int first = 0;
        int second  = 0;
        for (int i = 1; i <= n ; i++) {
            if (i == k) {
                first = temp.val;
            }
            
            if (i == n-k+1) {
                second = temp.val;
            }
            temp = temp.next;
        }
        temp = head;
        for (int i = 1; i <= n ; i++) {
            if (i == k) {
                temp.val = second;
            }

            if (i == n-k+1) {
                temp.val= first;
            }
            temp = temp.next;
        }
        
        return head;
    }
}