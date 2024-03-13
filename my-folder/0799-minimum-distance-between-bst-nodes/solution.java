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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = inorderTraversal(root);
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < list.size()-1; i++) {
            min = Math.min(min, list.get(i+1) - list.get(i));
        }
        return min;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root,result);
        return result;
    }

    void traverse (TreeNode node, List<Integer> ans) {
        if (node == null) return;
        traverse(node.left,ans);
        ans.add(node.val);
        traverse(node.right,ans);

    }
}
