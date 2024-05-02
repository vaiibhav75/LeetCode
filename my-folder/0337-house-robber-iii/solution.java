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

class Tuple {
    int notLoot;
    int loot;
    public Tuple(int notLoot, int loot) {
        this.notLoot = notLoot;
        this.loot = loot;
    }
}
class Solution {
    public int rob(TreeNode root) {
        Tuple x = loot(root);
        return Math.max(x.loot,x.notLoot);
    }

    public Tuple loot (TreeNode root) {
        if (root == null) return new Tuple(0, 0);
        Tuple left = loot(root.left);
        Tuple right = loot(root.right);

        int notLoot = Math.max(left.loot, left.notLoot) + Math.max(right.loot, right.notLoot);
        int loot = root.val + left.notLoot + right.notLoot;
        return new Tuple(notLoot, loot);
    }
}
