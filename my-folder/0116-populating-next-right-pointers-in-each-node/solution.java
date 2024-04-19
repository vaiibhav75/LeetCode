/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> list = new LinkedList<>();
        if (root == null) return null;

        list.add(root);

        while (!list.isEmpty()) {
            int size = list.size();

            for (int i = 0; i < size; i++) {
                Node x = list.poll();

                if (x.left != null) list.add(x.left);
                if (x.right != null) list.add(x.right);
                if (i != size -1) x.next = list.peek();
            }

        }

        return root;
    }
}
