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
    public void flatten(TreeNode root) {
        flattenH(root);
    }
    
    TreeNode flattenH (TreeNode node) {
        if (node == null) return null;
        
        TreeNode left = flattenH(node.left);
        TreeNode right = flattenH(node.right);
        
        if (left != null) {
            left.right = node.right;
            node.right = node.left;
            node.left = null;
        }
        
        if (right == null) return left == null ? node : left;
        return right;
    }
}
