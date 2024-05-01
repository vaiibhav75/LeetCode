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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = helper(root, targetSum);
        for (List<Integer> list : res) {
            Collections.reverse(list);
        }
        return res;
    }
    
    static List<List<Integer>> helper (TreeNode root, int targetSum) {

        // if (root == null && targetSum == 0) {
        //     List<List<Integer>> ans = new ArrayList<>();
        //     ans.add(new ArrayList<>());
        //     return ans;
        // }

        if (root == null) return new ArrayList<>();

        List<List<Integer>> left = helper(root.left, targetSum - root.val);
        List<List<Integer>> right = helper(root.right, targetSum - root.val);

        List<List<Integer>> res = new ArrayList<>();

        for (List<Integer> list : left) {
            list.add(root.val);
            res.add(list);
        }

        for (List<Integer> list : right) {
            list.add(root.val);
            res.add(list);
        }

        if (targetSum == root.val && root.left == null && root.right == null) {
            List<Integer> ans = new ArrayList<>();
            ans.add(root.val);
            res.add(ans);
        }

        return res;
    }
}
