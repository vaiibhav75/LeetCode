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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> arr = new ArrayList<>();
        inOrder(root,arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int x: queries) {
            List<Integer> insert = new ArrayList<>();
            insert.add(bs(arr,x,false));
            insert.add(bs(arr,x,true));
            ans.add(insert);
        }
        return ans;
        
    }

    public void inOrder (TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    
    public int bs (List<Integer> arr, int target,boolean isMax) {
        int start = 0;
        int end = arr.size() - 1;
        if (isMax && target > arr.get(end)) return -1;
        if (!isMax && target < arr.get(0)) return -1;
        
        while (start <= end ) {
            int mid = start + (end-start)/2;
            if (arr.get(mid) == target) {
                return arr.get(mid);
            } else if (arr.get(mid) < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        
        return isMax ? arr.get(start):arr.get(end);
    }
}
