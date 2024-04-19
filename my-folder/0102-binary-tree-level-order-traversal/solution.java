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

class Carry {
    int height;
    TreeNode node;
    public Carry (int height, TreeNode node) {
        this.height = height;
        this.node = node;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<Carry> list = new LinkedList<>();
        list.add(new Carry(0,root));
        List<List<Integer>> ans = new ArrayList<>();
        while (!list.isEmpty()) {
            Carry curr = list.poll();
            if (curr.height == 0 || curr.height == ans.size()) {
                ans.add(new ArrayList<>());
            }
            ans.get(curr.height).add(curr.node.val);
            
            if (curr.node.left != null) list.add(new Carry(curr.height+1, curr.node.left));
            if (curr.node.right != null) list.add(new Carry(curr.height+1, curr.node.right));
        }
        
        return ans;
    }
}
