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

    HashMap<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    TreeNode buildTree(int[] preorder,int s, int e, int[] inorder, int x, int y) {
        if (s > e) return null;
        int z = map.get(preorder[s]);
        int s1 = z-x;
        int s2 = y-z;
        TreeNode left = buildTree(preorder,s+1,s+s1,inorder,x,z-1);
        TreeNode right = buildTree(preorder,s+s1+1,e,inorder,z+1,y);
        return new TreeNode(preorder[s],left,right);
    }

}
