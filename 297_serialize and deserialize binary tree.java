297_serialize and deserialize binary tree.java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //use idx to record or use queue to record the preorder traverse when wen want to build a tree
public class Codec {
    private String spliter = ",";
    private String N = "N";
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        //corner case
        if(root == null){
            return new String();
        }
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }
    
    //preorder traverse to build a string
    public void buildString(TreeNode root, StringBuilder sb){
        //base case
        if(root == null){
            sb.append(N).append(spliter);
            return ;
        }
        sb.append(root.val).append(spliter);
        buildString(root.left, sb);
        buildString(root.right, sb);
        return ;
    }
    
    // private int idx = 0;
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null || data.length() == 0){
            return null;
        }
        String[] dataS = data.split(spliter);
        return buildTree(new LinkedList<String>(Arrays.asList(dataS)));
    }
    //preorder traverse to build a tree
    public TreeNode buildTree(Queue<String> dataS){
        String nodeVal = dataS.poll();
        if(nodeVal.equals(N)){
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodeVal));
        // idx++;
        node.left = buildTree(dataS);
        // idx++;
        node.right = buildTree(dataS);
        return node;
    }
    
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));