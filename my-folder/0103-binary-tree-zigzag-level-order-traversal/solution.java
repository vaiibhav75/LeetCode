class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> list = new LinkedList<>();
        if (root == null) return new ArrayList<>();

        list.add(root);
        boolean swap = false;
        while (!list.isEmpty()) {
            List<Integer> curr = new ArrayList<>();
            int size = list.size();

            for (int i = 0; i < size; i++) {
                TreeNode x = list.poll();
                curr.add(x.val);
                if (x.left != null) list.add(x.left);
                if (x.right != null) list.add(x.right);
            }
            if (swap) Collections.reverse(curr);
            ans.add(curr);
            swap = !swap;
        }
        return ans;
    }
}
