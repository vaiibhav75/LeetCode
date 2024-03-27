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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        return (int) calculate(root,targetSum) + pathSum(root.left,targetSum) + pathSum(root.right,targetSum);
    }
    
    public long calculate (TreeNode root, long targetSum) {
        if (root == null) return 0;
        return  calculate(root.left,targetSum-root.val) + calculate(root.right,targetSum-root.val) + (targetSum == root.val ? 1 : 0) ;
    }
}
