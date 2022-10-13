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
class Solution {
        boolean flag = true;
        TreeNode temp = null;
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return flag;
    }
     public void inorder(TreeNode root){
        if(root==null) return;
        
        inorder(root.left);
        
        if(temp!=null && root.val<=temp.val){
            flag=false;
            return;
        }
        temp=root;
        
        inorder(root.right);
    }
}