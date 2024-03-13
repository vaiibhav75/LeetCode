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
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
        traverse(root,result);
        return result;
    }
    
    void traverse (TreeNode node, List<Integer> ans) {
        if (node == null) return;
        traverse(node.left,ans);
        traverse(node.right,ans);
        ans.add(node.val);
    }
}
