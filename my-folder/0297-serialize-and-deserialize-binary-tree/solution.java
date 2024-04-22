/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }
    
    public void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("# ");
            return;
        }
        sb.append(root.val + " ");
        buildString(root.left, sb);
        buildString(root.right, sb);
    }

   

    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] traverse = data.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(traverse));
        return buildTree(list);
    }
    
    public TreeNode buildTree(ArrayList<String> list) {
        if (list.get(0).equals("#")) {
            list.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        root.left = buildTree(list);
        root.right = buildTree(list);
        return root;
    }

    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
