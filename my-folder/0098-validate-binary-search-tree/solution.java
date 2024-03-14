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
    public boolean isValidBST(TreeNode root) {
        return isValidBST1(root)[2] == 1;
    }

    public long[] isValidBST1(TreeNode root) {
        if (root == null) return new long[] {(long) Integer.MAX_VALUE +1,(long)Integer.MIN_VALUE-1,1};
        long[] ans = new long[3];
        long[] left = isValidBST1(root.left);
        long[] right = isValidBST1(root.right);
        ans[0] = Math.min(root.val,Math.min(left[0],right[0]));
        ans[1] = Math.max(root.val,Math.max(left[1],right[1]));
        if (left[1] < root.val && right[0] > root.val && left[2] == 1 && right[2] == 1) {
            ans[2] = 1;
        }
        return ans;
    }


}
