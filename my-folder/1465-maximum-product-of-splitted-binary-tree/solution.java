class Solution {
    long max;
    long sum;
    long mod = 1000000007;
    public int maxProduct(TreeNode root) {
        max = 0;
        sum = sum(root);
        long temp = computingSum(root);
        max %= mod;
        return (int)max;
    }

    public long computingSum (TreeNode root) {
        if (root == null) return 0;
        long val = root.val + computingSum(root.left) + computingSum(root.right);
        long ans = val * (sum-val);
        max = Math.max(max,ans);
        return val;
    }


    public long sum (TreeNode root) {
        if (root == null) return 0;
        return root.val + sum(root.right) + sum(root.left);
    }
}
