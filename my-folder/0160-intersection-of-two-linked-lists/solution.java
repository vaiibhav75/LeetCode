/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        
        int lengthA = 0;
        int lengthB = 0;
        
        while (pointerA != null) {
            lengthA++;
            pointerA = pointerA.next;
        }

        while (pointerB != null) {
            lengthB++;
            pointerB = pointerB.next;
        }
        
        pointerA = headA;
        pointerB = headB;


        for (int i = 0; i < lengthA-lengthB; i++) {
            pointerA = pointerA.next;
        }

        for (int i = 0; i < lengthB - lengthA; i++) {
            pointerB = pointerB.next;
        }
        
        while (pointerB != pointerA) {
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }
        
        return pointerB;
    }
}
