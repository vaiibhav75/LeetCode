class Tuple {
    TreeNode node;
    boolean isMonitored;
    boolean isCamera;
    public Tuple(TreeNode node, boolean isMonitored, boolean isCamera) {
        this.node = node;
        this.isMonitored = isMonitored;
        this.isCamera = isCamera;
    }
}
class Solution {
    int ans;
    public int minCameraCover(TreeNode root) {
        ans = 0;
        Tuple rootTuple = insMonitored(root);
        if (!rootTuple.isMonitored) ans++;
        return ans;
    }

    public Tuple insMonitored (TreeNode node) {
        if (node == null) return new Tuple(null, true, false);
        Tuple left = insMonitored(node.left);
        Tuple right = insMonitored(node.right);

        boolean currMonitored = left.isCamera || right.isCamera;
        boolean requiresCamera = !left.isMonitored || !right.isMonitored;

        if (requiresCamera) {
            ans++;
            return new Tuple(node, true, true);
        }

        return new Tuple(node, currMonitored, false);
    }
}
