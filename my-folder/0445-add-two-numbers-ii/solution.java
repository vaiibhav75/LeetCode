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
        ListNode t1 = l1;
        ListNode t2  = l2;
        int ll1 = 0;
        int ll2 = 0;
        
        while (t1 != null) {
            ll1++;
            t1 = t1.next;
        }
        while (t2 != null) {
            ll2++;
            t2 = t2.next;
        }
        
        if (ll1 > ll2) {
            return solve(l1,l2,ll1,ll2);
        } else {
            return solve(l2,l1,ll2,ll1);
        }
    }
    
    static ListNode solve (ListNode l1, ListNode l2, int ll1, int ll2) {
        ListNode t1 = l1;
        ListNode t2 = l2;  
        for (int i = 0; i < ll1-ll2; i++) {
            t1 = t1.next;
        }
        
        while (t1 != null) {
            t1.val += t2.val;
            t1 = t1.next;
            t2 = t2.next;
        }
        
        int x = resolve(l1);
        if (x >  0) {
            ListNode temp = new ListNode(x);
            temp.next = l1;
            l1 = temp;
        }
        
        return l1;
    }
    
    static int resolve (ListNode l1) {
        if (l1.next == null) {
            int x = l1.val/10;
            l1.val %= 10;
            return x;
        }
        
        l1.val += resolve(l1.next);
        int x = l1.val/10;
        l1.val %= 10;
        return x;
    }
}
