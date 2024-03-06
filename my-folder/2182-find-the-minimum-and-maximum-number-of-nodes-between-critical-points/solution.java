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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
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

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < n-1; i++) {
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                list.add(i);
            }
            if (arr[i] < arr[i-1] && arr[i] < arr[i+1]) {
                list.add(i);
            }
        }

        if (list.size() < 2) {
            return new int[] {-1,-1};
        }

        int max = list.get(list.size()-1) - list.get(0);
        int min = max;

        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min,list.get(i) - list.get(i-1));
        }

        return new int[] {min,max};
    }
}
