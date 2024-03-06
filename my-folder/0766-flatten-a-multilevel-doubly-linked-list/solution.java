class Solution {
    public Node flatten(Node head) {
        Node solve = resolve(head);
        return head;
    }

    static Node resolve (Node head) {
        System.out.println("Reched");
        Node t = head;
        Node tail = null;
        while (t != null) {
            if (t.child != null) {
                Node x = t.child;
                Node y = resolve(t.child);
                Node z = t.next;
                t.child = null;
                t.next = x;
                x.prev = t;
                if (z == null) {
                    return y;
                }
                
                y.next = z;
                z.prev = y;
            }

            if (t.next == null) tail = t;
            t = t.next;
        }
        return tail;
    }
}

