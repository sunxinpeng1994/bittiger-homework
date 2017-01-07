144_binary_tree_preorder_traversal.java

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //iterative
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        //corner case
        if(root == null){
            return list;
        }
        //core logic
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if(temp != null){
                list.add(temp.val);
                stack.push(temp.right);
                stack.push(temp.left);
            }
        }
        return list;
    }
}

//recursive
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        return recursion(root, list);
    }
 public List<Integer> recursion(TreeNode node, List<Integer> list){
        if(node != null){
            list.add(node.val);
            recursion(node.left, list);
            recursion(node.right, list);
        }
        return list;
    }
}













