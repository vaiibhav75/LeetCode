class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ListNode head = null;
        ListNode curr = null;
        while (true) {
            int index = -1;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (lists[i] != null) {
                    if (lists[i].val <= min) {
                        min = lists[i].val;
                        index = i;
                    }
                }
            }
            if (index == -1) return head;
            if (head == null) {
                head = new ListNode(min);
                curr = head;
            } else {
                curr.next = new ListNode(min);
                curr = curr.next;
            }
            // print(head);
            lists[index] = lists[index].next;
        }
    }
    
    static void print(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    } 

}
