/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public Queue<Integer> serialize(TreeNode root) {
        Queue<Integer> sb = new LinkedList<>();
        buildString(root, sb);
        return sb;
    }

    public void buildString(TreeNode root, Queue<Integer> sb) {
        if (root == null) {
            sb.add(1001);
            return;
        }
        sb.add(root.val);
        buildString(root.left, sb);
        buildString(root.right, sb);
    }

    // Decodes your encoded data to tree.

    public TreeNode deserialize(Queue<Integer> list) {
        int x = list.poll();
        if (x==1001) return null;
        return new TreeNode(x,deserialize(list),deserialize(list));
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
