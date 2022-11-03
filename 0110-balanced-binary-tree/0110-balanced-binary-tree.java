/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// height or difference of left of node and right of node is less than or equal to 1.
class Solution {
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        validate(root);
        return result;
    }
    private int validate(TreeNode root){
        if ( root == null)
            return 0;
        int l = validate(root.left);
        int r = validate(root.right);
        if (Math.abs(l-r) >1)
            result = false;
        return 1+Math.max(l,r);    
    }
}