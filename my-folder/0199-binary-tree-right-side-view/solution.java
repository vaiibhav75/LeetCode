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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> list = new LinkedList<>();
        if (root == null) return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        list.add(root);

        while (!list.isEmpty()) {
            int size = list.size();

            for (int i = 0; i < size; i++) {
                TreeNode x = list.poll();

                if (x.left != null) list.add(x.left);
                if (x.right != null) list.add(x.right);
                if (i == size -1) ans.add(x.val);
            }

        }

        return ans;
    }
}
