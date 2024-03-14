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
    int max;
    public int longestUnivaluePath(TreeNode root) {
        max = 0;
        int  x = uniValue(root);
        return max;
    }

    public int uniValue (TreeNode root) {
        if (root == null) return 0;
        int ans = 0;
        int l = uniValue(root.left);
        int r = uniValue(root.right);
        int max1 = 0;
        if (root.left != null && root.left.val == root.val) {
            max1 = Math.max(max1,l);
            ans += l;
        }
        if (root.right != null && root.right.val == root.val) {
            max1 = Math.max(max1,r);
            ans += r;
        }
        max = Math.max(max,ans);
        return 1+max1;
        
    }
}
