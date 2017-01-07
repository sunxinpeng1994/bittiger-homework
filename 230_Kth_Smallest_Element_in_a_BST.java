230_Kth_Smallest_Element_in_a_BST.java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }
        inorderTraverse(root);
        return list.get(k - 1);
    }
    public void inorderTraverse(TreeNode root){
        if(root.left != null){
            inorderTraverse(root.left);
        }
        list.add(root.val);
        if(root.right != null){
            inorderTraverse(root.right);
        }
    }
}