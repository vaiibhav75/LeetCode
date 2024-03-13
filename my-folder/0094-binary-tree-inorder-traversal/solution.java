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
    public int[] findMode(TreeNode root) {
        List<Integer> inorderResult = inorderTraversal(root);
        System.out.println("Inorder Traversal Result: " + inorderResult);
        return mode(inorderResult);
    }

    // mode(s) of sorted array
    public int[] mode(List<Integer> arr) {
        List<Integer> ans = new ArrayList<>();
        int max = 1;
        int count = 1;
        ans.add(arr.get(0));
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).equals(arr.get(i - 1))) { // Using equals() for object comparison
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                max = count;
                ans.clear();
                ans.add(arr.get(i));
            } else if (count == max) {
                ans.add(arr.get(i));
            }
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    void traverse(TreeNode node, List<Integer> ans) {
        if (node == null) return;
        traverse(node.left, ans);
        ans.add(node.val);
        traverse(node.right, ans);
    }
}

