/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> list = new LinkedList<>();
        list.add(root);

        while (!list.isEmpty()) {
            int size = list.size();
            int a = -1;
            int b = -1;
            for (int i = 0; i < size; i++) {
                TreeNode curr = list.poll();
                if (curr.left != null) {
                    list.add(curr.left);
                    if (curr.left.val == x) a = i;
                    if (curr.left.val == y) b = i;
                }
                if (curr.right != null) {
                    list.add(curr.right);
                    if (curr.right.val == x) a = i;
                    if (curr.right.val == y) b = i;
                }

            }

            if (a != -1 && b != -1 && a != b) return true;


        }
        return false;
    }
}
