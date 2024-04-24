class PositionTree {
    TreeNode node;
    int pos;

    public PositionTree (TreeNode node, int pos) {
        this.node = node;
        this.pos = pos;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int max = 0;
        Queue<PositionTree> queue = new LinkedList<>();
        queue.add(new PositionTree(root,1));

        while (!queue.isEmpty()) {
            int length = queue.size();
            int start = -1;
            int end = -1;


            for (int i = 0; i < length; i++) {
                PositionTree curr = queue.poll();
                TreeNode node = curr.node;
                int x = curr.pos;
                if (start == -1) start = x;
                end = x;

                if (node.left != null) queue.add(new PositionTree(node.left,2*x - 1));
                if (node.right != null) queue.add(new PositionTree(node.right,2*x));

            }

            max = Math.max(max,end-start+1);
        }

        return max;
    }
}
