/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Tuple {
    TreeNode node;
    Tuple parent;
    boolean visited;
    Tuple left;
    Tuple right;
    public Tuple(TreeNode node, Tuple parent) {
        this.node = node;
        this.parent = parent;
    }
}

class Solution {
    List<Integer> ans;
    Tuple targetSend;
    TreeNode target;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ans = new ArrayList<>();
        this.target = target;
        Tuple mapped = mapParent(root, null);
        dfs(targetSend, k);
        return ans;
    }

    public Tuple mapParent (TreeNode node, Tuple parent) {
        if (node == null) return null;
        Tuple ans = new Tuple(node, parent);
        ans.left = mapParent(node.left, ans);
        ans.right = mapParent(node.right, ans);
        if (node == target) targetSend = ans;
        return ans;
    }
    
    public void dfs (Tuple node, int k) {
        if (node == null) return;
        if (node.visited) return;
        node.visited = true;
        if (k == 0) {
            ans.add(node.node.val);
            return;
        }
        dfs(node.left, k - 1);
        dfs(node.right, k - 1);
        dfs(node.parent, k - 1);
    }
}
