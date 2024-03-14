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
        
        if (root == null) {
            return new ArrayList<>();
        }
        
        List<Integer> ans = new ArrayList<>();
        ans.add(root.val);
        
        List<Integer> right = rightSideView(root.right);
        List<Integer> left = rightSideView(root.left);

        ans.addAll(right);
        
        for (int i = right.size(); i < left.size(); i++) {
            ans.add(left.get(i));
        }
        
        return ans;
    }
}
