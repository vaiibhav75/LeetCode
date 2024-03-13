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
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return null;
        List<String> ans = new ArrayList<>();
        if (root.left == null && root.right == null) {
            ans.add(Integer.toString(root.val));
            return ans;
        }
        
        List<String> val1 = binaryTreePaths(root.left);
        List<String> val2 = binaryTreePaths(root.right);
        
        if (val1 != null) {
            for (String x : val1) {
                ans.add(root.val + "->" + x);
            }
        }

        if (val2 != null) {
            for (String x : val2) {
                ans.add(root.val + "->" + x);
            }
        }
        
        return ans;
    }
}
