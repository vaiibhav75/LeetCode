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
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        List<Integer> result = new ArrayList<>();
        if (flip(root, voyage, 0, result) != -1) {
            return result;
        }
        return List.of(-1);
    }

    public int flip(TreeNode root, int[] voyage, int index, List<Integer> result) {
        if (root == null) {
            return 0;
        }
        if (root.val != voyage[index]) {
            return -1;
        }
        if (root.left != null && root.left.val != voyage[index + 1]) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            result.add(root.val);
        }
        int val = flip(root.left, voyage, index + 1, result);
        if (val != -1) {
            int val2 = flip(root.right, voyage, index + val + 1, result);
            if (val2 != -1) {
                return val + val2 + 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
        

    }
}
