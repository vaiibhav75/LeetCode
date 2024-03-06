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
    int n;
    int[] arr;
    public Solution(ListNode head) {
        ListNode curr = head;
        n = 0;
        while (curr != null) {
            curr = curr.next;
            n++;
        }
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = head.val;
            head = head.next;
        }
    }

    public int getRandom() {
        int x = (int) (n*Math.random());
        return arr[x];
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
