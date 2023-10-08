class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode right = sortList(mid.next);
        mid.next = null;
        ListNode left = sortList(head);
        
        return mergeTwoLists(left,right);
    }


    static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }
        ListNode head = new ListNode();
        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }

        ListNode pointer = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                pointer.next = list1;
                pointer = list1;
                list1 = list1.next;
            } else {
                pointer.next = list2;
                pointer = list2;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            pointer.next = list1;
            pointer = list1;
            list1 = list1.next;
        }

        while (list2 != null) {
            pointer.next = list2;
            pointer = list2;
            list2 = list2.next;
        }

        return head;
    }
}