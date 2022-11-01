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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        Sum(root , low, high);
        return sum;
    }
    private int Sum(TreeNode node, int low, int high){
        if ( node != null) {
            if ( low<=node.val && high >=node.val)
                sum+=node.val;
            if (low<node.val)
                Sum(node.left, low, high);
            if (node.val<high)
                Sum(node.right, low, high);
        }
        return sum;
    }
}