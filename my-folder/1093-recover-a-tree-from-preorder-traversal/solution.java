class Tuple {
    TreeNode node;
    int level;

    Tuple(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        Queue<Tuple> q = new LinkedList<>();
        int dashes = 0;

        for (int i = 0; i < traversal.length(); i++) {
            if (traversal.charAt(i) == '-') {
                dashes++;
            } else {
                int num = 0;
                while (i < traversal.length() && traversal.charAt(i) != '-') {
                    num = num * 10 + (traversal.charAt(i) - '0');
                    i++;
                }
                i--;
                q.add(new Tuple(new TreeNode(num), dashes));
                dashes = 0;
            }
        }

        TreeNode root = q.poll().node;
        
        Stack<Tuple> stack = new Stack<>();
        
        stack.push(new Tuple(root, 0));
        
        while (stack.size() > 0 && q.size() > 0) {
            Tuple curr = stack.peek();
            Tuple next = q.poll();
            
            if (next.level == curr.level + 1) {
                curr.node.left = next.node;
                stack.push(next);
            } else {
                while (stack.size() > 0 && stack.peek().level >= next.level) {
                    stack.pop();
                }
                stack.peek().node.right = next.node;
                stack.push(next);
            }
            
        }
        
        return root;
    }
    
}
