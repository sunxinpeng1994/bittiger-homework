145_binary_postorder_traversal.java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 // nice solution. please also try with two stacks without Collections.reverse
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null){
            return res;
        }
        while(!stack.isEmpty() || root != null){
            if(root != null){
                stack.push(root);
                res.add(root.val);
                root = root.right;
            }
            else{
                root = stack.pop().left;
            }
        }
        Collections.reverse(res);
        return res;
    }
}
