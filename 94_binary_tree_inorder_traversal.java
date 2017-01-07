94_binary_tree_inorder_traversal.java
//iterative
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while(root != null){
            stack.push(root);
            root = root.left;
        }
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
        }
        return res;
    }
}
//recursive
public class Solution {
    List<Integer> res = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null){
            helper(root);
        }
        return res;
    }
    public void helper(TreeNode node){
        if(node.left != null){
            helper(node.left);
        }
        res.add(node.val);
        if(node.right != null){
            helper(node.right);
        }
    }
}