class Solution {
    public int countHighestScoreNodes(int[] parents) {
        int n = parents.length;
        ArrayList<TreeNode> tree = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tree.add(new TreeNode(i));
        }

        for (int i = 1; i < n; i++) {
            if (tree.get(parents[i]).left == null) {
                tree.get(parents[i]).left = tree.get(i);
            } else {
                tree.get(parents[i]).right = tree.get(i);
            }
        }
        long[] ans = new long[n];
        int temp = compute(tree.get(0),n,ans);
        long max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max,ans[i]);
        }
        int fin = 0;
        for (long x:ans) {
            if (x == max) fin++;
        }
        return fin;
    }

    public int compute (TreeNode root, int n, long[] ans) {
        if (root == null) return 0;
        int left = compute(root.left,n,ans);
        int right = compute(root.right,n,ans);

        long val = 1;
        if (n - 1 - left - right != 0) val *= n - 1 - left - right;
        if (left != 0) val *= (long)left;
        if (right != 0) val *= (long)right;
        ans[root.val] = val;

        return 1 + left + right;
    }
}
