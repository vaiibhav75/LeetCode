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
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        ans.add((long)root.val);
        while (!stack.isEmpty()) {
            Stack<TreeNode> curr = new Stack<>();
            long sum = 0;
            while (!stack.isEmpty())  {
                TreeNode x = stack.pop();
                if (x.left != null) {
                    curr.push(x.left);
                    sum += x.left.val;
                }
                if (x.right != null) {
                    curr.push(x.right);
                    sum += x.right.val;
                }
            }
            stack = curr;
            if (!curr.isEmpty()) {
                ans.add(sum);
            }
        }

        if (k > ans.size()) return -1;

        Collections.sort(ans);
        return ans.get(ans.size()-k);
    }
}
